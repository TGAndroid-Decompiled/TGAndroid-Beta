package ci;

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
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.u40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a01;
import org.telegram.ui.f60;
import org.telegram.ui.ry;
import org.telegram.ui.wu0;
import org.telegram.ui.xn;
public final class y6 implements j8, org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.a2, t5.b, r9.g, u40 {
    public final int f5873a;
    public final long f5874b;
    public final Object f5875c;
    public final Object d;
    public final Object e;

    public y6(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f5873a = i10;
        this.f5875c = obj;
        this.d = obj2;
        this.f5874b = j3;
        this.e = obj3;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        xn.s0((xn) this.f5875c, (ArrayList) this.d, this.f5874b, (bm0) this.e, z10, i10);
    }

    @Override
    public void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        xn xnVar = (xn) this.f5875c;
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
        xnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ai.fa(xnVar, fileLocationArr, str, fileLocationArr2, this.f5874b));
    }

    @Override
    public ScheduledFuture a(final k2.u uVar) {
        switch (this.f5873a) {
            case 5:
                r9.f fVar = (r9.f) this.f5875c;
                return fVar.f42118b.schedule(new r9.d(fVar, (Runnable) this.d, uVar, 1), this.f5874b, (TimeUnit) this.e);
            default:
                final r9.f fVar2 = (r9.f) this.f5875c;
                final Callable callable = (Callable) this.d;
                return fVar2.f42118b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return f.this.f42117a.submit(new p2.b(11, callable, uVar));
                    }
                }, this.f5874b, (TimeUnit) this.e);
        }
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        b7 b7Var = (b7) this.f5875c;
        l8 l8Var = (l8) this.d;
        long j3 = this.f5874b;
        String str = (String) this.e;
        if (l8Var.K) {
            String str2 = l8Var.N;
            if (str2 != null) {
                return BitmapFactory.decodeFile(str2, options);
            }
            try {
                return MediaStore.Video.Thumbnails.getThumbnail(b7Var.getContext().getContentResolver(), j3, 1, options);
            } catch (Throwable unused) {
                b7Var.invalidate();
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
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f5873a) {
            case 2:
                ChatObject.Call call = (ChatObject.Call) this.f5875c;
                Runnable runnable = (Runnable) this.e;
                boolean z10 = false;
                org.telegram.ui.Cells.z1 z1Var = ((org.telegram.ui.Cells.z1[]) this.d)[0];
                if (z1Var != null && z1Var.b()) {
                    z10 = true;
                }
                f60.w1(call, z10, this.f5874b, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.e;
                ProfileActivity profileActivity = ((a01) this.f5875c).f31621b;
                profileActivity.N1 = true;
                Bundle i11 = a4.a.i("scrollToTopOnResume", true);
                long j3 = -this.f5874b;
                i11.putLong("chat_id", j3);
                if (profileActivity.getMessagesController().checkCanOpenChat(i11, (ry) this.d)) {
                    xn xnVar = new xn(i11);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j3, user, 0, null, xnVar, true, null, null);
                    profileActivity.presentFragment(xnVar, true);
                    return;
                }
                return;
        }
    }

    @Override
    public wu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public Object i() {
        da.b bVar = (da.b) this.f5875c;
        Iterable iterable = (Iterable) this.d;
        l5.i iVar = (l5.i) this.e;
        s5.g gVar = (s5.g) ((s5.d) bVar.f7566c);
        gVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + s5.g.g(iterable);
            SQLiteDatabase a2 = gVar.a();
            a2.beginTransaction();
            try {
                a2.compileStatement(str).execute();
                Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    gVar.e(rawQuery.getInt(0), o5.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                a2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a2.setTransactionSuccessful();
            } finally {
                a2.endTransaction();
            }
        }
        gVar.c(new ai.z1(((u5.a) bVar.f7568g).q() + this.f5874b, iVar));
        return null;
    }

    @Override
    public boolean t() {
        return false;
    }

    public y6(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f5873a = i10;
        this.f5875c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5874b = j3;
    }

    public y6(a01 a01Var, long j3, ry ryVar, TLRPC.User user) {
        this.f5873a = 3;
        this.f5875c = a01Var;
        this.f5874b = j3;
        this.d = ryVar;
        this.e = user;
    }

    @Override
    public void B(float f7) {
    }

    @Override
    public void P() {
    }

    @Override
    public void L(boolean z10, boolean z11) {
    }
}
