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
import org.telegram.messenger.az;
import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
import org.telegram.messenger.rd;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.ui;
import org.telegram.ui.eg0;
public final class t5 implements wa, i6.a, com.google.android.gms.common.api.internal.q, ib.b, jg.y1, m.e2, l.w, m.k, ce.c, o0.a, org.telegram.ui.Components.a5, oi.h0, oi.r3, oi.e1, org.telegram.messenger.wa, org.telegram.messenger.qa, wy, gh.a {
    public final int f15507a;
    public Object f15508b;

    public t5(int i7) {
        this.f15507a = i7;
    }

    @Override
    public void A(int i7, int i10) {
        oi.g2 g2Var;
        oi.m5 m5Var = (oi.m5) this.f15508b;
        oi.b3 b3Var = m5Var.F;
        if (b3Var != null && m5Var.f22531a != null && (g2Var = b3Var.f22024a.R3) != null) {
            g2Var.f(i7, i10);
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
            return org.telegram.messenger.g0.T1(l10.A1(), f10, ((org.telegram.ui.ActionBar.j5) this.f15508b).f29073a);
        }
        return f10;
    }

    @Override
    public int A2() {
        int i7;
        org.telegram.ui.ActionBar.t4 t4Var;
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.f15508b;
        gh.a i10 = i();
        if (i10 != null) {
            i7 = i10.A2();
        } else {
            i7 = 0;
        }
        if (j5Var.f29073a < 1.0f && (t4Var = j5Var.d) != null) {
            return i0.a.f(j5Var.f29073a, t4Var.getButtonsGlassBackgroundColor(), i7);
        }
        return i7;
    }

    @Override
    public boolean C(l.k kVar) {
        m.h hVar = (m.h) this.f15508b;
        if (kVar == hVar.f20101c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        l.w wVar = hVar.f20102e;
        if (wVar == null) {
            return false;
        }
        return wVar.C(kVar);
    }

    @Override
    public void D(int i7) {
        ((oi.b2) this.f15508b).t0(74, i7);
    }

    @Override
    public void D0(boolean z10) {
        v5 v5Var = (v5) this.f15508b;
        if (v5Var.j()) {
            v5Var.F.getClass();
        }
        v5Var.x(-4, z10);
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
            return i0.a.f(((org.telegram.ui.ActionBar.j5) this.f15508b).f29073a, l10.D1(), i7);
        }
        return i7;
    }

    @Override
    public boolean E1(boolean z10) {
        return false;
    }

    @Override
    public void F(float f10) {
        v5 v5Var = (v5) this.f15508b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.G = f10;
        c7Var.f14359j = true;
        v5Var.c();
    }

    @Override
    public void G() {
        int i7;
        oi.b2 b2Var = (oi.b2) this.f15508b;
        oi.h3 h3Var = b2Var.Q.f22440v3;
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
    public a70 G0(View view) {
        return a70.I((oi.b2) this.f15508b, view);
    }

    @Override
    public void G1(float f10, int i7) {
        ArrayList arrayList;
        v5 v5Var = (v5) this.f15508b;
        c7 c7Var = v5Var.d;
        if (c7Var != null && (arrayList = c7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((c7) v5Var.d.T.get(i7)).W = f10;
        }
    }

    @Override
    public void H(oi.a aVar) {
        oi.b2 b2Var = (oi.b2) this.f15508b;
        if (aVar != null && (aVar.f21935b instanceof TL_iv.pageBlockMap) && org.telegram.messenger.g0.J1(b2Var)) {
            ui uiVar = new ui(b2Var.getParentActivity(), b2Var, false, false, false, b2Var.getResourceProvider());
            uiVar.X3 = new sa.d(16);
            uiVar.K1 = true;
            uiVar.f40438v3.setVisibility(8);
            uiVar.f40435u4 = new a3.h(b2Var, aVar, uiVar, 16);
            uiVar.f1();
            uiVar.show();
        }
    }

    @Override
    public boolean J(oi.f1 f1Var) {
        return false;
    }

    @Override
    public void J0(float f10, int i7) {
        ArrayList arrayList;
        v5 v5Var = (v5) this.f15508b;
        c7 c7Var = v5Var.d;
        if (c7Var != null && (arrayList = c7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((c7) v5Var.d.T.get(i7)).P = f10;
        }
    }

    @Override
    public a0.h K0() {
        return null;
    }

    @Override
    public void M(long j3, boolean z10) {
        v5 v5Var = (v5) this.f15508b;
        if (!z10) {
            v5Var.m(j3);
            return;
        }
        i61 i61Var = v5Var.f15626e;
        if (i61Var != null) {
            i61Var.q0(j3, true);
        } else if (v5Var.j()) {
            v5Var.F.m(j3, true);
        } else {
            i61 i61Var2 = v5Var.E;
            if (i61Var2 != null) {
                i61Var2.q0(j3, false);
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
            return i0.a.f(((org.telegram.ui.ActionBar.j5) this.f15508b).f29073a, l10.M0(), i7);
        }
        return i7;
    }

    @Override
    public void M1(float f10) {
        c7 c7Var = ((v5) this.f15508b).d;
        if (c7Var == null) {
            return;
        }
        c7Var.f14339a0 = f10;
        c7Var.f14359j = true;
    }

    @Override
    public void N1() {
        ((v5) this.f15508b).q(null);
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        ((oi.o) this.f15508b).M(z10, i7, i10, 0L, false);
        oi.o oVar = (oi.o) this.f15508b;
        eg0 eg0Var = oVar.P;
        if (eg0Var != null) {
            eg0Var.i();
            oVar.P = null;
        }
    }

    @Override
    public org.telegram.ui.Cells.j9 P0() {
        switch (this.f15507a) {
            case 19:
                oi.o3 o3Var = ((oi.w0) this.f15508b).T;
                if (o3Var == null) {
                    return null;
                }
                return o3Var.f22284a.getTextSelectionHelper();
            default:
                oi.k4 k4Var = ((oi.m4) this.f15508b).H;
                if (k4Var != null) {
                    return ((oi.p3) k4Var).f22312a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public void P1(ArrayList arrayList) {
        jg.h1 h1Var = (jg.h1) this.f15508b;
        String str = h1Var.f17528a0;
        if (str != null) {
            h1Var.U(str, h1Var.f17532d0, h1Var.f17534e0, h1Var.f17531c0, h1Var.f17529b0);
        }
    }

    @Override
    public void Q() {
        oi.b2 b2Var = (oi.b2) this.f15508b;
        b2Var.J0 = b2Var.L0;
        oi.b2.e0(b2Var, false, false);
        b2Var.C0(2, true);
    }

    @Override
    public void Q0(float f10) {
        v5 v5Var = (v5) this.f15508b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.P = f10;
        v5Var.c();
    }

    @Override
    public void R0(oi.s3 s3Var, View view) {
        oi.b2 b2Var = (oi.b2) this.f15508b;
        a70 I = a70.I(b2Var, view);
        I.T = true;
        b2Var.getParentActivity();
        b2Var.getResourceProvider();
        b2Var.f22022y0 = oi.h4.b(I, b2Var, s3Var, false);
    }

    @Override
    public void S0(CharSequence charSequence) {
        switch (this.f15507a) {
            case 19:
                oi.o3 o3Var = ((oi.w0) this.f15508b).T;
                if (o3Var != null) {
                    o3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        o3Var.f22284a.w4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                oi.k4 k4Var = ((oi.m4) this.f15508b).H;
                if (k4Var != null) {
                    oi.p3 p3Var = (oi.p3) k4Var;
                    p3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        p3Var.f22312a.w4(charSequence.toString());
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
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.f15508b;
        gh.a i10 = i();
        if (i10 != null && j5Var.d.e()) {
            i7 = i10.U0();
        } else {
            i7 = 0;
        }
        gh.a l10 = l();
        if (l10 != null) {
            return i0.a.f(j5Var.f29073a, l10.U0(), i7);
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
            return i0.a.f(((org.telegram.ui.ActionBar.j5) this.f15508b).f29073a, l10.W1(), i7);
        }
        return i7;
    }

    @Override
    public float Y0() {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.f15508b;
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
            return org.telegram.messenger.g0.T1(f11, f10, j5Var.f29073a);
        }
        if (j5Var.f29073a < 0.5f) {
            return f11;
        }
        return f10;
    }

    @Override
    public float Z0() {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.f15508b;
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
            return org.telegram.messenger.g0.T1(f11, f10, j5Var.f29073a);
        }
        if (j5Var.f29073a < 0.5f) {
            return f11;
        }
        return f10;
    }

    @Override
    public boolean a(float f10) {
        boolean z10;
        int[] iArr;
        oi.b2 b2Var = (oi.b2) this.f15508b;
        FrameLayout frameLayout = b2Var.f22018w0;
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
    public void a0(oi.a6 a6Var, String str) {
        oi.b2 b2Var = (oi.b2) this.f15508b;
        if (b2Var.A0 == null) {
            b2Var.A0 = new ga.d(new kg.x1(this, 21), b2Var.getResourceProvider());
        }
        b2Var.A0.k(a6Var, str);
    }

    @Override
    public org.telegram.ui.Cells.i9 a1() {
        switch (this.f15507a) {
            case 19:
                return (oi.w0) this.f15508b;
            default:
                return (oi.m4) this.f15508b;
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f15507a) {
            case 4:
                j6.r rVar = new j6.r(1, (TaskCompletionSource) obj2);
                j6.i iVar = (j6.i) ((j6.t) obj).n();
                Parcel p12 = iVar.p1();
                com.google.android.gms.internal.cast.t.d(p12, rVar);
                p12.writeStringArray((String[]) this.f15508b);
                iVar.u1(p12, 6);
                return;
            case 7:
                k7.f fVar = new k7.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
                gVar.f6235c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i7 = t7.a.f57663a;
                obtain.writeStrongBinder(fVar);
                t7.a.b(obtain, (j7.g) this.f15508b);
                t7.a.b(obtain, gVar);
                ((k7.b) ((k7.d) ((k7.e) obj).n())).h1(obtain, 6);
                return;
            default:
                d6.l lVar = new d6.l((TaskCompletionSource) obj2);
                l7.i iVar2 = (l7.i) ((l7.c) obj).n();
                Parcel l1 = iVar2.l1();
                int i10 = l7.f.f19730a;
                l1.writeStrongBinder(lVar);
                l7.f.c(l1, (a6.e) this.f15508b);
                iVar2.m1(l1, 1);
                return;
        }
    }

    @Override
    public void b() {
        az azVar = (az) this.f15508b;
        HashMap hashMap = azVar.f23009n;
        azVar.getNotificationCenter().k(ls.R0, new HashMap(hashMap));
        hashMap.clear();
    }

    @Override
    public void b1(CharSequence charSequence) {
        oi.b3 b3Var = ((oi.m5) this.f15508b).F;
        if (b3Var != null && charSequence != null && charSequence.length() > 0) {
            b3Var.f22024a.w4(charSequence.toString());
        }
    }

    @Override
    public void b2(float f10) {
        v5 v5Var = (v5) this.f15508b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.f14379t0 = f10;
        c7Var.f14359j = true;
        v5Var.y(true);
    }

    @Override
    public Cursor c(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15508b;
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
        switch (this.f15507a) {
            case 19:
                return ((oi.w0) this.f15508b).f22531a;
            default:
                return ((oi.m4) this.f15508b).f22531a;
        }
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15508b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public void d(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).f19184z.k().c(false);
        }
        l.w wVar = ((m.h) this.f15508b).f20102e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public a0.h d1() {
        return null;
    }

    @Override
    public boolean d2(oi.f1 f1Var) {
        return false;
    }

    @Override
    public void e(oi.f1 f1Var) {
        switch (this.f15507a) {
            case 19:
                oi.o3 o3Var = ((oi.w0) this.f15508b).T;
                if (o3Var != null) {
                    oi.t3 t3Var = o3Var.f22284a;
                    oi.t3.Q1(t3Var, f1Var);
                    t3Var.f22428p3.k(f1Var, true);
                    return;
                }
                return;
            case 20:
            default:
                oi.b3 b3Var = ((oi.m5) this.f15508b).F;
                if (b3Var != null) {
                    oi.t3 t3Var2 = b3Var.f22024a;
                    oi.t3.Q1(t3Var2, f1Var);
                    t3Var2.f22428p3.k(f1Var, true);
                    return;
                }
                return;
            case 21:
                oi.k4 k4Var = ((oi.m4) this.f15508b).H;
                if (k4Var != null) {
                    oi.t3 t3Var3 = ((oi.p3) k4Var).f22312a;
                    oi.t3.Q1(t3Var3, f1Var);
                    t3Var3.f22428p3.k(f1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void e1(long j3) {
        v5 v5Var = (v5) this.f15508b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.f14375r0 = j3;
        c7Var.f14359j = true;
        v5Var.y(true);
    }

    @Override
    public void f(Location location) {
        az azVar = (az) this.f15508b;
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = org.telegram.messenger.g0.b0(location.getLatitude());
        tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(location.getLongitude());
        HashMap hashMap = azVar.f23009n;
        for (Map.Entry entry : hashMap.entrySet()) {
            gj gjVar = (gj) entry.getValue();
            azVar.r0(yy.d(tL_messageMediaGeo, gj.B0(gjVar.f24213k), gjVar, null, null, null, true, 0));
        }
        hashMap.clear();
    }

    @Override
    public void f0() {
        v5 v5Var = (v5) this.f15508b;
        v5Var.s(null, null, true);
        sa saVar = ((ga) v5Var).D0;
        ga gaVar = saVar.Y0;
        if (gaVar != null) {
            gaVar.s(null, null, true);
        }
        u9 u9Var = saVar.f15456w1;
        if (u9Var != null) {
            u9Var.n0();
        }
        ia iaVar = saVar.f15397d1;
        if (iaVar != null) {
            iaVar.setHasRoundVideo(false);
        }
        c7 c7Var = saVar.L1;
        if (c7Var != null) {
            File file = c7Var.f14369o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                saVar.L1.f14369o0 = null;
            }
            if (saVar.L1.f14371p0 != null) {
                try {
                    new File(saVar.L1.f14371p0).delete();
                } catch (Exception unused2) {
                }
                saVar.L1.f14371p0 = null;
            }
        }
    }

    @Override
    public void g(int i7) {
        g0 g0Var = ((v5) this.f15508b).F;
        if (g0Var != null) {
            ArrayList arrayList = g0Var.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                f0 f0Var = (f0) obj;
                if (f0Var.f14615a == i7) {
                    f0Var.f14616b.e(true, 1.0f);
                    g0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public void g0(boolean z10, float f10) {
        v5 v5Var = (v5) this.f15508b;
        c7 c7Var = v5Var.d;
        if (c7Var != null) {
            c7Var.Z = f10;
            c7Var.f14359j = true;
            i61 i61Var = v5Var.f15626e;
            if (i61Var != null && i61Var.U() != -9223372036854775807L) {
                v5Var.m(f10 * ((float) v5Var.f15626e.U()));
            }
        }
    }

    @Override
    public boolean g1() {
        switch (this.f15507a) {
            case 19:
                oi.w0 w0Var = (oi.w0) this.f15508b;
                oi.o3 o3Var = w0Var.T;
                if (o3Var != null) {
                    oi.a aVar = w0Var.f22531a;
                    if (o3Var.f22284a.V4()) {
                        return true;
                    }
                }
                return false;
            default:
                oi.m4 m4Var = (oi.m4) this.f15508b;
                oi.k4 k4Var = m4Var.H;
                if (k4Var != null) {
                    oi.a aVar2 = m4Var.f22531a;
                    if (((oi.p3) k4Var).f22312a.V4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public Object mo24get() {
        return new jb.a((Context) ((d9.o) this.f15508b).f7954a);
    }

    @Override
    public void h(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f15508b).f19188f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public void h1(boolean z10) {
        tg.t1 t1Var;
        sa saVar = ((ga) ((v5) this.f15508b)).D0;
        u9 u9Var = saVar.f15456w1;
        if (u9Var != null) {
            tg.t1 t1Var2 = null;
            if (!z10 && (u9Var.getSelectedEntity() instanceof tg.t1)) {
                saVar.f15456w1.A0(null, true);
            } else if (z10 && !(saVar.f15456w1.getSelectedEntity() instanceof tg.t1)) {
                f5 f5Var = saVar.f15456w1.B0;
                int i7 = 0;
                int i10 = 0;
                while (true) {
                    if (i10 < f5Var.getChildCount()) {
                        View childAt = f5Var.getChildAt(i10);
                        if (childAt instanceof tg.t1) {
                            t1Var = (tg.t1) childAt;
                            break;
                        }
                        i10++;
                    } else {
                        t1Var = null;
                        break;
                    }
                }
                if (t1Var != null) {
                    u9 u9Var2 = saVar.f15456w1;
                    f5 f5Var2 = u9Var2.B0;
                    while (true) {
                        if (i7 >= f5Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = f5Var2.getChildAt(i7);
                        if (childAt2 instanceof tg.t1) {
                            t1Var2 = (tg.t1) childAt2;
                            break;
                        }
                        i7++;
                    }
                    u9Var2.A0(t1Var2, true);
                }
            }
        }
    }

    public gh.a i() {
        org.telegram.ui.ActionBar.t4 t4Var = ((org.telegram.ui.ActionBar.j5) this.f15508b).d;
        if (t4Var != null) {
            return t4Var.getMenuGlassColorProvider();
        }
        return null;
    }

    @Override
    public void i2(int i7, long j3) {
        ArrayList arrayList;
        v5 v5Var = (v5) this.f15508b;
        c7 c7Var = v5Var.d;
        if (c7Var != null && (arrayList = c7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((c7) v5Var.d.T.get(i7)).X = j3;
        }
    }

    public org.telegram.messenger.ca j() {
        m8.d dVar = (m8.d) this.f15508b;
        q6.m.j("no included points", !Double.isNaN(dVar.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(dVar.f20927b, dVar.d), new LatLng(dVar.f20928c, dVar.f20929e));
        ?? obj = new Object();
        obj.f23248a = latLngBounds;
        return obj;
    }

    @Override
    public void j1() {
        oi.b2 b2Var = (oi.b2) this.f15508b;
        b2Var.E0();
        b2Var.H0();
    }

    @Override
    public void k2() {
        switch (this.f15507a) {
            case 19:
                oi.w0 w0Var = (oi.w0) this.f15508b;
                oi.o3 o3Var = w0Var.T;
                if (o3Var != null) {
                    oi.a aVar = w0Var.f22531a;
                    oi.t3.S1(o3Var.f22284a);
                    return;
                }
                return;
            default:
                oi.m4 m4Var = (oi.m4) this.f15508b;
                oi.k4 k4Var = m4Var.H;
                if (k4Var != null) {
                    oi.a aVar2 = m4Var.f22531a;
                    oi.t3.S1(((oi.p3) k4Var).f22312a);
                    return;
                }
                return;
        }
    }

    public gh.a l() {
        org.telegram.ui.ActionBar.t4 t4Var;
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.f15508b;
        if (j5Var.f29073a < 1.0f && (t4Var = j5Var.d) != null) {
            return t4Var.getButtonsGlassColorProvider();
        }
        return null;
    }

    @Override
    public void l1(int i7, int i10) {
        switch (this.f15507a) {
            case 19:
                oi.w0 w0Var = (oi.w0) this.f15508b;
                oi.o3 o3Var = w0Var.T;
                if (o3Var != null) {
                    oi.a aVar = w0Var.f22531a;
                    oi.g2 g2Var = o3Var.f22284a.R3;
                    if (g2Var != null) {
                        g2Var.f(i7, i10);
                        return;
                    }
                    return;
                }
                return;
            default:
                oi.m4 m4Var = (oi.m4) this.f15508b;
                oi.k4 k4Var = m4Var.H;
                if (k4Var != null) {
                    oi.a aVar2 = m4Var.f22531a;
                    oi.g2 g2Var2 = ((oi.p3) k4Var).f22312a.R3;
                    if (g2Var2 != null) {
                        g2Var2.f(i7, i10);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public int m() {
        return ((org.telegram.messenger.j0) this.f15508b).f24812c;
    }

    @Override
    public void m0() {
        oi.b2 b2Var = (oi.b2) this.f15508b;
        int i7 = 0;
        oi.b2.e0(b2Var, false, true);
        int i10 = b2Var.J0;
        if (i10 != 2) {
            i7 = i10;
        }
        b2Var.C0(i7, true);
    }

    @Override
    public void m2(long j3) {
        v5 v5Var = (v5) this.f15508b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.D = j3;
        c7Var.f14359j = true;
        v5Var.w(true);
    }

    @Override
    public void n(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.f15508b;
        Handler handler = eVar.f19188f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f19189n;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                if (kVar == ((l.d) arrayList.get(i7)).f19182b) {
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
        v5 v5Var = (v5) this.f15508b;
        c7 c7Var = v5Var.d;
        if (c7Var != null && (arrayList = c7Var.T) != null && i7 >= 0 && i7 < arrayList.size()) {
            ((c7) v5Var.d.T.get(i7)).V = f10;
        }
    }

    @Override
    public boolean o() {
        oi.m5 m5Var = (oi.m5) this.f15508b;
        oi.b3 b3Var = m5Var.F;
        if (b3Var != null && m5Var.f22531a != null) {
            return b3Var.f22024a.V4();
        }
        return false;
    }

    @Override
    public void onContentChanged() {
        oi.b2 b2Var = (oi.b2) this.f15508b;
        if (b2Var.f22023z0 != null) {
            boolean p32 = b2Var.Q.p3();
            b2Var.M0 = p32;
            b2Var.f22023z0.g(p32);
            b2Var.f22023z0.invalidate();
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
        ((rd) this.f15508b).m(location);
    }

    public LongSparseArray p(long j3, long j10) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.f15508b).get(j3);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j10);
    }

    public t5 q(org.telegram.messenger.bb bbVar) {
        m8.d dVar = (m8.d) this.f15508b;
        LatLng latLng = new LatLng(bbVar.f23066a, bbVar.f23067b);
        dVar.getClass();
        double d = dVar.f20927b;
        double d2 = latLng.f7398a;
        dVar.f20927b = Math.min(d, d2);
        dVar.f20928c = Math.max(dVar.f20928c, d2);
        boolean isNaN = Double.isNaN(dVar.d);
        double d10 = latLng.f7399b;
        if (isNaN) {
            dVar.d = d10;
            dVar.f20929e = d10;
            return this;
        }
        double d11 = dVar.d;
        double d12 = dVar.f20929e;
        if (d11 > d12 ? !(d11 <= d10 || d10 <= d12) : !(d11 <= d10 && d10 <= d12)) {
            if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
                dVar.d = d10;
                return this;
            }
            dVar.f20929e = d10;
        }
        return this;
    }

    @Override
    public void q1(float f10) {
        v5 v5Var = (v5) this.f15508b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.F = f10;
        c7Var.f14359j = true;
        v5Var.w(true);
    }

    @Override
    public void r(int i7) {
        ((jg.h1) this.f15508b).f();
    }

    @Override
    public void r1(oi.f1 f1Var, int i7, int i10) {
        oi.b3 b3Var;
        org.telegram.ui.Cells.j9 textSelectionHelper;
        oi.m5 m5Var = (oi.m5) this.f15508b;
        if (!m5Var.H && i7 != i10 && (b3Var = m5Var.F) != null && (textSelectionHelper = b3Var.f22024a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != m5Var) {
                m5Var.post(new jg.o1(this, f1Var, i10, textSelectionHelper, i7, 4));
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
        return aVar.g((w7.s) this.f15508b, jSONObject);
    }

    @Override
    public void s0(float f10) {
        v5 v5Var = (v5) this.f15508b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.f14377s0 = f10;
        c7Var.f14359j = true;
        v5Var.y(true);
    }

    @Override
    public void s1(Editable editable) {
        oi.m5 m5Var = (oi.m5) this.f15508b;
        oi.a aVar = m5Var.f22531a;
        if (aVar != null) {
            aVar.f21950s = true;
            aVar.f21949r = m5Var.f22246r.f22112q2;
        }
        m5Var.w();
        oi.b3 b3Var = m5Var.F;
        if (b3Var != null && m5Var.f22531a != null) {
            b3Var.a();
        }
    }

    @Override
    public void t(float f10) {
        v5 v5Var = (v5) this.f15508b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.f14381u0 = f10;
        c7Var.f14359j = true;
        v5Var.c();
    }

    @Override
    public int t0() {
        int i7;
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.f15508b;
        gh.a i10 = i();
        if (i10 != null && j5Var.d.e()) {
            i7 = i10.t0();
        } else {
            i7 = 0;
        }
        gh.a l10 = l();
        if (l10 != null) {
            return i0.a.f(j5Var.f29073a, l10.t0(), i7);
        }
        return i7;
    }

    @Override
    public void u() {
        switch (this.f15507a) {
            case 19:
                oi.w0 w0Var = (oi.w0) this.f15508b;
                oi.o3 o3Var = w0Var.T;
                if (o3Var != null) {
                    oi.t3.T1(o3Var.f22284a, w0Var.f22531a);
                    return;
                }
                return;
            default:
                oi.m4 m4Var = (oi.m4) this.f15508b;
                oi.k4 k4Var = m4Var.H;
                if (k4Var != null) {
                    oi.t3.T1(((oi.p3) k4Var).f22312a, m4Var.f22531a);
                    return;
                }
                return;
        }
    }

    @Override
    public void u1() {
        switch (this.f15507a) {
            case 19:
                oi.w0 w0Var = (oi.w0) this.f15508b;
                oi.o3 o3Var = w0Var.T;
                if (o3Var != null) {
                    oi.a aVar = w0Var.f22531a;
                    oi.t3 t3Var = o3Var.f22284a;
                    oi.g2 g2Var = t3Var.R3;
                    if (g2Var != null) {
                        g2Var.g();
                    }
                    t3Var.f22428p3.onContentChanged();
                    return;
                }
                return;
            default:
                oi.m4 m4Var = (oi.m4) this.f15508b;
                oi.k4 k4Var = m4Var.H;
                if (k4Var != null) {
                    oi.a aVar2 = m4Var.f22531a;
                    oi.t3 t3Var2 = ((oi.p3) k4Var).f22312a;
                    oi.g2 g2Var2 = t3Var2.R3;
                    if (g2Var2 != null) {
                        g2Var2.g();
                    }
                    t3Var2.f22428p3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public Object v(ce.d dVar, kd.c cVar) {
        Object v = ((q4.q) this.f15508b).v(new gb.y0(dVar, 1), cVar);
        if (v == jd.a.f17409a) {
            return v;
        }
        return gd.k.f13517a;
    }

    @Override
    public void v0(Bitmap bitmap) {
        ((i6.h) this.f15508b).e(3, bitmap);
    }

    @Override
    public boolean v1(int i7) {
        return true;
    }

    public void w(long j3, long j10, long j11, Object obj) {
        LongSparseArray longSparseArray = (LongSparseArray) this.f15508b;
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
        v5 v5Var = (v5) this.f15508b;
        c7 c7Var = v5Var.d;
        if (c7Var == null) {
            return;
        }
        c7Var.E = f10;
        c7Var.f14359j = true;
        v5Var.w(true);
    }

    @Override
    public void x(oi.q3 q3Var, View view) {
        oi.b2 b2Var = (oi.b2) this.f15508b;
        a70 I = a70.I(b2Var, view);
        I.T = true;
        b2Var.f22022y0 = oi.h4.c(I, b2Var, b2Var.getParentActivity(), b2Var.getResourceProvider(), q3Var, false);
    }

    public Object y(long j3, long j10, long j11) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = (LongSparseArray) ((LongSparseArray) this.f15508b).get(j3);
        if (longSparseArray2 == null || (longSparseArray = (LongSparseArray) longSparseArray2.get(j10)) == null) {
            return null;
        }
        Object obj = longSparseArray.get(j11);
        longSparseArray.remove(j11);
        return obj;
    }

    public t5(com.google.android.gms.common.api.j jVar, Object obj, int i7) {
        this.f15507a = i7;
        this.f15508b = obj;
    }

    public t5(Object obj, int i7) {
        this.f15507a = i7;
        this.f15508b = obj;
    }

    public t5(a7.a aVar) {
        this.f15507a = 15;
        q6.m.h(aVar);
        this.f15508b = aVar;
    }

    public t5(String str, int i7) {
        this.f15507a = 23;
        this.f15508b = new org.telegram.messenger.j0(str, i7);
    }

    public t5(Context context, Uri uri) {
        this.f15507a = 17;
        this.f15508b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public t5(String str, String str2) {
        this.f15507a = 24;
        this.f15508b = new org.telegram.messenger.n0(str, str2);
    }

    public t5() {
        this.f15507a = 25;
        this.f15508b = new LongSparseArray();
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
    public void x0(oi.f1 f1Var) {
    }

    @Override
    public void k(oi.f1 f1Var, boolean z10) {
    }
}
