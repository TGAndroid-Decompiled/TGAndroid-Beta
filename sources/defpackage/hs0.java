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
public final class hs0 implements b3c, yc3, ed, d39, ba7, jo9, xcb {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;

    public hs0(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    @Override
    public final void a(boolean z, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        gl.d3(new ms0((rn8) this.c, this.b, tL_chatAdminRights, str, z, (cj3) this.d));
    }

    @Override
    public final Object apply(Object obj) {
        boolean z;
        String str = (String) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte b = ((xb6) this.d).a;
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
            sQLiteDatabase.execSQL(ug8.n(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(b)});
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        Context context = (Context) this.d;
        RectF rectF = ProfileActivity.Z6;
        profileActivity.x2(context, this.b, view, i, f, f2);
    }

    @Override
    public final void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((ss0) this.c).o0(true, this.b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public final void h(mt8 mt8Var) {
        ((fy2) mt8Var.get()).d((String) this.c, this.b, (ma0) this.d);
    }

    @Override
    public final Object m() {
        z90 z90Var = (z90) this.c;
        lo9 lo9Var = (lo9) z90Var.c;
        long e = ((ti2) z90Var.g).e() + this.b;
        lo9Var.getClass();
        lo9Var.c(new rz1(e, (ra0) this.d));
        return null;
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        int i2 = 0;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 2:
                f13 f13Var = (f13) obj2;
                u41 u41Var = (u41) obj;
                if (!u41Var.R) {
                    u41Var.setLoading(true);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.peer = na7.q1(f13Var.a).h1(j);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(f13Var.a).sendRequest(getgroupcallstreamrtmpurl, new d13(f13Var, u41Var, (byte) 1));
                    return;
                }
                return;
            case 3:
                d dVar = (d) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                qm1 qm1Var = new qm1(dVar, this.b, twoStepVerificationActivity, (is0) obj, (byte) 3);
                twoStepVerificationActivity.a0 = (byte) 1;
                twoStepVerificationActivity.c0 = qm1Var;
                twoStepVerificationActivity.w0(new lz4(dVar, twoStepVerificationActivity, (byte) 0));
                return;
            case 4:
                h75 h75Var = (h75) obj2;
                d dVar2 = (d) h75Var.b2.N().getFragmentStack().get(h75Var.b2.N().getFragmentStack().size() - 1);
                na7.q1(h75Var.n1.a).k(h75Var.Z0(), (TLRPC.User) obj, null, dVar2, new et(h75Var, j, (byte) 16));
                return;
            case 5:
            case 6:
            case 7:
            default:
                t5b t5bVar = (t5b) obj2;
                ArrayList arrayList = (ArrayList) obj;
                t5bVar.d.put(Long.valueOf(j), arrayList);
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    t5bVar.b.k(Boolean.TRUE, ((Long) obj3).longValue());
                }
                t5bVar.j(true);
                t5bVar.f(true);
                t5bVar.g(true);
                hdVar.dismiss();
                t5bVar.y.M = true;
                return;
            case 8:
                vqa vqaVar = (vqa) obj2;
                c01 g = hdVar.g(-1, true, true);
                g.d();
                TL_stars.deleteStarGift deletestargift = new TL_stars.deleteStarGift();
                deletestargift.stargift = (TL_stars.InputSavedStarGift) obj;
                ConnectionsManager.getInstance(vqaVar.a).sendRequest(deletestargift, new w47(vqaVar, g, this.b, (byte) 15));
                return;
        }
    }

    public hs0(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }

    @Override
    public final void l(View view, float f, float f2) {
    }
}
