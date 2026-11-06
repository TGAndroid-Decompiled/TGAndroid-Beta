package bi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dp;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.tq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c40;
import org.telegram.ui.la1;
import org.telegram.ui.qv0;
import org.telegram.ui.ww;
public final class i implements la1, org.telegram.ui.ActionBar.r1, org.telegram.messenger.lc, cj0, dp, w5.b, v5.e, ua.a {
    public final int f4018a;
    public final long f4019b;
    public final Object f4020c;
    public final Object d;

    public i(Object obj, long j3, Object obj2, int i7) {
        this.f4018a = i7;
        this.f4020c = obj;
        this.f4019b = j3;
        this.d = obj2;
    }

    @Override
    public void a(boolean z9, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        org.telegram.messenger.g0.h3(new o((qv0) this.f4020c, this.f4019b, tL_chatAdminRights, str, z9, (ww) this.d));
    }

    @Override
    public Object apply(Object obj) {
        boolean z9;
        String str = (String) this.f4020c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i7 = ((r5.c) this.d).f54296a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i7)});
        try {
            if (rawQuery.getCount() > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            rawQuery.close();
            long j3 = this.f4019b;
            if (!z9) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i7));
                contentValues.put("events_dropped_count", Long.valueOf(j3));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(rf.b.h(j3, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i7)});
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override
    public void c(ua.b bVar) {
        ((x9.a) bVar.get()).d((String) this.f4020c, this.f4019b, (da.p1) this.d);
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        ProfileActivity.k0((ProfileActivity) this.f4020c, (Context) this.d, this.f4019b, view, i7, f10, f11);
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        ResultCallback resultCallback = (ResultCallback) this.f4020c;
        long j3 = this.f4019b;
        File file = (File) this.d;
        org.telegram.messenger.jc p10 = imageReceiver.p();
        if (z9 && p10 != null && !p10.f23509c.isRecycled()) {
            Bitmap bitmap = p10.f23509c;
            if (bitmap == null) {
                Drawable drawable = p10.d;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            if (bitmap != null) {
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(j3), bitmap));
                }
                Utilities.f21333e.c(new fi.z8(file, bitmap));
            } else if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f4018a) {
            case 1:
                k7 k7Var = (k7) this.f4020c;
                vf.b h = u1Var.h(-1, true, true);
                h.d();
                TL_stars.deleteStarGift deletestargift = new TL_stars.deleteStarGift();
                deletestargift.stargift = (TL_stars.InputSavedStarGift) this.d;
                ConnectionsManager.getInstance(k7Var.f28612a).sendRequest(deletestargift, new h3(k7Var, h, this.f4019b, 0));
                return;
            case 2:
                fi.n8 n8Var = (fi.n8) this.f4020c;
                ArrayList arrayList = (ArrayList) this.d;
                n8Var.d.put(Long.valueOf(this.f4019b), arrayList);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    n8Var.f12486b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                n8Var.j(true);
                n8Var.f(true);
                n8Var.g(true);
                u1Var.dismiss();
                n8Var.f12495y.L = true;
                return;
            case 3:
            case 4:
            default:
                c40 c40Var = (c40) this.f4020c;
                qp.s1(c40Var.f44565k1.f21723a).n(c40Var.l1(), (TLRPC.User) this.d, null, (org.telegram.ui.ActionBar.f2) c40Var.Z1.M().getFragmentStack().get(c40Var.Z1.M().getFragmentStack().size() - 1), new r3(c40Var, this.f4019b, 26));
                return;
            case 5:
                tq tqVar = (tq) this.f4020c;
                fi.d dVar = (fi.d) this.d;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.peer = qp.s1(tqVar.f28612a).j1(this.f4019b);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(tqVar.f28612a).sendRequest(getgroupcallstreamrtmpurl, new pq(tqVar, dVar, 0));
                    return;
                }
                return;
        }
    }

    @Override
    public Object h() {
        ia.c cVar = (ia.c) this.f4020c;
        long s5 = ((x5.a) cVar.f15420g).s() + this.f4019b;
        v5.g gVar = (v5.g) ((v5.d) cVar.f15417c);
        gVar.getClass();
        gVar.c(new di.c1(s5, (o5.i) this.d));
        return null;
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((z) this.f4020c).u0(true, this.f4019b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    public i(Object obj, Object obj2, long j3, int i7) {
        this.f4018a = i7;
        this.f4020c = obj;
        this.d = obj2;
        this.f4019b = j3;
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
    }

    @Override
    public void t0(int i7, Drawable drawable) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
