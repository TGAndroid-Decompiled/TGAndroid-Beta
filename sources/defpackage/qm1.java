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
public final class qm1 implements gj, jd3, b3c, ed, vl5, d4b, cu4, xcb {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public qm1(Object obj, long j, d dVar, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = dVar;
        this.e = obj2;
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        mu1 mu1Var = (mu1) this.c;
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
        mu1Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new yq2(mu1Var, fileLocationArr, str, fileLocationArr2, this.b));
    }

    @Override
    public final ScheduledFuture a(final l69 l69Var) {
        byte b = this.a;
        Object obj = this.e;
        long j = this.b;
        Object obj2 = this.d;
        final id3 id3Var = (id3) this.c;
        switch (b) {
            case 1:
                return id3Var.b.schedule(new gd3(id3Var, (Runnable) obj2, l69Var, (byte) 1), j, (TimeUnit) obj);
            default:
                final Callable callable = (Callable) obj2;
                return id3Var.b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return id3.this.a.submit(new wc3(callable, l69Var, (byte) 1));
                    }
                }, j, (TimeUnit) obj);
        }
    }

    @Override
    public final void b(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        vqa vqaVar = (vqa) this.c;
        du4 du4Var = (du4) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
        vqaVar.getClass();
        if (du4Var.F1) {
            return;
        }
        vqaVar.d1(tL_starGiftUnique, this.b, tL_textWithEntities, z, du4Var);
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        d dVar = (d) this.c;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
        is0 is0Var = (is0) this.e;
        int currentAccount = dVar.getCurrentAccount();
        boolean[] zArr = uz4.a;
        if (zArr[currentAccount]) {
            return;
        }
        zArr[currentAccount] = true;
        uz4.b(dVar, this.b, tL_inputCheckPasswordSRP, twoStepVerificationActivity, is0Var, null);
    }

    @Override
    public final p98 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final Bitmap l(BitmapFactory.Options options) {
        zi8 zi8Var = (zi8) this.c;
        f4b f4bVar = (f4b) this.d;
        long j = this.b;
        String str = (String) this.e;
        if (f4bVar.K) {
            String str2 = f4bVar.N;
            if (str2 != null) {
                return BitmapFactory.decodeFile(str2, options);
            }
            try {
                return MediaStore.Video.Thumbnails.getThumbnail(zi8Var.getContext().getContentResolver(), j, 1, options);
            } catch (Throwable unused) {
                zi8Var.invalidate();
                return null;
            }
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public final Object m() {
        z90 z90Var = (z90) this.c;
        Iterable iterable = (Iterable) this.d;
        ra0 ra0Var = (ra0) this.e;
        lo9 lo9Var = (lo9) z90Var.c;
        lo9Var.getClass();
        if (iterable.iterator().hasNext()) {
            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(lo9.g(iterable));
            SQLiteDatabase a = lo9Var.a();
            a.beginTransaction();
            try {
                a.compileStatement(concat).execute();
                Cursor rawQuery = a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    int i = rawQuery.getInt(0);
                    lo9Var.e(i, xb6.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                a.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a.setTransactionSuccessful();
            } finally {
                a.endTransaction();
            }
        }
        lo9Var.c(new rz1(((ti2) z90Var.g).e() + this.b, ra0Var));
        return null;
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        ((mu1) this.c).F8((ArrayList) this.d, this.b, (tq9) this.e, z, i);
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        boolean z = false;
        Object obj = this.e;
        Object obj2 = this.d;
        long j = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 4:
                fc2 fc2Var = (fc2) obj3;
                Runnable runnable = (Runnable) obj;
                ag2 ag2Var = ((ag2[]) obj2)[0];
                if (ag2Var != null && ag2Var.b()) {
                    z = true;
                }
                h75.q1(fc2Var, z, j, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                ProfileActivity profileActivity = ((rn8) obj3).b;
                profileActivity.N1 = true;
                Bundle l = ir2.l("scrollToTopOnResume", true);
                long j2 = -j;
                l.putLong("chat_id", j2);
                if (profileActivity.getMessagesController().A(l, (cj3) obj2, null, null)) {
                    mu1 mu1Var = new mu1(l);
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.getMessagesController().j(j2, user, 0, null, mu1Var, true, null, null, null);
                    profileActivity.presentFragment(mu1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean x() {
        return false;
    }

    public qm1(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }

    public qm1(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }

    @Override
    public final void T() {
    }

    @Override
    public final void H(float f) {
    }

    @Override
    public final void O(boolean z, boolean z2) {
    }
}
