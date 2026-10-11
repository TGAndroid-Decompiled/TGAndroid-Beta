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
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.m50;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dv0;
import org.telegram.ui.f01;
import org.telegram.ui.g60;
import org.telegram.ui.sy;
import org.telegram.ui.web.f2;
import org.telegram.ui.zn;
public final class y6 implements j8, org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.z1, t5.b, r9.g, m50 {
    public final int f6351a;
    public final long f6352b;
    public final Object f6353c;
    public final Object d;
    public final Object f6354e;

    public y6(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f6351a = i10;
        this.f6353c = obj;
        this.d = obj2;
        this.f6352b = j3;
        this.f6354e = obj3;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        zn.h0((zn) this.f6353c, (ArrayList) this.d, this.f6352b, (hn0) this.f6354e, z10, i10);
    }

    @Override
    public void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        zn znVar = (zn) this.f6353c;
        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.f6354e;
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
        znVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ai.ga(znVar, fileLocationArr, str, fileLocationArr2, this.f6352b));
    }

    @Override
    public ScheduledFuture a(final m.f3 f3Var) {
        switch (this.f6351a) {
            case 5:
                r9.f fVar = (r9.f) this.f6353c;
                return fVar.f47241b.schedule(new r9.d(fVar, (Runnable) this.d, f3Var, 1), this.f6352b, (TimeUnit) this.f6354e);
            default:
                final r9.f fVar2 = (r9.f) this.f6353c;
                final Callable callable = (Callable) this.d;
                return fVar2.f47241b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return f.this.f47240a.submit(new f2(16, callable, f3Var));
                    }
                }, this.f6352b, (TimeUnit) this.f6354e);
        }
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        b7 b7Var = (b7) this.f6353c;
        l8 l8Var = (l8) this.d;
        long j3 = this.f6352b;
        String str = (String) this.f6354e;
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
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f6351a) {
            case 2:
                ChatObject.Call call = (ChatObject.Call) this.f6353c;
                Runnable runnable = (Runnable) this.f6354e;
                boolean z10 = false;
                org.telegram.ui.Cells.a2 a2Var2 = ((org.telegram.ui.Cells.a2[]) this.d)[0];
                if (a2Var2 != null && a2Var2.b()) {
                    z10 = true;
                }
                g60.x1(call, z10, this.f6352b, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.f6354e;
                ProfileActivity profileActivity = ((f01) this.f6353c).f37533b;
                profileActivity.N1 = true;
                Bundle i11 = a1.g.i("scrollToTopOnResume", true);
                long j3 = -this.f6352b;
                i11.putLong("chat_id", j3);
                if (profileActivity.getMessagesController().checkCanOpenChat(i11, (sy) this.d)) {
                    zn znVar = new zn(i11);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i12 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i12);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i12, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j3, user, 0, null, znVar, true, null, null);
                    profileActivity.presentFragment(znVar, true);
                    return;
                }
                return;
        }
    }

    @Override
    public dv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public Object i() {
        da.c cVar = (da.c) this.f6353c;
        Iterable iterable = (Iterable) this.d;
        l5.i iVar = (l5.i) this.f6354e;
        s5.g gVar = (s5.g) ((s5.d) cVar.f8233c);
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
        gVar.c(new ai.z1(((u5.a) cVar.f8236g).Z() + this.f6352b, iVar));
        return null;
    }

    @Override
    public boolean u() {
        return false;
    }

    public y6(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f6351a = i10;
        this.f6353c = obj;
        this.d = obj2;
        this.f6354e = obj3;
        this.f6352b = j3;
    }

    public y6(f01 f01Var, long j3, sy syVar, TLRPC.User user) {
        this.f6351a = 3;
        this.f6353c = f01Var;
        this.f6352b = j3;
        this.d = syVar;
        this.f6354e = user;
    }

    @Override
    public void D(float f7) {
    }

    @Override
    public void P() {
    }

    @Override
    public void L(boolean z10, boolean z11) {
    }
}
