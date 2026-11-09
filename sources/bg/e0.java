package bg;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import bi.k7;
import di.c1;
import fi.c7;
import fi.e7;
import fi.y5;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.r3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.kk0;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.t4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
import org.telegram.ui.e40;
import org.telegram.ui.tv0;
import org.telegram.ui.yq0;
import org.telegram.ui.yw;
import wg.f1;
public final class e0 implements j30, r1, c7, t4, w5.b, v9.g {
    public final int f3271a;
    public final long f3272b;
    public final Object f3273c;
    public final Object d;
    public final Object f3274e;

    public e0(Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.f3271a = i7;
        this.f3273c = obj;
        this.f3272b = j3;
        this.d = obj2;
        this.f3274e = obj3;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        cn.A1((cn) this.f3273c, (ArrayList) this.d, this.f3272b, (kk0) this.f3274e, z9, i7);
    }

    @Override
    public void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        cn cnVar = (cn) this.f3273c;
        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f3274e;
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
            int i7 = tL_photos_uploadProfilePhoto.flags;
            tL_photos_uploadProfilePhoto.video_start_ts = d;
            tL_photos_uploadProfilePhoto.flags = i7 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
            tL_photos_uploadProfilePhoto.flags |= 16;
        }
        cnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new g0(cnVar, fileLocationArr, str, fileLocationArr2, this.f3272b));
    }

    @Override
    public ScheduledFuture a(final rt rtVar) {
        switch (this.f3271a) {
            case 7:
                v9.f fVar = (v9.f) this.f3273c;
                return fVar.f57285b.schedule(new v9.d(fVar, (Runnable) this.d, rtVar, 1), this.f3272b, (TimeUnit) this.f3274e);
            default:
                final v9.f fVar2 = (v9.f) this.f3273c;
                final Callable callable = (Callable) this.d;
                return fVar2.f57285b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return f.this.f57284a.submit(new u9.f(11, callable, rtVar));
                    }
                }, this.f3272b, (TimeUnit) this.f3274e);
        }
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        y5 y5Var = (y5) this.f3273c;
        e7 e7Var = (e7) this.d;
        long j3 = this.f3272b;
        String str = (String) this.f3274e;
        if (e7Var.K) {
            String str2 = e7Var.N;
            if (str2 != null) {
                return BitmapFactory.decodeFile(str2, options);
            }
            try {
                return MediaStore.Video.Thumbnails.getThumbnail(y5Var.getContext().getContentResolver(), j3, 1, options);
            } catch (Throwable unused) {
                y5Var.invalidate();
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
    public void g(u1 u1Var, int i7) {
        switch (this.f3271a) {
            case 1:
                k7 k7Var = (k7) this.f3273c;
                f1 f1Var = (f1) this.f3274e;
                k7Var.getClass();
                k7Var.q1(this.f3272b, ((TL_stars.starGiftDepositPayload[]) this.d)[0], u1Var.h(i7, true, true), f1Var);
                return;
            case 4:
                r3 r3Var = (r3) this.f3273c;
                Runnable runnable = (Runnable) this.f3274e;
                boolean z9 = false;
                c2 c2Var = ((c2[]) this.d)[0];
                if (c2Var != null && c2Var.b()) {
                    z9 = true;
                }
                e40.B1(r3Var, z9, this.f3272b, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.f3274e;
                ProfileActivity profileActivity = ((tv0) this.f3273c).f50246b;
                profileActivity.M1 = true;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                long j3 = -this.f3272b;
                k10.putLong("chat_id", j3);
                if (profileActivity.getMessagesController().E(k10, (yw) this.d, null, null)) {
                    cn cnVar = new cn(k10);
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.getMessagesController().m(j3, user, 0, null, cnVar, true, null, null, null);
                    profileActivity.presentFragment(cnVar, true);
                    return;
                }
                return;
        }
    }

    @Override
    public yq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public Object h() {
        ia.c cVar = (ia.c) this.f3273c;
        Iterable iterable = (Iterable) this.d;
        o5.i iVar = (o5.i) this.f3274e;
        v5.g gVar = (v5.g) ((v5.d) cVar.f15420c);
        gVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + v5.g.g(iterable);
            SQLiteDatabase a10 = gVar.a();
            a10.beginTransaction();
            try {
                a10.compileStatement(str).execute();
                Cursor rawQuery = a10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    gVar.e(rawQuery.getInt(0), r5.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                a10.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a10.setTransactionSuccessful();
            } finally {
                a10.endTransaction();
            }
        }
        gVar.c(new c1(((x5.a) cVar.f15423g).s() + this.f3272b, iVar));
        return null;
    }

    @Override
    public boolean x() {
        return false;
    }

    public e0(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f3271a = i7;
        this.f3273c = obj;
        this.d = obj2;
        this.f3272b = j3;
        this.f3274e = obj3;
    }

    public e0(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f3271a = i7;
        this.f3273c = obj;
        this.d = obj2;
        this.f3274e = obj3;
        this.f3272b = j3;
    }

    @Override
    public void T() {
    }

    @Override
    public void H(float f10) {
    }

    @Override
    public void O(boolean z9, boolean z10) {
    }
}
