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
import gg.y1;
import java.io.File;
import java.util.ArrayList;
import k9.b1;
import lh.j;
import lh.q;
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
import org.telegram.ui.ActionBar.c4;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.ir;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.e60;
import org.telegram.ui.ig1;
import org.telegram.ui.qy;
import org.telegram.ui.vz0;
import ph.y7;
import y2.i;
public final class f implements g3.b, f3.f, ba.a, ig1, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, c2, il0, MessagesController.IsInChatCheckedCallback {
    public final int f5098a;
    public final long f5099b;
    public final Object f5100c;
    public final Object d;

    public f(Object obj, long j10, Object obj2, int i10) {
        this.f5098a = i10;
        this.f5100c = obj;
        this.f5099b = j10;
        this.d = obj2;
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public Object apply(Object obj) {
        boolean z4;
        String str = (String) this.f5100c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((b3.c) this.d).f1309a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            if (rawQuery.getCount() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            rawQuery.close();
            long j10 = this.f5099b;
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
        ProfileActivity.b0((ProfileActivity) this.f5100c, (Context) this.d, this.f5099b, view, i10, f10, f11);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        ResultCallback resultCallback = (ResultCallback) this.f5100c;
        long j10 = this.f5099b;
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
                Utilities.globalQueue.postRunnable(new c4(file, bitmap));
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
        ((f9.a) bVar.get()).d((String) this.f5100c, this.f5099b, (b1) this.d);
    }

    @Override
    public void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((q) this.f5100c).h0(true, this.f5099b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public Object h() {
        g gVar = (g) this.f5100c;
        long l10 = ((h3.a) gVar.f5105g).l() + this.f5099b;
        f3.h hVar = (f3.h) ((f3.d) gVar.f5103c);
        hVar.getClass();
        hVar.c(new f3.e(l10, (i) this.d));
        return null;
    }

    @Override
    public void l(d2 d2Var, int i10) {
        switch (this.f5098a) {
            case 6:
                ir.Q((ir) this.f5100c, (ph.d) this.d, this.f5099b);
                return;
            case 7:
                e60 e60Var = (e60) this.f5100c;
                e60Var.d.getMessagesController().addUserToChat(e60Var.i1(), (TLRPC.User) this.d, 0, null, (p2) e60Var.f33638f0.O().getFragmentStack().get(e60Var.f33638f0.O().getFragmentStack().size() - 1), new y1(e60Var, this.f5099b, 20));
                return;
            default:
                y7 y7Var = (y7) this.f5100c;
                ArrayList arrayList = (ArrayList) this.d;
                y7Var.d.put(Long.valueOf(this.f5099b), arrayList);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    y7Var.f42659b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                y7Var.i(true);
                y7Var.e(true);
                y7Var.f(true);
                d2Var.dismiss();
                y7Var.f42666x.H = true;
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.f5100c).lambda$createGroupInstance$69(this.f5099b, (int[]) this.d, arrayList);
    }

    @Override
    public void run(boolean z4, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new j((vz0) this.f5100c, this.f5099b, tL_chatAdminRights, str, z4, (qy) this.d));
    }

    public f(Object obj, Object obj2, long j10, int i10) {
        this.f5098a = i10;
        this.f5100c = obj;
        this.d = obj2;
        this.f5099b = j10;
    }

    @Override
    public void n0(View view, float f10, float f11) {
    }
}
