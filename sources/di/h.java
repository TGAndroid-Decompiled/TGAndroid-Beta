package di;

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
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.zo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cx;
import org.telegram.ui.f40;
import org.telegram.ui.oa1;
import org.telegram.ui.rv0;
public final class h implements oa1, org.telegram.ui.ActionBar.r1, org.telegram.messenger.jc, pj0, zo, w5.b, v5.e, ua.a {
    public final int f8890a;
    public final long f8891b;
    public final Object f8892c;
    public final Object d;

    public h(Object obj, long j3, Object obj2, int i7) {
        this.f8890a = i7;
        this.f8892c = obj;
        this.f8891b = j3;
        this.d = obj2;
    }

    @Override
    public void a(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        org.telegram.messenger.g0.g3(new m((rv0) this.f8892c, this.f8891b, tL_chatAdminRights, str, z10, (cx) this.d));
    }

    @Override
    public Object apply(Object obj) {
        boolean z10;
        String str = (String) this.f8892c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i7 = ((r5.c) this.d).f56470a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i7)});
        try {
            if (rawQuery.getCount() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rawQuery.close();
            long j3 = this.f8891b;
            if (!z10) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i7));
                contentValues.put("events_dropped_count", Long.valueOf(j3));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(p5.c.j(j3, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i7)});
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override
    public void b(ua.b bVar) {
        ((x9.a) bVar.get()).d((String) this.f8892c, this.f8891b, (da.p1) this.d);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        ProfileActivity.h0((ProfileActivity) this.f8892c, (Context) this.d, this.f8891b, view, i7, f10, f11);
    }

    @Override
    public Object g() {
        ia.c cVar = (ia.c) this.f8892c;
        long r10 = ((x5.a) cVar.f16196g).r() + this.f8891b;
        v5.g gVar = (v5.g) ((v5.d) cVar.f16193c);
        gVar.getClass();
        gVar.c(new ai.d0(r10, (o5.i) this.d));
        return null;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f8890a) {
            case 1:
                f6 f6Var = (f6) this.f8892c;
                vf.b h = u1Var.h(-1, true, true);
                h.d();
                TL_stars.deleteStarGift deletestargift = new TL_stars.deleteStarGift();
                deletestargift.stargift = (TL_stars.InputSavedStarGift) this.d;
                ConnectionsManager.getInstance(f6Var.f30189a).sendRequest(deletestargift, new p2(f6Var, h, this.f8891b, 0));
                return;
            case 2:
                hi.l8 l8Var = (hi.l8) this.f8892c;
                ArrayList arrayList = (ArrayList) this.d;
                l8Var.d.put(Long.valueOf(this.f8891b), arrayList);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    l8Var.f14956b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                l8Var.j(true);
                l8Var.f(true);
                l8Var.g(true);
                u1Var.dismiss();
                l8Var.f14965y.M = true;
                return;
            case 3:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f8892c;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                bg.f0 f0Var = new bg.f0(h2Var, this.f8891b, twoStepVerificationActivity, (q10) this.d, 3);
                twoStepVerificationActivity.f43872a0 = 1;
                twoStepVerificationActivity.f43876c0 = f0Var;
                twoStepVerificationActivity.x0(new ii.b(h2Var, twoStepVerificationActivity, 0));
                return;
            case 4:
            case 5:
            default:
                f40 f40Var = (f40) this.f8892c;
                mp.u1(f40Var.f47498o1.f23221a).n(f40Var.m1(), (TLRPC.User) this.d, null, (org.telegram.ui.ActionBar.h2) f40Var.d2.M().getFragmentStack().get(f40Var.d2.M().getFragmentStack().size() - 1), new bi.y3(f40Var, this.f8891b, 27));
                return;
            case 6:
                hr hrVar = (hr) this.f8892c;
                hi.d dVar = (hi.d) this.d;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.peer = mp.u1(hrVar.f30189a).l1(this.f8891b);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(hrVar.f30189a).sendRequest(getgroupcallstreamrtmpurl, new dr(hrVar, dVar, 0));
                    return;
                }
                return;
        }
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((t) this.f8892c).v0(true, this.f8891b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.f8892c;
        long j3 = this.f8891b;
        File file = (File) this.d;
        org.telegram.messenger.hc p10 = imageReceiver.p();
        if (z10 && p10 != null && !p10.f24426c.isRecycled()) {
            Bitmap bitmap = p10.f24426c;
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
                Utilities.f22782e.c(new org.telegram.ui.ActionBar.a2(5, file, bitmap));
            } else if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        }
    }

    public h(Object obj, Object obj2, long j3, int i7) {
        this.f8890a = i7;
        this.f8892c = obj;
        this.d = obj2;
        this.f8891b = j3;
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
