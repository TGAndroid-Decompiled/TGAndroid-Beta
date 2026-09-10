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
import org.telegram.ui.Components.gg;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.j60;
import org.telegram.ui.n01;
import org.telegram.ui.wy;
import org.telegram.ui.zg1;
public final class bb implements org.telegram.ui.ActionBar.c2, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, kl0, MessagesController.IsInChatCheckedCallback, t5.b, s5.e, pa.a, zg1 {
    public final int f2376a;
    public final long f2377b;
    public final Object f2378c;
    public final Object d;

    public bb(Object obj, long j3, Object obj2, int i10) {
        this.f2376a = i10;
        this.f2378c = obj;
        this.f2377b = j3;
        this.d = obj2;
    }

    @Override
    public Object apply(Object obj) {
        boolean z10;
        String str = (String) this.f2378c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((o5.c) this.d).f14264a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            if (rawQuery.getCount() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rawQuery.close();
            long j3 = this.f2377b;
            if (!z10) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i10));
                contentValues.put("events_dropped_count", Long.valueOf(j3));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(org.telegram.ui.Cells.r6.h(j3, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        ProfileActivity.b0((ProfileActivity) this.f2378c, (Context) this.d, this.f2377b, view, i10, f7, f10);
    }

    @Override
    public void d(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((xh.h) this.f2378c).h0(true, this.f2377b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.f2378c;
        long j3 = this.f2377b;
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
                Utilities.globalQueue.postRunnable(new yb(file, bitmap));
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
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f2376a) {
            case 0:
                kb kbVar = (kb) this.f2378c;
                ArrayList arrayList = (ArrayList) this.d;
                kbVar.d.put(Long.valueOf(this.f2377b), arrayList);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    kbVar.f3007b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                kbVar.i(true);
                kbVar.e(true);
                kbVar.f(true);
                d2Var.dismiss();
                kbVar.f3014x.K = true;
                return;
            case 3:
                sr.Q((sr) this.f2378c, (d) this.d, this.f2377b);
                return;
            default:
                j60 j60Var = (j60) this.f2378c;
                j60Var.d.getMessagesController().addUserToChat(j60Var.i1(), (TLRPC.User) this.d, 0, null, (org.telegram.ui.ActionBar.p2) j60Var.f33969i0.O().getFragmentStack().get(j60Var.f33969i0.O().getFragmentStack().size() - 1), new va(j60Var, this.f2377b, 19));
                return;
        }
    }

    @Override
    public Object g() {
        da.b bVar = (da.b) this.f2378c;
        long u10 = ((u5.a) bVar.f6356g).u() + this.f2377b;
        s5.g gVar = (s5.g) ((s5.d) bVar.f6354c);
        gVar.getClass();
        gVar.c(new za(u10, (l5.i) this.d));
        return null;
    }

    @Override
    public void j(pa.b bVar) {
        ((t9.a) bVar.get()).d((String) this.f2378c, this.f2377b, (y9.b1) this.d);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.f2378c).lambda$createGroupInstance$69(this.f2377b, (int[]) this.d, arrayList);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new gg((n01) this.f2378c, this.f2377b, tL_chatAdminRights, str, z10, (wy) this.d));
    }

    public bb(Object obj, Object obj2, long j3, int i10) {
        this.f2376a = i10;
        this.f2378c = obj;
        this.d = obj2;
        this.f2377b = j3;
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
