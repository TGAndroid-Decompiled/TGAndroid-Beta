package org.telegram.messenger.voip;

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
import org.telegram.messenger.ip;
import org.telegram.messenger.kc;
import org.telegram.messenger.mc;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.w3;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.zq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ay;
import org.telegram.ui.b50;
import org.telegram.ui.dx0;
import org.telegram.ui.gc1;
import rh.e4;
import vh.r6;
import z9.b1;
public final class d0 implements mc, u1, hk0, ip, t5.b, gc1, s5.e, qa.a {
    public final int f18627a;
    public final long f18628b;
    public final Object f18629c;
    public final Object d;

    public d0(Object obj, long j10, Object obj2, int i10) {
        this.f18627a = i10;
        this.f18629c = obj;
        this.f18628b = j10;
        this.d = obj2;
    }

    @Override
    public void a(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        org.telegram.messenger.i0.g3(new hf((dx0) this.f18629c, this.f18628b, tL_chatAdminRights, str, z10, (ay) this.d));
    }

    @Override
    public Object apply(Object obj) {
        boolean z10;
        String str = (String) this.f18629c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((o5.c) this.d).f14091a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            if (rawQuery.getCount() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rawQuery.close();
            long j10 = this.f18628b;
            if (!z10) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i10));
                contentValues.put("events_dropped_count", Long.valueOf(j10));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(f1.n(j10, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        ProfileActivity.j0((ProfileActivity) this.f18629c, (Context) this.d, this.f18628b, view, i10, f7, f10);
    }

    @Override
    public Object g() {
        ea.d dVar = (ea.d) this.f18629c;
        long g10 = ((u5.a) dVar.f6470g).g() + this.f18628b;
        s5.g gVar = (s5.g) ((s5.d) dVar.f6468c);
        gVar.getClass();
        gVar.c(new m4.x0(g10, (l5.i) this.d));
        return null;
    }

    @Override
    public void h(x1 x1Var, int i10) {
        switch (this.f18627a) {
            case 2:
                cr crVar = (cr) this.f18629c;
                vh.d dVar = (vh.d) this.d;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.peer = vp.r1(crVar.f21583a).i1(this.f18628b);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(crVar.f21583a).sendRequest(getgroupcallstreamrtmpurl, new zq(crVar, dVar, 0));
                    return;
                }
                return;
            case 3:
                b50 b50Var = (b50) this.f18629c;
                vp.r1(b50Var.f36036k1.f14863a).n(b50Var.k1(), (TLRPC.User) this.d, null, (k2) b50Var.Z1.M().getFragmentStack().get(b50Var.Z1.M().getFragmentStack().size() - 1), new bi.e(b50Var, this.f18628b, 15));
                return;
            case 8:
                e4 e4Var = (e4) this.f18629c;
                gf.e h = x1Var.h(-1, true, true);
                h.d();
                TL_stars.deleteStarGift deletestargift = new TL_stars.deleteStarGift();
                deletestargift.stargift = (TL_stars.InputSavedStarGift) this.d;
                ConnectionsManager.getInstance(e4Var.f21583a).sendRequest(deletestargift, new mg.x(e4Var, h, this.f18628b, 4));
                return;
            default:
                r6 r6Var = (r6) this.f18629c;
                ArrayList arrayList = (ArrayList) this.d;
                r6Var.d.put(Long.valueOf(this.f18628b), arrayList);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    r6Var.f51887b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                r6Var.j(true);
                r6Var.f(true);
                r6Var.g(true);
                x1Var.dismiss();
                r6Var.f51895y.L = true;
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void i(qa.b bVar) {
        ((u9.a) bVar.get()).d((String) this.f18629c, this.f18628b, (b1) this.d);
    }

    @Override
    public void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((rh.i) this.f18629c).t0(true, this.f18628b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.f18629c;
        long j10 = this.f18628b;
        File file = (File) this.d;
        kc p5 = imageReceiver.p();
        if (z10 && p5 != null && !p5.f16564c.isRecycled()) {
            Bitmap bitmap = p5.f16564c;
            if (bitmap == null) {
                Drawable drawable = p5.d;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            if (bitmap != null) {
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(j10), bitmap));
                }
                Utilities.e.c(new w3(file, bitmap));
            } else if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        }
    }

    public d0(Object obj, Object obj2, long j10, int i10) {
        this.f18627a = i10;
        this.f18629c = obj;
        this.d = obj2;
        this.f18628b = j10;
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
    }

    @Override
    public void q(int i10, Drawable drawable) {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
