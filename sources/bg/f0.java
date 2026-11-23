package bg;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import bi.j1;
import bi.k1;
import di.f6;
import hi.v7;
import hi.x7;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.p10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.e40;
import org.telegram.ui.ma1;
import org.telegram.ui.qv0;
import org.telegram.ui.wq0;
public final class f0 implements t30, j1, v7, ma1, z4, q1, w5.b, v9.h {
    public final int f3199a;
    public final long f3200b;
    public final Object f3201c;
    public final Object d;
    public final Object f3202e;

    public f0(Object obj, long j3, g2 g2Var, Object obj2, int i7) {
        this.f3199a = i7;
        this.f3201c = obj;
        this.f3200b = j3;
        this.d = g2Var;
        this.f3202e = obj2;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        bn.A1((bn) this.f3201c, (ArrayList) this.d, this.f3200b, (yk0) this.f3202e, z10, i7);
    }

    @Override
    public void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        bn bnVar = (bn) this.f3201c;
        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f3202e;
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
        bnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new h0(bnVar, fileLocationArr, str, fileLocationArr2, this.f3200b));
    }

    @Override
    public void a(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        f6 f6Var = (f6) this.f3201c;
        k1 k1Var = (k1) this.d;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f3202e;
        f6Var.getClass();
        if (k1Var.G1) {
            return;
        }
        f6Var.p1(tL_starGiftUnique, this.f3200b, tL_textWithEntities, z10, k1Var);
    }

    @Override
    public Bitmap b(BitmapFactory.Options options) {
        hi.f6 f6Var = (hi.f6) this.f3201c;
        x7 x7Var = (x7) this.d;
        long j3 = this.f3200b;
        String str = (String) this.f3202e;
        if (x7Var.K) {
            String str2 = x7Var.N;
            if (str2 != null) {
                return BitmapFactory.decodeFile(str2, options);
            }
            try {
                return MediaStore.Video.Thumbnails.getThumbnail(f6Var.getContext().getContentResolver(), j3, 1, options);
            } catch (Throwable unused) {
                f6Var.invalidate();
                return null;
            }
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public ScheduledFuture c(final nd0 nd0Var) {
        switch (this.f3199a) {
            case 8:
                v9.g gVar = (v9.g) this.f3201c;
                return gVar.f59451b.schedule(new v9.e(gVar, (Runnable) this.d, nd0Var, 1), this.f3200b, (TimeUnit) this.f3202e);
            default:
                final v9.g gVar2 = (v9.g) this.f3201c;
                final Callable callable = (Callable) this.d;
                return gVar2.f59451b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return g.this.f59450a.submit(new b(0, callable, nd0Var));
                    }
                }, this.f3200b, (TimeUnit) this.f3202e);
        }
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public wq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public Object h() {
        ia.c cVar = (ia.c) this.f3201c;
        Iterable iterable = (Iterable) this.d;
        o5.i iVar = (o5.i) this.f3202e;
        v5.g gVar = (v5.g) ((v5.d) cVar.f16281c);
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
        gVar.c(new ai.z(((x5.a) cVar.f16284g).o() + this.f3200b, iVar));
        return null;
    }

    @Override
    public void i(t1 t1Var, int i7) {
        switch (this.f3199a) {
            case 5:
                t3 t3Var = (t3) this.f3201c;
                Runnable runnable = (Runnable) this.f3202e;
                boolean z10 = false;
                d2 d2Var = ((d2[]) this.d)[0];
                if (d2Var != null && d2Var.b()) {
                    z10 = true;
                }
                e40.C1(t3Var, z10, this.f3200b, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.f3202e;
                ProfileActivity profileActivity = ((qv0) this.f3201c).f51546b;
                profileActivity.N1 = true;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                long j3 = -this.f3200b;
                k10.putLong("chat_id", j3);
                if (profileActivity.getMessagesController().E(k10, (bx) this.d, null, null)) {
                    bn bnVar = new bn(k10);
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.getMessagesController().m(j3, user, 0, null, bnVar, true, null, null, null);
                    profileActivity.presentFragment(bnVar, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        g2 g2Var = (g2) this.f3201c;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.d;
        p10 p10Var = (p10) this.f3202e;
        int currentAccount = g2Var.getCurrentAccount();
        boolean[] zArr = ii.n.f16413a;
        if (zArr[currentAccount]) {
            return;
        }
        zArr[currentAccount] = true;
        ii.n.b(g2Var, this.f3200b, tL_inputCheckPasswordSRP, twoStepVerificationActivity, p10Var, null);
    }

    @Override
    public boolean x() {
        return false;
    }

    public f0(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f3199a = i7;
        this.f3201c = obj;
        this.d = obj2;
        this.f3200b = j3;
        this.f3202e = obj3;
    }

    public f0(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f3199a = i7;
        this.f3201c = obj;
        this.d = obj2;
        this.f3202e = obj3;
        this.f3200b = j3;
    }

    @Override
    public void U() {
    }

    @Override
    public void H(float f10) {
    }

    @Override
    public void P(boolean z10, boolean z11) {
    }
}
