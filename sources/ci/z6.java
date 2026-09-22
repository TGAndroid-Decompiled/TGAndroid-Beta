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
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.t40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dv0;
import org.telegram.ui.h01;
import org.telegram.ui.i60;
import org.telegram.ui.uy;
import org.telegram.ui.web.g1;
import org.telegram.ui.zn;
public final class z6 implements m8, org.telegram.ui.Components.c5, org.telegram.ui.ActionBar.a2, t5.b, r9.g, t40 {
    public final int f5868a;
    public final long f5869b;
    public final Object f5870c;
    public final Object d;
    public final Object e;

    public z6(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f5868a = i10;
        this.f5870c = obj;
        this.d = obj2;
        this.f5869b = j3;
        this.e = obj3;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        zn.d0((zn) this.f5870c, (ArrayList) this.d, this.f5869b, (om0) this.e, z10, i10);
    }

    @Override
    public void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        zn znVar = (zn) this.f5870c;
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
        znVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ai.fa(znVar, fileLocationArr, str, fileLocationArr2, this.f5869b));
    }

    @Override
    public ScheduledFuture a(final l.d dVar) {
        switch (this.f5868a) {
            case 5:
                r9.f fVar = (r9.f) this.f5870c;
                return fVar.f42486b.schedule(new r9.d(fVar, (Runnable) this.d, dVar, 1), this.f5869b, (TimeUnit) this.e);
            default:
                final r9.f fVar2 = (r9.f) this.f5870c;
                final Callable callable = (Callable) this.d;
                return fVar2.f42486b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return f.this.f42485a.submit(new g1(17, callable, dVar));
                    }
                }, this.f5869b, (TimeUnit) this.e);
        }
    }

    @Override
    public Bitmap c(BitmapFactory.Options options) {
        d7 d7Var = (d7) this.f5870c;
        o8 o8Var = (o8) this.d;
        long j3 = this.f5869b;
        String str = (String) this.e;
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
    public Object g() {
        da.b bVar = (da.b) this.f5870c;
        Iterable iterable = (Iterable) this.d;
        l5.i iVar = (l5.i) this.e;
        s5.h hVar = (s5.h) ((s5.d) bVar.f7582c);
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + s5.h.g(iterable);
            SQLiteDatabase a2 = hVar.a();
            a2.beginTransaction();
            try {
                a2.compileStatement(str).execute();
                Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    hVar.e(rawQuery.getInt(0), o5.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                a2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a2.setTransactionSuccessful();
            } finally {
                a2.endTransaction();
            }
        }
        hVar.c(new ai.z1(((u5.a) bVar.f7584g).q() + this.f5869b, iVar));
        return null;
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
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f5868a) {
            case 2:
                ChatObject.Call call = (ChatObject.Call) this.f5870c;
                Runnable runnable = (Runnable) this.e;
                boolean z10 = false;
                org.telegram.ui.Cells.a2 a2Var = ((org.telegram.ui.Cells.a2[]) this.d)[0];
                if (a2Var != null && a2Var.b()) {
                    z10 = true;
                }
                i60.w1(call, z10, this.f5869b, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.e;
                ProfileActivity profileActivity = ((h01) this.f5870c).f34055b;
                profileActivity.N1 = true;
                Bundle i11 = a4.a.i("scrollToTopOnResume", true);
                long j3 = -this.f5869b;
                i11.putLong("chat_id", j3);
                if (profileActivity.getMessagesController().checkCanOpenChat(i11, (uy) this.d)) {
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
    public boolean t() {
        return false;
    }

    public z6(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f5868a = i10;
        this.f5870c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5869b = j3;
    }

    public z6(h01 h01Var, long j3, uy uyVar, TLRPC.User user) {
        this.f5868a = 3;
        this.f5870c = h01Var;
        this.f5869b = j3;
        this.d = uyVar;
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
