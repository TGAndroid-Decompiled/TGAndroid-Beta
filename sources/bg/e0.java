package bg;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import di.c6;
import hi.b7;
import hi.d7;
import hi.x5;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.r3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.r4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.pv0;
import org.telegram.ui.uq0;
import org.telegram.ui.yw;
import ug.t1;
import wg.c1;
public final class e0 implements l30, q1, b7, r4, w5.b, v9.g {
    public final int f3226a;
    public final long f3227b;
    public final Object f3228c;
    public final Object d;
    public final Object f3229e;

    public e0(Object obj, long j3, Object obj2, Object obj3, int i7) {
        this.f3226a = i7;
        this.f3228c = obj;
        this.f3227b = j3;
        this.d = obj2;
        this.f3229e = obj3;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        an.A1((an) this.f3228c, (ArrayList) this.d, this.f3227b, (ok0) this.f3229e, z10, i7);
    }

    @Override
    public void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        an anVar = (an) this.f3228c;
        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f3229e;
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
        anVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new g0(anVar, fileLocationArr, str, fileLocationArr2, this.f3227b));
    }

    @Override
    public ScheduledFuture a(final cf cfVar) {
        switch (this.f3226a) {
            case 7:
                v9.f fVar = (v9.f) this.f3228c;
                return fVar.f58754b.schedule(new v9.d(fVar, (Runnable) this.d, cfVar, 1), this.f3227b, (TimeUnit) this.f3229e);
            default:
                final v9.f fVar2 = (v9.f) this.f3228c;
                final Callable callable = (Callable) this.d;
                return fVar2.f58754b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return f.this.f58753a.submit(new t1(2, callable, cfVar));
                    }
                }, this.f3227b, (TimeUnit) this.f3229e);
        }
    }

    @Override
    public Bitmap d(BitmapFactory.Options options) {
        x5 x5Var = (x5) this.f3228c;
        d7 d7Var = (d7) this.d;
        long j3 = this.f3227b;
        String str = (String) this.f3229e;
        if (d7Var.K) {
            String str2 = d7Var.N;
            if (str2 != null) {
                return BitmapFactory.decodeFile(str2, options);
            }
            try {
                return MediaStore.Video.Thumbnails.getThumbnail(x5Var.getContext().getContentResolver(), j3, 1, options);
            } catch (Throwable unused) {
                x5Var.invalidate();
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
        ia.c cVar = (ia.c) this.f3228c;
        Iterable iterable = (Iterable) this.d;
        o5.i iVar = (o5.i) this.f3229e;
        v5.g gVar = (v5.g) ((v5.d) cVar.f15875c);
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
        gVar.c(new ai.c0(((x5.a) cVar.f15878g).s() + this.f3227b, iVar, 14));
        return null;
    }

    @Override
    public uq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f3226a) {
            case 1:
                c6 c6Var = (c6) this.f3228c;
                c1 c1Var = (c1) this.f3229e;
                c6Var.getClass();
                c6Var.r1(this.f3227b, ((TL_stars.starGiftDepositPayload[]) this.d)[0], t1Var.h(i7, true, true), c1Var);
                return;
            case 4:
                r3 r3Var = (r3) this.f3228c;
                Runnable runnable = (Runnable) this.f3229e;
                boolean z10 = false;
                c2 c2Var = ((c2[]) this.d)[0];
                if (c2Var != null && c2Var.b()) {
                    z10 = true;
                }
                c40.B1(r3Var, z10, this.f3227b, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.f3229e;
                ProfileActivity profileActivity = ((pv0) this.f3228c).f50383b;
                profileActivity.N1 = true;
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                long j3 = -this.f3227b;
                k10.putLong("chat_id", j3);
                if (profileActivity.getMessagesController().E(k10, (yw) this.d, null, null)) {
                    an anVar = new an(k10);
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.getMessagesController().m(j3, user, 0, null, anVar, true, null, null, null);
                    profileActivity.presentFragment(anVar, true);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean x() {
        return false;
    }

    public e0(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.f3226a = i7;
        this.f3228c = obj;
        this.d = obj2;
        this.f3227b = j3;
        this.f3229e = obj3;
    }

    public e0(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.f3226a = i7;
        this.f3228c = obj;
        this.d = obj2;
        this.f3229e = obj3;
        this.f3227b = j3;
    }

    @Override
    public void U() {
    }

    @Override
    public void I(float f10) {
    }

    @Override
    public void O(boolean z10, boolean z11) {
    }
}
