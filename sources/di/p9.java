package di;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bh1;
import org.telegram.ui.m01;
import org.telegram.ui.n60;
import org.telegram.ui.yy;
public final class p9 implements org.telegram.ui.ActionBar.z1, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, bm0, MessagesController.IsInChatCheckedCallback, t5.b, s5.e, qa.a, bh1 {
    public final int f7593a;
    public final long f7594b;
    public final Object f7595c;
    public final Object d;

    public p9(Object obj, long j10, Object obj2, int i10) {
        this.f7593a = i10;
        this.f7595c = obj;
        this.f7594b = j10;
        this.d = obj2;
    }

    @Override
    public Object apply(Object obj) {
        boolean z10;
        String str = (String) this.f7595c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((o5.c) this.d).f16293a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            if (rawQuery.getCount() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rawQuery.close();
            long j10 = this.f7594b;
            if (!z10) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i10));
                contentValues.put("events_dropped_count", Long.valueOf(j10));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(org.telegram.ui.Cells.c1.h(j10, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        ProfileActivity.b0((ProfileActivity) this.f7595c, (Context) this.d, this.f7594b, view, i10, f7, f10);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.f7595c;
        long j10 = this.f7594b;
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
                Utilities.globalQueue.postRunnable(new la(file, bitmap));
            } else if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public Object f() {
        ea.b bVar = (ea.b) this.f7595c;
        long b10 = ((u5.a) bVar.f8670g).b() + this.f7594b;
        s5.g gVar = (s5.g) ((s5.d) bVar.f8668c);
        gVar.getClass();
        gVar.c(new bi.p1(b10, (l5.i) this.d));
        return null;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f7593a) {
            case 0:
                x9 x9Var = (x9) this.f7595c;
                ArrayList arrayList = (ArrayList) this.d;
                x9Var.d.put(Long.valueOf(this.f7594b), arrayList);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    x9Var.f8097b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                x9Var.i(true);
                x9Var.e(true);
                x9Var.f(true);
                a2Var.dismiss();
                x9Var.f8104x.K = true;
                return;
            case 3:
                as.R((as) this.f7595c, (d) this.d, this.f7594b);
                return;
            default:
                n60 n60Var = (n60) this.f7595c;
                n60Var.d.getMessagesController().addUserToChat(n60Var.j1(), (TLRPC.User) this.d, 0, null, (org.telegram.ui.ActionBar.m2) n60Var.f38190i0.O().getFragmentStack().get(n60Var.f38190i0.O().getFragmentStack().size() - 1), new bi.g(n60Var, this.f7594b, 26));
                return;
        }
    }

    @Override
    public void h(qa.b bVar) {
        ((u9.a) bVar.get()).d((String) this.f7595c, this.f7594b, (z9.b1) this.d);
    }

    @Override
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((zh.g) this.f7595c).h0(true, this.f7594b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.f7595c).lambda$createGroupInstance$69(this.f7594b, (int[]) this.d, arrayList);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new bi.x2((m01) this.f7595c, this.f7594b, tL_chatAdminRights, str, z10, (yy) this.d));
    }

    public p9(Object obj, Object obj2, long j10, int i10) {
        this.f7593a = i10;
        this.f7595c = obj;
        this.d = obj2;
        this.f7594b = j10;
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
