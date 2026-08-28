package c3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import ff.g0;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kh.a8;
import kh.r6;
import kh.y7;
import n5.a0;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bu0;
import org.telegram.ui.dy;
import org.telegram.ui.dz0;
import org.telegram.ui.o50;
import org.telegram.ui.qn;
import w2.i;
import xf.o0;
public final class g implements e3.b, d40, y7, x4, b2, z8.g {
    public final int f2296a;
    public final long f2297b;
    public final Object f2298c;
    public final Object d;
    public final Object f2299e;

    public g(Object obj, Object obj2, long j10, Object obj3, int i9) {
        this.f2296a = i9;
        this.f2298c = obj;
        this.d = obj2;
        this.f2297b = j10;
        this.f2299e = obj3;
    }

    @Override
    public void B(int i9, int i10, boolean z10) {
        qn.r0((qn) this.f2298c, (ArrayList) this.d, this.f2297b, (ll0) this.f2299e, z10, i9);
    }

    @Override
    public void P(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        qn qnVar = (qn) this.f2298c;
        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f2299e;
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
            int i9 = tL_photos_uploadProfilePhoto.flags;
            tL_photos_uploadProfilePhoto.video_start_ts = d;
            tL_photos_uploadProfilePhoto.flags = i9 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
            tL_photos_uploadProfilePhoto.flags |= 16;
        }
        qnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new g0(qnVar, fileLocationArr, str, fileLocationArr2, this.f2297b));
    }

    @Override
    public ScheduledFuture a(final a0 a0Var) {
        switch (this.f2296a) {
            case 6:
                z8.f fVar = (z8.f) this.f2298c;
                return fVar.f50377b.schedule(new z8.d(fVar, (Runnable) this.d, a0Var, 1), this.f2297b, (TimeUnit) this.f2299e);
            default:
                final z8.f fVar2 = (z8.f) this.f2298c;
                final Callable callable = (Callable) this.d;
                return fVar2.f50377b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return f.this.f50376a.submit(new o0(8, callable, a0Var));
                    }
                }, this.f2297b, (TimeUnit) this.f2299e);
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void f(c2 c2Var, int i9) {
        switch (this.f2296a) {
            case 4:
                ChatObject.Call call = (ChatObject.Call) this.f2298c;
                Runnable runnable = (Runnable) this.f2299e;
                boolean z10 = false;
                z1 z1Var = ((z1[]) this.d)[0];
                if (z1Var != null && z1Var.b()) {
                    z10 = true;
                }
                o50.w1(call, z10, this.f2297b, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.f2299e;
                ProfileActivity profileActivity = ((dz0) this.f2298c).f37761b;
                profileActivity.J1 = true;
                Bundle i10 = aa.d.i("scrollToTopOnResume", true);
                long j10 = -this.f2297b;
                i10.putLong("chat_id", j10);
                if (profileActivity.getMessagesController().checkCanOpenChat(i10, (dy) this.d)) {
                    qn qnVar = new qn(i10);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i11 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i11);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j10, user, 0, null, qnVar, true, null, null);
                    profileActivity.presentFragment(qnVar, true);
                    return;
                }
                return;
        }
    }

    @Override
    public Bitmap g(BitmapFactory.Options options) {
        r6 r6Var = (r6) this.f2298c;
        a8 a8Var = (a8) this.d;
        long j10 = this.f2297b;
        String str = (String) this.f2299e;
        if (a8Var.K) {
            String str2 = a8Var.N;
            if (str2 != null) {
                return BitmapFactory.decodeFile(str2, options);
            }
            try {
                return MediaStore.Video.Thumbnails.getThumbnail(r6Var.getContext().getContentResolver(), j10, 1, options);
            } catch (Throwable unused) {
                r6Var.invalidate();
                return null;
            }
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public bu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public Object j() {
        h hVar = (h) this.f2298c;
        Iterable iterable = (Iterable) this.d;
        i iVar = (i) this.f2299e;
        d3.h hVar2 = (d3.h) ((d3.d) hVar.f2302c);
        hVar2.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + d3.h.g(iterable);
            SQLiteDatabase a2 = hVar2.a();
            a2.beginTransaction();
            try {
                a2.compileStatement(str).execute();
                Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    hVar2.e(rawQuery.getInt(0), z2.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                a2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a2.setTransactionSuccessful();
            } finally {
                a2.endTransaction();
            }
        }
        hVar2.c(new d3.e(((f3.a) hVar.f2305g).d() + this.f2297b, iVar));
        return null;
    }

    @Override
    public boolean u() {
        return false;
    }

    public g(Object obj, Object obj2, Object obj3, long j10, int i9) {
        this.f2296a = i9;
        this.f2298c = obj;
        this.d = obj2;
        this.f2299e = obj3;
        this.f2297b = j10;
    }

    public g(dz0 dz0Var, long j10, dy dyVar, TLRPC.User user) {
        this.f2296a = 5;
        this.f2298c = dz0Var;
        this.f2297b = j10;
        this.d = dyVar;
        this.f2299e = user;
    }

    @Override
    public void O() {
    }

    @Override
    public void D(float f10) {
    }

    @Override
    public void J(boolean z10, boolean z11) {
    }
}
