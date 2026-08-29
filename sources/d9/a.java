package d9;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import eg.z1;
import f3.f;
import f3.h;
import i9.b1;
import java.io.File;
import java.util.ArrayList;
import jh.q;
import nh.l9;
import nh.y8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i5;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.fr;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dz0;
import org.telegram.ui.fy;
import org.telegram.ui.pf1;
import org.telegram.ui.r50;
import y2.i;
public final class a implements z9.a, g3.b, f, pf1, b2, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, al0, MessagesController.IsInChatCheckedCallback {
    public final int f5529a;
    public final long f5530b;
    public final Object f5531c;
    public final Object d;

    public a(Object obj, long j10, Object obj2, int i10) {
        this.f5529a = i10;
        this.f5531c = obj;
        this.f5530b = j10;
        this.d = obj2;
    }

    @Override
    public Object apply(Object obj) {
        boolean z10;
        String str = (String) this.f5531c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((b3.c) this.d).f1909a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            if (rawQuery.getCount() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rawQuery.close();
            long j10 = this.f5530b;
            if (!z10) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i10));
                contentValues.put("events_dropped_count", Long.valueOf(j10));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(com.google.android.recaptcha.internal.a.l(j10, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        ProfileActivity.b0((ProfileActivity) this.f5531c, (Context) this.d, this.f5530b, view, i10, f9, f10);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.f5531c;
        long j10 = this.f5530b;
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
                Utilities.globalQueue.postRunnable(new l9(file, bitmap));
            } else if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        i5.a(this, i10, str, drawable);
    }

    @Override
    public Object f() {
        e3.f fVar = (e3.f) this.f5531c;
        long e10 = ((h3.a) fVar.f5817g).e() + this.f5530b;
        h hVar = (h) ((f3.d) fVar.f5814c);
        hVar.getClass();
        hVar.c(new f3.e(e10, (i) this.d));
        return null;
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f5529a) {
            case 4:
                y8 y8Var = (y8) this.f5531c;
                ArrayList arrayList = (ArrayList) this.d;
                y8Var.d.put(Long.valueOf(this.f5530b), arrayList);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    y8Var.f18902b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                y8Var.i(true);
                y8Var.e(true);
                y8Var.f(true);
                c2Var.dismiss();
                y8Var.f18910x.G = true;
                return;
            case 7:
                fr.Q((fr) this.f5531c, (nh.d) this.d, this.f5530b);
                return;
            default:
                r50 r50Var = (r50) this.f5531c;
                r50Var.d.getMessagesController().addUserToChat(r50Var.i1(), (TLRPC.User) this.d, 0, null, (o2) r50Var.f41885e0.O().getFragmentStack().get(r50Var.f41885e0.O().getFragmentStack().size() - 1), new z1(r50Var, this.f5530b, 24));
                return;
        }
    }

    @Override
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((q) this.f5531c).h0(true, this.f5530b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void j(z9.b bVar) {
        ((b) bVar.get()).d((String) this.f5531c, this.f5530b, (b1) this.d);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        i5.b(this, imageReceiver);
    }

    @Override
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.f5531c).lambda$createGroupInstance$69(this.f5530b, (int[]) this.d, arrayList);
    }

    @Override
    public void run(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new jh.i((dz0) this.f5531c, this.f5530b, tL_chatAdminRights, str, z10, (fy) this.d));
    }

    public a(Object obj, Object obj2, long j10, int i10) {
        this.f5529a = i10;
        this.f5531c = obj;
        this.d = obj2;
        this.f5530b = j10;
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }
}
