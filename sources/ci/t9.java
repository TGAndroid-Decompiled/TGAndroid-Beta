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
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.j01;
import org.telegram.ui.k60;
import org.telegram.ui.vg1;
import org.telegram.ui.wy;
public final class t9 implements org.telegram.ui.ActionBar.b2, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, bl0, MessagesController.IsInChatCheckedCallback, t5.b, s5.e, pa.a, vg1 {
    public final int f5572a;
    public final long f5573b;
    public final Object f5574c;
    public final Object d;

    public t9(Object obj, long j3, Object obj2, int i10) {
        this.f5572a = i10;
        this.f5574c = obj;
        this.f5573b = j3;
        this.d = obj2;
    }

    @Override
    public Object apply(Object obj) {
        boolean z10;
        String str = (String) this.f5574c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((o5.c) this.d).f15491a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            if (rawQuery.getCount() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rawQuery.close();
            long j3 = this.f5573b;
            if (!z10) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i10));
                contentValues.put("events_dropped_count", Long.valueOf(j3));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(org.telegram.ui.Cells.p6.h(j3, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ProfileActivity.b0((ProfileActivity) this.f5574c, (Context) this.d, this.f5573b, view, i10, f7, f10);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.f5574c;
        long j3 = this.f5573b;
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
                Utilities.globalQueue.postRunnable(new pa(file, bitmap));
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
        ((yh.g) this.f5574c).h0(true, this.f5573b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f5572a) {
            case 0:
                ba baVar = (ba) this.f5574c;
                ArrayList arrayList = (ArrayList) this.d;
                baVar.d.put(Long.valueOf(this.f5573b), arrayList);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    baVar.f4402b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                baVar.i(true);
                baVar.e(true);
                baVar.f(true);
                c2Var.dismiss();
                baVar.f4409x.K = true;
                return;
            case 3:
                mr.Q((mr) this.f5574c, (d) this.d, this.f5573b);
                return;
            default:
                k60 k60Var = (k60) this.f5574c;
                k60Var.d.getMessagesController().addUserToChat(k60Var.i1(), (TLRPC.User) this.d, 0, null, (org.telegram.ui.ActionBar.o2) k60Var.f35050i0.O().getFragmentStack().get(k60Var.f35050i0.O().getFragmentStack().size() - 1), new ai.j(k60Var, this.f5573b, 24));
                return;
        }
    }

    @Override
    public Object i() {
        da.b bVar = (da.b) this.f5574c;
        long q6 = ((u5.a) bVar.f7585g).q() + this.f5573b;
        s5.g gVar = (s5.g) ((s5.d) bVar.f7583c);
        gVar.getClass();
        gVar.c(new ai.z1(q6, (l5.i) this.d));
        return null;
    }

    @Override
    public void j(pa.b bVar) {
        ((t9.a) bVar.get()).d((String) this.f5574c, this.f5573b, (y9.b1) this.d);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.f5574c).lambda$createGroupInstance$69(this.f5573b, (int[]) this.d, arrayList);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new ai.h3((j01) this.f5574c, this.f5573b, tL_chatAdminRights, str, z10, (wy) this.d));
    }

    public t9(Object obj, Object obj2, long j3, int i10) {
        this.f5572a = i10;
        this.f5574c = obj;
        this.d = obj2;
        this.f5573b = j3;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
