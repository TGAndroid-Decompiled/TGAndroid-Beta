package a4;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Parcel;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.biometric.p;
import androidx.lifecycle.a0;
import c6.o;
import ci.b7;
import ci.g0;
import ci.i0;
import ci.rc;
import ci.z6;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.d0;
import e2.v;
import ei.w4;
import fb.n;
import gg.a2;
import ii.a1;
import ii.c3;
import ii.g5;
import ii.h1;
import ii.i1;
import ii.i2;
import ii.i5;
import ii.p2;
import ii.s3;
import ii.x3;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.regex.Pattern;
import l.w;
import m.t3;
import n7.m1;
import n7.n1;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.l81;
import r0.b0;
import r0.k1;
import v7.k8;
import z3.m;
public final class l implements z3.d, a0, androidx.activity.result.b, s, lg.e, i81, k0, v0, OnCompleteListener, n, r0.n, db.n, a2, m, ii.k0, h1, y2.m, w {
    public final int f296a;
    public final Object f297b;

    public l(a6.i iVar) {
        this.f296a = 6;
        this.f297b = (r) iVar.f326b;
    }

    @Override
    public void A(CharSequence charSequence) {
        s3 s3Var = ((a1) this.f297b).S;
        if (s3Var != null) {
            s3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                s3Var.f12677a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public n9 C() {
        return (a1) this.f297b;
    }

    @Override
    public void F() {
        m0 m0Var = (m0) this.f297b;
        for (com.google.android.gms.common.api.c cVar : m0Var.f6637f.values()) {
            cVar.disconnect();
        }
        m0Var.f6644o.F = Collections.EMPTY_SET;
    }

    @Override
    public ii.a G() {
        return ((a1) this.f297b).f12250a;
    }

    @Override
    public boolean H() {
        a1 a1Var = (a1) this.f297b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.f12250a;
            if (s3Var.f12677a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void I(int i10, int i11) {
        a1 a1Var = (a1) this.f297b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.f12250a;
            i2 i2Var = s3Var.f12677a.H3;
            if (i2Var != null) {
                i2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void I0() {
        ((i0) this.f297b).f5183f.k();
    }

    @Override
    public boolean J() {
        return true;
    }

    @Override
    public void K() {
        ((i0) this.f297b).f5183f.o();
    }

    @Override
    public void K0(float f7) {
        ((i0) this.f297b).f5183f.setRotation(f7);
    }

    @Override
    public void L(Editable editable) {
        ((i5) this.f297b).h();
    }

    @Override
    public void M() {
        a1 a1Var = (a1) this.f297b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.f12250a;
            x3 x3Var = s3Var.f12677a;
            i2 i2Var = x3Var.H3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.f12808f3.onContentChanged();
        }
    }

    @Override
    public k1 M0(View view, k1 k1Var) {
        boolean z10;
        k1 k1Var2;
        int b10;
        int c10;
        boolean z11;
        int color;
        int d = k1Var.d();
        g.r rVar = (g.r) this.f297b;
        Context context = rVar.f10170e;
        int d10 = k1Var.d();
        ActionBarContextView actionBarContextView = rVar.f10188y;
        int i10 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rVar.f10188y.getLayoutParams();
            boolean z12 = true;
            if (rVar.f10188y.isShown()) {
                if (rVar.f10179l0 == null) {
                    rVar.f10179l0 = new Rect();
                    rVar.m0 = new Rect();
                }
                Rect rect = rVar.f10179l0;
                Rect rect2 = rVar.m0;
                rect.set(k1Var.b(), k1Var.d(), k1Var.c(), k1Var.a());
                ViewGroup viewGroup = rVar.J;
                Method method = t3.f15885a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e7) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e7);
                    }
                }
                int i11 = rect.top;
                int i12 = rect.left;
                int i13 = rect.right;
                ViewGroup viewGroup2 = rVar.J;
                WeakHashMap weakHashMap = r0.i0.f46890a;
                k1 a2 = b0.a(viewGroup2);
                if (a2 == null) {
                    b10 = 0;
                } else {
                    b10 = a2.b();
                }
                if (a2 == null) {
                    c10 = 0;
                } else {
                    c10 = a2.c();
                }
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                if (i11 > 0 && rVar.L == null) {
                    View view2 = new View(context);
                    rVar.L = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    rVar.J.addView(rVar.L, -1, layoutParams);
                } else {
                    View view3 = rVar.L;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            rVar.L.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = rVar.L;
                if (view4 == null) {
                    z12 = false;
                }
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = rVar.L;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(2131099654);
                    } else {
                        color = context.getColor(2131099653);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!rVar.Q && z12) {
                    d10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                rVar.f10188y.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view6 = rVar.L;
        if (view6 != null) {
            if (z10) {
                i10 = 0;
            }
            view6.setVisibility(i10);
        }
        if (d != d10) {
            k1Var2 = k1Var.f(k1Var.b(), d10, k1Var.c(), k1Var.a());
        } else {
            k1Var2 = k1Var;
        }
        return r0.i0.g(view, k1Var2);
    }

    @Override
    public boolean N(boolean z10) {
        return false;
    }

    @Override
    public int O() {
        return 2;
    }

    @Override
    public void P(byte[] bArr, int i10, int i11, z3.l lVar, e2.h hVar) {
        boolean z10;
        d2.b a2;
        boolean z11;
        v vVar = (v) this.f297b;
        vVar.H(i10 + i11, bArr);
        vVar.J(i10);
        ArrayList arrayList = new ArrayList();
        while (vVar.a() > 0) {
            if (vVar.a() >= 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.a("Incomplete Mp4Webvtt Top Level box header found.", z10);
            int j3 = vVar.j();
            if (vVar.j() == 1987343459) {
                int i12 = j3 - 8;
                CharSequence charSequence = null;
                d2.a aVar = null;
                while (i12 > 0) {
                    if (i12 >= 8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    e2.d.a("Incomplete vtt cue box header found.", z11);
                    int j10 = vVar.j();
                    int j11 = vVar.j();
                    int i13 = j10 - 8;
                    byte[] bArr2 = vVar.f8583a;
                    int i14 = vVar.f8584b;
                    String str = d0.f8531a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    vVar.K(i13);
                    i12 = (i12 - 8) - i13;
                    if (j11 == 1937011815) {
                        i4.g gVar = new i4.g();
                        i4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (j11 == 1885436268) {
                        charSequence = i4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.f8048a = charSequence;
                    aVar.f8049b = null;
                    a2 = aVar.a();
                } else {
                    Pattern pattern = i4.h.f12004a;
                    i4.g gVar2 = new i4.g();
                    gVar2.f11997c = charSequence;
                    a2 = gVar2.a().a();
                }
                arrayList.add(a2);
            } else {
                vVar.K(j3 - 8);
            }
        }
        hVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override
    public void Q() {
        a1 a1Var = (a1) this.f297b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.f12250a;
            x3.P1(s3Var.f12677a);
        }
    }

    @Override
    public com.google.android.gms.common.api.internal.e R(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public o S() {
        o oVar = (o) this.f297b;
        if (oVar.f4398a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.f4401e)) {
                if (!Double.isNaN(oVar.f4402f) && oVar.f4402f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public String T(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            ka.d dVar = (ka.d) this.f297b;
            ka.e eVar = new ka.e(stringWriter, dVar.f14770a, dVar.f14771b, dVar.f14772c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f14774b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public da.b U(JSONObject jSONObject) {
        da.d aVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            aVar = new na.d(7);
        } else {
            aVar = new ob.a(7);
        }
        return aVar.D((rb.a) this.f297b, jSONObject);
    }

    @Override
    public a0.i V() {
        return null;
    }

    @Override
    public void W(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        p pVar = (p) this.f297b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.f2317l0.d(null);
        }
    }

    public db.i X(Object obj) {
        db.g gVar = ((gb.a0) this.f297b).f10434b;
        gVar.getClass();
        if (obj == null) {
            return db.k.f8262a;
        }
        Class<?> cls = obj.getClass();
        gb.n nVar = new gb.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    @Override
    public void a() {
        l2.h hVar = (l2.h) this.f297b;
        hVar.A.a();
        z4 z4Var = hVar.C;
        if (z4Var == null) {
            return;
        }
        throw z4Var;
    }

    @Override
    public void a0() {
        ((i0) this.f297b).f5183f.f15611a.g(1, true);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i10 = this.f296a;
        Object obj3 = this.f297b;
        switch (i10) {
            case 4:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                n1 n1Var = (n1) ((m1) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(n1Var.f16869b);
                int i11 = n7.j.f16847a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                ((c7.v) obj3).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    n1Var.f16868a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            default:
                h7.f fVar = new h7.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i12 = q7.a.f46109a;
                obtain3.writeStrongBinder(fVar);
                q7.a.b(obtain3, (g7.f) obj3);
                q7.a.b(obtain3, gVar);
                ((h7.b) ((h7.d) ((h7.e) obj).u())).F0(obtain3, 6);
                return;
        }
    }

    @Override
    public void c(i1 i1Var) {
        switch (this.f296a) {
            case 22:
                s3 s3Var = ((a1) this.f297b).S;
                if (s3Var != null) {
                    x3 x3Var = s3Var.f12677a;
                    x3.N1(x3Var, i1Var);
                    x3Var.f12808f3.x(i1Var, true);
                    return;
                }
                return;
            default:
                g5 g5Var = ((i5) this.f297b).f12494s;
                if (g5Var != null) {
                    x3 x3Var2 = ((c3) g5Var).f12310a;
                    x3.N1(x3Var2, i1Var);
                    x3Var2.f12808f3.x(i1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void d(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).f15250z.k().c(false);
        }
        w wVar = ((m.h) this.f297b).f15744e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public a0.i d0() {
        return null;
    }

    @Override
    public int e(long j3) {
        if (j3 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void g() {
        a1 a1Var = (a1) this.f297b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            x3.Q1(s3Var.f12677a, a1Var.f12250a);
        }
    }

    @Override
    public void h(int i10) {
        AndroidUtilities.runOnUIThread(new rc(this, 21));
    }

    @Override
    public boolean i0() {
        i0 i0Var = (i0) this.f297b;
        g0 g0Var = i0Var.f5183f;
        boolean m10 = g0Var.m(-90.0f);
        g0Var.i();
        i0Var.d.invalidate();
        return m10;
    }

    @Override
    public void j(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.f297b;
        androidx.fragment.app.g0 g0Var = (androidx.fragment.app.g0) k0Var.F.pollLast();
        if (g0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = g0Var.f2688a;
        int i10 = g0Var.f2689b;
        androidx.fragment.app.s l4 = k0Var.f2699c.l(str);
        if (l4 == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            return;
        }
        l4.x(i10, aVar.f2160a, aVar.f2161b);
    }

    @Override
    public void k(i1 i1Var) {
        ii.a aVar;
        i5 i5Var = (i5) this.f297b;
        g5 g5Var = i5Var.f12494s;
        if (g5Var != null && (aVar = i5Var.f12250a) != null) {
            x3 x3Var = ((c3) g5Var).f12310a;
            ArrayList arrayList = x3Var.j3;
            long j3 = aVar.f12249t;
            if (j3 != 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((ii.a) arrayList.get(i11)).f12240k.contains(Long.valueOf(j3))) {
                        i10 = i11;
                    }
                }
                if (i10 >= 0) {
                    i2 i2Var = x3Var.H3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    ii.a aVar2 = new ii.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f12240k;
                    ArrayList arrayList3 = aVar2.f12240k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        a1.g.y(1, arrayList3);
                    }
                    arrayList.add(i10 + 1, aVar2);
                    x3Var.t4();
                    x3Var.W2.N(false);
                    i2 i2Var2 = x3Var.H3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    x3Var.post(new p2(x3Var, aVar2, 26));
                }
            }
        }
    }

    @Override
    public long l(int i10) {
        boolean z10;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        return 0L;
    }

    @Override
    public boolean m(i1 i1Var) {
        return false;
    }

    @Override
    public void n() {
        m0 m0Var = (m0) this.f297b;
        m0Var.f6633a.lock();
        try {
            m0Var.f6642m = new com.google.android.gms.common.api.internal.g0(m0Var, m0Var.f6639j, m0Var.f6640k, m0Var.d, m0Var.f6641l, m0Var.f6633a, m0Var.f6635c);
            m0Var.f6642m.F();
            m0Var.f6634b.signalAll();
        } finally {
            m0Var.f6633a.unlock();
        }
    }

    @Override
    public void o(k6.a aVar) {
        x xVar = (x) this.f297b;
        xVar.f6710o.lock();
        try {
            xVar.f6708m = aVar;
            x.l(xVar);
        } finally {
            xVar.f6710o.unlock();
        }
    }

    @Override
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.f297b).f8196c, "launchApplication", task);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        b7 b7Var = (b7) this.f297b;
        z6 z6Var = b7Var.L;
        AndroidUtilities.cancelRunOnUIThread(z6Var);
        l81 l81Var = b7Var.f4788y;
        if (l81Var != null && l81Var.y()) {
            AndroidUtilities.runOnUIThread(z6Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((b7) this.f297b).i();
    }

    @Override
    public List p(long j3) {
        if (j3 >= 0) {
            return (List) this.f297b;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public boolean q() {
        i0 i0Var = (i0) this.f297b;
        i0Var.d.invalidate();
        return i0Var.f5183f.j();
    }

    @Override
    public boolean r(i1 i1Var) {
        return false;
    }

    @Override
    public void s(int i10) {
        x xVar = (x) this.f297b;
        Lock lock = xVar.f6710o;
        lock.lock();
        try {
            if (xVar.f6709n) {
                xVar.f6709n = false;
                x.k(xVar, i10);
            } else {
                xVar.f6709n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public boolean s0(int i10) {
        return true;
    }

    @Override
    public z3.d t(int i10, int i11, byte[] bArr) {
        return sc.v.a(this, bArr, i11);
    }

    @Override
    public boolean v(l.k kVar) {
        m.h hVar = (m.h) this.f297b;
        if (kVar == hVar.f15743c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        w wVar = hVar.f15744e;
        if (wVar == null) {
            return false;
        }
        return wVar.v(kVar);
    }

    @Override
    public Object v2() {
        Constructor constructor = (Constructor) this.f297b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e7) {
            k8 k8Var = ib.c.f12091a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e11.getCause());
        }
    }

    @Override
    public int w() {
        return 1;
    }

    @Override
    public void x(i1 i1Var, int i10, int i11) {
        g5 g5Var;
        o9 textSelectionHelper;
        i5 i5Var = (i5) this.f297b;
        if (!i5Var.f12495w && i10 != i11 && (g5Var = i5Var.f12494s) != null && (textSelectionHelper = ((c3) g5Var).f12310a.getTextSelectionHelper()) != null) {
            i1Var.post(new w4(this, i1Var, i11, textSelectionHelper, i10, 3));
        }
    }

    @Override
    public o9 y() {
        s3 s3Var = ((a1) this.f297b).S;
        if (s3Var == null) {
            return null;
        }
        return s3Var.f12677a.getTextSelectionHelper();
    }

    @Override
    public void z(Bundle bundle) {
        x xVar = (x) this.f297b;
        xVar.f6710o.lock();
        try {
            xVar.f6708m = k6.a.f14694e;
            x.l(xVar);
        } finally {
            xVar.f6710o.unlock();
        }
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public l(b7.a aVar, c7.v vVar) {
        this.f296a = 4;
        this.f297b = vVar;
    }

    public l(Object obj, int i10) {
        this.f296a = i10;
        this.f297b = obj;
    }

    public l(MediaInfo mediaInfo) {
        this.f296a = 7;
        o oVar = new o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f297b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public l(JSONObject jSONObject) {
        this.f296a = 7;
        this.f297b = new o(jSONObject);
    }

    public l() {
        this.f296a = 21;
        this.f297b = new v();
    }

    @Override
    public void reset() {
    }

    @Override
    public void u() {
    }

    @Override
    public void D(int i10) {
    }

    @Override
    public void E(CharSequence charSequence) {
    }

    @Override
    public void b(Bundle bundle) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void x0(ArrayList arrayList) {
    }

    @Override
    public void i(int i10, int i11) {
    }

    @Override
    public void onError(l81 l81Var, Exception exc) {
    }

    @Override
    public void B(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
