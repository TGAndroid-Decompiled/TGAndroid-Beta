package b9;

import a4.w;
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
import jf.f0;
import nh.f6;
import nh.m7;
import nh.o7;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dz0;
import org.telegram.ui.fy;
import org.telegram.ui.r50;
import org.telegram.ui.tn;
import org.telegram.ui.zt0;
public final class d implements i, g3.b, r40, m7, b5, b2 {
    public final int f1997a;
    public final Object f1998b;
    public final long f1999c;
    public final Object d;
    public final Object f2000e;

    public d(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f1997a = i10;
        this.f1998b = obj;
        this.f2000e = obj2;
        this.f1999c = j10;
        this.d = obj3;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        tn.s0((tn) this.f1998b, (ArrayList) this.f2000e, this.f1999c, (yl0) this.d, z10, i10);
    }

    @Override
    public void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        tn tnVar = (tn) this.f1998b;
        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.f2000e;
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
        tnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new f0(tnVar, fileLocationArr, str, fileLocationArr2, this.f1999c));
    }

    @Override
    public ScheduledFuture a(final ha.c cVar) {
        switch (this.f1997a) {
            case 0:
                h hVar = (h) this.f1998b;
                return hVar.f2013b.schedule(new f(hVar, (Runnable) this.f2000e, cVar, 1), this.f1999c, (TimeUnit) this.d);
            default:
                final h hVar2 = (h) this.f1998b;
                final Callable callable = (Callable) this.f2000e;
                return hVar2.f2013b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return h.this.f2012a.submit(new a1.e(10, callable, cVar));
                    }
                }, this.f1999c, (TimeUnit) this.d);
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public Object f() {
        e3.f fVar = (e3.f) this.f1998b;
        Iterable iterable = (Iterable) this.f2000e;
        y2.i iVar = (y2.i) this.d;
        f3.h hVar = (f3.h) ((f3.d) fVar.f5814c);
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
        hVar.c(new f3.e(((h3.a) fVar.f5817g).e() + this.f1999c, iVar));
        return null;
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f1997a) {
            case 6:
                ChatObject.Call call = (ChatObject.Call) this.f1998b;
                Runnable runnable = (Runnable) this.f2000e;
                boolean z10 = false;
                y1 y1Var = ((y1[]) this.d)[0];
                if (y1Var != null && y1Var.b()) {
                    z10 = true;
                }
                r50.w1(call, z10, this.f1999c, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.d;
                ProfileActivity profileActivity = ((dz0) this.f1998b).f37655b;
                profileActivity.J1 = true;
                Bundle i11 = w.i("scrollToTopOnResume", true);
                long j10 = -this.f1999c;
                i11.putLong("chat_id", j10);
                if (profileActivity.getMessagesController().checkCanOpenChat(i11, (fy) this.f2000e)) {
                    tn tnVar = new tn(i11);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j10, user, 0, null, tnVar, true, null, null);
                    profileActivity.presentFragment(tnVar, true);
                    return;
                }
                return;
        }
    }

    @Override
    public zt0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public Bitmap h(BitmapFactory.Options options) {
        f6 f6Var = (f6) this.f1998b;
        o7 o7Var = (o7) this.f2000e;
        long j10 = this.f1999c;
        String str = (String) this.d;
        if (o7Var.K) {
            String str2 = o7Var.N;
            if (str2 != null) {
                return BitmapFactory.decodeFile(str2, options);
            }
            try {
                return MediaStore.Video.Thumbnails.getThumbnail(f6Var.getContext().getContentResolver(), j10, 1, options);
            } catch (Throwable unused) {
                f6Var.invalidate();
                return null;
            }
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public boolean u() {
        return false;
    }

    public d(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f1997a = i10;
        this.f1998b = obj;
        this.f2000e = obj2;
        this.d = obj3;
        this.f1999c = j10;
    }

    public d(ChatObject.Call call, y1[] y1VarArr, long j10, Runnable runnable) {
        this.f1997a = 6;
        this.f1998b = call;
        this.d = y1VarArr;
        this.f1999c = j10;
        this.f2000e = runnable;
    }

    public d(dz0 dz0Var, long j10, fy fyVar, TLRPC.User user) {
        this.f1997a = 7;
        this.f1998b = dz0Var;
        this.f1999c = j10;
        this.f2000e = fyVar;
        this.d = user;
    }

    @Override
    public void P() {
    }

    @Override
    public void D(float f9) {
    }

    @Override
    public void K(boolean z10, boolean z11) {
    }
}
