package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.webrtc.AudioTrack;
import org.webrtc.MediaStream;
import org.webrtc.NativeLifecycleLock;
public final class ps0 implements b7c, qd3, fd, NativeLifecycleLock.NativePointerCallable, s69, ic7, bs9, sgb {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;

    public ps0(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    @Override
    public final void a(boolean z, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        hl.c3(new us0((cr8) this.c, this.b, tL_chatAdminRights, str, z, (uj3) this.d));
    }

    @Override
    public final Object apply(Object obj) {
        boolean z;
        String str = (String) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte b = ((be6) this.d).a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(b)});
        try {
            if (rawQuery.getCount() > 0) {
                z = true;
            } else {
                z = false;
            }
            rawQuery.close();
            long j = this.b;
            if (!z) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(b));
                contentValues.put("events_dropped_count", Long.valueOf(j));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(ik8.n(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(b)});
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override
    public final Object call(long j) {
        Boolean lambda$addTrack$0;
        lambda$addTrack$0 = ((MediaStream) this.c).lambda$addTrack$0(this.b, (AudioTrack) this.d, j);
        return lambda$addTrack$0;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        Context context = (Context) this.d;
        RectF rectF = ProfileActivity.Z6;
        profileActivity.y2(context, this.b, view, i, f, f2);
    }

    @Override
    public final void f(vw8 vw8Var) {
        ((az2) vw8Var.get()).d((String) this.c, this.b, (oa0) this.d);
    }

    @Override
    public final Object g() {
        ba0 ba0Var = (ba0) this.c;
        ds9 ds9Var = (ds9) ba0Var.c;
        long e = ((pj2) ba0Var.g).e() + this.b;
        ds9Var.getClass();
        ds9Var.c(new i02(e, (ta0) this.d));
        return null;
    }

    @Override
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((at0) this.c).o0(true, this.b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        int i2 = 0;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 2:
                y13 y13Var = (y13) obj2;
                c51 c51Var = (c51) obj;
                if (!c51Var.R) {
                    c51Var.setLoading(true);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.peer = uc7.s1(y13Var.a).j1(j);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(y13Var.a).sendRequest(getgroupcallstreamrtmpurl, new w13(y13Var, c51Var, (byte) 0));
                    return;
                }
                return;
            case 3:
                e eVar = (e) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                jn1 jn1Var = new jn1(eVar, this.b, twoStepVerificationActivity, (qs0) obj, (byte) 3);
                twoStepVerificationActivity.a0 = (byte) 1;
                twoStepVerificationActivity.c0 = jn1Var;
                twoStepVerificationActivity.x0(new p15(eVar, twoStepVerificationActivity, (byte) 0));
                return;
            case 4:
                j95 j95Var = (j95) obj2;
                e eVar2 = (e) j95Var.b2.N().getFragmentStack().get(j95Var.b2.N().getFragmentStack().size() - 1);
                uc7.s1(j95Var.n1.a).k(j95Var.a1(), (TLRPC.User) obj, null, eVar2, false, new kt(j95Var, j, (byte) 16), null);
                return;
            case 9:
                wua wuaVar = (wua) obj2;
                l01 g = idVar.g(-1, true, true);
                g.d();
                TL_stars.deleteStarGift deletestargift = new TL_stars.deleteStarGift();
                deletestargift.stargift = (TL_stars.InputSavedStarGift) obj;
                ConnectionsManager.getInstance(wuaVar.a).sendRequest(deletestargift, new p87(wuaVar, g, this.b, (byte) 16));
                return;
            default:
                r9b r9bVar = (r9b) obj2;
                ArrayList arrayList = (ArrayList) obj;
                r9bVar.d.put(Long.valueOf(j), arrayList);
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    r9bVar.b.k(((Long) obj3).longValue(), Boolean.TRUE);
                }
                r9bVar.j(true);
                r9bVar.f(true);
                r9bVar.g(true);
                idVar.dismiss();
                r9bVar.y.M = true;
                return;
        }
    }

    public ps0(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }

    @Override
    public final void u(View view, float f, float f2) {
    }
}
