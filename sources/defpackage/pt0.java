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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class pt0 implements c5c, ke3, ee, g59, cc7, kq9, yeb {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;

    public pt0(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    @Override
    public final void a(boolean z, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        gm.c3(new ut0((sp8) this.c, this.b, tL_chatAdminRights, str, z, (nk3) this.d));
    }

    @Override
    public final Object apply(Object obj) {
        boolean z;
        String str = (String) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte b = ((wd6) this.d).a;
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
            sQLiteDatabase.execSQL(wi8.n(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(b)});
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        Context context = (Context) this.d;
        RectF rectF = ProfileActivity.e7;
        profileActivity.A2(context, this.b, view, i, f, f2);
    }

    @Override
    public final Object e() {
        za0 za0Var = (za0) this.c;
        mq9 mq9Var = (mq9) za0Var.c;
        long a = ((hk2) za0Var.g).a() + this.b;
        mq9Var.getClass();
        mq9Var.c(new d12(a, (rb0) this.d));
        return null;
    }

    @Override
    public final void f(nv8 nv8Var) {
        ((qz2) nv8Var.get()).d((String) this.c, this.b, (mb0) this.d);
    }

    @Override
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((au0) this.c).p0(true, this.b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        int i2 = 0;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 2:
                r23 r23Var = (r23) obj2;
                b61 b61Var = (b61) obj;
                if (!b61Var.R) {
                    b61Var.setLoading(true);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.peer = oc7.r1(r23Var.a).i1(j);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(r23Var.a).sendRequest(getgroupcallstreamrtmpurl, new p23(r23Var, b61Var, (byte) 1));
                    return;
                }
                return;
            case 3:
                d dVar = (d) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                zn1 zn1Var = new zn1(dVar, this.b, twoStepVerificationActivity, (qt0) obj, (byte) 3);
                twoStepVerificationActivity.a0 = (byte) 1;
                twoStepVerificationActivity.c0 = zn1Var;
                twoStepVerificationActivity.x0(new k15(dVar, twoStepVerificationActivity, (byte) 0));
                return;
            case 4:
                g95 g95Var = (g95) obj2;
                d dVar2 = (d) g95Var.b2.N().getFragmentStack().get(g95Var.b2.N().getFragmentStack().size() - 1);
                oc7.r1(g95Var.n1.a).k(g95Var.Z0(), (TLRPC.User) obj, null, dVar2, false, new fu(g95Var, j, (byte) 16), null);
                return;
            case 5:
            case 6:
            case 7:
            default:
                v7b v7bVar = (v7b) obj2;
                ArrayList arrayList = (ArrayList) obj;
                v7bVar.d.put(Long.valueOf(j), arrayList);
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    v7bVar.b.k(Boolean.TRUE, ((Long) obj3).longValue());
                }
                v7bVar.j(true);
                v7bVar.f(true);
                v7bVar.g(true);
                heVar.dismiss();
                v7bVar.y.M = true;
                return;
            case 8:
                wsa wsaVar = (wsa) obj2;
                k11 g = heVar.g(-1, true, true);
                g.d();
                TL_stars.deleteStarGift deletestargift = new TL_stars.deleteStarGift();
                deletestargift.stargift = (TL_stars.InputSavedStarGift) obj;
                ConnectionsManager.getInstance(wsaVar.a).sendRequest(deletestargift, new jb7(wsaVar, g, this.b, (byte) 15));
                return;
        }
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    public pt0(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }

    @Override
    public final void p(View view, float f, float f2) {
    }
}
