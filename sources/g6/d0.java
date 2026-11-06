package g6;

import a8.p0;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.text.Editable;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bg.m0;
import bi.k1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import gb.q0;
import h9.h1;
import hi.j4;
import ii.k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import l2.l0;
import li.a3;
import li.a6;
import li.b2;
import li.f1;
import li.f2;
import li.g1;
import li.g3;
import li.h4;
import li.i0;
import li.k4;
import li.m4;
import li.m5;
import li.o3;
import li.p3;
import li.q3;
import li.r3;
import li.s3;
import li.t3;
import li.x0;
import m.y0;
import n2.r0;
import n2.t0;
import org.telegram.messenger.cb;
import org.telegram.messenger.cz;
import org.telegram.messenger.da;
import org.telegram.messenger.ez;
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.j0;
import org.telegram.messenger.n0;
import org.telegram.messenger.qs;
import org.telegram.messenger.ra;
import org.telegram.messenger.xa;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.t4;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.an;
import org.telegram.ui.bg0;
import org.telegram.ui.va;
import org.telegram.ui.vs;
public class d0 implements OnCompleteListener, ib.b, j6.n, h1, i6.a, k0, com.google.android.gms.common.api.internal.p, bi, t4, i0, r3, f1, y0, n2.v, xa, ra, cz, gh.a, lm0 {
    public final int f13554a;
    public Object f13555b;

    public d0(int i7, boolean z9) {
        this.f13554a = i7;
    }

    @Override
    public int A() {
        int i7;
        i5 i5Var = (i5) this.f13555b;
        gh.a Q = Q();
        if (Q != null && i5Var.d.b()) {
            i7 = Q.A();
        } else {
            i7 = 0;
        }
        gh.a S = S();
        if (S != null) {
            return i0.a.f(i5Var.f27587a, S.A(), i7);
        }
        return i7;
    }

    @Override
    public void C() {
        gz gzVar = (gz) this.f13555b;
        HashMap hashMap = gzVar.f22763n;
        gzVar.getNotificationCenter().k(qs.R0, new HashMap(hashMap));
        hashMap.clear();
    }

    @Override
    public int C0() {
        int i7;
        gh.a Q = Q();
        gh.a S = S();
        if (Q != null) {
            i7 = Q.C0();
        } else {
            i7 = 0;
        }
        if (S != null) {
            return i0.a.f(((i5) this.f13555b).f27587a, S.C0(), i7);
        }
        return i7;
    }

    @Override
    public boolean E(g1 g1Var) {
        return false;
    }

    @Override
    public void G() {
        b2 b2Var = (b2) this.f13555b;
        int i7 = 0;
        b2.e0(b2Var, false, true);
        int i10 = b2Var.I0;
        if (i10 != 2) {
            i7 = i10;
        }
        b2Var.C0(i7, true);
    }

    @Override
    public boolean G1() {
        return false;
    }

    @Override
    public void H(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: g6.d0.H(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    @Override
    public void H0() {
        a3.s sVar;
        t0 t0Var = (t0) this.f13555b;
        synchronized (t0Var.f17756a) {
            sVar = t0Var.H;
        }
        if (sVar != null) {
            sVar.m();
        }
    }

    @Override
    public void I() {
        ((t0) this.f13555b).l1 = true;
    }

    @Override
    public void I0(CharSequence charSequence) {
        switch (this.f13554a) {
            case 12:
                o3 o3Var = ((x0) this.f13555b).S;
                if (o3Var != null) {
                    o3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        o3Var.f18738a.w4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                k4 k4Var = ((m4) this.f13555b).G;
                if (k4Var != null) {
                    p3 p3Var = (p3) k4Var;
                    p3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        p3Var.f18772a.w4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public k60 J(View view) {
        return k60.H((b2) this.f13555b, view);
    }

    @Override
    public void K(Location location) {
        gz gzVar = (gz) this.f13555b;
        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeo.geo = tL_geoPoint;
        tL_geoPoint.lat = g0.b0(location.getLatitude());
        tL_messageMediaGeo.geo._long = g0.b0(location.getLongitude());
        HashMap hashMap = gzVar.f22763n;
        for (Map.Entry entry : hashMap.entrySet()) {
            ij ijVar = (ij) entry.getValue();
            gzVar.r0(ez.d(tL_messageMediaGeo, ij.B0(ijVar.f23244k), ijVar, null, null, null, true, 0));
        }
        hashMap.clear();
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        ((li.p) this.f13555b).L(z9, i7, i10, 0L, false);
        li.p pVar = (li.p) this.f13555b;
        bg0 bg0Var = pVar.O;
        if (bg0Var != null) {
            bg0Var.h();
            pVar.O = null;
        }
    }

    @Override
    public void L1() {
        switch (this.f13554a) {
            case 12:
                x0 x0Var = (x0) this.f13555b;
                o3 o3Var = x0Var.S;
                if (o3Var != null) {
                    li.a aVar = x0Var.f18986a;
                    t3.S1(o3Var.f18738a);
                    return;
                }
                return;
            default:
                m4 m4Var = (m4) this.f13555b;
                k4 k4Var = m4Var.G;
                if (k4Var != null) {
                    li.a aVar2 = m4Var.f18986a;
                    t3.S1(((p3) k4Var).f18772a);
                    return;
                }
                return;
        }
    }

    @Override
    public int M() {
        int i7;
        gh.a Q = Q();
        gh.a S = S();
        if (Q != null) {
            i7 = Q.M();
        } else {
            i7 = 0;
        }
        if (S != null) {
            return i0.a.f(((i5) this.f13555b).f27587a, S.M(), i7);
        }
        return i7;
    }

    @Override
    public void N() {
        b2 b2Var = (b2) this.f13555b;
        b2Var.E0();
        b2Var.H0();
    }

    @Override
    public int O() {
        int i7;
        i5 i5Var = (i5) this.f13555b;
        gh.a Q = Q();
        if (Q != null && i5Var.d.b()) {
            i7 = Q.O();
        } else {
            i7 = 0;
        }
        gh.a S = S();
        if (S != null) {
            return i0.a.f(i5Var.f27587a, S.O(), i7);
        }
        return i7;
    }

    @Override
    public void O1(long j3, int i7, long j10) {
        j2.n nVar = ((t0) this.f13555b).f20300a1;
        Handler handler = (Handler) nVar.f16453b;
        if (handler != null) {
            handler.post(new b3.b(nVar, i7, j3, j10, 1));
        }
    }

    public gh.a Q() {
        s4 s4Var = ((i5) this.f13555b).d;
        if (s4Var != null) {
            return s4Var.getMenuGlassColorProvider();
        }
        return null;
    }

    public da R() {
        m8.d dVar = (m8.d) this.f13555b;
        q6.m.i("no included points", !Double.isNaN(dVar.d));
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(dVar.f19935b, dVar.d), new LatLng(dVar.f19936c, dVar.f19937e));
        ?? obj = new Object();
        obj.f21986a = latLngBounds;
        return obj;
    }

    @Override
    public int R0() {
        int i7;
        gh.a Q = Q();
        gh.a S = S();
        if (Q != null) {
            i7 = Q.R0();
        } else {
            i7 = 0;
        }
        if (S != null) {
            return i0.a.f(((i5) this.f13555b).f27587a, S.R0(), i7);
        }
        return i7;
    }

    public gh.a S() {
        s4 s4Var;
        i5 i5Var = (i5) this.f13555b;
        if (i5Var.f27587a < 1.0f && (s4Var = i5Var.d) != null) {
            return s4Var.getButtonsGlassColorProvider();
        }
        return null;
    }

    @Override
    public h9 S0() {
        switch (this.f13554a) {
            case 12:
                return (x0) this.f13555b;
            default:
                return (m4) this.f13555b;
        }
    }

    public cc.e T(ab.q r24) {
        throw new UnsupportedOperationException("Method not decompiled: g6.d0.T(ab.q):cc.e");
    }

    @Override
    public void T0(CharSequence charSequence) {
        a3 a3Var = ((m5) this.f13555b).E;
        if (a3Var != null && charSequence != null && charSequence.length() > 0) {
            a3Var.f18416a.w4(charSequence.toString());
        }
    }

    public int U() {
        return ((j0) this.f13555b).f23439c;
    }

    @Override
    public void U0(Exception exc) {
        h2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        j2.n nVar = ((t0) this.f13555b).f20300a1;
        Handler handler = (Handler) nVar.f16453b;
        if (handler != null) {
            handler.post(new n2.p(nVar, exc, 1));
        }
    }

    public LongSparseArray V(long j3, long j10) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.f13555b).get(j3);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j10);
    }

    @Override
    public li.a V0() {
        switch (this.f13554a) {
            case 12:
                return ((x0) this.f13555b).f18986a;
            default:
                return ((m4) this.f13555b).f18986a;
        }
    }

    @Override
    public void W() {
        l0 l0Var = ((t0) this.f13555b).Y;
        if (l0Var != null) {
            l0Var.f17933a.f18014i0 = true;
        }
    }

    public d0 X(cb cbVar) {
        m8.d dVar = (m8.d) this.f13555b;
        LatLng latLng = new LatLng(cbVar.f21797a, cbVar.f21798b);
        dVar.getClass();
        double d = dVar.f19935b;
        double d2 = latLng.f7696a;
        dVar.f19935b = Math.min(d, d2);
        dVar.f19936c = Math.max(dVar.f19936c, d2);
        boolean isNaN = Double.isNaN(dVar.d);
        double d10 = latLng.f7697b;
        if (isNaN) {
            dVar.d = d10;
            dVar.f19937e = d10;
            return this;
        }
        double d11 = dVar.d;
        double d12 = dVar.f19937e;
        if (d11 > d12 ? !(d11 <= d10 || d10 <= d12) : !(d11 <= d10 && d10 <= d12)) {
            if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
                dVar.d = d10;
                return this;
            }
            dVar.f19937e = d10;
        }
        return this;
    }

    @Override
    public void Y(r0 r0Var) {
        j2.n nVar = ((t0) this.f13555b).f20300a1;
        Handler handler = (Handler) nVar.f16453b;
        if (handler != null) {
            handler.post(new n2.r(nVar, r0Var, 1));
        }
    }

    public void Z(long j3, long j10, long j11, Object obj) {
        LongSparseArray longSparseArray = (LongSparseArray) this.f13555b;
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
    public boolean a(float f10) {
        boolean z9;
        int[] iArr;
        b2 b2Var = (b2) this.f13555b;
        FrameLayout frameLayout = b2Var.f18466v0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f10 >= iArr[1]) {
                z9 = true;
                b2.e0(b2Var, z9, true);
                return z9;
            }
        }
        z9 = false;
        b2.e0(b2Var, z9, true);
        return z9;
    }

    public Object a0(long j3, long j10, long j11) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = (LongSparseArray) ((LongSparseArray) this.f13555b).get(j3);
        if (longSparseArray2 == null || (longSparseArray = (LongSparseArray) longSparseArray2.get(j10)) == null) {
            return null;
        }
        Object obj = longSparseArray.get(j11);
        longSparseArray.remove(j11);
        return obj;
    }

    @Override
    public boolean a1() {
        switch (this.f13554a) {
            case 12:
                x0 x0Var = (x0) this.f13555b;
                o3 o3Var = x0Var.S;
                if (o3Var != null) {
                    li.a aVar = x0Var.f18986a;
                    if (o3Var.f18738a.V4()) {
                        return true;
                    }
                }
                return false;
            default:
                m4 m4Var = (m4) this.f13555b;
                k4 k4Var = m4Var.G;
                if (k4Var != null) {
                    li.a aVar2 = m4Var.f18986a;
                    if (((p3) k4Var).f18772a.V4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f13554a) {
            case 7:
                j6.q qVar = new j6.q(0, (TaskCompletionSource) obj2);
                j6.i iVar = (j6.i) ((j6.s) obj).n();
                Parcel P0 = iVar.P0();
                com.google.android.gms.internal.cast.t.d(P0, qVar);
                P0.writeStringArray((String[]) this.f13555b);
                iVar.U0(P0, 5);
                return;
            default:
                k7.f fVar = new k7.f(1, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
                gVar.f6538c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i7 = t7.a.f55357a;
                obtain.writeStrongBinder(fVar);
                t7.a.b(obtain, (GetCredentialRequest) this.f13555b);
                t7.a.b(obtain, gVar);
                ((k7.b) ((k7.d) ((k7.e) obj).n())).H0(obtain, 1);
                return;
        }
    }

    @Override
    public void b(g1 g1Var) {
        switch (this.f13554a) {
            case 12:
                o3 o3Var = ((x0) this.f13555b).S;
                if (o3Var != null) {
                    t3 t3Var = o3Var.f18738a;
                    t3.Q1(t3Var, g1Var);
                    t3Var.f18887o3.r(g1Var, true);
                    return;
                }
                return;
            case 13:
            default:
                a3 a3Var = ((m5) this.f13555b).E;
                if (a3Var != null) {
                    t3 t3Var2 = a3Var.f18416a;
                    t3.Q1(t3Var2, g1Var);
                    t3Var2.f18887o3.r(g1Var, true);
                    return;
                }
                return;
            case 14:
                k4 k4Var = ((m4) this.f13555b).G;
                if (k4Var != null) {
                    t3 t3Var3 = ((p3) k4Var).f18772a;
                    t3.Q1(t3Var3, g1Var);
                    t3Var3.f18887o3.r(g1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void c(int i7) {
        u2.j jVar;
        t0 t0Var = (t0) this.f13555b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = t0Var.f20302c1) != null) {
            jVar.d(i7);
        }
        j2.n nVar = t0Var.f20300a1;
        Handler handler = (Handler) nVar.f16453b;
        if (handler != null) {
            handler.post(new m0(nVar, i7, 15));
        }
    }

    @Override
    public void c0(qg qgVar) {
        qs.f(kg.m.f0((kg.m) this.f13555b)).d(qgVar);
    }

    @Override
    public void c1() {
        ((t0) this.f13555b).f20309j1 = true;
    }

    @Override
    public void close() {
        ((ii.s) this.f13555b).finishFragment();
    }

    @Override
    public void d(s3 s3Var, View view) {
        b2 b2Var = (b2) this.f13555b;
        k60 H = k60.H(b2Var, view);
        H.Q = true;
        b2Var.getParentActivity();
        b2Var.getResourceProvider();
        b2Var.f18470x0 = h4.b(H, b2Var, s3Var, false);
    }

    @Override
    public void d1(int i7, int i10) {
        switch (this.f13554a) {
            case 12:
                x0 x0Var = (x0) this.f13555b;
                o3 o3Var = x0Var.S;
                if (o3Var != null) {
                    li.a aVar = x0Var.f18986a;
                    f2 f2Var = o3Var.f18738a.Q3;
                    if (f2Var != null) {
                        f2Var.f(i7, i10);
                        return;
                    }
                    return;
                }
                return;
            default:
                m4 m4Var = (m4) this.f13555b;
                k4 k4Var = m4Var.G;
                if (k4Var != null) {
                    li.a aVar2 = m4Var.f18986a;
                    f2 f2Var2 = ((p3) k4Var).f18772a.Q3;
                    if (f2Var2 != null) {
                        f2Var2.f(i7, i10);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void e(long j3) {
        t0 t0Var = (t0) this.f13555b;
        t0Var.f20311m1 = true;
        j2.n nVar = t0Var.f20300a1;
        Handler handler = (Handler) nVar.f16453b;
        if (handler != null) {
            handler.post(new bi.r3(nVar, j3, 15));
        }
    }

    @Override
    public int e1() {
        int i7;
        s4 s4Var;
        i5 i5Var = (i5) this.f13555b;
        gh.a Q = Q();
        if (Q != null) {
            i7 = Q.e1();
        } else {
            i7 = 0;
        }
        if (i5Var.f27587a < 1.0f && (s4Var = i5Var.d) != null) {
            return i0.a.f(i5Var.f27587a, s4Var.getButtonsGlassBackgroundColor(), i7);
        }
        return i7;
    }

    @Override
    public void f(boolean z9) {
        j2.n nVar = ((t0) this.f13555b).f20300a1;
        Handler handler = (Handler) nVar.f16453b;
        if (handler != null) {
            handler.post(new k1(12, nVar, z9));
        }
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public void f1(Editable editable) {
        m5 m5Var = (m5) this.f13555b;
        li.a aVar = m5Var.f18986a;
        if (aVar != null) {
            aVar.f18404s = true;
            aVar.f18403r = m5Var.f18706r.f18590k2;
        }
        m5Var.w();
        a3 a3Var = m5Var.E;
        if (a3Var != null && m5Var.f18986a != null) {
            a3Var.a();
        }
    }

    @Override
    public void g(int i7) {
        ((b2) this.f13555b).t0(74, i7);
    }

    @Override
    public Object mo24get() {
        o9.g firebaseApp = (o9.g) ((d9.o) this.f13555b).f8253a;
        kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
        q0 q0Var = q0.f13744a;
        return q0.a(firebaseApp);
    }

    @Override
    public CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        vs vsVar = (vs) this.f13555b;
        sb2.append((Object) vsVar.f28930a.getText());
        sb2.append(" ");
        sb2.append((Object) vsVar.f28931b.getText());
        return sb2.toString();
    }

    @Override
    public void h() {
        int i7;
        b2 b2Var = (b2) this.f13555b;
        g3 g3Var = b2Var.P.f18898u3;
        if (g3Var != null && g3Var.x() && b2Var.P.F4()) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        b2Var.C0(i7, true);
        b2Var.D0();
        b2Var.B0();
    }

    @Override
    public void i(r0 r0Var) {
        j2.n nVar = ((t0) this.f13555b).f20300a1;
        Handler handler = (Handler) nVar.f16453b;
        if (handler != null) {
            handler.post(new n2.r(nVar, r0Var, 0));
        }
    }

    @Override
    public void i1() {
        switch (this.f13554a) {
            case 12:
                x0 x0Var = (x0) this.f13555b;
                o3 o3Var = x0Var.S;
                if (o3Var != null) {
                    li.a aVar = x0Var.f18986a;
                    t3 t3Var = o3Var.f18738a;
                    f2 f2Var = t3Var.Q3;
                    if (f2Var != null) {
                        f2Var.g();
                    }
                    t3Var.f18887o3.onContentChanged();
                    return;
                }
                return;
            default:
                m4 m4Var = (m4) this.f13555b;
                k4 k4Var = m4Var.G;
                if (k4Var != null) {
                    li.a aVar2 = m4Var.f18986a;
                    t3 t3Var2 = ((p3) k4Var).f18772a;
                    f2 f2Var2 = t3Var2.Q3;
                    if (f2Var2 != null) {
                        f2Var2.g();
                    }
                    t3Var2.f18887o3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public Object j(Object obj, Object obj2) {
        return ((g9.k) this.f13555b).apply(obj2);
    }

    @Override
    public float j0() {
        float f10;
        float f11;
        i5 i5Var = (i5) this.f13555b;
        gh.a Q = Q();
        gh.a S = S();
        if (Q != null) {
            f10 = Q.j0();
        } else {
            f10 = -1.0f;
        }
        if (S != null) {
            f11 = S.j0();
        } else {
            f11 = f10;
        }
        if (f11 >= 0.0f && f10 >= 0.0f) {
            return g0.T1(f11, f10, i5Var.f27587a);
        }
        if (i5Var.f27587a < 0.5f) {
            return f11;
        }
        return f10;
    }

    @Override
    public void k(long j3) {
        ((ii.s) this.f13555b).presentFragment(an.ra(j3));
    }

    @Override
    public void l(boolean z9, float f10) {
        float c10;
        vs vsVar = (vs) this.f13555b;
        if (f10 <= 0.25f) {
            c10 = com.google.android.recaptcha.internal.a.c(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                c10 = com.google.android.recaptcha.internal.a.c(f11, 0.25f, 9437184.0f, 1048576);
            } else {
                float f12 = f11 - 0.25f;
                if (f12 <= 0.25f) {
                    c10 = com.google.android.recaptcha.internal.a.c(f12, 0.25f, 9.437184E7f, 10485760);
                } else {
                    c10 = com.google.android.recaptcha.internal.a.c(f12 - 0.25f, 0.25f, (float) (2097152000 - 104857600), 104857600);
                }
            }
        }
        int i7 = (int) c10;
        long j3 = i7;
        boolean z10 = true;
        vsVar.f28931b.setText(hd.a0("AutodownloadSizeLimitUpTo", null, 2131753772, g0.i0(j3, false, false)));
        vsVar.d = j3;
        r8[] r8VarArr = vsVar.h;
        AnimatorSet[] animatorSetArr = vsVar.f50820n;
        if (vsVar.f50818e == DataAutoDownloadActivity.o0(vsVar.f50821r)) {
            vsVar.f50819f.setText(hd.a0("AutoDownloadPreloadVideoInfo", null, 2131753810, g0.i0(j3, false, false)));
            if (i7 <= 2097152) {
                z10 = false;
            }
            if (z10 != r8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                r8VarArr[0].e(arrayList, z10);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new va(vsVar, 22));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override
    public void l0(g1 g1Var, int i7, int i10) {
        a3 a3Var;
        i9 textSelectionHelper;
        m5 m5Var = (m5) this.f13555b;
        if (!m5Var.G && i7 != i10 && (a3Var = m5Var.E) != null && (textSelectionHelper = a3Var.f18416a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != m5Var) {
                m5Var.post(new j4(this, g1Var, i10, textSelectionHelper, i7, 4));
            }
        }
    }

    @Override
    public boolean l1(boolean z9) {
        return false;
    }

    @Override
    public boolean m() {
        m5 m5Var = (m5) this.f13555b;
        a3 a3Var = m5Var.E;
        if (a3Var != null && m5Var.f18986a != null) {
            return a3Var.f18416a.V4();
        }
        return false;
    }

    @Override
    public void n(li.a aVar) {
        b2 b2Var = (b2) this.f13555b;
        if (aVar != null && (aVar.f18389b instanceof TL_iv.pageBlockMap) && g0.J1(b2Var)) {
            di diVar = new di(b2Var.getParentActivity(), b2Var, false, false, false, b2Var.getResourceProvider());
            diVar.T3 = new qb.a(13);
            diVar.G1 = true;
            diVar.f32981r3.setVisibility(8);
            diVar.f32978q4 = new a3.h(b2Var, aVar, diVar, 15);
            diVar.e1();
            diVar.show();
        }
    }

    @Override
    public void o(a6 a6Var, String str) {
        b2 b2Var = (b2) this.f13555b;
        if (b2Var.f18473z0 == null) {
            b2Var.f18473z0 = new ga.d(new l2.y(this, 6), b2Var.getResourceProvider());
        }
        b2Var.f18473z0.k(a6Var, str);
    }

    @Override
    public float o0() {
        float f10;
        float f11;
        i5 i5Var = (i5) this.f13555b;
        gh.a Q = Q();
        gh.a S = S();
        if (Q != null) {
            f10 = Q.o0();
        } else {
            f10 = -1.0f;
        }
        if (S != null) {
            f11 = S.o0();
        } else {
            f11 = f10;
        }
        if (f11 >= 0.0f && f10 >= 0.0f) {
            return g0.T1(f11, f10, i5Var.f27587a);
        }
        if (i5Var.f27587a < 0.5f) {
            return f11;
        }
        return f10;
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f13554a) {
            case 0:
                c.h((c) ((j) this.f13555b).f13564c, "joinApplication", task);
                return;
            default:
                ((CountDownLatch) this.f13555b).countDown();
                return;
        }
    }

    @Override
    public void onContentChanged() {
        b2 b2Var = (b2) this.f13555b;
        if (b2Var.f18472y0 != null) {
            boolean p32 = b2Var.P.p3();
            b2Var.L0 = p32;
            b2Var.f18472y0.f(p32);
            b2Var.f18472y0.invalidate();
        }
        b2Var.H0();
        Runnable runnable = b2Var.M0;
        g0.r(runnable);
        g0.i3(runnable, 1000L);
    }

    @Override
    public void p(Bitmap bitmap) {
        j6.b bVar = i6.h.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f10 = width;
            int height = bitmap.getHeight();
            int f11 = (int) p0.f(f10, 9.0f, 16.0f, 0.5f);
            float f12 = (f11 - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f12, f10, height + f12);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, f11, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((i6.h) this.f13555b).e(bitmap2, 0);
    }

    @Override
    public void q() {
        b2 b2Var = (b2) this.f13555b;
        b2Var.I0 = b2Var.K0;
        b2.e0(b2Var, false, false);
        b2Var.C0(2, true);
    }

    @Override
    public int q0() {
        return 0;
    }

    @Override
    public boolean s(g1 g1Var) {
        return false;
    }

    @Override
    public void t() {
        switch (this.f13554a) {
            case 12:
                x0 x0Var = (x0) this.f13555b;
                o3 o3Var = x0Var.S;
                if (o3Var != null) {
                    t3.T1(o3Var.f18738a, x0Var.f18986a);
                    return;
                }
                return;
            default:
                m4 m4Var = (m4) this.f13555b;
                k4 k4Var = m4Var.G;
                if (k4Var != null) {
                    t3.T1(((p3) k4Var).f18772a, m4Var.f18986a);
                    return;
                }
                return;
        }
    }

    @Override
    public void t1() {
        l0 l0Var = ((t0) this.f13555b).Y;
        if (l0Var != null) {
            l0Var.a();
        }
    }

    @Override
    public void u() {
        boolean z9;
        ii.s sVar = (ii.s) this.f13555b;
        te.a aVar = sVar.f15594a;
        ii.l0 l0Var = sVar.f15602w;
        if (l0Var.f15569n && l0Var.f15567l == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        aVar.a(z9, true);
        sVar.d.f37160f3.O(true);
    }

    @Override
    public void v(String str, long j3, long j10, long j11) {
        h6.o oVar = (h6.o) this.f13555b;
        try {
            oVar.a(new h6.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e10) {
            j6.b bVar = h6.h.f14246k;
            Log.e(bVar.f16505a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e10);
        }
        Iterator it = oVar.f14270q.f14253i.iterator();
        while (it.hasNext()) {
            ((h6.g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    @Override
    public float v0() {
        float f10;
        gh.a Q = Q();
        gh.a S = S();
        if (Q != null) {
            f10 = Q.v0();
        } else {
            f10 = 0.0f;
        }
        if (S != null) {
            return g0.T1(S.v0(), f10, ((i5) this.f13555b).f27587a);
        }
        return f10;
    }

    @Override
    public void w(int i7, int i10) {
        f2 f2Var;
        m5 m5Var = (m5) this.f13555b;
        a3 a3Var = m5Var.E;
        if (a3Var != null && m5Var.f18986a != null && (f2Var = a3Var.f18416a.Q3) != null) {
            f2Var.f(i7, i10);
        }
    }

    @Override
    public i9 w0() {
        switch (this.f13554a) {
            case 12:
                o3 o3Var = ((x0) this.f13555b).S;
                if (o3Var == null) {
                    return null;
                }
                return o3Var.f18738a.getTextSelectionHelper();
            default:
                k4 k4Var = ((m4) this.f13555b).G;
                if (k4Var != null) {
                    return ((p3) k4Var).f18772a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public void z(q3 q3Var, View view) {
        b2 b2Var = (b2) this.f13555b;
        k60 H = k60.H(b2Var, view);
        H.Q = true;
        b2Var.f18470x0 = h4.c(H, b2Var, b2Var.getParentActivity(), b2Var.getResourceProvider(), q3Var, false);
    }

    public d0(j6.r rVar, String[] strArr) {
        this.f13554a = 7;
        this.f13555b = strArr;
    }

    public d0(Object obj, int i7) {
        this.f13554a = i7;
        this.f13555b = obj;
    }

    public d0(int i7) {
        this.f13554a = i7;
        switch (i7) {
            case 17:
                this.f13555b = new AtomicInteger(0);
                return;
            case 24:
                this.f13555b = new LongSparseArray();
                return;
            default:
                this.f13555b = new cb.c(ec.a.h, 21);
                return;
        }
    }

    public d0(String str, int i7) {
        this.f13554a = 22;
        this.f13555b = new j0(str, i7);
    }

    public d0(String str, String str2) {
        this.f13554a = 23;
        this.f13555b = new n0(str, str2);
    }

    @Override
    public void D() {
    }

    @Override
    public void F0() {
    }

    @Override
    public void r0() {
    }

    @Override
    public void t0() {
    }

    @Override
    public void x() {
    }

    @Override
    public void B(int i7) {
    }

    @Override
    public void F(g1 g1Var) {
    }

    @Override
    public void M0(Object obj) {
    }

    @Override
    public void P(int i7) {
    }

    @Override
    public void Y0(TLRPC.User user) {
    }

    @Override
    public void y(int i7) {
    }

    @Override
    public void r(g1 g1Var, boolean z9) {
    }

    @Override
    public void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
    }

    @Override
    public void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }
}
