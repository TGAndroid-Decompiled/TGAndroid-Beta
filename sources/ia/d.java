package ia;

import a3.h;
import android.animation.AnimatorSet;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.location.Location;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.j;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.l;
import gb.y0;
import j6.i;
import j6.r;
import j6.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import jg.h1;
import jg.o1;
import jg.y1;
import l.m;
import l.w;
import m.e2;
import m.k;
import oi.d1;
import oi.d2;
import oi.e1;
import oi.e3;
import oi.e4;
import oi.g0;
import oi.h4;
import oi.j4;
import oi.k5;
import oi.l3;
import oi.m3;
import oi.n3;
import oi.o;
import oi.o3;
import oi.p3;
import oi.q3;
import oi.v0;
import oi.y2;
import oi.y5;
import oi.z1;
import org.json.JSONObject;
import org.telegram.messenger.az;
import org.telegram.messenger.bb;
import org.telegram.messenger.ca;
import org.telegram.messenger.cz;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.j0;
import org.telegram.messenger.n0;
import org.telegram.messenger.ns;
import org.telegram.messenger.qa;
import org.telegram.messenger.wa;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.d0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.x40;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.bg0;
import org.telegram.ui.ys;
import w7.s;
public final class d implements q, ib.b, y1, e2, w, k, ce.c, o0.a, r4, g0, o3, d1, wa, qa, az, gh.a, pm0 {
    public final int f15880a;
    public Object f15881b;

    public d(int i7) {
        this.f15880a = i7;
    }

    public static d H(float f10, int i7) {
        boolean z10;
        Point point = org.telegram.messenger.g0.f23609q;
        int i10 = (int) (point.x * f10);
        int i11 = (int) (point.y * f10);
        if (i10 == i11) {
            return new d(i10, i11, new int[0]);
        }
        if (i7 == 3) {
            return new d(i10, i11, new int[]{i11, i10});
        }
        boolean z11 = true;
        if (i7 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 >= i11) {
            z11 = false;
        }
        if (z10 == z11) {
            return new d(i10, i11, new int[0]);
        }
        return new d(i11, i10, new int[0]);
    }

    @Override
    public void A(oi.a aVar) {
        z1 z1Var = (z1) this.f15881b;
        if (aVar != null && (aVar.f21544b instanceof TL_iv.pageBlockMap) && org.telegram.messenger.g0.J1(z1Var)) {
            ki kiVar = new ki(z1Var.getParentActivity(), z1Var, false, false, false, z1Var.getResourceProvider());
            kiVar.X3 = new sa.d(16);
            kiVar.K1 = true;
            kiVar.f36506v3.setVisibility(8);
            kiVar.f36503u4 = new h(z1Var, aVar, kiVar, 16);
            kiVar.e1();
            kiVar.show();
        }
    }

    @Override
    public float A1() {
        float f10;
        gh.a k10 = k();
        gh.a t6 = t();
        if (k10 != null) {
            f10 = k10.A1();
        } else {
            f10 = 0.0f;
        }
        if (t6 != null) {
            return org.telegram.messenger.g0.T1(t6.A1(), f10, ((g5) this.f15881b).f28585a);
        }
        return f10;
    }

    @Override
    public int A2() {
        int i7;
        q4 q4Var;
        g5 g5Var = (g5) this.f15881b;
        gh.a k10 = k();
        if (k10 != null) {
            i7 = k10.A2();
        } else {
            i7 = 0;
        }
        if (g5Var.f28585a < 1.0f && (q4Var = g5Var.d) != null) {
            return i0.a.f(g5Var.f28585a, q4Var.getButtonsGlassBackgroundColor(), i7);
        }
        return i7;
    }

    @Override
    public void D() {
        z1 z1Var = (z1) this.f15881b;
        z1Var.J0 = z1Var.L0;
        z1.e0(z1Var, false, false);
        z1Var.C0(2, true);
    }

    @Override
    public int D1() {
        int i7;
        gh.a k10 = k();
        gh.a t6 = t();
        if (k10 != null) {
            i7 = k10.D1();
        } else {
            i7 = 0;
        }
        if (t6 != null) {
            return i0.a.f(((g5) this.f15881b).f28585a, t6.D1(), i7);
        }
        return i7;
    }

    @Override
    public h9 E() {
        switch (this.f15880a) {
            case 16:
                l3 l3Var = ((v0) this.f15881b).T;
                if (l3Var == null) {
                    return null;
                }
                return l3Var.f21798a.getTextSelectionHelper();
            default:
                h4 h4Var = ((j4) this.f15881b).H;
                if (h4Var != null) {
                    return ((m3) h4Var).f21814a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public Object G(ce.d dVar, kd.c cVar) {
        Object G = ((q4.q) this.f15881b).G(new y0(dVar, 1), cVar);
        if (G == jd.a.f16999a) {
            return G;
        }
        return gd.k.f13173a;
    }

    @Override
    public void I(CharSequence charSequence) {
        y2 y2Var = ((k5) this.f15881b).F;
        if (y2Var != null && charSequence != null && charSequence.length() > 0) {
            y2Var.f22138a.w4(charSequence.toString());
        }
    }

    @Override
    public void J(CharSequence charSequence) {
        switch (this.f15880a) {
            case 16:
                l3 l3Var = ((v0) this.f15881b).T;
                if (l3Var != null) {
                    l3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        l3Var.f21798a.w4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                h4 h4Var = ((j4) this.f15881b).H;
                if (h4Var != null) {
                    m3 m3Var = (m3) h4Var;
                    m3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        m3Var.f21814a.w4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        switch (this.f15880a) {
            case 15:
                ((o) this.f15881b).M(z10, i7, i10, 0L, false);
                o oVar = (o) this.f15881b;
                bg0 bg0Var = oVar.P;
                if (bg0Var != null) {
                    bg0Var.i();
                    oVar.P = null;
                    return;
                }
                return;
            default:
                d0 d0Var = (d0) this.f15881b;
                d0Var.q1(i7, i10, z10);
                d0Var.dismiss();
                return;
        }
    }

    @Override
    public void M(y5 y5Var, String str) {
        z1 z1Var = (z1) this.f15881b;
        if (z1Var.A0 == null) {
            z1Var.A0 = new ga.d(new ki.e(this, 19), z1Var.getResourceProvider());
        }
        z1Var.A0.k(y5Var, str);
    }

    @Override
    public int M0() {
        int i7;
        gh.a k10 = k();
        gh.a t6 = t();
        if (k10 != null) {
            i7 = k10.M0();
        } else {
            i7 = 0;
        }
        if (t6 != null) {
            return i0.a.f(((g5) this.f15881b).f28585a, t6.M0(), i7);
        }
        return i7;
    }

    @Override
    public g9 N() {
        switch (this.f15880a) {
            case 16:
                return (v0) this.f15881b;
            default:
                return (j4) this.f15881b;
        }
    }

    @Override
    public oi.a P() {
        switch (this.f15880a) {
            case 16:
                return ((v0) this.f15881b).f22106a;
            default:
                return ((j4) this.f15881b).f22106a;
        }
    }

    @Override
    public boolean R() {
        switch (this.f15880a) {
            case 16:
                v0 v0Var = (v0) this.f15881b;
                l3 l3Var = v0Var.T;
                if (l3Var != null) {
                    oi.a aVar = v0Var.f22106a;
                    if (l3Var.f21798a.V4()) {
                        return true;
                    }
                }
                return false;
            default:
                j4 j4Var = (j4) this.f15881b;
                h4 h4Var = j4Var.H;
                if (h4Var != null) {
                    oi.a aVar2 = j4Var.f22106a;
                    if (((m3) h4Var).f21814a.V4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    public b S(JSONObject jSONObject) {
        e aVar;
        int i7 = jSONObject.getInt("settings_version");
        if (i7 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i7 + ". Using default settings values.", null);
            aVar = new pb.b(11);
        } else {
            aVar = new qb.a(11);
        }
        return aVar.d((s) this.f15881b, jSONObject);
    }

    public void T(long j3, long j10, long j11, Object obj) {
        LongSparseArray longSparseArray = (LongSparseArray) this.f15881b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j3);
        if (longSparseArray2 == null) {
            longSparseArray2 = new LongSparseArray();
            longSparseArray.put(j3, longSparseArray2);
        }
        LongSparseArray longSparseArray3 = (LongSparseArray) longSparseArray2.get(j10);
        if (longSparseArray3 == null) {
            longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j10, longSparseArray3);
        }
        longSparseArray3.get(j11);
        longSparseArray3.put(j11, obj);
    }

    @Override
    public a0.h U() {
        return null;
    }

    @Override
    public int U0() {
        int i7;
        g5 g5Var = (g5) this.f15881b;
        gh.a k10 = k();
        if (k10 != null && g5Var.d.e()) {
            i7 = k10.U0();
        } else {
            i7 = 0;
        }
        gh.a t6 = t();
        if (t6 != null) {
            return i0.a.f(g5Var.f28585a, t6.U0(), i7);
        }
        return i7;
    }

    @Override
    public void V(int i7, int i10) {
        switch (this.f15880a) {
            case 16:
                v0 v0Var = (v0) this.f15881b;
                l3 l3Var = v0Var.T;
                if (l3Var != null) {
                    oi.a aVar = v0Var.f22106a;
                    d2 d2Var = l3Var.f21798a.R3;
                    if (d2Var != null) {
                        d2Var.f(i7, i10);
                        return;
                    }
                    return;
                }
                return;
            default:
                j4 j4Var = (j4) this.f15881b;
                h4 h4Var = j4Var.H;
                if (h4Var != null) {
                    oi.a aVar2 = j4Var.f22106a;
                    d2 d2Var2 = ((m3) h4Var).f21814a.R3;
                    if (d2Var2 != null) {
                        d2Var2.f(i7, i10);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public Object W(long j3, long j10, long j11) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = (LongSparseArray) ((LongSparseArray) this.f15881b).get(j3);
        if (longSparseArray2 == null || (longSparseArray = (LongSparseArray) longSparseArray2.get(j10)) == null) {
            return null;
        }
        Object obj = longSparseArray.get(j11);
        longSparseArray.remove(j11);
        return obj;
    }

    @Override
    public int W1() {
        int i7;
        gh.a k10 = k();
        gh.a t6 = t();
        if (k10 != null) {
            i7 = k10.W1();
        } else {
            i7 = 0;
        }
        if (t6 != null) {
            return i0.a.f(((g5) this.f15881b).f28585a, t6.W1(), i7);
        }
        return i7;
    }

    @Override
    public void Y() {
        z1 z1Var = (z1) this.f15881b;
        int i7 = 0;
        z1.e0(z1Var, false, true);
        int i10 = z1Var.J0;
        if (i10 != 2) {
            i7 = i10;
        }
        z1Var.C0(i7, true);
    }

    @Override
    public float Y0() {
        float f10;
        float f11;
        g5 g5Var = (g5) this.f15881b;
        gh.a k10 = k();
        gh.a t6 = t();
        if (k10 != null) {
            f10 = k10.Y0();
        } else {
            f10 = -1.0f;
        }
        if (t6 != null) {
            f11 = t6.Y0();
        } else {
            f11 = f10;
        }
        if (f11 >= 0.0f && f10 >= 0.0f) {
            return org.telegram.messenger.g0.T1(f11, f10, g5Var.f28585a);
        }
        if (g5Var.f28585a < 0.5f) {
            return f11;
        }
        return f10;
    }

    @Override
    public void Z(e1 e1Var, int i7, int i10) {
        y2 y2Var;
        h9 textSelectionHelper;
        k5 k5Var = (k5) this.f15881b;
        if (!k5Var.H && i7 != i10 && (y2Var = k5Var.F) != null && (textSelectionHelper = y2Var.f22138a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != k5Var) {
                k5Var.post(new o1(this, e1Var, i10, textSelectionHelper, i7, 4));
            }
        }
    }

    @Override
    public float Z0() {
        float f10;
        float f11;
        g5 g5Var = (g5) this.f15881b;
        gh.a k10 = k();
        gh.a t6 = t();
        if (k10 != null) {
            f10 = k10.Z0();
        } else {
            f10 = -1.0f;
        }
        if (t6 != null) {
            f11 = t6.Z0();
        } else {
            f11 = f10;
        }
        if (f11 >= 0.0f && f10 >= 0.0f) {
            return org.telegram.messenger.g0.T1(f11, f10, g5Var.f28585a);
        }
        if (g5Var.f28585a < 0.5f) {
            return f11;
        }
        return f10;
    }

    @Override
    public boolean a(float f10) {
        boolean z10;
        int[] iArr;
        z1 z1Var = (z1) this.f15881b;
        FrameLayout frameLayout = z1Var.f22186w0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f10 >= iArr[1]) {
                z10 = true;
                z1.e0(z1Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        z1.e0(z1Var, z10, true);
        return z10;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f15880a) {
            case 1:
                r rVar = new r(1, (TaskCompletionSource) obj2);
                i iVar = (i) ((t) obj).n();
                Parcel p12 = iVar.p1();
                com.google.android.gms.internal.cast.t.d(p12, rVar);
                p12.writeStringArray((String[]) this.f15881b);
                iVar.u1(p12, 6);
                return;
            case 4:
                k7.f fVar = new k7.f(0, (TaskCompletionSource) obj2);
                g gVar = new g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
                gVar.f5920c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i7 = t7.a.f57044a;
                obtain.writeStrongBinder(fVar);
                t7.a.b(obtain, (j7.g) this.f15881b);
                t7.a.b(obtain, gVar);
                ((k7.b) ((k7.d) ((k7.e) obj).n())).h1(obtain, 6);
                return;
            default:
                l lVar = new l((TaskCompletionSource) obj2);
                l7.i iVar2 = (l7.i) ((l7.c) obj).n();
                Parcel l1 = iVar2.l1();
                int i10 = l7.f.f19335a;
                l1.writeStrongBinder(lVar);
                l7.f.c(l1, (a6.e) this.f15881b);
                iVar2.m1(l1, 1);
                return;
        }
    }

    @Override
    public void b0(Editable editable) {
        k5 k5Var = (k5) this.f15881b;
        oi.a aVar = k5Var.f22106a;
        if (aVar != null) {
            aVar.f21559s = true;
            aVar.f21558r = k5Var.f21776r.f21665q2;
        }
        k5Var.w();
        y2 y2Var = k5Var.F;
        if (y2Var != null && k5Var.f22106a != null) {
            y2Var.a();
        }
    }

    @Override
    public void c() {
        ez ezVar = (ez) this.f15881b;
        HashMap hashMap = ezVar.f23391n;
        ezVar.getNotificationCenter().k(ns.R0, new HashMap(hashMap));
        hashMap.clear();
    }

    @Override
    public void c0() {
        switch (this.f15880a) {
            case 16:
                v0 v0Var = (v0) this.f15881b;
                l3 l3Var = v0Var.T;
                if (l3Var != null) {
                    oi.a aVar = v0Var.f22106a;
                    q3 q3Var = l3Var.f21798a;
                    d2 d2Var = q3Var.R3;
                    if (d2Var != null) {
                        d2Var.g();
                    }
                    q3Var.f21931p3.onContentChanged();
                    return;
                }
                return;
            default:
                j4 j4Var = (j4) this.f15881b;
                h4 h4Var = j4Var.H;
                if (h4Var != null) {
                    oi.a aVar2 = j4Var.f22106a;
                    q3 q3Var2 = ((m3) h4Var).f21814a;
                    d2 d2Var2 = q3Var2.R3;
                    if (d2Var2 != null) {
                        d2Var2.g();
                    }
                    q3Var2.f21931p3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15881b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public void d(e1 e1Var) {
        switch (this.f15880a) {
            case 16:
                l3 l3Var = ((v0) this.f15881b).T;
                if (l3Var != null) {
                    q3 q3Var = l3Var.f21798a;
                    q3.Q1(q3Var, e1Var);
                    q3Var.f21931p3.b(e1Var, true);
                    return;
                }
                return;
            case 17:
            default:
                y2 y2Var = ((k5) this.f15881b).F;
                if (y2Var != null) {
                    q3 q3Var2 = y2Var.f22138a;
                    q3.Q1(q3Var2, e1Var);
                    q3Var2.f21931p3.b(e1Var, true);
                    return;
                }
                return;
            case 18:
                h4 h4Var = ((j4) this.f15881b).H;
                if (h4Var != null) {
                    q3 q3Var3 = ((m3) h4Var).f21814a;
                    q3.Q1(q3Var3, e1Var);
                    q3Var3.f21931p3.b(e1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void e(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).f18789z.k().c(false);
        }
        w wVar = ((m.h) this.f15881b).f19707e;
        if (wVar != null) {
            wVar.e(kVar, z10);
        }
    }

    @Override
    public boolean e0(int i7) {
        return true;
    }

    @Override
    public void f(Location location) {
        ez ezVar = (ez) this.f15881b;
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.g0.b0(location.getLatitude());
        tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(location.getLongitude());
        HashMap hashMap = ezVar.f23391n;
        for (Map.Entry entry : hashMap.entrySet()) {
            gj gjVar = (gj) entry.getValue();
            ezVar.r0(cz.d(tL_messageMediaGeo, gj.B0(gjVar.f23817k), gjVar, null, null, null, true, 0));
        }
        hashMap.clear();
    }

    @Override
    public boolean g() {
        k5 k5Var = (k5) this.f15881b;
        y2 y2Var = k5Var.F;
        if (y2Var != null && k5Var.f22106a != null) {
            return y2Var.f22138a.V4();
        }
        return false;
    }

    @Override
    public m60 g0(View view) {
        return m60.H((z1) this.f15881b, view);
    }

    @Override
    public Object mo24get() {
        return new jb.a((Context) ((d9.o) this.f15881b).f7640b);
    }

    @Override
    public CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        ys ysVar = (ys) this.f15881b;
        sb2.append((Object) ysVar.f30042a.getText());
        sb2.append(" ");
        sb2.append((Object) ysVar.f30043b.getText());
        return sb2.toString();
    }

    @Override
    public void h() {
        switch (this.f15880a) {
            case 16:
                v0 v0Var = (v0) this.f15881b;
                l3 l3Var = v0Var.T;
                if (l3Var != null) {
                    q3.T1(l3Var.f21798a, v0Var.f22106a);
                    return;
                }
                return;
            default:
                j4 j4Var = (j4) this.f15881b;
                h4 h4Var = j4Var.H;
                if (h4Var != null) {
                    q3.T1(((m3) h4Var).f21814a, j4Var.f22106a);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean h0(boolean z10) {
        return false;
    }

    @Override
    public void i(int i7) {
        ((h1) this.f15881b).f();
    }

    @Override
    public void j(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f15881b).f18793f.removeCallbacksAndMessages(kVar);
    }

    public gh.a k() {
        q4 q4Var = ((g5) this.f15881b).d;
        if (q4Var != null) {
            return q4Var.getMenuGlassColorProvider();
        }
        return null;
    }

    @Override
    public void k0(p3 p3Var, View view) {
        z1 z1Var = (z1) this.f15881b;
        m60 H = m60.H(z1Var, view);
        H.Q = true;
        z1Var.getParentActivity();
        z1Var.getResourceProvider();
        z1Var.f22190y0 = e4.b(H, z1Var, p3Var, false);
    }

    @Override
    public void l(boolean z10, float f10) {
        float c10;
        ys ysVar = (ys) this.f15881b;
        if (f10 <= 0.25f) {
            c10 = com.google.android.gms.internal.vision.e2.c(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                c10 = com.google.android.gms.internal.vision.e2.c(f11, 0.25f, 9437184.0f, 1048576);
            } else {
                float f12 = f11 - 0.25f;
                if (f12 <= 0.25f) {
                    c10 = com.google.android.gms.internal.vision.e2.c(f12, 0.25f, 9.437184E7f, 10485760);
                } else {
                    c10 = com.google.android.gms.internal.vision.e2.c(f12 - 0.25f, 0.25f, (float) (2097152000 - 104857600), 104857600);
                }
            }
        }
        int i7 = (int) c10;
        long j3 = i7;
        boolean z11 = true;
        ysVar.f30043b.setText(hd.a0("AutodownloadSizeLimitUpTo", null, 2131753772, org.telegram.messenger.g0.i0(j3, false, false)));
        ysVar.d = j3;
        q8[] q8VarArr = ysVar.h;
        AnimatorSet[] animatorSetArr = ysVar.f53620n;
        if (ysVar.f53618e == DataAutoDownloadActivity.o0(ysVar.f53621r)) {
            ysVar.f53619f.setText(hd.a0("AutoDownloadPreloadVideoInfo", null, 2131753810, org.telegram.messenger.g0.i0(j3, false, false)));
            if (i7 <= 2097152) {
                z11 = false;
            }
            if (z11 != q8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                q8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new w9(ysVar, 23));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public void l0(ArrayList arrayList) {
        h1 h1Var = (h1) this.f15881b;
        String str = h1Var.f17117a0;
        if (str != null) {
            h1Var.U(str, h1Var.f17121d0, h1Var.f17123e0, h1Var.f17120c0, h1Var.f17118b0);
        }
    }

    @Override
    public void m(int i7, int i10) {
        d2 d2Var;
        k5 k5Var = (k5) this.f15881b;
        y2 y2Var = k5Var.F;
        if (y2Var != null && k5Var.f22106a != null && (d2Var = y2Var.f22138a.R3) != null) {
            d2Var.f(i7, i10);
        }
    }

    @Override
    public void m0() {
        z1 z1Var = (z1) this.f15881b;
        z1Var.E0();
        z1Var.H0();
    }

    @Override
    public void n(n3 n3Var, View view) {
        z1 z1Var = (z1) this.f15881b;
        m60 H = m60.H(z1Var, view);
        H.Q = true;
        z1Var.f22190y0 = e4.c(H, z1Var, z1Var.getParentActivity(), z1Var.getResourceProvider(), n3Var, false);
    }

    @Override
    public boolean o(e1 e1Var) {
        return false;
    }

    @Override
    public void onContentChanged() {
        z1 z1Var = (z1) this.f15881b;
        if (z1Var.f22191z0 != null) {
            boolean p32 = z1Var.Q.p3();
            z1Var.M0 = p32;
            z1Var.f22191z0.g(p32);
            z1Var.f22191z0.invalidate();
        }
        z1Var.H0();
        Runnable runnable = z1Var.N0;
        org.telegram.messenger.g0.r(runnable);
        org.telegram.messenger.g0.i3(runnable, 1000L);
    }

    @Override
    public Cursor p(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15881b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override
    public int p0() {
        return 0;
    }

    @Override
    public void q(l.k kVar, m mVar) {
        l.e eVar = (l.e) this.f15881b;
        Handler handler = eVar.f18793f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f18794n;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                if (kVar == ((l.d) arrayList.get(i7)).f18787b) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 == -1) {
            return;
        }
        int i10 = i7 + 1;
        if (i10 < arrayList.size()) {
            dVar = (l.d) arrayList.get(i10);
        }
        handler.postAtTime(new a8.qa(this, dVar, mVar, kVar, false, 3), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override
    public boolean q0(e1 e1Var) {
        return false;
    }

    public ca r() {
        m8.d dVar = (m8.d) this.f15881b;
        q6.m.i("no included points", !Double.isNaN(dVar.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(dVar.f20535b, dVar.d), new LatLng(dVar.f20536c, dVar.f20537e));
        ?? obj = new Object();
        obj.f22811a = latLngBounds;
        return obj;
    }

    @Override
    public void s(int i7) {
        ((z1) this.f15881b).t0(74, i7);
    }

    public gh.a t() {
        q4 q4Var;
        g5 g5Var = (g5) this.f15881b;
        if (g5Var.f28585a < 1.0f && (q4Var = g5Var.d) != null) {
            return q4Var.getButtonsGlassColorProvider();
        }
        return null;
    }

    @Override
    public int t0() {
        int i7;
        g5 g5Var = (g5) this.f15881b;
        gh.a k10 = k();
        if (k10 != null && g5Var.d.e()) {
            i7 = k10.t0();
        } else {
            i7 = 0;
        }
        gh.a t6 = t();
        if (t6 != null) {
            return i0.a.f(g5Var.f28585a, t6.t0(), i7);
        }
        return i7;
    }

    public int u() {
        return ((j0) this.f15881b).f24493c;
    }

    @Override
    public void u0() {
        switch (this.f15880a) {
            case 16:
                v0 v0Var = (v0) this.f15881b;
                l3 l3Var = v0Var.T;
                if (l3Var != null) {
                    oi.a aVar = v0Var.f22106a;
                    q3.S1(l3Var.f21798a);
                    return;
                }
                return;
            default:
                j4 j4Var = (j4) this.f15881b;
                h4 h4Var = j4Var.H;
                if (h4Var != null) {
                    oi.a aVar2 = j4Var.f22106a;
                    q3.S1(((m3) h4Var).f21814a);
                    return;
                }
                return;
        }
    }

    @Override
    public void v() {
        int i7;
        z1 z1Var = (z1) this.f15881b;
        e3 e3Var = z1Var.Q.f21943v3;
        if (e3Var != null && e3Var.x() && z1Var.Q.F4()) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        z1Var.C0(i7, true);
        z1Var.D0();
        z1Var.B0();
    }

    public LongSparseArray w(long j3, long j10) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.f15881b).get(j3);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j10);
    }

    public d x(bb bbVar) {
        m8.d dVar = (m8.d) this.f15881b;
        LatLng latLng = new LatLng(bbVar.f22677a, bbVar.f22678b);
        dVar.getClass();
        double d = dVar.f20535b;
        double d2 = latLng.f7083a;
        dVar.f20535b = Math.min(d, d2);
        dVar.f20536c = Math.max(dVar.f20536c, d2);
        boolean isNaN = Double.isNaN(dVar.d);
        double d10 = latLng.f7084b;
        if (isNaN) {
            dVar.d = d10;
            dVar.f20537e = d10;
            return this;
        }
        double d11 = dVar.d;
        double d12 = dVar.f20537e;
        if (d11 > d12 ? !(d11 <= d10 || d10 <= d12) : !(d11 <= d10 && d10 <= d12)) {
            if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
                dVar.d = d10;
                return this;
            }
            dVar.f20537e = d10;
        }
        return this;
    }

    @Override
    public boolean y(l.k kVar) {
        m.h hVar = (m.h) this.f15881b;
        if (kVar == hVar.f19706c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        w wVar = hVar.f19707e;
        if (wVar == null) {
            return false;
        }
        return wVar.y(kVar);
    }

    public d(j jVar, Object obj, int i7) {
        this.f15880a = i7;
        this.f15881b = obj;
    }

    public d(Object obj, int i7) {
        this.f15880a = i7;
        this.f15881b = obj;
    }

    public d(a7.a aVar) {
        this.f15880a = 12;
        q6.m.g(aVar);
        this.f15881b = aVar;
    }

    public d(int i7, int i10, int[] iArr) {
        this.f15880a = 29;
        x40[] x40VarArr = new x40[(iArr.length / 2) + 1];
        this.f15881b = x40VarArr;
        x40 x40Var = new x40(i7, i10);
        int i11 = 0;
        x40VarArr[0] = x40Var;
        while (i11 < iArr.length / 2) {
            int i12 = i11 + 1;
            int i13 = i11 * 2;
            ((x40[]) this.f15881b)[i12] = new x40(iArr[i13], iArr[i13 + 1]);
            i11 = i12;
        }
    }

    public d(String str, int i7) {
        this.f15880a = 20;
        this.f15881b = new j0(str, i7);
    }

    public d(String str, String str2) {
        this.f15880a = 21;
        this.f15881b = new n0(str, str2);
    }

    public d(Context context, Uri uri) {
        this.f15880a = 14;
        this.f15881b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public d() {
        this.f15880a = 22;
        this.f15881b = new LongSparseArray();
    }

    @Override
    public void B() {
    }

    @Override
    public void C() {
    }

    @Override
    public void F() {
    }

    @Override
    public void O(int i7) {
    }

    @Override
    public void z(e1 e1Var) {
    }

    @Override
    public void b(e1 e1Var, boolean z10) {
    }
}
