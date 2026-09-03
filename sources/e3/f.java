package e3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import f3.h;
import hg.y1;
import java.io.File;
import java.util.ArrayList;
import k9.b1;
import mh.p;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j5;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d60;
import org.telegram.ui.ig1;
import org.telegram.ui.py;
import org.telegram.ui.vz0;
import qh.w7;
import y2.i;
public final class f implements g3.b, f3.f, ba.a, ig1, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, c2, jl0, MessagesController.IsInChatCheckedCallback {
    public final int f4928a;
    public final long f4929b;
    public final Object f4930c;
    public final Object d;

    public f(Object obj, long j10, Object obj2, int i10) {
        this.f4928a = i10;
        this.f4930c = obj;
        this.f4929b = j10;
        this.d = obj2;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public Object apply(Object obj) {
        boolean z4;
        String str = (String) this.f4930c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((b3.c) this.d).f1400a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            if (rawQuery.getCount() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            rawQuery.close();
            long j10 = this.f4929b;
            if (!z4) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i10));
                contentValues.put("events_dropped_count", Long.valueOf(j10));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(e2.c.i(j10, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        ProfileActivity.b0((ProfileActivity) this.f4930c, (Context) this.d, this.f4929b, view, i10, f10, f11);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        ResultCallback resultCallback = (ResultCallback) this.f4930c;
        long j10 = this.f4929b;
        File file = (File) this.d;
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (z4 && bitmapSafe != null && !bitmapSafe.bitmap.isRecycled()) {
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
                Utilities.globalQueue.postRunnable(new d4(file, bitmap));
            } else if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        j5.a(this, i10, str, drawable);
    }

    @Override
    public void f(ba.b bVar) {
        ((f9.a) bVar.get()).d((String) this.f4930c, this.f4929b, (b1) this.d);
    }

    @Override
    public Object g() {
        g gVar = (g) this.f4930c;
        long W = ((h3.a) gVar.f4936g).W() + this.f4929b;
        h hVar = (h) ((f3.d) gVar.f4933c);
        hVar.getClass();
        hVar.c(new f3.e(W, (i) this.d));
        return null;
    }

    @Override
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((p) this.f4930c).h0(true, this.f4929b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void j(d2 d2Var, int i10) {
        switch (this.f4928a) {
            case 6:
                lr.Q((lr) this.f4930c, (qh.d) this.d, this.f4929b);
                return;
            case 7:
                d60 d60Var = (d60) this.f4930c;
                d60Var.d.getMessagesController().addUserToChat(d60Var.i1(), (TLRPC.User) this.d, 0, null, (p2) d60Var.f36012f0.O().getFragmentStack().get(d60Var.f36012f0.O().getFragmentStack().size() - 1), new y1(d60Var, this.f4929b, 20));
                return;
            default:
                w7 w7Var = (w7) this.f4930c;
                ArrayList arrayList = (ArrayList) this.d;
                w7Var.d.put(Long.valueOf(this.f4929b), arrayList);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    w7Var.f46263b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                w7Var.i(true);
                w7Var.e(true);
                w7Var.f(true);
                d2Var.dismiss();
                w7Var.f46271x.H = true;
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.f4930c).lambda$createGroupInstance$69(this.f4929b, (int[]) this.d, arrayList);
    }

    @Override
    public void run(boolean z4, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new mh.i((vz0) this.f4930c, this.f4929b, tL_chatAdminRights, str, z4, (py) this.d));
    }

    public f(Object obj, Object obj2, long j10, int i10) {
        this.f4928a = i10;
        this.f4930c = obj;
        this.d = obj2;
        this.f4929b = j10;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
