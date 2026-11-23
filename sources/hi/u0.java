package hi;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
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
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.messenger.qd;
import org.telegram.messenger.vy;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x60;
import org.telegram.ui.dg0;
public final class u0 implements og.n, sg.s0, rb, i6.a, com.google.android.gms.common.api.internal.q, jg.y1, m.e2, l.w, m.k, ce.c, o0.a, org.telegram.ui.Components.z4, oi.h0, oi.r3, oi.e1, org.telegram.messenger.va, org.telegram.messenger.pa, vy {
    public final int f15481a;
    public Object f15482b;

    public u0(int i7) {
        this.f15481a = i7;
    }

    public int A0() {
        return ((org.telegram.messenger.j0) this.f15482b).f24899c;
    }

    @Override
    public void B(oi.a aVar) {
        oi.b2 b2Var = (oi.b2) this.f15482b;
        if (aVar != null && (aVar.f22001b instanceof TL_iv.pageBlockMap) && org.telegram.messenger.g0.J1(b2Var)) {
            ti tiVar = new ti(b2Var.getParentActivity(), b2Var, false, false, false, b2Var.getResourceProvider());
            tiVar.X3 = new sa.d(16);
            tiVar.K1 = true;
            tiVar.f40026v3.setVisibility(8);
            tiVar.f40023u4 = new a3.h(b2Var, aVar, tiVar, 16);
            tiVar.f1();
            tiVar.show();
        }
    }

    public LongSparseArray B0(long j3, long j10) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.f15482b).get(j3);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j10);
    }

    @Override
    public Cursor C(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15482b;
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

    public u0 C0(org.telegram.messenger.ab abVar) {
        m8.d dVar = (m8.d) this.f15482b;
        LatLng latLng = new LatLng(abVar.f22962a, abVar.f22963b);
        dVar.getClass();
        double d = dVar.f20989b;
        double d2 = latLng.f7360a;
        dVar.f20989b = Math.min(d, d2);
        dVar.f20990c = Math.max(dVar.f20990c, d2);
        boolean isNaN = Double.isNaN(dVar.d);
        double d10 = latLng.f7361b;
        if (isNaN) {
            dVar.d = d10;
            dVar.f20991e = d10;
            return this;
        }
        double d11 = dVar.d;
        double d12 = dVar.f20991e;
        if (d11 > d12 ? !(d11 <= d10 || d10 <= d12) : !(d11 <= d10 && d10 <= d12)) {
            if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
                dVar.d = d10;
                return this;
            }
            dVar.f20991e = d10;
        }
        return this;
    }

    @Override
    public void D(boolean z10) {
        f6 f6Var = (f6) this.f15482b;
        if (f6Var.j()) {
            f6Var.F.getClass();
        }
        f6Var.x(-4, z10);
    }

    public ia.b D0(JSONObject jSONObject) {
        ia.d aVar;
        int i7 = jSONObject.getInt("settings_version");
        if (i7 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i7 + ". Using default settings values.", null);
            aVar = new pb.b(11);
        } else {
            aVar = new qb.a(11);
        }
        return aVar.g((w7.s) this.f15482b, jSONObject);
    }

    @Override
    public void E() {
        oi.b2 b2Var = (oi.b2) this.f15482b;
        b2Var.J0 = b2Var.L0;
        oi.b2.e0(b2Var, false, false);
        b2Var.C0(2, true);
    }

    public void E0(long j3, long j10, long j11, Object obj) {
        LongSparseArray longSparseArray = (LongSparseArray) this.f15482b;
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

    public Object F0(long j3, long j10, long j11) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = (LongSparseArray) ((LongSparseArray) this.f15482b).get(j3);
        if (longSparseArray2 == null || (longSparseArray = (LongSparseArray) longSparseArray2.get(j10)) == null) {
            return null;
        }
        Object obj = longSparseArray.get(j11);
        longSparseArray.remove(j11);
        return obj;
    }

    @Override
    public void G() {
        ((w0) this.f15482b).f15635e.invalidate();
    }

    @Override
    public void H(float f10, int i7) {
        ArrayList arrayList;
        f6 f6Var = (f6) this.f15482b;
        x7 x7Var = f6Var.d;
        if (x7Var != null && (arrayList = x7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((x7) f6Var.d.T.get(i7)).P = f10;
        }
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        ((oi.p) this.f15482b).M(z10, i7, i10, 0L, false);
        oi.p pVar = (oi.p) this.f15482b;
        dg0 dg0Var = pVar.P;
        if (dg0Var != null) {
            dg0Var.i();
            pVar.P = null;
        }
    }

    @Override
    public Object J(ce.d dVar, kd.c cVar) {
        Object J = ((q4.q) this.f15482b).J(new gb.z0(dVar, 1), cVar);
        if (J == jd.a.f17478a) {
            return J;
        }
        return gd.k.f13480a;
    }

    @Override
    public org.telegram.ui.Cells.i9 K() {
        switch (this.f15481a) {
            case 20:
                oi.o3 o3Var = ((oi.w0) this.f15482b).T;
                if (o3Var == null) {
                    return null;
                }
                return o3Var.f22348a.getTextSelectionHelper();
            default:
                oi.k4 k4Var = ((oi.m4) this.f15482b).H;
                if (k4Var != null) {
                    return ((oi.p3) k4Var).f22378a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public void L(float f10) {
        f6 f6Var = (f6) this.f15482b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.P = f10;
        f6Var.c();
    }

    @Override
    public void M(CharSequence charSequence) {
        switch (this.f15481a) {
            case 20:
                oi.o3 o3Var = ((oi.w0) this.f15482b).T;
                if (o3Var != null) {
                    o3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        o3Var.f22348a.w4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                oi.k4 k4Var = ((oi.m4) this.f15482b).H;
                if (k4Var != null) {
                    oi.p3 p3Var = (oi.p3) k4Var;
                    p3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        p3Var.f22378a.w4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void O() {
        zy zyVar = (zy) this.f15482b;
        HashMap hashMap = zyVar.f28482n;
        zyVar.getNotificationCenter().k(ks.R0, new HashMap(hashMap));
        hashMap.clear();
    }

    @Override
    public org.telegram.ui.Cells.h9 P() {
        switch (this.f15481a) {
            case 20:
                return (oi.w0) this.f15482b;
            default:
                return (oi.m4) this.f15482b;
        }
    }

    @Override
    public void Q(oi.a6 a6Var, String str) {
        oi.b2 b2Var = (oi.b2) this.f15482b;
        if (b2Var.A0 == null) {
            b2Var.A0 = new m.o3(new kg.f1(this, 23), b2Var.getResourceProvider());
        }
        b2Var.A0.g(a6Var, str);
    }

    @Override
    public void T(CharSequence charSequence) {
        oi.b3 b3Var = ((oi.m5) this.f15482b).F;
        if (b3Var != null && charSequence != null && charSequence.length() > 0) {
            b3Var.f22090a.w4(charSequence.toString());
        }
    }

    @Override
    public void U(long j3) {
        f6 f6Var = (f6) this.f15482b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.f15770r0 = j3;
        x7Var.f15754j = true;
        f6Var.y(true);
    }

    @Override
    public oi.a V() {
        switch (this.f15481a) {
            case 20:
                return ((oi.w0) this.f15482b).f22598a;
            default:
                return ((oi.m4) this.f15482b).f22598a;
        }
    }

    @Override
    public boolean W() {
        switch (this.f15481a) {
            case 20:
                oi.w0 w0Var = (oi.w0) this.f15482b;
                oi.o3 o3Var = w0Var.T;
                if (o3Var != null) {
                    oi.a aVar = w0Var.f22598a;
                    if (o3Var.f22348a.V4()) {
                        return true;
                    }
                }
                return false;
            default:
                oi.m4 m4Var = (oi.m4) this.f15482b;
                oi.k4 k4Var = m4Var.H;
                if (k4Var != null) {
                    oi.a aVar2 = m4Var.f22598a;
                    if (((oi.p3) k4Var).f22378a.V4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public boolean W1(int i7) {
        return true;
    }

    @Override
    public void X(boolean z10) {
        tg.w1 w1Var;
        nb nbVar = ((bb) ((f6) this.f15482b)).D0;
        pa paVar = nbVar.f15126w1;
        if (paVar != null) {
            tg.w1 w1Var2 = null;
            if (!z10 && (paVar.getSelectedEntity() instanceof tg.w1)) {
                nbVar.f15126w1.D0(null, true);
            } else if (z10 && !(nbVar.f15126w1.getSelectedEntity() instanceof tg.w1)) {
                q5 q5Var = nbVar.f15126w1.B0;
                int i7 = 0;
                int i10 = 0;
                while (true) {
                    if (i10 < q5Var.getChildCount()) {
                        View childAt = q5Var.getChildAt(i10);
                        if (childAt instanceof tg.w1) {
                            w1Var = (tg.w1) childAt;
                            break;
                        }
                        i10++;
                    } else {
                        w1Var = null;
                        break;
                    }
                }
                if (w1Var != null) {
                    pa paVar2 = nbVar.f15126w1;
                    q5 q5Var2 = paVar2.B0;
                    while (true) {
                        if (i7 >= q5Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = q5Var2.getChildAt(i7);
                        if (childAt2 instanceof tg.w1) {
                            w1Var2 = (tg.w1) childAt2;
                            break;
                        }
                        i7++;
                    }
                    paVar2.D0(w1Var2, true);
                }
            }
        }
    }

    @Override
    public void Y(int i7, int i10) {
        switch (this.f15481a) {
            case 20:
                oi.w0 w0Var = (oi.w0) this.f15482b;
                oi.o3 o3Var = w0Var.T;
                if (o3Var != null) {
                    oi.a aVar = w0Var.f22598a;
                    oi.g2 g2Var = o3Var.f22348a.R3;
                    if (g2Var != null) {
                        g2Var.f(i7, i10);
                        return;
                    }
                    return;
                }
                return;
            default:
                oi.m4 m4Var = (oi.m4) this.f15482b;
                oi.k4 k4Var = m4Var.H;
                if (k4Var != null) {
                    oi.a aVar2 = m4Var.f22598a;
                    oi.g2 g2Var2 = ((oi.p3) k4Var).f22378a.R3;
                    if (g2Var2 != null) {
                        g2Var2.f(i7, i10);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public a0.h Y0() {
        return null;
    }

    @Override
    public void Z(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.f15482b;
        Handler handler = eVar.f19253f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f19254n;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                if (kVar == ((l.d) arrayList.get(i7)).f19247b) {
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
    public boolean a(float f10) {
        boolean z10;
        int[] iArr;
        oi.b2 b2Var = (oi.b2) this.f15482b;
        FrameLayout frameLayout = b2Var.f22084w0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f10 >= iArr[1]) {
                z10 = true;
                oi.b2.e0(b2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        oi.b2.e0(b2Var, z10, true);
        return z10;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f15481a) {
            case 6:
                j6.s sVar = new j6.s(1, (TaskCompletionSource) obj2);
                j6.i iVar = (j6.i) ((j6.u) obj).n();
                Parcel p12 = iVar.p1();
                com.google.android.gms.internal.cast.t.d(p12, sVar);
                p12.writeStringArray((String[]) this.f15482b);
                iVar.u1(p12, 6);
                return;
            case 7:
            default:
                d6.l lVar = new d6.l((TaskCompletionSource) obj2);
                l7.i iVar2 = (l7.i) ((l7.c) obj).n();
                Parcel l1 = iVar2.l1();
                int i7 = l7.f.f19796a;
                l1.writeStrongBinder(lVar);
                l7.f.c(l1, (a6.e) this.f15482b);
                iVar2.m1(l1, 1);
                return;
            case 8:
                k7.f fVar = new k7.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
                gVar.f6198c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = t7.a.f57742a;
                obtain.writeStrongBinder(fVar);
                t7.a.b(obtain, (j7.g) this.f15482b);
                t7.a.b(obtain, gVar);
                ((k7.b) ((k7.d) ((k7.e) obj).n())).h1(obtain, 6);
                return;
        }
    }

    @Override
    public void b0(float f10, int i7) {
        ArrayList arrayList;
        f6 f6Var = (f6) this.f15482b;
        x7 x7Var = f6Var.d;
        if (x7Var != null && (arrayList = x7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((x7) f6Var.d.T.get(i7)).V = f10;
        }
    }

    @Override
    public void c(oi.q3 q3Var, View view) {
        oi.b2 b2Var = (oi.b2) this.f15482b;
        x60 I = x60.I(b2Var, view);
        I.T = true;
        b2Var.f22088y0 = oi.h4.c(I, b2Var, b2Var.getParentActivity(), b2Var.getResourceProvider(), q3Var, false);
    }

    @Override
    public void c0(Location location) {
        zy zyVar = (zy) this.f15482b;
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.g0.b0(location.getLatitude());
        tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(location.getLongitude());
        HashMap hashMap = zyVar.f28482n;
        for (Map.Entry entry : hashMap.entrySet()) {
            fj fjVar = (fj) entry.getValue();
            zyVar.r0(xy.d(tL_messageMediaGeo, fj.B0(fjVar.f24073k), fjVar, null, null, null, true, 0));
        }
        hashMap.clear();
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15482b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public void d(oi.f1 f1Var) {
        switch (this.f15481a) {
            case 20:
                oi.o3 o3Var = ((oi.w0) this.f15482b).T;
                if (o3Var != null) {
                    oi.t3 t3Var = o3Var.f22348a;
                    oi.t3.Q1(t3Var, f1Var);
                    t3Var.f22495p3.b(f1Var, true);
                    return;
                }
                return;
            case 21:
            default:
                oi.b3 b3Var = ((oi.m5) this.f15482b).F;
                if (b3Var != null) {
                    oi.t3 t3Var2 = b3Var.f22090a;
                    oi.t3.Q1(t3Var2, f1Var);
                    t3Var2.f22495p3.b(f1Var, true);
                    return;
                }
                return;
            case 22:
                oi.k4 k4Var = ((oi.m4) this.f15482b).H;
                if (k4Var != null) {
                    oi.t3 t3Var3 = ((oi.p3) k4Var).f22378a;
                    oi.t3.Q1(t3Var3, f1Var);
                    t3Var3.f22495p3.b(f1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void d0(float f10) {
        f6 f6Var = (f6) this.f15482b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.F = f10;
        x7Var.f15754j = true;
        f6Var.w(true);
    }

    @Override
    public void e(int i7) {
        n0 n0Var = ((f6) this.f15482b).F;
        if (n0Var != null) {
            ArrayList arrayList = n0Var.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                m0 m0Var = (m0) obj;
                if (m0Var.f14864a == i7) {
                    m0Var.f14865b.e(true, 1.0f);
                    n0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public void e0(oi.f1 f1Var, int i7, int i10) {
        oi.b3 b3Var;
        org.telegram.ui.Cells.i9 textSelectionHelper;
        oi.m5 m5Var = (oi.m5) this.f15482b;
        if (!m5Var.H && i7 != i10 && (b3Var = m5Var.F) != null && (textSelectionHelper = b3Var.f22090a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != m5Var) {
                m5Var.post(new jg.o1(this, f1Var, i10, textSelectionHelper, i7, 4));
            }
        }
    }

    @Override
    public void f(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).f19249z.k().c(false);
        }
        l.w wVar = ((m.h) this.f15482b).f20165e;
        if (wVar != null) {
            wVar.f(kVar, z10);
        }
    }

    @Override
    public void f0() {
        oi.b2 b2Var = (oi.b2) this.f15482b;
        int i7 = 0;
        oi.b2.e0(b2Var, false, true);
        int i10 = b2Var.J0;
        if (i10 != 2) {
            i7 = i10;
        }
        b2Var.C0(i7, true);
    }

    @Override
    public void g() {
        switch (this.f15481a) {
            case 20:
                oi.w0 w0Var = (oi.w0) this.f15482b;
                oi.o3 o3Var = w0Var.T;
                if (o3Var != null) {
                    oi.t3.T1(o3Var.f22348a, w0Var.f22598a);
                    return;
                }
                return;
            default:
                oi.m4 m4Var = (oi.m4) this.f15482b;
                oi.k4 k4Var = m4Var.H;
                if (k4Var != null) {
                    oi.t3.T1(((oi.p3) k4Var).f22378a, m4Var.f22598a);
                    return;
                }
                return;
        }
    }

    @Override
    public void g0(Editable editable) {
        oi.m5 m5Var = (oi.m5) this.f15482b;
        oi.a aVar = m5Var.f22598a;
        if (aVar != null) {
            aVar.f22016s = true;
            aVar.f22015r = m5Var.f22314r.f22178q2;
        }
        m5Var.w();
        oi.b3 b3Var = m5Var.F;
        if (b3Var != null && m5Var.f22598a != null) {
            b3Var.a();
        }
    }

    @Override
    public void h0() {
        switch (this.f15481a) {
            case 20:
                oi.w0 w0Var = (oi.w0) this.f15482b;
                oi.o3 o3Var = w0Var.T;
                if (o3Var != null) {
                    oi.a aVar = w0Var.f22598a;
                    oi.t3 t3Var = o3Var.f22348a;
                    oi.g2 g2Var = t3Var.R3;
                    if (g2Var != null) {
                        g2Var.g();
                    }
                    t3Var.f22495p3.onContentChanged();
                    return;
                }
                return;
            default:
                oi.m4 m4Var = (oi.m4) this.f15482b;
                oi.k4 k4Var = m4Var.H;
                if (k4Var != null) {
                    oi.a aVar2 = m4Var.f22598a;
                    oi.t3 t3Var2 = ((oi.p3) k4Var).f22378a;
                    oi.g2 g2Var2 = t3Var2.R3;
                    if (g2Var2 != null) {
                        g2Var2.g();
                    }
                    t3Var2.f22495p3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean i() {
        oi.m5 m5Var = (oi.m5) this.f15482b;
        oi.b3 b3Var = m5Var.F;
        if (b3Var != null && m5Var.f22598a != null) {
            return b3Var.f22090a.V4();
        }
        return false;
    }

    @Override
    public x60 i0(View view) {
        return x60.I((oi.b2) this.f15482b, view);
    }

    @Override
    public void j(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f15482b).f19253f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public void j0(float f10) {
        f6 f6Var = (f6) this.f15482b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.E = f10;
        x7Var.f15754j = true;
        f6Var.w(true);
    }

    @Override
    public void k(float f10) {
        f6 f6Var = (f6) this.f15482b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.f15776u0 = f10;
        x7Var.f15754j = true;
        f6Var.c();
    }

    @Override
    public void k0() {
        pa paVar = (pa) this.f15482b;
        paVar.f15579n0.f57386a.v();
        paVar.N0.setViewHidden(false);
    }

    @Override
    public void l() {
        bi.o3 o3Var = ((pa) this.f15482b).f15602z0;
        if (o3Var != null) {
            o3Var.invalidate();
        }
    }

    @Override
    public void l0(oi.s3 s3Var, View view) {
        oi.b2 b2Var = (oi.b2) this.f15482b;
        x60 I = x60.I(b2Var, view);
        I.T = true;
        b2Var.getParentActivity();
        b2Var.getResourceProvider();
        b2Var.f22088y0 = oi.h4.b(I, b2Var, s3Var, false);
    }

    @Override
    public void m(int i7, int i10) {
        oi.g2 g2Var;
        oi.m5 m5Var = (oi.m5) this.f15482b;
        oi.b3 b3Var = m5Var.F;
        if (b3Var != null && m5Var.f22598a != null && (g2Var = b3Var.f22090a.R3) != null) {
            g2Var.f(i7, i10);
        }
    }

    @Override
    public boolean m0(boolean z10) {
        return false;
    }

    @Override
    public void m2(ArrayList arrayList) {
        jg.h1 h1Var = (jg.h1) this.f15482b;
        String str = h1Var.f17596a0;
        if (str != null) {
            h1Var.U(str, h1Var.f17600d0, h1Var.f17602e0, h1Var.f17599c0, h1Var.f17597b0);
        }
    }

    @Override
    public void n(float f10) {
        f6 f6Var = (f6) this.f15482b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.G = f10;
        x7Var.f15754j = true;
        f6Var.c();
    }

    @Override
    public void n0(float f10, int i7) {
        ArrayList arrayList;
        f6 f6Var = (f6) this.f15482b;
        x7 x7Var = f6Var.d;
        if (x7Var != null && (arrayList = x7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((x7) f6Var.d.T.get(i7)).W = f10;
        }
    }

    @Override
    public boolean o(oi.f1 f1Var) {
        return false;
    }

    @Override
    public void o0(float f10) {
        x7 x7Var = ((f6) this.f15482b).d;
        if (x7Var == null) {
            return;
        }
        x7Var.f15734a0 = f10;
        x7Var.f15754j = true;
    }

    @Override
    public void onContentChanged() {
        oi.b2 b2Var = (oi.b2) this.f15482b;
        if (b2Var.f22089z0 != null) {
            boolean p32 = b2Var.Q.p3();
            b2Var.M0 = p32;
            b2Var.f22089z0.h(p32);
            b2Var.f22089z0.invalidate();
        }
        b2Var.H0();
        Runnable runnable = b2Var.N0;
        org.telegram.messenger.g0.r(runnable);
        org.telegram.messenger.g0.h3(runnable, 1000L);
    }

    @Override
    public void onLocationChanged(Location location) {
        if (location == null) {
            return;
        }
        ((qd) this.f15482b).m(location);
    }

    @Override
    public void p(long j3, boolean z10) {
        f6 f6Var = (f6) this.f15482b;
        if (!z10) {
            f6Var.m(j3);
            return;
        }
        h61 h61Var = f6Var.f14451e;
        if (h61Var != null) {
            h61Var.q0(j3, true);
        } else if (f6Var.j()) {
            f6Var.F.m(j3, true);
        } else {
            h61 h61Var2 = f6Var.E;
            if (h61Var2 != null) {
                h61Var2.q0(j3, false);
            }
        }
    }

    @Override
    public void p0() {
        ((f6) this.f15482b).q(null);
    }

    @Override
    public void q() {
        pa paVar = (pa) this.f15482b;
        if (paVar.M0) {
            paVar.M0 = false;
            return;
        }
        paVar.U0.b(1);
        paVar.w((sg.h) sg.h.f57338a.get(0));
    }

    @Override
    public void r(int i7) {
        ((oi.b2) this.f15482b).t0(74, i7);
    }

    @Override
    public void r0(float f10) {
        f6 f6Var = (f6) this.f15482b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.f15774t0 = f10;
        x7Var.f15754j = true;
        f6Var.y(true);
    }

    @Override
    public boolean s() {
        boolean z10;
        pa paVar = (pa) this.f15482b;
        if (paVar.f15590t0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            paVar.D0(null, true);
        }
        return z10;
    }

    @Override
    public void s0() {
        oi.b2 b2Var = (oi.b2) this.f15482b;
        b2Var.E0();
        b2Var.H0();
    }

    @Override
    public void t() {
        f6 f6Var = (f6) this.f15482b;
        f6Var.s(null, null, true);
        nb nbVar = ((bb) f6Var).D0;
        bb bbVar = nbVar.Y0;
        if (bbVar != null) {
            bbVar.s(null, null, true);
        }
        pa paVar = nbVar.f15126w1;
        if (paVar != null) {
            paVar.p0();
        }
        db dbVar = nbVar.f15067d1;
        if (dbVar != null) {
            dbVar.setHasRoundVideo(false);
        }
        x7 x7Var = nbVar.L1;
        if (x7Var != null) {
            File file = x7Var.f15764o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                nbVar.L1.f15764o0 = null;
            }
            if (nbVar.L1.f15766p0 != null) {
                try {
                    new File(nbVar.L1.f15766p0).delete();
                } catch (Exception unused2) {
                }
                nbVar.L1.f15766p0 = null;
            }
        }
    }

    @Override
    public boolean t0(oi.f1 f1Var) {
        return false;
    }

    @Override
    public boolean u(l.k kVar) {
        m.h hVar = (m.h) this.f15482b;
        if (kVar == hVar.f20164c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        l.w wVar = hVar.f20165e;
        if (wVar == null) {
            return false;
        }
        return wVar.u(kVar);
    }

    @Override
    public void u0(int i7, long j3) {
        ArrayList arrayList;
        f6 f6Var = (f6) this.f15482b;
        x7 x7Var = f6Var.d;
        if (x7Var != null && (arrayList = x7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((x7) f6Var.d.T.get(i7)).X = j3;
        }
    }

    @Override
    public a0.h u1() {
        return null;
    }

    @Override
    public void v(int i7) {
        ((jg.h1) this.f15482b).f();
    }

    @Override
    public void w(Bitmap bitmap) {
        ((i6.i) this.f15482b).e(3, bitmap);
    }

    @Override
    public void w0() {
        switch (this.f15481a) {
            case 20:
                oi.w0 w0Var = (oi.w0) this.f15482b;
                oi.o3 o3Var = w0Var.T;
                if (o3Var != null) {
                    oi.a aVar = w0Var.f22598a;
                    oi.t3.S1(o3Var.f22348a);
                    return;
                }
                return;
            default:
                oi.m4 m4Var = (oi.m4) this.f15482b;
                oi.k4 k4Var = m4Var.H;
                if (k4Var != null) {
                    oi.a aVar2 = m4Var.f22598a;
                    oi.t3.S1(((oi.p3) k4Var).f22378a);
                    return;
                }
                return;
        }
    }

    @Override
    public void x(boolean z10, float f10) {
        f6 f6Var = (f6) this.f15482b;
        x7 x7Var = f6Var.d;
        if (x7Var != null) {
            x7Var.Z = f10;
            x7Var.f15754j = true;
            h61 h61Var = f6Var.f14451e;
            if (h61Var != null && h61Var.U() != -9223372036854775807L) {
                f6Var.m(f10 * ((float) f6Var.f14451e.U()));
            }
        }
    }

    @Override
    public void x0() {
        pa paVar = (pa) this.f15482b;
        if (paVar.f15590t0 != null) {
            paVar.D0(null, true);
        }
        paVar.N0.setViewHidden(true);
    }

    @Override
    public void y() {
        int i7;
        oi.b2 b2Var = (oi.b2) this.f15482b;
        oi.h3 h3Var = b2Var.Q.f22507v3;
        if (h3Var != null && h3Var.x() && b2Var.Q.F4()) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        b2Var.C0(i7, true);
        b2Var.D0();
        b2Var.B0();
    }

    @Override
    public void y0(long j3) {
        f6 f6Var = (f6) this.f15482b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.D = j3;
        x7Var.f15754j = true;
        f6Var.w(true);
    }

    @Override
    public void z(float f10) {
        f6 f6Var = (f6) this.f15482b;
        x7 x7Var = f6Var.d;
        if (x7Var == null) {
            return;
        }
        x7Var.f15772s0 = f10;
        x7Var.f15754j = true;
        f6Var.y(true);
    }

    public org.telegram.messenger.ba z0() {
        m8.d dVar = (m8.d) this.f15482b;
        q6.m.j("no included points", !Double.isNaN(dVar.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(dVar.f20989b, dVar.d), new LatLng(dVar.f20990c, dVar.f20991e));
        ?? obj = new Object();
        obj.f23176a = latLngBounds;
        return obj;
    }

    public u0(com.google.android.gms.common.api.j jVar, Object obj, int i7) {
        this.f15481a = i7;
        this.f15482b = obj;
    }

    public u0(Object obj, int i7) {
        this.f15481a = i7;
        this.f15482b = obj;
    }

    public u0(a7.a aVar) {
        this.f15481a = 16;
        q6.m.h(aVar);
        this.f15482b = aVar;
    }

    public u0(String str, int i7) {
        this.f15481a = 24;
        this.f15482b = new org.telegram.messenger.j0(str, i7);
    }

    public u0(Context context, Uri uri) {
        this.f15481a = 18;
        this.f15482b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public u0(String str, String str2) {
        this.f15481a = 25;
        this.f15482b = new org.telegram.messenger.n0(str, str2);
    }

    public u0() {
        this.f15481a = 26;
        this.f15482b = new LongSparseArray();
    }

    @Override
    public void F() {
    }

    @Override
    public void N() {
    }

    @Override
    public void h() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void A(oi.f1 f1Var) {
    }

    @Override
    public void R(boolean z10) {
    }

    @Override
    public void S(int i7) {
    }

    @Override
    public void q0(boolean z10) {
    }

    @Override
    public void b(oi.f1 f1Var, boolean z10) {
    }
}
