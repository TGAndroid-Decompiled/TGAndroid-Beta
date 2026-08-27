package a9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import gf.g0;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import lh.q6;
import lh.x7;
import lh.z7;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cu0;
import org.telegram.ui.dz0;
import org.telegram.ui.gy;
import org.telegram.ui.rn;
import org.telegram.ui.s50;

public final class d implements j, e3.b, i40, x7, x4, a2 {

    public final int f163a;

    public final Object f164b;

    public final long f165c;
    public final Object d;

    public final Object f166e;

    public d(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f163a = i10;
        this.f164b = obj;
        this.f166e = obj2;
        this.f165c = j10;
        this.d = obj3;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        rn.s0((rn) this.f164b, (ArrayList) this.f166e, this.f165c, (ol0) this.d, z10, i10);
    }

    @Override
    public void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        rn rnVar = (rn) this.f164b;
        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.f166e;
        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.d;
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
        rnVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new g0(rnVar, fileLocationArr, str, fileLocationArr2, this.f165c));
    }

    @Override
    public ScheduledFuture a(final i iVar) {
        switch (this.f163a) {
            case 0:
                h hVar = (h) this.f164b;
                Runnable runnable = (Runnable) this.f166e;
                return hVar.f179b.schedule(new f(hVar, runnable, iVar, 1), this.f165c, (TimeUnit) this.d);
            default:
                final h hVar2 = (h) this.f164b;
                final Callable callable = (Callable) this.f166e;
                return hVar2.f179b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return hVar2.f178a.submit(new a1.e(3, callable, iVar));
                    }
                }, this.f165c, (TimeUnit) this.d);
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f163a) {
            case 6:
                ChatObject.Call call = (ChatObject.Call) this.f164b;
                y1[] y1VarArr = (y1[]) this.d;
                Runnable runnable = (Runnable) this.f166e;
                boolean z10 = false;
                y1 y1Var = y1VarArr[0];
                if (y1Var != null && y1Var.b()) {
                    z10 = true;
                }
                s50.w1(call, z10, this.f165c, runnable);
                break;
            default:
                dz0 dz0Var = (dz0) this.f164b;
                gy gyVar = (gy) this.f166e;
                TLRPC.User user = (TLRPC.User) this.d;
                ProfileActivity profileActivity = dz0Var.f37574b;
                profileActivity.J1 = true;
                Bundle bundleH = p.h("scrollToTopOnResume", true);
                long j10 = -this.f165c;
                bundleH.putLong("chat_id", j10);
                if (profileActivity.getMessagesController().checkCanOpenChat(bundleH, gyVar)) {
                    rn rnVar = new rn(bundleH);
                    NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                    int i11 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i11);
                    profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
                    profileActivity.getMessagesController().addUserToChat(j10, user, 0, null, rnVar, true, null, null);
                    profileActivity.presentFragment(rnVar, true);
                    break;
                }
                break;
        }
    }

    @Override
    public cu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public Bitmap h(BitmapFactory.Options options) {
        q6 q6Var = (q6) this.f164b;
        z7 z7Var = (z7) this.f166e;
        long j10 = this.f165c;
        String str = (String) this.d;
        if (!z7Var.K) {
            return BitmapFactory.decodeFile(str, options);
        }
        String str2 = z7Var.N;
        if (str2 != null) {
            return BitmapFactory.decodeFile(str2, options);
        }
        try {
            return MediaStore.Video.Thumbnails.getThumbnail(q6Var.getContext().getContentResolver(), j10, 1, options);
        } catch (Throwable unused) {
            q6Var.invalidate();
            return null;
        }
    }

    @Override
    public Object i() {
        c3.g gVar = (c3.g) this.f164b;
        Iterable iterable = (Iterable) this.f166e;
        w2.i iVar = (w2.i) this.d;
        d3.h hVar = (d3.h) ((d3.d) gVar.f2435c);
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + d3.h.g(iterable);
            SQLiteDatabase sQLiteDatabaseA = hVar.a();
            sQLiteDatabaseA.beginTransaction();
            try {
                sQLiteDatabaseA.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        hVar.e(cursorRawQuery.getInt(0), z2.c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseA.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseA.setTransactionSuccessful();
                sQLiteDatabaseA.endTransaction();
            } catch (Throwable th2) {
                sQLiteDatabaseA.endTransaction();
                throw th2;
            }
        }
        hVar.c(new d3.e(((f3.a) gVar.f2438g).E() + this.f165c, iVar));
        return null;
    }

    @Override
    public boolean v() {
        return false;
    }

    public d(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f163a = i10;
        this.f164b = obj;
        this.f166e = obj2;
        this.d = obj3;
        this.f165c = j10;
    }

    public d(ChatObject.Call call, y1[] y1VarArr, long j10, Runnable runnable) {
        this.f163a = 6;
        this.f164b = call;
        this.d = y1VarArr;
        this.f165c = j10;
        this.f166e = runnable;
    }

    public d(dz0 dz0Var, long j10, gy gyVar, TLRPC.User user) {
        this.f163a = 7;
        this.f164b = dz0Var;
        this.f165c = j10;
        this.f166e = gyVar;
        this.d = user;
    }

    @Override
    public void P() {
    }

    @Override
    public void E(float f10) {
    }

    @Override
    public void J(boolean z10, boolean z11) {
    }
}
