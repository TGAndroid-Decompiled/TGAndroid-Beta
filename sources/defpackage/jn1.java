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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class jn1 implements hj, ce3, b7c, fd, yn5, a8b, gw4, sgb {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public jn1(Object obj, long j, e eVar, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = eVar;
        this.e = obj2;
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        zu1 zu1Var = (zu1) this.c;
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
        zu1Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new rr2(zu1Var, fileLocationArr, str, fileLocationArr2, this.b));
    }

    @Override
    public final ScheduledFuture a(final z8d z8dVar) {
        byte b = this.a;
        Object obj = this.e;
        long j = this.b;
        Object obj2 = this.d;
        final be3 be3Var = (be3) this.c;
        switch (b) {
            case 1:
                return be3Var.b.schedule(new zd3(be3Var, (Runnable) obj2, z8dVar, (byte) 1), j, (TimeUnit) obj);
            default:
                final Callable callable = (Callable) obj2;
                return be3Var.b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return be3.this.a.submit(new wd3(callable, z8dVar, (byte) 0));
                    }
                }, j, (TimeUnit) obj);
        }
    }

    @Override
    public final void b(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        wua wuaVar = (wua) this.c;
        hw4 hw4Var = (hw4) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.e;
        wuaVar.getClass();
        if (hw4Var.F1) {
            return;
        }
        wuaVar.e1(tL_starGiftUnique, this.b, tL_textWithEntities, z, hw4Var);
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final Object g() {
        ba0 ba0Var = (ba0) this.c;
        Iterable iterable = (Iterable) this.d;
        ta0 ta0Var = (ta0) this.e;
        ds9 ds9Var = (ds9) ba0Var.c;
        ds9Var.getClass();
        if (iterable.iterator().hasNext()) {
            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(ds9.g(iterable));
            SQLiteDatabase a = ds9Var.a();
            a.beginTransaction();
            try {
                a.compileStatement(concat).execute();
                Cursor rawQuery = a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    int i = rawQuery.getInt(0);
                    ds9Var.e(i, be6.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                a.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a.setTransactionSuccessful();
            } finally {
                a.endTransaction();
            }
        }
        ds9Var.c(new i02(((pj2) ba0Var.g).e() + this.b, ta0Var));
        return null;
    }

    @Override
    public final fd8 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        e eVar = (e) this.c;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
        qs0 qs0Var = (qs0) this.e;
        int currentAccount = eVar.getCurrentAccount();
        boolean[] zArr = z15.a;
        if (zArr[currentAccount]) {
            return;
        }
        zArr[currentAccount] = true;
        z15.b(eVar, this.b, tL_inputCheckPasswordSRP, twoStepVerificationActivity, qs0Var, null);
    }

    @Override
    public final Bitmap i(BitmapFactory.Options options) {
        mm8 mm8Var = (mm8) this.c;
        c8b c8bVar = (c8b) this.d;
        long j = this.b;
        String str = (String) this.e;
        if (c8bVar.K) {
            String str2 = c8bVar.N;
            if (str2 != null) {
                return BitmapFactory.decodeFile(str2, options);
            }
            try {
                return MediaStore.Video.Thumbnails.getThumbnail(mm8Var.getContext().getContentResolver(), j, 1, options);
            } catch (Throwable unused) {
                mm8Var.invalidate();
                return null;
            }
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        boolean z = false;
        Object obj = this.e;
        Object obj2 = this.d;
        long j = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 4:
                vc2 vc2Var = (vc2) obj3;
                Runnable runnable = (Runnable) obj;
                sg2 sg2Var = ((sg2[]) obj2)[0];
                if (sg2Var != null && sg2Var.b()) {
                    z = true;
                }
                j95.r1(vc2Var, z, j, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                ProfileActivity profileActivity = ((cr8) obj3).b;
                profileActivity.N1 = true;
                Bundle l = bs2.l("scrollToTopOnResume", true);
                long j2 = -j;
                l.putLong("chat_id", j2);
                if (profileActivity.getMessagesController().C(l, (uj3) obj2, null, null)) {
                    zu1 zu1Var = new zu1(l);
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.getMessagesController().k(j2, user, null, zu1Var, true, null, null);
                    profileActivity.presentFragment(zu1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        ((zu1) this.c).S8((ArrayList) this.d, this.b, (mu9) this.e, z, i);
    }

    public jn1(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }

    public jn1(Object obj, Object obj2, Object obj3, long j, byte b) {
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
