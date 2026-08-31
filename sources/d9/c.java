package d9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import lf.f0;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.y4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d60;
import org.telegram.ui.lu0;
import org.telegram.ui.py;
import org.telegram.ui.qz0;
import org.telegram.ui.xn;
import qh.j5;
import qh.q6;
import qh.s6;
public final class c implements h, g3.b, x40, y4, c2, q6 {
    public final int f4352a;
    public final Object f4353b;
    public final long f4354c;
    public final Object d;
    public final Object f4355e;

    public c(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f4352a = i10;
        this.f4353b = obj;
        this.f4355e = obj2;
        this.f4354c = j10;
        this.d = obj3;
    }

    @Override
    public void I(int i10, int i11, boolean z4) {
        xn.s0((xn) this.f4353b, (ArrayList) this.f4355e, this.f4354c, (jm0) this.d, z4, i10);
    }

    @Override
    public void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        xn xnVar = (xn) this.f4353b;
        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.f4355e;
        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.d;
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            fileLocationArr[0] = photoSize2.location;
            fileLocationArr2[0] = photoSize.location;
            return;
        }
        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
        if (inputFile != null) {
            tL_photos_uploadProfilePhoto.file = inputFile;
            tL_photos_uploadProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadProfilePhoto.video = inputFile2;
            int i10 = tL_photos_uploadProfilePhoto.flags;
            tL_photos_uploadProfilePhoto.video_start_ts = d;
            tL_photos_uploadProfilePhoto.flags = i10 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
            tL_photos_uploadProfilePhoto.flags |= 16;
        }
        xnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new f0(xnVar, fileLocationArr, str, fileLocationArr2, this.f4354c));
    }

    @Override
    public ScheduledFuture a(final y5.h hVar) {
        switch (this.f4352a) {
            case 0:
                g gVar = (g) this.f4353b;
                return gVar.f4368b.schedule(new e(gVar, (Runnable) this.f4355e, hVar, 1), this.f4354c, (TimeUnit) this.d);
            default:
                final g gVar2 = (g) this.f4353b;
                final Callable callable = (Callable) this.f4355e;
                return gVar2.f4368b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return g.this.f4367a.submit(new a1.e(14, callable, hVar));
                    }
                }, this.f4354c, (TimeUnit) this.d);
        }
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        j5 j5Var = (j5) this.f4353b;
        s6 s6Var = (s6) this.f4355e;
        long j10 = this.f4354c;
        String str = (String) this.d;
        if (s6Var.K) {
            String str2 = s6Var.N;
            if (str2 != null) {
                return BitmapFactory.decodeFile(str2, options);
            }
            try {
                return MediaStore.Video.Thumbnails.getThumbnail(j5Var.getContext().getContentResolver(), j10, 1, options);
            } catch (Throwable unused) {
                j5Var.invalidate();
                return null;
            }
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public Object g() {
        e3.g gVar = (e3.g) this.f4353b;
        Iterable iterable = (Iterable) this.f4355e;
        y2.i iVar = (y2.i) this.d;
        f3.h hVar = (f3.h) ((f3.d) gVar.f4933c);
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + f3.h.g(iterable);
            SQLiteDatabase a2 = hVar.a();
            a2.beginTransaction();
            try {
                a2.compileStatement(str).execute();
                Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    hVar.e(rawQuery.getInt(0), b3.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                a2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a2.setTransactionSuccessful();
            } finally {
                a2.endTransaction();
            }
        }
        hVar.c(new f3.e(((h3.a) gVar.f4936g).W() + this.f4354c, iVar));
        return null;
    }

    @Override
    public lu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void j(d2 d2Var, int i10) {
        switch (this.f4352a) {
            case 5:
                ChatObject.Call call = (ChatObject.Call) this.f4353b;
                Runnable runnable = (Runnable) this.f4355e;
                boolean z4 = false;
                z1 z1Var = ((z1[]) this.d)[0];
                if (z1Var != null && z1Var.b()) {
                    z4 = true;
                }
                d60.w1(call, z4, this.f4354c, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.d;
                ProfileActivity profileActivity = ((qz0) this.f4353b).f40724b;
                profileActivity.K1 = true;
                Bundle i11 = android.support.v4.media.a.i("scrollToTopOnResume", true);
                long j10 = -this.f4354c;
                i11.putLong("chat_id", j10);
                if (profileActivity.getMessagesController().checkCanOpenChat(i11, (py) this.f4355e)) {
                    xn xnVar = new xn(i11);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j10, user, 0, null, xnVar, true, null, null);
                    profileActivity.presentFragment(xnVar, true);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean u() {
        return false;
    }

    public c(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f4352a = i10;
        this.f4353b = obj;
        this.f4355e = obj2;
        this.d = obj3;
        this.f4354c = j10;
    }

    public c(ChatObject.Call call, z1[] z1VarArr, long j10, Runnable runnable) {
        this.f4352a = 5;
        this.f4353b = call;
        this.d = z1VarArr;
        this.f4354c = j10;
        this.f4355e = runnable;
    }

    public c(qz0 qz0Var, long j10, py pyVar, TLRPC.User user) {
        this.f4352a = 6;
        this.f4353b = qz0Var;
        this.f4354c = j10;
        this.f4355e = pyVar;
        this.d = user;
    }

    @Override
    public void P() {
    }

    @Override
    public void D(float f10) {
    }

    @Override
    public void K(boolean z4, boolean z10) {
    }
}
