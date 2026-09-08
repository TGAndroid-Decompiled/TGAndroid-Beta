package di;

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
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.t40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.co;
import org.telegram.ui.cv0;
import org.telegram.ui.i01;
import org.telegram.ui.j60;
import org.telegram.ui.uy;
import org.telegram.ui.web.g1;
public final class y6 implements m8, org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.a2, t5.b, r9.g, t40 {
    public final int f8504a;
    public final long f8505b;
    public final Object f8506c;
    public final Object d;
    public final Object f8507e;

    public y6(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f8504a = i10;
        this.f8506c = obj;
        this.d = obj2;
        this.f8505b = j3;
        this.f8507e = obj3;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        co.r0((co) this.f8506c, (ArrayList) this.d, this.f8505b, (am0) this.f8507e, z10, i10);
    }

    @Override
    public void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        co coVar = (co) this.f8506c;
        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f8507e;
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
        coVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new bi.m9(coVar, fileLocationArr, str, fileLocationArr2, this.f8505b));
    }

    @Override
    public ScheduledFuture a(final l.d dVar) {
        switch (this.f8504a) {
            case 5:
                r9.f fVar = (r9.f) this.f8506c;
                return fVar.f45078b.schedule(new r9.d(fVar, (Runnable) this.d, dVar, 1), this.f8505b, (TimeUnit) this.f8507e);
            default:
                final r9.f fVar2 = (r9.f) this.f8506c;
                final Callable callable = (Callable) this.d;
                return fVar2.f45078b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return f.this.f45077a.submit(new g1(14, callable, dVar));
                    }
                }, this.f8505b, (TimeUnit) this.f8507e);
        }
    }

    @Override
    public Bitmap d(BitmapFactory.Options options) {
        d7 d7Var = (d7) this.f8506c;
        o8 o8Var = (o8) this.d;
        long j3 = this.f8505b;
        String str = (String) this.f8507e;
        if (o8Var.K) {
            String str2 = o8Var.N;
            if (str2 != null) {
                return BitmapFactory.decodeFile(str2, options);
            }
            try {
                return MediaStore.Video.Thumbnails.getThumbnail(d7Var.getContext().getContentResolver(), j3, 1, options);
            } catch (Throwable unused) {
                d7Var.invalidate();
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
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f8504a) {
            case 2:
                ChatObject.Call call = (ChatObject.Call) this.f8506c;
                Runnable runnable = (Runnable) this.f8507e;
                boolean z10 = false;
                org.telegram.ui.Cells.z1 z1Var = ((org.telegram.ui.Cells.z1[]) this.d)[0];
                if (z1Var != null && z1Var.b()) {
                    z10 = true;
                }
                j60.w1(call, z10, this.f8505b, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.f8507e;
                ProfileActivity profileActivity = ((i01) this.f8506c).f37176b;
                profileActivity.N1 = true;
                Bundle i11 = a4.a.i("scrollToTopOnResume", true);
                long j3 = -this.f8505b;
                i11.putLong("chat_id", j3);
                if (profileActivity.getMessagesController().checkCanOpenChat(i11, (uy) this.d)) {
                    co coVar = new co(i11);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j3, user, 0, null, coVar, true, null, null);
                    profileActivity.presentFragment(coVar, true);
                    return;
                }
                return;
        }
    }

    @Override
    public cv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public Object i() {
        da.b bVar = (da.b) this.f8506c;
        Iterable iterable = (Iterable) this.d;
        l5.i iVar = (l5.i) this.f8507e;
        s5.g gVar = (s5.g) ((s5.d) bVar.f6680c);
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
        gVar.c(new bi.p1(((u5.a) bVar.f6683g).l() + this.f8505b, iVar));
        return null;
    }

    @Override
    public boolean t() {
        return false;
    }

    public y6(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f8504a = i10;
        this.f8506c = obj;
        this.d = obj2;
        this.f8507e = obj3;
        this.f8505b = j3;
    }

    public y6(i01 i01Var, long j3, uy uyVar, TLRPC.User user) {
        this.f8504a = 3;
        this.f8506c = i01Var;
        this.f8505b = j3;
        this.d = uyVar;
        this.f8507e = user;
    }

    @Override
    public void P() {
    }

    @Override
    public void C(float f7) {
    }

    @Override
    public void L(boolean z10, boolean z11) {
    }
}
