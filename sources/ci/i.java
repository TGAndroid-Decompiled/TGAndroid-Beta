package ci;

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
import org.telegram.messenger.hp;
import org.telegram.messenger.uo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.tq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ca1;
import org.telegram.ui.iv0;
import org.telegram.ui.uw;
import org.telegram.ui.x30;
public final class i implements ca1, org.telegram.ui.ActionBar.p1, org.telegram.messenger.ec, gj0, uo, v5.b, u5.e, ta.a {
    public final int f5263a;
    public final long f5264b;
    public final Object f5265c;
    public final Object d;

    public i(Object obj, long j10, Object obj2, int i3) {
        this.f5263a = i3;
        this.f5265c = obj;
        this.f5264b = j10;
        this.d = obj2;
    }

    @Override
    public void a(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        org.telegram.messenger.g0.h3(new n((iv0) this.f5265c, this.f5264b, tL_chatAdminRights, str, z10, (uw) this.d));
    }

    @Override
    public Object apply(Object obj) {
        boolean z10;
        String str = (String) this.f5265c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i3 = ((q5.c) this.d).f53801a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i3)});
        try {
            if (rawQuery.getCount() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rawQuery.close();
            long j10 = this.f5264b;
            if (!z10) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i3));
                contentValues.put("events_dropped_count", Long.valueOf(j10));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(t4.c.e(j10, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i3)});
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        ProfileActivity.k0((ProfileActivity) this.f5265c, (Context) this.d, this.f5264b, view, i3, f10, f11);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void c(ta.b bVar) {
        ((w9.a) bVar.get()).d((String) this.f5265c, this.f5264b, (ca.p1) this.d);
    }

    @Override
    public Object d() {
        ha.c cVar = (ha.c) this.f5265c;
        long o10 = ((w5.a) cVar.f14377g).o() + this.f5264b;
        u5.g gVar = (u5.g) ((u5.d) cVar.f14374c);
        gVar.getClass();
        gVar.c(new ei.c1(o10, (n5.i) this.d));
        return null;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f5263a) {
            case 1:
                l6 l6Var = (l6) this.f5265c;
                sf.b h = s1Var.h(-1, true, true);
                h.d();
                TL_stars.deleteStarGift deletestargift = new TL_stars.deleteStarGift();
                deletestargift.stargift = (TL_stars.InputSavedStarGift) this.d;
                ConnectionsManager.getInstance(l6Var.f28583a).sendRequest(deletestargift, new u2(l6Var, h, this.f5264b, 0));
                return;
            case 2:
                gi.o8 o8Var = (gi.o8) this.f5265c;
                ArrayList arrayList = (ArrayList) this.d;
                o8Var.d.put(Long.valueOf(this.f5264b), arrayList);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    o8Var.f13341b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                o8Var.j(true);
                o8Var.f(true);
                o8Var.g(true);
                s1Var.dismiss();
                o8Var.f13350y.M = true;
                return;
            case 3:
            case 4:
            default:
                x30 x30Var = (x30) this.f5265c;
                hp.s1(x30Var.f51759l1.f21919a).n(x30Var.k1(), (TLRPC.User) this.d, null, (org.telegram.ui.ActionBar.d2) x30Var.f51716a2.M().getFragmentStack().get(x30Var.f51716a2.M().getFragmentStack().size() - 1), new e3(x30Var, this.f5264b, 26));
                return;
            case 5:
                tq tqVar = (tq) this.f5265c;
                gi.d dVar = (gi.d) this.d;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.peer = hp.s1(tqVar.f28583a).j1(this.f5264b);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(tqVar.f28583a).sendRequest(getgroupcallstreamrtmpurl, new pq(tqVar, dVar, 0));
                    return;
                }
                return;
        }
    }

    @Override
    public void l(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((v) this.f5265c).u0(true, this.f5264b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.f5265c;
        long j10 = this.f5264b;
        File file = (File) this.d;
        org.telegram.messenger.cc p10 = imageReceiver.p();
        if (z10 && p10 != null && !p10.f22007c.isRecycled()) {
            Bitmap bitmap = p10.f22007c;
            if (bitmap == null) {
                Drawable drawable = p10.d;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            if (bitmap != null) {
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(j10), bitmap));
                }
                Utilities.f21387e.c(new gi.a9(file, bitmap));
            } else if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        }
    }

    public i(Object obj, Object obj2, long j10, int i3) {
        this.f5263a = i3;
        this.f5265c = obj;
        this.d = obj2;
        this.f5264b = j10;
    }

    @Override
    public void D(ImageReceiver imageReceiver) {
    }

    @Override
    public void F0(int i3, Drawable drawable) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
