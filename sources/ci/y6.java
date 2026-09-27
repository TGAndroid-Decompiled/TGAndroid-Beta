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
import org.telegram.ui.Components.w40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a01;
import org.telegram.ui.g60;
import org.telegram.ui.ty;
import org.telegram.ui.web.g2;
import org.telegram.ui.xn;
import org.telegram.ui.yu0;
public final class y6 implements i8, org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.b2, t5.b, r9.g, w40 {
    public final int f5884a;
    public final long f5885b;
    public final Object f5886c;
    public final Object d;
    public final Object e;

    public y6(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f5884a = i10;
        this.f5886c = obj;
        this.d = obj2;
        this.f5885b = j3;
        this.e = obj3;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        xn.c0((xn) this.f5886c, (ArrayList) this.d, this.f5885b, (om0) this.e, z10, i10);
    }

    @Override
    public void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        xn xnVar = (xn) this.f5886c;
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
        xnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ai.fa(xnVar, fileLocationArr, str, fileLocationArr2, this.f5885b));
    }

    @Override
    public ScheduledFuture a(final o0.c cVar) {
        switch (this.f5884a) {
            case 5:
                r9.f fVar = (r9.f) this.f5886c;
                return fVar.f42496b.schedule(new r9.d(fVar, (Runnable) this.d, cVar, 1), this.f5885b, (TimeUnit) this.e);
            default:
                final r9.f fVar2 = (r9.f) this.f5886c;
                final Callable callable = (Callable) this.d;
                return fVar2.f42496b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return f.this.f42495a.submit(new g2(14, callable, cVar));
                    }
                }, this.f5885b, (TimeUnit) this.e);
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f5884a) {
            case 2:
                ChatObject.Call call = (ChatObject.Call) this.f5886c;
                Runnable runnable = (Runnable) this.e;
                boolean z10 = false;
                org.telegram.ui.Cells.a2 a2Var = ((org.telegram.ui.Cells.a2[]) this.d)[0];
                if (a2Var != null && a2Var.b()) {
                    z10 = true;
                }
                g60.w1(call, z10, this.f5885b, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.e;
                ProfileActivity profileActivity = ((a01) this.f5886c).f31935b;
                profileActivity.N1 = true;
                Bundle i11 = a4.a.i("scrollToTopOnResume", true);
                long j3 = -this.f5885b;
                i11.putLong("chat_id", j3);
                if (profileActivity.getMessagesController().checkCanOpenChat(i11, (ty) this.d)) {
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
    public yu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public Object h() {
        da.b bVar = (da.b) this.f5886c;
        Iterable iterable = (Iterable) this.d;
        l5.i iVar = (l5.i) this.e;
        s5.h hVar = (s5.h) ((s5.d) bVar.f7567c);
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
        hVar.c(new ai.z1(((u5.a) bVar.f7569g).q() + this.f5885b, iVar));
        return null;
    }

    @Override
    public Bitmap i(BitmapFactory.Options options) {
        b7 b7Var = (b7) this.f5886c;
        k8 k8Var = (k8) this.d;
        long j3 = this.f5885b;
        String str = (String) this.e;
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
    public boolean t() {
        return false;
    }

    public y6(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f5884a = i10;
        this.f5886c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f5885b = j3;
    }

    public y6(a01 a01Var, long j3, ty tyVar, TLRPC.User user) {
        this.f5884a = 3;
        this.f5886c = a01Var;
        this.f5885b = j3;
        this.d = tyVar;
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
