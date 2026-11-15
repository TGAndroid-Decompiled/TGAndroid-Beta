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
import org.telegram.messenger.ap;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c40;
import org.telegram.ui.ka1;
import org.telegram.ui.pv0;
import org.telegram.ui.yw;
public final class h implements ka1, org.telegram.ui.ActionBar.q1, org.telegram.messenger.kc, hj0, ap, w5.b, v5.e, ua.a {
    public final int f8648a;
    public final long f8649b;
    public final Object f8650c;
    public final Object d;

    public h(Object obj, long j3, Object obj2, int i7) {
        this.f8648a = i7;
        this.f8650c = obj;
        this.f8649b = j3;
        this.d = obj2;
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ResultCallback resultCallback = (ResultCallback) this.f8650c;
        long j3 = this.f8649b;
        File file = (File) this.d;
        org.telegram.messenger.ic p10 = imageReceiver.p();
        if (z10 && p10 != null && !p10.f24374c.isRecycled()) {
            Bitmap bitmap = p10.f24374c;
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
                Utilities.f22416e.c(new hi.x8(file, bitmap));
            } else if (resultCallback != null) {
                resultCallback.onComplete(null);
            }
        }
    }

    @Override
    public void a(boolean z10, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        org.telegram.messenger.g0.h3(new l((pv0) this.f8650c, this.f8649b, tL_chatAdminRights, str, z10, (yw) this.d));
    }

    @Override
    public Object apply(Object obj) {
        boolean z10;
        String str = (String) this.f8650c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i7 = ((r5.c) this.d).f55896a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i7)});
        try {
            if (rawQuery.getCount() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rawQuery.close();
            long j3 = this.f8649b;
            if (!z10) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i7));
                contentValues.put("events_dropped_count", Long.valueOf(j3));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(r.b.j(j3, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i7)});
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override
    public void b(ua.b bVar) {
        ((x9.a) bVar.get()).d((String) this.f8650c, this.f8649b, (da.p1) this.d);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        ProfileActivity.h0((ProfileActivity) this.f8650c, (Context) this.d, this.f8649b, view, i7, f10, f11);
    }

    @Override
    public Object g() {
        ia.c cVar = (ia.c) this.f8650c;
        long s5 = ((x5.a) cVar.f15878g).s() + this.f8649b;
        v5.g gVar = (v5.g) ((v5.d) cVar.f15875c);
        gVar.getClass();
        gVar.c(new ai.c0(s5, (o5.i) this.d, 14));
        return null;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f8648a) {
            case 1:
                c6 c6Var = (c6) this.f8650c;
                vf.b h = t1Var.h(-1, true, true);
                h.d();
                TL_stars.deleteStarGift deletestargift = new TL_stars.deleteStarGift();
                deletestargift.stargift = (TL_stars.InputSavedStarGift) this.d;
                ConnectionsManager.getInstance(c6Var.f29679a).sendRequest(deletestargift, new o2(c6Var, h, this.f8649b, 0));
                return;
            case 2:
                hi.l8 l8Var = (hi.l8) this.f8650c;
                ArrayList arrayList = (ArrayList) this.d;
                l8Var.d.put(Long.valueOf(this.f8649b), arrayList);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    l8Var.f14601b.k(Boolean.TRUE, ((Long) obj).longValue());
                }
                l8Var.j(true);
                l8Var.f(true);
                l8Var.g(true);
                t1Var.dismiss();
                l8Var.f14610y.M = true;
                return;
            case 3:
            case 4:
            default:
                c40 c40Var = (c40) this.f8650c;
                np.s1(c40Var.f45951o1.f22778a).n(c40Var.l1(), (TLRPC.User) this.d, null, (org.telegram.ui.ActionBar.e2) c40Var.d2.M().getFragmentStack().get(c40Var.d2.M().getFragmentStack().size() - 1), new x2(c40Var, this.f8649b, 26));
                return;
            case 5:
                ar arVar = (ar) this.f8650c;
                hi.d dVar = (hi.d) this.d;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.peer = np.s1(arVar.f29679a).j1(this.f8649b);
                    getgroupcallstreamrtmpurl.revoke = true;
                    ConnectionsManager.getInstance(arVar.f29679a).sendRequest(getgroupcallstreamrtmpurl, new wq(arVar, dVar, 0));
                    return;
                }
                return;
        }
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((t) this.f8650c).u0(true, this.f8649b, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    public h(Object obj, Object obj2, long j3, int i7) {
        this.f8648a = i7;
        this.f8650c = obj;
        this.d = obj2;
        this.f8649b = j3;
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
    }

    @Override
    public void O(int i7, Drawable drawable) {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
