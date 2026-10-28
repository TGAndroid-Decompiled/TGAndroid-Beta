package ag;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import bi.h7;
import di.d1;
import fi.o6;
import fi.u7;
import fi.w7;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import li.e3;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.in0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ey;
import org.telegram.ui.su0;
import org.telegram.ui.tz0;
import org.telegram.ui.wn;
import org.telegram.ui.x50;
import vg.n1;
public final class j0 implements f50, b2, u7, e5, u5.b, t9.g {
    public final int f1304a;
    public final long f1305b;
    public final Object f1306c;
    public final Object d;
    public final Object e;

    public j0(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f1304a = i10;
        this.f1306c = obj;
        this.f1305b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        wn.v0((wn) this.f1306c, (ArrayList) this.d, this.f1305b, (in0) this.e, z10, i10);
    }

    @Override
    public void R(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        wn wnVar = (wn) this.f1306c;
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
            int i10 = tL_photos_uploadProfilePhoto.flags;
            tL_photos_uploadProfilePhoto.video_start_ts = d;
            tL_photos_uploadProfilePhoto.flags = i10 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
            tL_photos_uploadProfilePhoto.flags |= 16;
        }
        wnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new l0(wnVar, fileLocationArr, str, fileLocationArr2, this.f1305b));
    }

    @Override
    public ScheduledFuture a(final e3 e3Var) {
        switch (this.f1304a) {
            case 7:
                t9.f fVar = (t9.f) this.f1306c;
                return fVar.f48781b.schedule(new t9.d(fVar, (Runnable) this.d, e3Var, 1), this.f1305b, (TimeUnit) this.e);
            default:
                final t9.f fVar2 = (t9.f) this.f1306c;
                final Callable callable = (Callable) this.d;
                return fVar2.f48781b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return f.this.f48780a.submit(new s9.g(5, callable, e3Var));
                    }
                }, this.f1305b, (TimeUnit) this.e);
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public Object f() {
        aa.b0 b0Var = (aa.b0) this.f1306c;
        Iterable iterable = (Iterable) this.d;
        m5.i iVar = (m5.i) this.e;
        t5.g gVar = (t5.g) ((t5.d) b0Var.f1034f);
        gVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + t5.g.g(iterable);
            SQLiteDatabase a2 = gVar.a();
            a2.beginTransaction();
            try {
                a2.compileStatement(str).execute();
                Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    gVar.e(rawQuery.getInt(0), p5.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                a2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a2.setTransactionSuccessful();
            } finally {
                a2.endTransaction();
            }
        }
        gVar.c(new d1(((v5.a) b0Var.e).o() + this.f1305b, iVar));
        return null;
    }

    @Override
    public Bitmap g(BitmapFactory.Options options) {
        o6 o6Var = (o6) this.f1306c;
        w7 w7Var = (w7) this.d;
        long j10 = this.f1305b;
        String str = (String) this.e;
        if (w7Var.K) {
            String str2 = w7Var.N;
            if (str2 != null) {
                return BitmapFactory.decodeFile(str2, options);
            }
            try {
                return MediaStore.Video.Thumbnails.getThumbnail(o6Var.getContext().getContentResolver(), j10, 1, options);
            } catch (Throwable unused) {
                o6Var.invalidate();
                return null;
            }
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public su0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void h(e2 e2Var, int i10) {
        switch (this.f1304a) {
            case 1:
                h7 h7Var = (h7) this.f1306c;
                n1 n1Var = (n1) this.e;
                h7Var.getClass();
                h7Var.O1(this.f1305b, ((TL_stars.starGiftDepositPayload[]) this.d)[0], e2Var.h(i10, true, true), n1Var);
                return;
            case 4:
                ChatObject.Call call = (ChatObject.Call) this.f1306c;
                Runnable runnable = (Runnable) this.e;
                boolean z10 = false;
                y1 y1Var = ((y1[]) this.d)[0];
                if (y1Var != null && y1Var.b()) {
                    z10 = true;
                }
                x50.w1(call, z10, this.f1305b, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.e;
                ProfileActivity profileActivity = ((tz0) this.f1306c).f43810b;
                profileActivity.N1 = true;
                Bundle i11 = a1.g.i("scrollToTopOnResume", true);
                long j10 = -this.f1305b;
                i11.putLong("chat_id", j10);
                if (profileActivity.getMessagesController().checkCanOpenChat(i11, (ey) this.d)) {
                    wn wnVar = new wn(i11);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j10, user, 0, null, wnVar, true, null, null);
                    profileActivity.presentFragment(wnVar, true);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean u() {
        return false;
    }

    public j0(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f1304a = i10;
        this.f1306c = obj;
        this.d = obj2;
        this.f1305b = j10;
        this.e = obj3;
    }

    public j0(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f1304a = i10;
        this.f1306c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1305b = j10;
    }

    @Override
    public void Q() {
    }

    @Override
    public void F(float f7) {
    }

    @Override
    public void L(boolean z10, boolean z11) {
    }
}
