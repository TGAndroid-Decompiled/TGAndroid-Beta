package ci;

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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d60;
import org.telegram.ui.mg1;
import org.telegram.ui.qy;
import org.telegram.ui.yz0;
public final class q9 implements org.telegram.ui.ActionBar.z1, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, ll0, MessagesController.IsInChatCheckedCallback, t5.b, s5.f, pa.a, mg1 {
    public final int f5381a;
    public final long f5382b;
    public final Object f5383c;
    public final Object d;

    public q9(Object obj, long j3, Object obj2, int i10) {
        this.f5381a = i10;
        this.f5383c = obj;
        this.f5382b = j3;
        this.d = obj2;
    }

    @Override
    public Object apply(Object obj) {
        boolean z10;
        String str = (String) this.f5383c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((o5.c) this.d).f15663a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            if (rawQuery.getCount() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rawQuery.close();
            long j3 = this.f5382b;
            if (!z10) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i10));
                contentValues.put("events_dropped_count", Long.valueOf(j3));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(org.telegram.ui.Cells.c1.j(j3, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ProfileActivity.b0((ProfileActivity) this.f5383c, (Context) this.d, this.f5382b, view, i10, f7, f10);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.f5383c;
        long j3 = this.f5382b;
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
                    resultCallback.onComplete(new Pair(Long.valueOf(j3), bitmap));
                }
                Utilities.globalQueue.postRunnable(new ma(file, bitmap));
            } else if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((yh.g) this.f5383c).h0(true, this.f5382b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f5381a) {
            case 0:
                y9 y9Var = (y9) this.f5383c;
                ArrayList arrayList = (ArrayList) this.d;
                y9Var.d.put(Long.valueOf(this.f5382b), arrayList);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    y9Var.f5881b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                y9Var.i(true);
                y9Var.e(true);
                y9Var.f(true);
                a2Var.dismiss();
                y9Var.f5888x.K = true;
                return;
            case 3:
                nr.Q((nr) this.f5383c, (d) this.d, this.f5382b);
                return;
            default:
                d60 d60Var = (d60) this.f5383c;
                d60Var.d.getMessagesController().addUserToChat(d60Var.i1(), (TLRPC.User) this.d, 0, null, (org.telegram.ui.ActionBar.m2) d60Var.f32968i0.O().getFragmentStack().get(d60Var.f32968i0.O().getFragmentStack().size() - 1), new ai.j(d60Var, this.f5382b, 24));
                return;
        }
    }

    @Override
    public void g(pa.b bVar) {
        ((t9.a) bVar.get()).d((String) this.f5383c, this.f5382b, (y9.b1) this.d);
    }

    @Override
    public Object i() {
        da.b bVar = (da.b) this.f5383c;
        long q6 = ((u5.a) bVar.f7567g).q() + this.f5382b;
        s5.h hVar = (s5.h) ((s5.d) bVar.f7565c);
        hVar.getClass();
        hVar.c(new ai.z1(q6, (l5.i) this.d));
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.f5383c).lambda$createGroupInstance$69(this.f5382b, (int[]) this.d, arrayList);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new ai.h3((yz0) this.f5383c, this.f5382b, tL_chatAdminRights, str, z10, (qy) this.d));
    }

    public q9(Object obj, Object obj2, long j3, int i10) {
        this.f5381a = i10;
        this.f5383c = obj;
        this.d = obj2;
        this.f5382b = j3;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
