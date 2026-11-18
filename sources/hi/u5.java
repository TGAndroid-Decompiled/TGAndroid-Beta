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
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.y60;
import org.telegram.ui.fg0;
public final class u5 implements xa, i6.a, com.google.android.gms.common.api.internal.q, ib.b, jg.y1, m.e2, l.w, m.k, ce.c, o0.a, org.telegram.ui.Components.z4, oi.g0, oi.q3, oi.d1, org.telegram.messenger.va, org.telegram.messenger.pa, vy, gh.a {
    public final int f15535a;
    public Object f15536b;

    public u5(int i7) {
        this.f15535a = i7;
    }

    @Override
    public void A(int i7, int i10) {
        oi.e2 e2Var;
        oi.l5 l5Var = (oi.l5) this.f15536b;
        oi.a3 a3Var = l5Var.F;
        if (a3Var != null && l5Var.f22439a != null && (e2Var = a3Var.f21932a.R3) != null) {
            e2Var.f(i7, i10);
        }
    }

    @Override
    public float A1() {
        float f10;
        gh.a i7 = i();
        gh.a l10 = l();
        if (i7 != null) {
            f10 = i7.A1();
        } else {
            f10 = 0.0f;
        }
        if (l10 != null) {
            return org.telegram.messenger.g0.T1(l10.A1(), f10, ((org.telegram.ui.ActionBar.k5) this.f15536b).f29145a);
        }
        return f10;
    }

    @Override
    public int A2() {
        int i7;
        org.telegram.ui.ActionBar.u4 u4Var;
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) this.f15536b;
        gh.a i10 = i();
        if (i10 != null) {
            i7 = i10.A2();
        } else {
            i7 = 0;
        }
        if (k5Var.f29145a < 1.0f && (u4Var = k5Var.d) != null) {
            return i0.a.f(k5Var.f29145a, u4Var.getButtonsGlassBackgroundColor(), i7);
        }
        return i7;
    }

    @Override
    public boolean C(l.k kVar) {
        m.h hVar = (m.h) this.f15536b;
        if (kVar == hVar.f20070c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        l.w wVar = hVar.f20071e;
        if (wVar == null) {
            return false;
        }
        return wVar.C(kVar);
    }

    @Override
    public void D(int i7) {
        ((oi.z1) this.f15536b).t0(74, i7);
    }

    @Override
    public void D0(boolean z10) {
        w5 w5Var = (w5) this.f15536b;
        if (w5Var.j()) {
            w5Var.F.getClass();
        }
        w5Var.x(-4, z10);
    }

    @Override
    public int D1() {
        int i7;
        gh.a i10 = i();
        gh.a l10 = l();
        if (i10 != null) {
            i7 = i10.D1();
        } else {
            i7 = 0;
        }
        if (l10 != null) {
            return i0.a.f(((org.telegram.ui.ActionBar.k5) this.f15536b).f29145a, l10.D1(), i7);
        }
        return i7;
    }

    @Override
    public boolean E1(boolean z10) {
        return false;
    }

    @Override
    public void F(float f10) {
        w5 w5Var = (w5) this.f15536b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.G = f10;
        d7Var.f14406j = true;
        w5Var.c();
    }

    @Override
    public void G() {
        int i7;
        oi.z1 z1Var = (oi.z1) this.f15536b;
        oi.g3 g3Var = z1Var.Q.f22346v3;
        if (g3Var != null && g3Var.x() && z1Var.Q.F4()) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        z1Var.C0(i7, true);
        z1Var.D0();
        z1Var.B0();
    }

    @Override
    public y60 G0(View view) {
        return y60.I((oi.z1) this.f15536b, view);
    }

    @Override
    public void G1(float f10, int i7) {
        ArrayList arrayList;
        w5 w5Var = (w5) this.f15536b;
        d7 d7Var = w5Var.d;
        if (d7Var != null && (arrayList = d7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((d7) w5Var.d.T.get(i7)).W = f10;
        }
    }

    @Override
    public void H(oi.a aVar) {
        oi.z1 z1Var = (oi.z1) this.f15536b;
        if (aVar != null && (aVar.f21907b instanceof TL_iv.pageBlockMap) && org.telegram.messenger.g0.J1(z1Var)) {
            si siVar = new si(z1Var.getParentActivity(), z1Var, false, false, false, z1Var.getResourceProvider());
            siVar.X3 = new sa.d(16);
            siVar.K1 = true;
            siVar.f39729v3.setVisibility(8);
            siVar.f39726u4 = new a3.h(z1Var, aVar, siVar, 16);
            siVar.f1();
            siVar.show();
        }
    }

    @Override
    public boolean J(oi.e1 e1Var) {
        return false;
    }

    @Override
    public void J0(float f10, int i7) {
        ArrayList arrayList;
        w5 w5Var = (w5) this.f15536b;
        d7 d7Var = w5Var.d;
        if (d7Var != null && (arrayList = d7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((d7) w5Var.d.T.get(i7)).P = f10;
        }
    }

    @Override
    public a0.h K0() {
        return null;
    }

    @Override
    public void M(long j3, boolean z10) {
        w5 w5Var = (w5) this.f15536b;
        if (!z10) {
            w5Var.m(j3);
            return;
        }
        f61 f61Var = w5Var.f15650e;
        if (f61Var != null) {
            f61Var.q0(j3, true);
        } else if (w5Var.j()) {
            w5Var.F.m(j3, true);
        } else {
            f61 f61Var2 = w5Var.E;
            if (f61Var2 != null) {
                f61Var2.q0(j3, false);
            }
        }
    }

    @Override
    public int M0() {
        int i7;
        gh.a i10 = i();
        gh.a l10 = l();
        if (i10 != null) {
            i7 = i10.M0();
        } else {
            i7 = 0;
        }
        if (l10 != null) {
            return i0.a.f(((org.telegram.ui.ActionBar.k5) this.f15536b).f29145a, l10.M0(), i7);
        }
        return i7;
    }

    @Override
    public void M1(float f10) {
        d7 d7Var = ((w5) this.f15536b).d;
        if (d7Var == null) {
            return;
        }
        d7Var.f14386a0 = f10;
        d7Var.f14406j = true;
    }

    @Override
    public void N1() {
        ((w5) this.f15536b).q(null);
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        ((oi.o) this.f15536b).M(z10, i7, i10, 0L, false);
        oi.o oVar = (oi.o) this.f15536b;
        fg0 fg0Var = oVar.P;
        if (fg0Var != null) {
            fg0Var.i();
            oVar.P = null;
        }
    }

    @Override
    public org.telegram.ui.Cells.j9 P0() {
        switch (this.f15535a) {
            case 19:
                oi.n3 n3Var = ((oi.v0) this.f15536b).T;
                if (n3Var == null) {
                    return null;
                }
                return n3Var.f22188a.getTextSelectionHelper();
            default:
                oi.j4 j4Var = ((oi.l4) this.f15536b).H;
                if (j4Var != null) {
                    return ((oi.o3) j4Var).f22220a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public void P1(ArrayList arrayList) {
        jg.h1 h1Var = (jg.h1) this.f15536b;
        String str = h1Var.f17500a0;
        if (str != null) {
            h1Var.U(str, h1Var.f17504d0, h1Var.f17506e0, h1Var.f17503c0, h1Var.f17501b0);
        }
    }

    @Override
    public void Q() {
        oi.z1 z1Var = (oi.z1) this.f15536b;
        z1Var.J0 = z1Var.L0;
        oi.z1.e0(z1Var, false, false);
        z1Var.C0(2, true);
    }

    @Override
    public void Q0(float f10) {
        w5 w5Var = (w5) this.f15536b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.P = f10;
        w5Var.c();
    }

    @Override
    public void R0(oi.r3 r3Var, View view) {
        oi.z1 z1Var = (oi.z1) this.f15536b;
        y60 I = y60.I(z1Var, view);
        I.T = true;
        z1Var.getParentActivity();
        z1Var.getResourceProvider();
        z1Var.f22546y0 = oi.g4.b(I, z1Var, r3Var, false);
    }

    @Override
    public void S0(CharSequence charSequence) {
        switch (this.f15535a) {
            case 19:
                oi.n3 n3Var = ((oi.v0) this.f15536b).T;
                if (n3Var != null) {
                    n3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        n3Var.f22188a.w4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                oi.j4 j4Var = ((oi.l4) this.f15536b).H;
                if (j4Var != null) {
                    oi.o3 o3Var = (oi.o3) j4Var;
                    o3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        o3Var.f22220a.w4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public int U0() {
        int i7;
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) this.f15536b;
        gh.a i10 = i();
        if (i10 != null && k5Var.d.e()) {
            i7 = i10.U0();
        } else {
            i7 = 0;
        }
        gh.a l10 = l();
        if (l10 != null) {
            return i0.a.f(k5Var.f29145a, l10.U0(), i7);
        }
        return i7;
    }

    @Override
    public int W1() {
        int i7;
        gh.a i10 = i();
        gh.a l10 = l();
        if (i10 != null) {
            i7 = i10.W1();
        } else {
            i7 = 0;
        }
        if (l10 != null) {
            return i0.a.f(((org.telegram.ui.ActionBar.k5) this.f15536b).f29145a, l10.W1(), i7);
        }
        return i7;
    }

    @Override
    public float Y0() {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) this.f15536b;
        gh.a i7 = i();
        gh.a l10 = l();
        if (i7 != null) {
            f10 = i7.Y0();
        } else {
            f10 = -1.0f;
        }
        if (l10 != null) {
            f11 = l10.Y0();
        } else {
            f11 = f10;
        }
        if (f11 >= 0.0f && f10 >= 0.0f) {
            return org.telegram.messenger.g0.T1(f11, f10, k5Var.f29145a);
        }
        if (k5Var.f29145a < 0.5f) {
            return f11;
        }
        return f10;
    }

    @Override
    public float Z0() {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) this.f15536b;
        gh.a i7 = i();
        gh.a l10 = l();
        if (i7 != null) {
            f10 = i7.Z0();
        } else {
            f10 = -1.0f;
        }
        if (l10 != null) {
            f11 = l10.Z0();
        } else {
            f11 = f10;
        }
        if (f11 >= 0.0f && f10 >= 0.0f) {
            return org.telegram.messenger.g0.T1(f11, f10, k5Var.f29145a);
        }
        if (k5Var.f29145a < 0.5f) {
            return f11;
        }
        return f10;
    }

    @Override
    public boolean a(float f10) {
        boolean z10;
        int[] iArr;
        oi.z1 z1Var = (oi.z1) this.f15536b;
        FrameLayout frameLayout = z1Var.f22542w0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f10 >= iArr[1]) {
                z10 = true;
                oi.z1.e0(z1Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        oi.z1.e0(z1Var, z10, true);
        return z10;
    }

    @Override
    public void a0(oi.z5 z5Var, String str) {
        oi.z1 z1Var = (oi.z1) this.f15536b;
        if (z1Var.A0 == null) {
            z1Var.A0 = new ga.d(new ki.e(this, 20), z1Var.getResourceProvider());
        }
        z1Var.A0.k(z5Var, str);
    }

    @Override
    public org.telegram.ui.Cells.i9 a1() {
        switch (this.f15535a) {
            case 19:
                return (oi.v0) this.f15536b;
            default:
                return (oi.l4) this.f15536b;
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f15535a) {
            case 4:
                j6.r rVar = new j6.r(1, (TaskCompletionSource) obj2);
                j6.i iVar = (j6.i) ((j6.t) obj).n();
                Parcel p12 = iVar.p1();
                com.google.android.gms.internal.cast.t.d(p12, rVar);
                p12.writeStringArray((String[]) this.f15536b);
                iVar.u1(p12, 6);
                return;
            case 7:
                k7.f fVar = new k7.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
                gVar.f6203c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i7 = t7.a.f57620a;
                obtain.writeStrongBinder(fVar);
                t7.a.b(obtain, (j7.g) this.f15536b);
                t7.a.b(obtain, gVar);
                ((k7.b) ((k7.d) ((k7.e) obj).n())).h1(obtain, 6);
                return;
            default:
                d6.l lVar = new d6.l((TaskCompletionSource) obj2);
                l7.i iVar2 = (l7.i) ((l7.c) obj).n();
                Parcel l1 = iVar2.l1();
                int i10 = l7.f.f19699a;
                l1.writeStrongBinder(lVar);
                l7.f.c(l1, (a6.e) this.f15536b);
                iVar2.m1(l1, 1);
                return;
        }
    }

    @Override
    public void b() {
        zy zyVar = (zy) this.f15536b;
        HashMap hashMap = zyVar.f28390n;
        zyVar.getNotificationCenter().k(ks.R0, new HashMap(hashMap));
        hashMap.clear();
    }

    @Override
    public void b1(CharSequence charSequence) {
        oi.a3 a3Var = ((oi.l5) this.f15536b).F;
        if (a3Var != null && charSequence != null && charSequence.length() > 0) {
            a3Var.f21932a.w4(charSequence.toString());
        }
    }

    @Override
    public void b2(float f10) {
        w5 w5Var = (w5) this.f15536b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.f14426t0 = f10;
        d7Var.f14406j = true;
        w5Var.y(true);
    }

    @Override
    public Cursor c(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15536b;
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
    public oi.a c1() {
        switch (this.f15535a) {
            case 19:
                return ((oi.v0) this.f15536b).f22439a;
            default:
                return ((oi.l4) this.f15536b).f22439a;
        }
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15536b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public void d(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).f19153z.k().c(false);
        }
        l.w wVar = ((m.h) this.f15536b).f20071e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public a0.h d1() {
        return null;
    }

    @Override
    public boolean d2(oi.e1 e1Var) {
        return false;
    }

    @Override
    public void e(oi.e1 e1Var) {
        switch (this.f15535a) {
            case 19:
                oi.n3 n3Var = ((oi.v0) this.f15536b).T;
                if (n3Var != null) {
                    oi.s3 s3Var = n3Var.f22188a;
                    oi.s3.Q1(s3Var, e1Var);
                    s3Var.f22334p3.k(e1Var, true);
                    return;
                }
                return;
            case 20:
            default:
                oi.a3 a3Var = ((oi.l5) this.f15536b).F;
                if (a3Var != null) {
                    oi.s3 s3Var2 = a3Var.f21932a;
                    oi.s3.Q1(s3Var2, e1Var);
                    s3Var2.f22334p3.k(e1Var, true);
                    return;
                }
                return;
            case 21:
                oi.j4 j4Var = ((oi.l4) this.f15536b).H;
                if (j4Var != null) {
                    oi.s3 s3Var3 = ((oi.o3) j4Var).f22220a;
                    oi.s3.Q1(s3Var3, e1Var);
                    s3Var3.f22334p3.k(e1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void e1(long j3) {
        w5 w5Var = (w5) this.f15536b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.f14422r0 = j3;
        d7Var.f14406j = true;
        w5Var.y(true);
    }

    @Override
    public void f(Location location) {
        zy zyVar = (zy) this.f15536b;
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.g0.b0(location.getLatitude());
        tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(location.getLongitude());
        HashMap hashMap = zyVar.f28390n;
        for (Map.Entry entry : hashMap.entrySet()) {
            fj fjVar = (fj) entry.getValue();
            zyVar.r0(xy.d(tL_messageMediaGeo, fj.B0(fjVar.f23965k), fjVar, null, null, null, true, 0));
        }
        hashMap.clear();
    }

    @Override
    public void f0() {
        w5 w5Var = (w5) this.f15536b;
        w5Var.s(null, null, true);
        ta taVar = ((ha) w5Var).D0;
        ha haVar = taVar.Y0;
        if (haVar != null) {
            haVar.s(null, null, true);
        }
        v9 v9Var = taVar.f15492w1;
        if (v9Var != null) {
            v9Var.n0();
        }
        ja jaVar = taVar.f15433d1;
        if (jaVar != null) {
            jaVar.setHasRoundVideo(false);
        }
        d7 d7Var = taVar.L1;
        if (d7Var != null) {
            File file = d7Var.f14416o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                taVar.L1.f14416o0 = null;
            }
            if (taVar.L1.f14418p0 != null) {
                try {
                    new File(taVar.L1.f14418p0).delete();
                } catch (Exception unused2) {
                }
                taVar.L1.f14418p0 = null;
            }
        }
    }

    @Override
    public void g(int i7) {
        f0 f0Var = ((w5) this.f15536b).F;
        if (f0Var != null) {
            ArrayList arrayList = f0Var.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                e0 e0Var = (e0) obj;
                if (e0Var.f14506a == i7) {
                    e0Var.f14507b.e(true, 1.0f);
                    f0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public void g0(boolean z10, float f10) {
        w5 w5Var = (w5) this.f15536b;
        d7 d7Var = w5Var.d;
        if (d7Var != null) {
            d7Var.Z = f10;
            d7Var.f14406j = true;
            f61 f61Var = w5Var.f15650e;
            if (f61Var != null && f61Var.U() != -9223372036854775807L) {
                w5Var.m(f10 * ((float) w5Var.f15650e.U()));
            }
        }
    }

    @Override
    public boolean g1() {
        switch (this.f15535a) {
            case 19:
                oi.v0 v0Var = (oi.v0) this.f15536b;
                oi.n3 n3Var = v0Var.T;
                if (n3Var != null) {
                    oi.a aVar = v0Var.f22439a;
                    if (n3Var.f22188a.V4()) {
                        return true;
                    }
                }
                return false;
            default:
                oi.l4 l4Var = (oi.l4) this.f15536b;
                oi.j4 j4Var = l4Var.H;
                if (j4Var != null) {
                    oi.a aVar2 = l4Var.f22439a;
                    if (((oi.o3) j4Var).f22220a.V4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public Object mo24get() {
        return new jb.a((Context) ((d9.o) this.f15536b).f7922a);
    }

    @Override
    public void h(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f15536b).f19157f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public void h1(boolean z10) {
        tg.r1 r1Var;
        ta taVar = ((ha) ((w5) this.f15536b)).D0;
        v9 v9Var = taVar.f15492w1;
        if (v9Var != null) {
            tg.r1 r1Var2 = null;
            if (!z10 && (v9Var.getSelectedEntity() instanceof tg.r1)) {
                taVar.f15492w1.A0(null, true);
            } else if (z10 && !(taVar.f15492w1.getSelectedEntity() instanceof tg.r1)) {
                g5 g5Var = taVar.f15492w1.B0;
                int i7 = 0;
                int i10 = 0;
                while (true) {
                    if (i10 < g5Var.getChildCount()) {
                        View childAt = g5Var.getChildAt(i10);
                        if (childAt instanceof tg.r1) {
                            r1Var = (tg.r1) childAt;
                            break;
                        }
                        i10++;
                    } else {
                        r1Var = null;
                        break;
                    }
                }
                if (r1Var != null) {
                    v9 v9Var2 = taVar.f15492w1;
                    g5 g5Var2 = v9Var2.B0;
                    while (true) {
                        if (i7 >= g5Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = g5Var2.getChildAt(i7);
                        if (childAt2 instanceof tg.r1) {
                            r1Var2 = (tg.r1) childAt2;
                            break;
                        }
                        i7++;
                    }
                    v9Var2.A0(r1Var2, true);
                }
            }
        }
    }

    public gh.a i() {
        org.telegram.ui.ActionBar.u4 u4Var = ((org.telegram.ui.ActionBar.k5) this.f15536b).d;
        if (u4Var != null) {
            return u4Var.getMenuGlassColorProvider();
        }
        return null;
    }

    @Override
    public void i2(int i7, long j3) {
        ArrayList arrayList;
        w5 w5Var = (w5) this.f15536b;
        d7 d7Var = w5Var.d;
        if (d7Var != null && (arrayList = d7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((d7) w5Var.d.T.get(i7)).X = j3;
        }
    }

    public org.telegram.messenger.ba j() {
        m8.d dVar = (m8.d) this.f15536b;
        q6.m.j("no included points", !Double.isNaN(dVar.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(dVar.f20896b, dVar.d), new LatLng(dVar.f20897c, dVar.f20898e));
        ?? obj = new Object();
        obj.f23051a = latLngBounds;
        return obj;
    }

    @Override
    public void j1() {
        oi.z1 z1Var = (oi.z1) this.f15536b;
        z1Var.E0();
        z1Var.H0();
    }

    @Override
    public void k2() {
        switch (this.f15535a) {
            case 19:
                oi.v0 v0Var = (oi.v0) this.f15536b;
                oi.n3 n3Var = v0Var.T;
                if (n3Var != null) {
                    oi.a aVar = v0Var.f22439a;
                    oi.s3.S1(n3Var.f22188a);
                    return;
                }
                return;
            default:
                oi.l4 l4Var = (oi.l4) this.f15536b;
                oi.j4 j4Var = l4Var.H;
                if (j4Var != null) {
                    oi.a aVar2 = l4Var.f22439a;
                    oi.s3.S1(((oi.o3) j4Var).f22220a);
                    return;
                }
                return;
        }
    }

    public gh.a l() {
        org.telegram.ui.ActionBar.u4 u4Var;
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) this.f15536b;
        if (k5Var.f29145a < 1.0f && (u4Var = k5Var.d) != null) {
            return u4Var.getButtonsGlassColorProvider();
        }
        return null;
    }

    @Override
    public void l1(int i7, int i10) {
        switch (this.f15535a) {
            case 19:
                oi.v0 v0Var = (oi.v0) this.f15536b;
                oi.n3 n3Var = v0Var.T;
                if (n3Var != null) {
                    oi.a aVar = v0Var.f22439a;
                    oi.e2 e2Var = n3Var.f22188a.R3;
                    if (e2Var != null) {
                        e2Var.f(i7, i10);
                        return;
                    }
                    return;
                }
                return;
            default:
                oi.l4 l4Var = (oi.l4) this.f15536b;
                oi.j4 j4Var = l4Var.H;
                if (j4Var != null) {
                    oi.a aVar2 = l4Var.f22439a;
                    oi.e2 e2Var2 = ((oi.o3) j4Var).f22220a.R3;
                    if (e2Var2 != null) {
                        e2Var2.f(i7, i10);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public int m() {
        return ((org.telegram.messenger.j0) this.f15536b).f24764c;
    }

    @Override
    public void m0() {
        oi.z1 z1Var = (oi.z1) this.f15536b;
        int i7 = 0;
        oi.z1.e0(z1Var, false, true);
        int i10 = z1Var.J0;
        if (i10 != 2) {
            i7 = i10;
        }
        z1Var.C0(i7, true);
    }

    @Override
    public void m2(long j3) {
        w5 w5Var = (w5) this.f15536b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.D = j3;
        d7Var.f14406j = true;
        w5Var.w(true);
    }

    @Override
    public void n(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.f15536b;
        Handler handler = eVar.f19157f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f19158n;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                if (kVar == ((l.d) arrayList.get(i7)).f19151b) {
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
    public void n1(float f10, int i7) {
        ArrayList arrayList;
        w5 w5Var = (w5) this.f15536b;
        d7 d7Var = w5Var.d;
        if (d7Var != null && (arrayList = d7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((d7) w5Var.d.T.get(i7)).V = f10;
        }
    }

    @Override
    public boolean o() {
        oi.l5 l5Var = (oi.l5) this.f15536b;
        oi.a3 a3Var = l5Var.F;
        if (a3Var != null && l5Var.f22439a != null) {
            return a3Var.f21932a.V4();
        }
        return false;
    }

    @Override
    public void onContentChanged() {
        oi.z1 z1Var = (oi.z1) this.f15536b;
        if (z1Var.f22547z0 != null) {
            boolean p32 = z1Var.Q.p3();
            z1Var.M0 = p32;
            z1Var.f22547z0.g(p32);
            z1Var.f22547z0.invalidate();
        }
        z1Var.H0();
        Runnable runnable = z1Var.N0;
        org.telegram.messenger.g0.r(runnable);
        org.telegram.messenger.g0.h3(runnable, 1000L);
    }

    @Override
    public void onLocationChanged(Location location) {
        if (location == null) {
            return;
        }
        ((qd) this.f15536b).m(location);
    }

    public LongSparseArray p(long j3, long j10) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.f15536b).get(j3);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j10);
    }

    public u5 q(org.telegram.messenger.ab abVar) {
        m8.d dVar = (m8.d) this.f15536b;
        LatLng latLng = new LatLng(abVar.f22851a, abVar.f22852b);
        dVar.getClass();
        double d = dVar.f20896b;
        double d2 = latLng.f7366a;
        dVar.f20896b = Math.min(d, d2);
        dVar.f20897c = Math.max(dVar.f20897c, d2);
        boolean isNaN = Double.isNaN(dVar.d);
        double d10 = latLng.f7367b;
        if (isNaN) {
            dVar.d = d10;
            dVar.f20898e = d10;
            return this;
        }
        double d11 = dVar.d;
        double d12 = dVar.f20898e;
        if (d11 > d12 ? !(d11 <= d10 || d10 <= d12) : !(d11 <= d10 && d10 <= d12)) {
            if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
                dVar.d = d10;
                return this;
            }
            dVar.f20898e = d10;
        }
        return this;
    }

    @Override
    public void q1(float f10) {
        w5 w5Var = (w5) this.f15536b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.F = f10;
        d7Var.f14406j = true;
        w5Var.w(true);
    }

    @Override
    public void r(int i7) {
        ((jg.h1) this.f15536b).f();
    }

    @Override
    public void r1(oi.e1 e1Var, int i7, int i10) {
        oi.a3 a3Var;
        org.telegram.ui.Cells.j9 textSelectionHelper;
        oi.l5 l5Var = (oi.l5) this.f15536b;
        if (!l5Var.H && i7 != i10 && (a3Var = l5Var.F) != null && (textSelectionHelper = a3Var.f21932a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != l5Var) {
                l5Var.post(new jg.o1(this, e1Var, i10, textSelectionHelper, i7, 4));
            }
        }
    }

    public ia.b s(JSONObject jSONObject) {
        ia.d aVar;
        int i7 = jSONObject.getInt("settings_version");
        if (i7 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i7 + ". Using default settings values.", null);
            aVar = new pb.b(11);
        } else {
            aVar = new qb.a(11);
        }
        return aVar.g((w7.s) this.f15536b, jSONObject);
    }

    @Override
    public void s0(float f10) {
        w5 w5Var = (w5) this.f15536b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.f14424s0 = f10;
        d7Var.f14406j = true;
        w5Var.y(true);
    }

    @Override
    public void s1(Editable editable) {
        oi.l5 l5Var = (oi.l5) this.f15536b;
        oi.a aVar = l5Var.f22439a;
        if (aVar != null) {
            aVar.f21922s = true;
            aVar.f21921r = l5Var.f22163r.f22019q2;
        }
        l5Var.w();
        oi.a3 a3Var = l5Var.F;
        if (a3Var != null && l5Var.f22439a != null) {
            a3Var.a();
        }
    }

    @Override
    public void t(float f10) {
        w5 w5Var = (w5) this.f15536b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.f14428u0 = f10;
        d7Var.f14406j = true;
        w5Var.c();
    }

    @Override
    public int t0() {
        int i7;
        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) this.f15536b;
        gh.a i10 = i();
        if (i10 != null && k5Var.d.e()) {
            i7 = i10.t0();
        } else {
            i7 = 0;
        }
        gh.a l10 = l();
        if (l10 != null) {
            return i0.a.f(k5Var.f29145a, l10.t0(), i7);
        }
        return i7;
    }

    @Override
    public void u() {
        switch (this.f15535a) {
            case 19:
                oi.v0 v0Var = (oi.v0) this.f15536b;
                oi.n3 n3Var = v0Var.T;
                if (n3Var != null) {
                    oi.s3.T1(n3Var.f22188a, v0Var.f22439a);
                    return;
                }
                return;
            default:
                oi.l4 l4Var = (oi.l4) this.f15536b;
                oi.j4 j4Var = l4Var.H;
                if (j4Var != null) {
                    oi.s3.T1(((oi.o3) j4Var).f22220a, l4Var.f22439a);
                    return;
                }
                return;
        }
    }

    @Override
    public void u1() {
        switch (this.f15535a) {
            case 19:
                oi.v0 v0Var = (oi.v0) this.f15536b;
                oi.n3 n3Var = v0Var.T;
                if (n3Var != null) {
                    oi.a aVar = v0Var.f22439a;
                    oi.s3 s3Var = n3Var.f22188a;
                    oi.e2 e2Var = s3Var.R3;
                    if (e2Var != null) {
                        e2Var.g();
                    }
                    s3Var.f22334p3.onContentChanged();
                    return;
                }
                return;
            default:
                oi.l4 l4Var = (oi.l4) this.f15536b;
                oi.j4 j4Var = l4Var.H;
                if (j4Var != null) {
                    oi.a aVar2 = l4Var.f22439a;
                    oi.s3 s3Var2 = ((oi.o3) j4Var).f22220a;
                    oi.e2 e2Var2 = s3Var2.R3;
                    if (e2Var2 != null) {
                        e2Var2.g();
                    }
                    s3Var2.f22334p3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public Object v(ce.d dVar, kd.c cVar) {
        Object v = ((q4.q) this.f15536b).v(new gb.y0(dVar, 1), cVar);
        if (v == jd.a.f17381a) {
            return v;
        }
        return gd.k.f13485a;
    }

    @Override
    public void v0(Bitmap bitmap) {
        ((i6.h) this.f15536b).e(3, bitmap);
    }

    @Override
    public boolean v1(int i7) {
        return true;
    }

    public void w(long j3, long j10, long j11, Object obj) {
        LongSparseArray longSparseArray = (LongSparseArray) this.f15536b;
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
    public void w1(float f10) {
        w5 w5Var = (w5) this.f15536b;
        d7 d7Var = w5Var.d;
        if (d7Var == null) {
            return;
        }
        d7Var.E = f10;
        d7Var.f14406j = true;
        w5Var.w(true);
    }

    @Override
    public void x(oi.p3 p3Var, View view) {
        oi.z1 z1Var = (oi.z1) this.f15536b;
        y60 I = y60.I(z1Var, view);
        I.T = true;
        z1Var.f22546y0 = oi.g4.c(I, z1Var, z1Var.getParentActivity(), z1Var.getResourceProvider(), p3Var, false);
    }

    public Object y(long j3, long j10, long j11) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = (LongSparseArray) ((LongSparseArray) this.f15536b).get(j3);
        if (longSparseArray2 == null || (longSparseArray = (LongSparseArray) longSparseArray2.get(j10)) == null) {
            return null;
        }
        Object obj = longSparseArray.get(j11);
        longSparseArray.remove(j11);
        return obj;
    }

    public u5(com.google.android.gms.common.api.j jVar, Object obj, int i7) {
        this.f15535a = i7;
        this.f15536b = obj;
    }

    public u5(Object obj, int i7) {
        this.f15535a = i7;
        this.f15536b = obj;
    }

    public u5(a7.a aVar) {
        this.f15535a = 15;
        q6.m.h(aVar);
        this.f15536b = aVar;
    }

    public u5(String str, int i7) {
        this.f15535a = 23;
        this.f15536b = new org.telegram.messenger.j0(str, i7);
    }

    public u5(Context context, Uri uri) {
        this.f15535a = 17;
        this.f15536b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public u5(String str, String str2) {
        this.f15535a = 24;
        this.f15536b = new org.telegram.messenger.n0(str, str2);
    }

    public u5() {
        this.f15535a = 25;
        this.f15536b = new LongSparseArray();
    }

    @Override
    public void E0() {
    }

    @Override
    public void V() {
    }

    @Override
    public void b0(int i7) {
    }

    @Override
    public void x0(oi.e1 e1Var) {
    }

    @Override
    public void k(oi.e1 e1Var, boolean z10) {
    }
}
