package b9;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import bg.i2;
import c3.h;
import d3.f;
import g9.b1;
import gh.r;
import java.io.File;
import java.util.ArrayList;
import kh.aa;
import kh.n9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g5;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dy;
import org.telegram.ui.dz0;
import org.telegram.ui.nf1;
import org.telegram.ui.o50;
import w2.i;
public final class a implements x9.a, e3.b, f, nf1, b2, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, nk0, MessagesController.IsInChatCheckedCallback {
    public final int f1655a;
    public final long f1656b;
    public final Object f1657c;
    public final Object d;

    public a(Object obj, long j10, Object obj2, int i9) {
        this.f1655a = i9;
        this.f1657c = obj;
        this.f1656b = j10;
        this.d = obj2;
    }

    @Override
    public Object apply(Object obj) {
        boolean z10;
        String str = (String) this.f1657c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i9 = ((z2.c) this.d).f50278a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i9)});
        try {
            if (rawQuery.getCount() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rawQuery.close();
            long j10 = this.f1656b;
            if (!z10) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i9));
                contentValues.put("events_dropped_count", Long.valueOf(j10));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(aa.d.n(j10, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i9)});
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        ProfileActivity.a0((ProfileActivity) this.f1657c, (Context) this.d, this.f1656b, view, i9, f10, f11);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.f1657c;
        long j10 = this.f1656b;
        File file = (File) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z10 && bitmapSafe != null && !bitmapSafe.bitmap.isRecycled()) {
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
                Utilities.globalQueue.postRunnable(new aa(file, bitmap));
            } else if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i9, String str, Drawable drawable) {
        g5.a(this, i9, str, drawable);
    }

    @Override
    public void e(x9.b bVar) {
        ((b) bVar.get()).d((String) this.f1657c, this.f1656b, (b1) this.d);
    }

    @Override
    public void f(c2 c2Var, int i9) {
        switch (this.f1655a) {
            case 4:
                n9 n9Var = (n9) this.f1657c;
                ArrayList arrayList = (ArrayList) this.d;
                n9Var.d.put(Long.valueOf(this.f1656b), arrayList);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    n9Var.f15768b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                n9Var.i(true);
                n9Var.e(true);
                n9Var.f(true);
                c2Var.dismiss();
                n9Var.f15776x.G = true;
                return;
            case 7:
                cr.P((cr) this.f1657c, (kh.d) this.d, this.f1656b);
                return;
            default:
                o50 o50Var = (o50) this.f1657c;
                o50Var.d.getMessagesController().addUserToChat(o50Var.i1(), (TLRPC.User) this.d, 0, null, (o2) o50Var.f40898e0.O().getFragmentStack().get(o50Var.f40898e0.O().getFragmentStack().size() - 1), new i2(o50Var, this.f1656b, 26));
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((r) this.f1657c).g0(true, this.f1656b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public Object j() {
        h hVar = (h) this.f1657c;
        long d = ((f3.a) hVar.f2305g).d() + this.f1656b;
        d3.h hVar2 = (d3.h) ((d3.d) hVar.f2302c);
        hVar2.getClass();
        hVar2.c(new d3.e(d, (i) this.d));
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        g5.b(this, imageReceiver);
    }

    @Override
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.f1657c).lambda$createGroupInstance$69(this.f1656b, (int[]) this.d, arrayList);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new gh.i((dz0) this.f1657c, this.f1656b, tL_chatAdminRights, str, z10, (dy) this.d));
    }

    public a(Object obj, Object obj2, long j10, int i9) {
        this.f1655a = i9;
        this.f1657c = obj;
        this.d = obj2;
        this.f1656b = j10;
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
