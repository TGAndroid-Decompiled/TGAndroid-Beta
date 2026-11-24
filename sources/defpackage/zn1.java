package defpackage;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class zn1 implements gk, ve3, c5c, ee, vn5, e6b, ew4, yeb {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public zn1(Object obj, long j, d dVar, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = dVar;
        this.e = obj2;
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        yv1 yv1Var = (yv1) this.c;
        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.e;
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
            int i = tL_photos_uploadProfilePhoto.flags;
            tL_photos_uploadProfilePhoto.video_start_ts = d;
            tL_photos_uploadProfilePhoto.flags = i | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
            tL_photos_uploadProfilePhoto.flags |= 16;
        }
        yv1Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new js2(yv1Var, fileLocationArr, str, fileLocationArr2, this.b));
    }

    @Override
    public final ScheduledFuture a(final k6d k6dVar) {
        byte b = this.a;
        Object obj = this.e;
        long j = this.b;
        Object obj2 = this.d;
        final ue3 ue3Var = (ue3) this.c;
        switch (b) {
            case 1:
                return ue3Var.b.schedule(new se3(ue3Var, (Runnable) obj2, k6dVar, (byte) 1), j, (TimeUnit) obj);
            default:
                final Callable callable = (Callable) obj2;
                return ue3Var.b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return ue3.this.a.submit(new rd3(callable, k6dVar, (byte) 2));
                    }
                }, j, (TimeUnit) obj);
        }
    }

    @Override
    public final void b(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        wsa wsaVar = (wsa) this.c;
        fw4 fw4Var = (fw4) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
        wsaVar.getClass();
        if (fw4Var.F1) {
            return;
        }
        wsaVar.d1(tL_starGiftUnique, this.b, tL_textWithEntities, z, fw4Var);
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final Object e() {
        za0 za0Var = (za0) this.c;
        Iterable iterable = (Iterable) this.d;
        rb0 rb0Var = (rb0) this.e;
        mq9 mq9Var = (mq9) za0Var.c;
        mq9Var.getClass();
        if (iterable.iterator().hasNext()) {
            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(mq9.g(iterable));
            SQLiteDatabase a = mq9Var.a();
            a.beginTransaction();
            try {
                a.compileStatement(concat).execute();
                Cursor rawQuery = a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    int i = rawQuery.getInt(0);
                    mq9Var.e(i, wd6.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                a.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a.setTransactionSuccessful();
            } finally {
                a.endTransaction();
            }
        }
        mq9Var.c(new d12(((hk2) za0Var.g).a() + this.b, rb0Var));
        return null;
    }

    @Override
    public final qb8 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        d dVar = (d) this.c;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
        qt0 qt0Var = (qt0) this.e;
        int currentAccount = dVar.getCurrentAccount();
        boolean[] zArr = u15.a;
        if (zArr[currentAccount]) {
            return;
        }
        zArr[currentAccount] = true;
        u15.b(dVar, this.b, tL_inputCheckPasswordSRP, twoStepVerificationActivity, qt0Var, null);
    }

    @Override
    public final Bitmap n(BitmapFactory.Options options) {
        cl8 cl8Var = (cl8) this.c;
        g6b g6bVar = (g6b) this.d;
        long j = this.b;
        String str = (String) this.e;
        if (g6bVar.K) {
            String str2 = g6bVar.N;
            if (str2 != null) {
                return BitmapFactory.decodeFile(str2, options);
            }
            try {
                return MediaStore.Video.Thumbnails.getThumbnail(cl8Var.getContext().getContentResolver(), j, 1, options);
            } catch (Throwable unused) {
                cl8Var.invalidate();
                return null;
            }
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        boolean z = false;
        Object obj = this.e;
        Object obj2 = this.d;
        long j = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 4:
                qd2 qd2Var = (qd2) obj3;
                Runnable runnable = (Runnable) obj;
                oh2 oh2Var = ((oh2[]) obj2)[0];
                if (oh2Var != null && oh2Var.b()) {
                    z = true;
                }
                g95.q1(qd2Var, z, j, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                ProfileActivity profileActivity = ((sp8) obj3).b;
                profileActivity.N1 = true;
                Bundle l = ts2.l("scrollToTopOnResume", true);
                long j2 = -j;
                l.putLong("chat_id", j2);
                if (profileActivity.getMessagesController().A(l, (nk3) obj2, null, null)) {
                    yv1 yv1Var = new yv1(l);
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.getMessagesController().k(j2, user, null, yv1Var, true, null, null);
                    profileActivity.presentFragment(yv1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        ((yv1) this.c).R8((ArrayList) this.d, this.b, (vs9) this.e, z, i);
    }

    public zn1(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }

    public zn1(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }

    @Override
    public final void H(float f) {
    }

    @Override
    public final void T() {
    }

    @Override
    public final void O(boolean z, boolean z2) {
    }
}
