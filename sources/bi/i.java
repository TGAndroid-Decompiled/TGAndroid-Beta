package bi;

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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.zr;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cy;
import org.telegram.ui.qf1;
import org.telegram.ui.rz0;
import org.telegram.ui.v50;
public final class i implements qf1, org.telegram.ui.ActionBar.b2, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, am0, MessagesController.IsInChatCheckedCallback, u5.b, t5.e, ra.a {
    public final int f4804a;
    public final long f4805b;
    public final Object f4806c;
    public final Object d;

    public i(Object obj, long j10, Object obj2, int i10) {
        this.f4804a = i10;
        this.f4806c = obj;
        this.f4805b = j10;
        this.d = obj2;
    }

    @Override
    public Object apply(Object obj) {
        boolean z10;
        String str = (String) this.f4806c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((p5.c) this.d).f46806a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            if (rawQuery.getCount() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rawQuery.close();
            long j10 = this.f4805b;
            if (!z10) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i10));
                contentValues.put("events_dropped_count", Long.valueOf(j10));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(b10.i(j10, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
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
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.f4806c;
        long j10 = this.f4805b;
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
                Utilities.globalQueue.postRunnable(new fi.u9(file, bitmap));
            } else if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.o5.a(this, i10, str, drawable);
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        ProfileActivity.a0((ProfileActivity) this.f4806c, (Context) this.d, this.f4805b, view, i10, f7, f10);
    }

    @Override
    public Object f() {
        aa.b0 b0Var = (aa.b0) this.f4806c;
        long o10 = ((v5.a) b0Var.e).o() + this.f4805b;
        t5.g gVar = (t5.g) ((t5.d) b0Var.f1034f);
        gVar.getClass();
        gVar.c(new di.d1(o10, (m5.i) this.d));
        return null;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f4804a) {
            case 1:
                h7.q1((h7) this.f4806c, (TL_stars.InputSavedStarGift) this.d, this.f4805b, e2Var);
                return;
            case 2:
                fi.g9 g9Var = (fi.g9) this.f4806c;
                ArrayList arrayList = (ArrayList) this.d;
                g9Var.d.put(Long.valueOf(this.f4805b), arrayList);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    g9Var.f10921b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                g9Var.i(true);
                g9Var.e(true);
                g9Var.f(true);
                e2Var.dismiss();
                g9Var.f10928x.L = true;
                return;
            case 3:
            case 4:
            default:
                v50 v50Var = (v50) this.f4806c;
                v50Var.d.getMessagesController().addUserToChat(v50Var.i1(), (TLRPC.User) this.d, 0, null, (org.telegram.ui.ActionBar.r2) v50Var.f44643i0.O().getFragmentStack().get(v50Var.f44643i0.O().getFragmentStack().size() - 1), new r3(v50Var, this.f4805b, 28));
                return;
            case 5:
                zr.Q((zr) this.f4806c, (fi.d) this.d, this.f4805b);
                return;
        }
    }

    @Override
    public void i(ra.b bVar) {
        ((v9.a) bVar.get()).d((String) this.f4806c, this.f4805b, (aa.d1) this.d);
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((y) this.f4806c).q0(true, this.f4805b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.o5.b(this, imageReceiver);
    }

    @Override
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.f4806c).lambda$createGroupInstance$69(this.f4805b, (int[]) this.d, arrayList);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new n((rz0) this.f4806c, this.f4805b, tL_chatAdminRights, str, z10, (cy) this.d));
    }

    public i(Object obj, Object obj2, long j10, int i10) {
        this.f4804a = i10;
        this.f4806c = obj;
        this.d = obj2;
        this.f4805b = j10;
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
