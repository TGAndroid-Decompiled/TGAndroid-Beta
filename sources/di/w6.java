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
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.h50;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;
import org.telegram.ui.jv0;
import org.telegram.ui.m01;
import org.telegram.ui.n60;
import org.telegram.ui.yy;
public final class w6 implements i8, org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.z1, t5.b, s9.h, h50 {
    public final int f8055a;
    public final long f8056b;
    public final Object f8057c;
    public final Object d;
    public final Object e;

    public w6(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f8055a = i10;
        this.f8057c = obj;
        this.d = obj2;
        this.f8056b = j10;
        this.e = obj3;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        fo.h0((fo) this.f8057c, (ArrayList) this.d, this.f8056b, (cn0) this.e, z10, i10);
    }

    @Override
    public void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        fo foVar = (fo) this.f8057c;
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
        foVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new bi.p9(foVar, fileLocationArr, str, fileLocationArr2, this.f8056b));
    }

    @Override
    public ScheduledFuture a(final m.h hVar) {
        switch (this.f8055a) {
            case 5:
                s9.g gVar = (s9.g) this.f8057c;
                return gVar.f45065b.schedule(new s9.e(gVar, (Runnable) this.d, hVar, 1), this.f8056b, (TimeUnit) this.e);
            default:
                final s9.g gVar2 = (s9.g) this.f8057c;
                final Callable callable = (Callable) this.d;
                return gVar2.f45065b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return g.this.f45064a.submit(new b(0, callable, hVar));
                    }
                }, this.f8056b, (TimeUnit) this.e);
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public Object f() {
        ea.b bVar = (ea.b) this.f8057c;
        Iterable iterable = (Iterable) this.d;
        l5.i iVar = (l5.i) this.e;
        s5.g gVar = (s5.g) ((s5.d) bVar.f8668c);
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
        gVar.c(new bi.p1(((u5.a) bVar.f8670g).b() + this.f8056b, iVar));
        return null;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f8055a) {
            case 2:
                ChatObject.Call call = (ChatObject.Call) this.f8057c;
                Runnable runnable = (Runnable) this.e;
                boolean z10 = false;
                org.telegram.ui.Cells.a2 a2Var2 = ((org.telegram.ui.Cells.a2[]) this.d)[0];
                if (a2Var2 != null && a2Var2.b()) {
                    z10 = true;
                }
                n60.x1(call, z10, this.f8056b, runnable);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.e;
                ProfileActivity profileActivity = ((m01) this.f8057c).f37880b;
                profileActivity.N1 = true;
                Bundle h = a1.g.h("scrollToTopOnResume", true);
                long j10 = -this.f8056b;
                h.putLong("chat_id", j10);
                if (profileActivity.getMessagesController().checkCanOpenChat(h, (yy) this.d)) {
                    fo foVar = new fo(h);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i11 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i11);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j10, user, 0, null, foVar, true, null, null);
                    profileActivity.presentFragment(foVar, true);
                    return;
                }
                return;
        }
    }

    @Override
    public jv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public Bitmap i(BitmapFactory.Options options) {
        a7 a7Var = (a7) this.f8057c;
        k8 k8Var = (k8) this.d;
        long j10 = this.f8056b;
        String str = (String) this.e;
        if (k8Var.K) {
            String str2 = k8Var.N;
            if (str2 != null) {
                return BitmapFactory.decodeFile(str2, options);
            }
            try {
                return MediaStore.Video.Thumbnails.getThumbnail(a7Var.getContext().getContentResolver(), j10, 1, options);
            } catch (Throwable unused) {
                a7Var.invalidate();
                return null;
            }
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public boolean v() {
        return false;
    }

    public w6(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f8055a = i10;
        this.f8057c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f8056b = j10;
    }

    public w6(m01 m01Var, long j10, yy yyVar, TLRPC.User user) {
        this.f8055a = 3;
        this.f8057c = m01Var;
        this.f8056b = j10;
        this.d = yyVar;
        this.e = user;
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
