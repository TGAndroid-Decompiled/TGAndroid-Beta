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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.g01;
import org.telegram.ui.g60;
import org.telegram.ui.ty;
import org.telegram.ui.vg1;
public final class q9 implements org.telegram.ui.ActionBar.a2, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, gm0, MessagesController.IsInChatCheckedCallback, t5.b, s5.e, pa.a, vg1 {
    public final int f5840a;
    public final long f5841b;
    public final Object f5842c;
    public final Object d;

    public q9(Object obj, long j3, Object obj2, int i10) {
        this.f5840a = i10;
        this.f5842c = obj;
        this.f5841b = j3;
        this.d = obj2;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public Object apply(Object obj) {
        boolean z10;
        String str = (String) this.f5842c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((o5.c) this.d).f17084a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            if (rawQuery.getCount() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rawQuery.close();
            long j3 = this.f5841b;
            if (!z10) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i10));
                contentValues.put("events_dropped_count", Long.valueOf(j3));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(org.telegram.ui.Cells.c1.h(j3, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ProfileActivity.b0((ProfileActivity) this.f5842c, (Context) this.d, this.f5841b, view, i10, f7, f10);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.f5842c;
        long j3 = this.f5841b;
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
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void e(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((yh.g) this.f5842c).h0(true, this.f5841b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f5840a) {
            case 0:
                y9 y9Var = (y9) this.f5842c;
                ArrayList arrayList = (ArrayList) this.d;
                y9Var.d.put(Long.valueOf(this.f5841b), arrayList);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    y9Var.f6361b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                y9Var.i(true);
                y9Var.e(true);
                y9Var.f(true);
                b2Var.dismiss();
                y9Var.f6369x.K = true;
                return;
            case 3:
                es.R((es) this.f5842c, (d) this.d, this.f5841b);
                return;
            default:
                g60 g60Var = (g60) this.f5842c;
                g60Var.d.getMessagesController().addUserToChat(g60Var.j1(), (TLRPC.User) this.d, 0, null, (org.telegram.ui.ActionBar.n2) g60Var.f37867i0.O().getFragmentStack().get(g60Var.f37867i0.O().getFragmentStack().size() - 1), new ai.j(g60Var, this.f5841b, 26));
                return;
        }
    }

    @Override
    public void g(pa.b bVar) {
        ((t9.a) bVar.get()).d((String) this.f5842c, this.f5841b, (y9.b1) this.d);
    }

    @Override
    public Object i() {
        da.c cVar = (da.c) this.f5842c;
        long Z = ((u5.a) cVar.f8237g).Z() + this.f5841b;
        s5.g gVar = (s5.g) ((s5.d) cVar.f8234c);
        gVar.getClass();
        gVar.c(new ai.z1(Z, (l5.i) this.d));
        return null;
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.f5842c).lambda$createGroupInstance$69(this.f5841b, (int[]) this.d, arrayList);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new ai.i3((g01) this.f5842c, this.f5841b, tL_chatAdminRights, str, z10, (ty) this.d));
    }

    public q9(Object obj, Object obj2, long j3, int i10) {
        this.f5840a = i10;
        this.f5842c = obj;
        this.d = obj2;
        this.f5841b = j3;
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
