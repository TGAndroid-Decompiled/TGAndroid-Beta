package cg;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import ci.l6;
import ei.c1;
import gi.d7;
import gi.f7;
import gi.y5;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.r3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.r4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.iv0;
import org.telegram.ui.mq0;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.x30;
import xg.e1;
public final class d0 implements e30, p1, d7, r4, v5.b, u9.h {
    public final int f4637a;
    public final long f4638b;
    public final Object f4639c;
    public final Object d;
    public final Object f4640e;

    public d0(Object obj, long j10, Object obj2, Object obj3, int i3) {
        this.f4637a = i3;
        this.f4639c = obj;
        this.f4638b = j10;
        this.d = obj2;
        this.f4640e = obj3;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        wm.E1((wm) this.f4639c, (ArrayList) this.d, this.f4638b, (nk0) this.f4640e, z10, i3);
    }

    @Override
    public void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        wm wmVar = (wm) this.f4639c;
        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f4640e;
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
            int i3 = tL_photos_uploadProfilePhoto.flags;
            tL_photos_uploadProfilePhoto.video_start_ts = d;
            tL_photos_uploadProfilePhoto.flags = i3 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
            tL_photos_uploadProfilePhoto.flags |= 16;
        }
        wmVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new f0(wmVar, fileLocationArr, str, fileLocationArr2, this.f4638b));
    }

    @Override
    public ScheduledFuture a(final i9 i9Var) {
        switch (this.f4637a) {
            case 7:
                u9.g gVar = (u9.g) this.f4639c;
                return gVar.f55765b.schedule(new u9.e(gVar, (Runnable) this.d, i9Var, 1), this.f4638b, (TimeUnit) this.f4640e);
            default:
                final u9.g gVar2 = (u9.g) this.f4639c;
                final Callable callable = (Callable) this.d;
                return gVar2.f55765b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return g.this.f55764a.submit(new a(1, callable, i9Var));
                    }
                }, this.f4638b, (TimeUnit) this.f4640e);
        }
    }

    @Override
    public Object d() {
        ha.c cVar = (ha.c) this.f4639c;
        Iterable iterable = (Iterable) this.d;
        n5.i iVar = (n5.i) this.f4640e;
        u5.g gVar = (u5.g) ((u5.d) cVar.f14374c);
        gVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + u5.g.g(iterable);
            SQLiteDatabase a10 = gVar.a();
            a10.beginTransaction();
            try {
                a10.compileStatement(str).execute();
                Cursor rawQuery = a10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    gVar.e(rawQuery.getInt(0), q5.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                a10.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a10.setTransactionSuccessful();
            } finally {
                a10.endTransaction();
            }
        }
        gVar.c(new c1(((w5.a) cVar.f14377g).o() + this.f4638b, iVar));
        return null;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public Bitmap f(BitmapFactory.Options options) {
        y5 y5Var = (y5) this.f4639c;
        f7 f7Var = (f7) this.d;
        long j10 = this.f4638b;
        String str = (String) this.f4640e;
        if (f7Var.K) {
            String str2 = f7Var.N;
            if (str2 != null) {
                return BitmapFactory.decodeFile(str2, options);
            }
            try {
                return MediaStore.Video.Thumbnails.getThumbnail(y5Var.getContext().getContentResolver(), j10, 1, options);
            } catch (Throwable unused) {
                y5Var.invalidate();
                return null;
            }
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public void g(s1 s1Var, int i3) {
        switch (this.f4637a) {
            case 1:
                l6 l6Var = (l6) this.f4639c;
                e1 e1Var = (e1) this.f4640e;
                l6Var.getClass();
                l6Var.r1(this.f4638b, ((TL_stars.starGiftDepositPayload[]) this.d)[0], s1Var.h(i3, true, true), e1Var);
                return;
            case 4:
                r3 r3Var = (r3) this.f4639c;
                Runnable runnable = (Runnable) this.f4640e;
                boolean z10 = false;
                c2 c2Var = ((c2[]) this.d)[0];
                if (c2Var != null && c2Var.b()) {
                    z10 = true;
                }
                x30.y1(r3Var, z10, this.f4638b, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.f4640e;
                ProfileActivity profileActivity = ((iv0) this.f4639c).f46427b;
                profileActivity.N1 = true;
                Bundle k10 = a1.g.k("scrollToTopOnResume", true);
                long j10 = -this.f4638b;
                k10.putLong("chat_id", j10);
                if (profileActivity.getMessagesController().E(k10, (uw) this.d, null, null)) {
                    wm wmVar = new wm(k10);
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.getMessagesController().m(j10, user, 0, null, wmVar, true, null, null, null);
                    profileActivity.presentFragment(wmVar, true);
                    return;
                }
                return;
        }
    }

    @Override
    public mq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public boolean x() {
        return false;
    }

    public d0(Object obj, Object obj2, long j10, Object obj3, int i3) {
        this.f4637a = i3;
        this.f4639c = obj;
        this.d = obj2;
        this.f4638b = j10;
        this.f4640e = obj3;
    }

    public d0(Object obj, Object obj2, Object obj3, long j10, int i3) {
        this.f4637a = i3;
        this.f4639c = obj;
        this.d = obj2;
        this.f4640e = obj3;
        this.f4638b = j10;
    }

    @Override
    public void T() {
    }

    @Override
    public void H(float f10) {
    }

    @Override
    public void O(boolean z10, boolean z11) {
    }
}
