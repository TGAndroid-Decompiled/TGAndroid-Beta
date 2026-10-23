package ai;

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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cy;
import org.telegram.ui.ju0;
import org.telegram.ui.jz0;
import org.telegram.ui.q50;
import org.telegram.ui.qn;
public final class y3 implements org.telegram.ui.ActionBar.a2, ei.y7, org.telegram.ui.Components.e5, t5.b, s9.g, d50 {
    public final int f2476a;
    public final long f2477b;
    public final Object f2478c;
    public final Object d;
    public final Object e;

    public y3(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f2476a = i10;
        this.f2478c = obj;
        this.f2477b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        qn.h0((qn) this.f2478c, (ArrayList) this.d, this.f2477b, (zm0) this.e, z10, i10);
    }

    @Override
    public void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        qn qnVar = (qn) this.f2478c;
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
        qnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new ci.b8(qnVar, fileLocationArr, str, fileLocationArr2, this.f2477b));
    }

    @Override
    public ScheduledFuture a(final le.b bVar) {
        switch (this.f2476a) {
            case 6:
                s9.f fVar = (s9.f) this.f2478c;
                return fVar.f46145b.schedule(new s9.d(fVar, (Runnable) this.d, bVar, 1), this.f2477b, (TimeUnit) this.e);
            default:
                final s9.f fVar2 = (s9.f) this.f2478c;
                final Callable callable = (Callable) this.d;
                return fVar2.f46145b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return f.this.f46144a.submit(new p2.b(18, callable, bVar));
                    }
                }, this.f2477b, (TimeUnit) this.e);
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f2476a) {
            case 0:
                l7 l7Var = (l7) this.f2478c;
                ug.m1 m1Var = (ug.m1) this.e;
                l7Var.getClass();
                l7Var.P1(this.f2477b, ((TL_stars.starGiftDepositPayload[]) this.d)[0], b2Var.h(i10, true, true), m1Var);
                return;
            case 3:
                ChatObject.Call call = (ChatObject.Call) this.f2478c;
                Runnable runnable = (Runnable) this.e;
                boolean z10 = false;
                org.telegram.ui.Cells.a2 a2Var = ((org.telegram.ui.Cells.a2[]) this.d)[0];
                if (a2Var != null && a2Var.b()) {
                    z10 = true;
                }
                q50.x1(call, z10, this.f2477b, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.e;
                ProfileActivity profileActivity = ((jz0) this.f2478c).f38384b;
                profileActivity.O1 = true;
                Bundle h = a1.g.h("scrollToTopOnResume", true);
                long j10 = -this.f2477b;
                h.putLong("chat_id", j10);
                if (profileActivity.getMessagesController().checkCanOpenChat(h, (cy) this.d)) {
                    qn qnVar = new qn(h);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i11 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i11);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j10, user, 0, null, qnVar, true, null, null);
                    profileActivity.presentFragment(qnVar, true);
                    return;
                }
                return;
        }
    }

    @Override
    public ju0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public Object j() {
        ea.b bVar = (ea.b) this.f2478c;
        Iterable iterable = (Iterable) this.d;
        l5.i iVar = (l5.i) this.e;
        s5.g gVar = (s5.g) ((s5.d) bVar.f8547c);
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
        gVar.c(new ci.d1(((u5.a) bVar.f8549g).d() + this.f2477b, iVar));
        return null;
    }

    @Override
    public Bitmap k(BitmapFactory.Options options) {
        ei.r6 r6Var = (ei.r6) this.f2478c;
        ei.a8 a8Var = (ei.a8) this.d;
        long j10 = this.f2477b;
        String str = (String) this.e;
        if (a8Var.K) {
            String str2 = a8Var.N;
            if (str2 != null) {
                return BitmapFactory.decodeFile(str2, options);
            }
            try {
                return MediaStore.Video.Thumbnails.getThumbnail(r6Var.getContext().getContentResolver(), j10, 1, options);
            } catch (Throwable unused) {
                r6Var.invalidate();
                return null;
            }
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public boolean v() {
        return false;
    }

    public y3(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f2476a = i10;
        this.f2478c = obj;
        this.d = obj2;
        this.f2477b = j10;
        this.e = obj3;
    }

    public y3(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f2476a = i10;
        this.f2478c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2477b = j10;
    }

    @Override
    public void E(float f7) {
    }

    @Override
    public void P() {
    }

    @Override
    public void K(boolean z10, boolean z11) {
    }
}
