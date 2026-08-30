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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ag1;
import org.telegram.ui.c60;
import org.telegram.ui.oy;
import org.telegram.ui.oz0;
import ph.z7;
import y2.i;
public final class f implements g3.b, f3.f, ba.a, ag1, ChatObject.Call.OnParticipantsLoad, ImageReceiver.ImageReceiverDelegate, c2, jl0, MessagesController.IsInChatCheckedCallback {
    public final int f5092a;
    public final long f5093b;
    public final Object f5094c;
    public final Object d;

    public f(Object obj, long j10, Object obj2, int i10) {
        this.f5092a = i10;
        this.f5094c = obj;
        this.f5093b = j10;
        this.d = obj2;
    }

    @Override
    public Object apply(Object obj) {
        boolean z4;
        String str = (String) this.f5094c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((b3.c) this.d).f1298a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            if (rawQuery.getCount() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            rawQuery.close();
            long j10 = this.f5093b;
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
        ProfileActivity.b0((ProfileActivity) this.f5094c, (Context) this.d, this.f5093b, view, i10, f10, f11);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        ResultCallback resultCallback = (ResultCallback) this.f5094c;
        long j10 = this.f5093b;
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
    public boolean e1(View view) {
        return false;
    }

    @Override
    public void f(ba.b bVar) {
        ((f9.a) bVar.get()).d((String) this.f5094c, this.f5093b, (b1) this.d);
    }

    @Override
    public Object g() {
        g gVar = (g) this.f5094c;
        long X = ((h3.a) gVar.f5099g).X() + this.f5093b;
        h hVar = (h) ((f3.d) gVar.f5097c);
        hVar.getClass();
        hVar.c(new f3.e(X, (i) this.d));
        return null;
    }

    @Override
    public void i(d2 d2Var, int i10) {
        switch (this.f5092a) {
            case 6:
                jr.Q((jr) this.f5094c, (ph.d) this.d, this.f5093b);
                return;
            case 7:
                c60 c60Var = (c60) this.f5094c;
                c60Var.d.getMessagesController().addUserToChat(c60Var.i1(), (TLRPC.User) this.d, 0, null, (p2) c60Var.f33119f0.O().getFragmentStack().get(c60Var.f33119f0.O().getFragmentStack().size() - 1), new y1(c60Var, this.f5093b, 21));
                return;
            default:
                z7 z7Var = (z7) this.f5094c;
                ArrayList arrayList = (ArrayList) this.d;
                z7Var.d.put(Long.valueOf(this.f5093b), arrayList);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    z7Var.f42661b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                z7Var.i(true);
                z7Var.e(true);
                z7Var.f(true);
                d2Var.dismiss();
                z7Var.f42668x.H = true;
                return;
        }
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((q) this.f5094c).h0(true, this.f5093b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        j5.b(this, imageReceiver);
    }

    @Override
    public void onLoad(ArrayList arrayList) {
        ((VoIPService) this.f5094c).lambda$createGroupInstance$69(this.f5093b, (int[]) this.d, arrayList);
    }

    @Override
    public void run(boolean z4, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new j((oz0) this.f5094c, this.f5093b, tL_chatAdminRights, str, z4, (oy) this.d));
    }

    public f(Object obj, Object obj2, long j10, int i10) {
        this.f5092a = i10;
        this.f5094c = obj;
        this.d = obj2;
        this.f5093b = j10;
    }

    @Override
    public void o0(View view, float f10, float f11) {
    }
}
