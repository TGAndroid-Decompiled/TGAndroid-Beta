package c3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import d3.h;
import h9.b1;
import hh.r;
import java.io.File;
import java.util.ArrayList;
import lh.k9;
import lh.x9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i5;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dz0;
import org.telegram.ui.gy;
import org.telegram.ui.mf1;
import org.telegram.ui.s50;
import w2.i;

public final class f implements e3.b, y9.a, d3.f, mf1, a2, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, qk0, MessagesController.IsInChatCheckedCallback {

    public final int f2430a;

    public final long f2431b;

    public final Object f2432c;
    public final Object d;

    public f(Object obj, long j10, Object obj2, int i10) {
        this.f2430a = i10;
        this.f2432c = obj;
        this.f2431b = j10;
        this.d = obj2;
    }

    @Override
    public Object apply(Object obj) {
        String str = (String) this.f2432c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((z2.c) this.d).f50178a;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            boolean z10 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j10 = this.f2431b;
            if (z10) {
                sQLiteDatabase.execSQL(com.google.android.recaptcha.internal.a.m(j10, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i10));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override
    public void b(y9.b bVar) {
        ((c9.a) bVar.get()).d((String) this.f2432c, this.f2431b, (b1) this.d);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        ProfileActivity.b0((ProfileActivity) this.f2432c, (Context) this.d, this.f2431b, view, i10, f10, f11);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.f2432c;
        long j10 = this.f2431b;
        File file = (File) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z10 || bitmapSafe == null || bitmapSafe.bitmap.isRecycled()) {
            return;
        }
        Bitmap bitmap = bitmapSafe.bitmap;
        if (bitmap == null) {
            Drawable drawable = bitmapSafe.drawable;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            }
        }
        if (bitmap != null) {
            if (resultCallback != null) {
                resultCallback.onComplete(new Pair(Long.valueOf(j10), bitmap));
            }
            Utilities.globalQueue.postRunnable(new x9(file, bitmap));
        } else if (resultCallback != null) {
            resultCallback.onComplete(null);
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f2430a) {
            case 4:
                k9 k9Var = (k9) this.f2432c;
                ArrayList arrayList = (ArrayList) this.d;
                k9Var.d.put(Long.valueOf(this.f2431b), arrayList);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    k9Var.f16250b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                k9Var.i(true);
                k9Var.e(true);
                k9Var.f(true);
                b2Var.dismiss();
                k9Var.f16258x.G = true;
                break;
            case 7:
                ar.Q((ar) this.f2432c, (lh.d) this.d, this.f2431b);
                break;
            default:
                s50 s50Var = (s50) this.f2432c;
                s50Var.d.getMessagesController().addUserToChat(s50Var.i1(), (TLRPC.User) this.d, 0, null, (n2) s50Var.f42427e0.O().getFragmentStack().get(s50Var.f42427e0.O().getFragmentStack().size() - 1), new cg.b2(s50Var, this.f2431b, 26));
                break;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((r) this.f2432c).h0(true, this.f2431b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public Object i() {
        g gVar = (g) this.f2432c;
        i iVar = (i) this.d;
        d3.d dVar = (d3.d) gVar.f2435c;
        long jE = ((f3.a) gVar.f2438g).E() + this.f2431b;
        h hVar = (h) dVar;
        hVar.getClass();
        hVar.c(new d3.e(jE, iVar));
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.f2432c).lambda$createGroupInstance$69(this.f2431b, (int[]) this.d, arrayList);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new hh.i((dz0) this.f2432c, this.f2431b, tL_chatAdminRights, str, z10, (gy) this.d));
    }

    public f(Object obj, Object obj2, long j10, int i10) {
        this.f2430a = i10;
        this.f2432c = obj;
        this.d = obj2;
        this.f2431b = j10;
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }
}
