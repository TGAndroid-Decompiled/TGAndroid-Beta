package ai;

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
import org.telegram.ui.Components.xr;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cy;
import org.telegram.ui.hf1;
import org.telegram.ui.jz0;
import org.telegram.ui.q50;
public final class f implements hf1, org.telegram.ui.ActionBar.a2, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, yl0, MessagesController.IsInChatCheckedCallback, t5.b, s5.e, qa.a {
    public final int f1242a;
    public final long f1243b;
    public final Object f1244c;
    public final Object d;

    public f(Object obj, long j10, Object obj2, int i10) {
        this.f1242a = i10;
        this.f1244c = obj;
        this.f1243b = j10;
        this.d = obj2;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public Object apply(Object obj) {
        boolean z10;
        String str = (String) this.f1244c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((o5.c) this.d).f17691a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            if (rawQuery.getCount() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rawQuery.close();
            long j10 = this.f1243b;
            if (!z10) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i10));
                contentValues.put("events_dropped_count", Long.valueOf(j10));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(r4.c.g(j10, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        ProfileActivity.a0((ProfileActivity) this.f1244c, (Context) this.d, this.f1243b, view, i10, f7, f10);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.f1244c;
        long j10 = this.f1243b;
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
                Utilities.globalQueue.postRunnable(new ei.y9(file, bitmap));
            } else if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f1242a) {
            case 1:
                l7.r1((l7) this.f1244c, (TL_stars.InputSavedStarGift) this.d, this.f1243b, b2Var);
                return;
            case 2:
                ei.k9 k9Var = (ei.k9) this.f1244c;
                ArrayList arrayList = (ArrayList) this.d;
                k9Var.d.put(Long.valueOf(this.f1243b), arrayList);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    k9Var.f9326b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                k9Var.i(true);
                k9Var.e(true);
                k9Var.f(true);
                b2Var.dismiss();
                k9Var.f9333x.K = true;
                return;
            case 3:
            case 4:
            default:
                q50 q50Var = (q50) this.f1244c;
                q50Var.d.getMessagesController().addUserToChat(q50Var.j1(), (TLRPC.User) this.d, 0, null, (org.telegram.ui.ActionBar.n2) q50Var.f40413i0.O().getFragmentStack().get(q50Var.f40413i0.O().getFragmentStack().size() - 1), new v3(q50Var, this.f1243b, 28));
                return;
            case 5:
                xr.R((xr) this.f1244c, (ei.d) this.d, this.f1243b);
                return;
        }
    }

    @Override
    public void h(qa.b bVar) {
        ((u9.a) bVar.get()).d((String) this.f1244c, this.f1243b, (z9.b1) this.d);
    }

    @Override
    public Object j() {
        ea.b bVar = (ea.b) this.f1244c;
        long d = ((u5.a) bVar.f8549g).d() + this.f1243b;
        s5.g gVar = (s5.g) ((s5.d) bVar.f8547c);
        gVar.getClass();
        gVar.c(new ci.d1(d, (l5.i) this.d));
        return null;
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((x) this.f1244c).h0(true, this.f1243b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.f1244c).lambda$createGroupInstance$69(this.f1243b, (int[]) this.d, arrayList);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new m((jz0) this.f1244c, this.f1243b, tL_chatAdminRights, str, z10, (cy) this.d));
    }

    public f(Object obj, Object obj2, long j10, int i10) {
        this.f1242a = i10;
        this.f1244c = obj;
        this.d = obj2;
        this.f1243b = j10;
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
