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
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.x40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a01;
import org.telegram.ui.h60;
import org.telegram.ui.uy;
import org.telegram.ui.web.x1;
import org.telegram.ui.yn;
import org.telegram.ui.yu0;
public final class y6 implements i8, org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.a2, t5.b, r9.g, x40 {
    public final int f6339a;
    public final long f6340b;
    public final Object f6341c;
    public final Object d;
    public final Object f6342e;

    public y6(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f6339a = i10;
        this.f6341c = obj;
        this.d = obj2;
        this.f6340b = j3;
        this.f6342e = obj3;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        yn.s0((yn) this.f6341c, (ArrayList) this.d, this.f6340b, (sm0) this.f6342e, z10, i10);
    }

    @Override
    public void O(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        yn ynVar = (yn) this.f6341c;
        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f6342e;
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
        ynVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ai.fa(ynVar, fileLocationArr, str, fileLocationArr2, this.f6340b));
    }

    @Override
    public ScheduledFuture a(final k2.e eVar) {
        switch (this.f6339a) {
            case 5:
                r9.f fVar = (r9.f) this.f6341c;
                return fVar.f45951b.schedule(new r9.d(fVar, (Runnable) this.d, eVar, 1), this.f6340b, (TimeUnit) this.f6342e);
            default:
                final r9.f fVar2 = (r9.f) this.f6341c;
                final Callable callable = (Callable) this.d;
                return fVar2.f45951b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return f.this.f45950a.submit(new x1(17, callable, eVar));
                    }
                }, this.f6340b, (TimeUnit) this.f6342e);
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public Bitmap f(BitmapFactory.Options options) {
        b7 b7Var = (b7) this.f6341c;
        k8 k8Var = (k8) this.d;
        long j3 = this.f6340b;
        String str = (String) this.f6342e;
        if (k8Var.K) {
            String str2 = k8Var.N;
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
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f6339a) {
            case 2:
                ChatObject.Call call = (ChatObject.Call) this.f6341c;
                Runnable runnable = (Runnable) this.f6342e;
                boolean z10 = false;
                org.telegram.ui.Cells.a2 a2Var = ((org.telegram.ui.Cells.a2[]) this.d)[0];
                if (a2Var != null && a2Var.b()) {
                    z10 = true;
                }
                h60.w1(call, z10, this.f6340b, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.f6342e;
                ProfileActivity profileActivity = ((a01) this.f6341c).f34623b;
                profileActivity.N1 = true;
                Bundle i11 = a4.a.i("scrollToTopOnResume", true);
                long j3 = -this.f6340b;
                i11.putLong("chat_id", j3);
                if (profileActivity.getMessagesController().checkCanOpenChat(i11, (uy) this.d)) {
                    yn ynVar = new yn(i11);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j3, user, 0, null, ynVar, true, null, null);
                    profileActivity.presentFragment(ynVar, true);
                    return;
                }
                return;
        }
    }

    @Override
    public yu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public Object h() {
        da.b bVar = (da.b) this.f6341c;
        Iterable iterable = (Iterable) this.d;
        l5.i iVar = (l5.i) this.f6342e;
        s5.g gVar = (s5.g) ((s5.d) bVar.f8181c);
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
        gVar.c(new ai.z1(((u5.a) bVar.f8184g).q() + this.f6340b, iVar));
        return null;
    }

    @Override
    public boolean t() {
        return false;
    }

    public y6(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f6339a = i10;
        this.f6341c = obj;
        this.d = obj2;
        this.f6342e = obj3;
        this.f6340b = j3;
    }

    public y6(a01 a01Var, long j3, uy uyVar, TLRPC.User user) {
        this.f6339a = 3;
        this.f6341c = a01Var;
        this.f6340b = j3;
        this.d = uyVar;
        this.f6342e = user;
    }

    @Override
    public void B(float f7) {
    }

    @Override
    public void N() {
    }

    @Override
    public void I(boolean z10, boolean z11) {
    }
}
