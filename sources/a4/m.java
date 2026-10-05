package a4;

import ai.q5;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.c0;
import androidx.fragment.app.g0;
import androidx.lifecycle.a0;
import b2.s0;
import c7.v;
import ci.ac;
import ci.b7;
import ci.d0;
import ci.e0;
import ci.j0;
import ci.j6;
import ci.k8;
import ci.kc;
import ci.mb;
import ci.oc;
import ci.yb;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import fb.n;
import ii.f6;
import ii.i1;
import ii.i2;
import ii.k0;
import ii.k3;
import ii.k4;
import ii.n4;
import ii.q3;
import ii.r3;
import ii.u3;
import ii.v3;
import ii.w3;
import ii.w4;
import ii.x3;
import ii.z;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import lg.o;
import m.e2;
import m.p3;
import m.s3;
import n7.m1;
import n7.n1;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.q;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.q20;
import qg.b2;
import r0.i0;
import r0.l1;
import u2.t;
import w7.z8;
public final class m implements z3.d, a0, androidx.activity.result.b, s, o, oc, OnCompleteListener, yv0, n, r0.n, db.n, k0, v3, e2, y2.g, le.d, l.i, l2.i {
    public final int f296a;
    public Object f297b;

    public m() {
        this.f296a = 19;
    }

    @Override
    public void A(float f7) {
        b7 b7Var = (b7) this.f297b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.f5349s0 = f7;
        k8Var.f5331j = true;
        b7Var.y(true);
    }

    public JSONObject A0() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f297b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(w9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e7) {
                        e = e7;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        w9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    w9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            w9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            w9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override
    public void B() {
        ii.e2 e2Var = (ii.e2) this.f297b;
        e2Var.I0 = e2Var.K0;
        ii.e2.Y(e2Var, false, false);
        e2Var.x0(2, true);
    }

    public db.i B0(Object obj) {
        db.g gVar = ((gb.a0) this.f297b).f10363b;
        gVar.getClass();
        if (obj == null) {
            return db.k.f8211a;
        }
        Class<?> cls = obj.getClass();
        gb.n nVar = new gb.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    @Override
    public void C(boolean z10) {
        b7 b7Var = (b7) this.f297b;
        if (b7Var.j()) {
            b7Var.E.getClass();
        }
        b7Var.x(-4, z10);
    }

    @Override
    public void D(ii.a aVar) {
        ii.e2 e2Var = (ii.e2) this.f297b;
        if (aVar != null && (aVar.f12187b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(e2Var)) {
            xi xiVar = new xi(e2Var.getParentActivity(), e2Var, false, false, false, e2Var.getResourceProvider());
            xiVar.Z1 = new qb.b(11);
            xiVar.P = true;
            xiVar.f32968x1.setVisibility(8);
            xiVar.f32955t2 = new q5(e2Var, aVar, xiVar, 11);
            xiVar.q1();
            xiVar.show();
        }
    }

    @Override
    public void E(boolean z10) {
        di.k kVar = (di.k) this.f297b;
        le.b bVar = kVar.W;
        if (bVar != null) {
            bVar.a(z10, true);
        }
        q20 q20Var = kVar.f39955s;
        if (q20Var != null) {
            q20Var.invalidate();
        }
    }

    @Override
    public void F() {
        ((j0) this.f297b).d.invalidate();
    }

    @Override
    public int G() {
        return 1;
    }

    @Override
    public long H(long j3, long j10) {
        return 0L;
    }

    @Override
    public void I(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.f297b;
        k8 k8Var = b7Var.d;
        if (k8Var != null && (arrayList = k8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((k8) b7Var.d.T.get(i10)).P = f7;
        }
    }

    @Override
    public q9 J() {
        switch (this.f296a) {
            case 21:
                r3 r3Var = ((z) this.f297b).O;
                if (r3Var != null) {
                    return r3Var.f12615a.getTextSelectionHelper();
                }
                return null;
            default:
                q3 q3Var = ((w4) this.f297b).N;
                if (q3Var != null) {
                    return q3Var.f12589a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override
    public void L(float f7) {
        b7 b7Var = (b7) this.f297b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.P = f7;
        b7Var.c();
    }

    @Override
    public boolean M(l.k kVar, MenuItem menuItem) {
        m.k kVar2 = ((ActionMenuView) this.f297b).P;
        if (kVar2 != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((k2.e) kVar2).f14389b).W.d).iterator();
            while (it.hasNext()) {
                if (((c0) it.next()).f2595a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public void N(CharSequence charSequence) {
        switch (this.f296a) {
            case 21:
                r3 r3Var = ((z) this.f297b).O;
                if (r3Var != null) {
                    r3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        r3Var.f12615a.u4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
            default:
                q3 q3Var = ((w4) this.f297b).N;
                if (q3Var != null) {
                    q3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        q3Var.f12589a.u4(charSequence.toString());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void O(float f7, boolean z10) {
        b7 b7Var = (b7) this.f297b;
        k8 k8Var = b7Var.d;
        if (k8Var != null) {
            k8Var.Z = f7;
            k8Var.f5331j = true;
            e81 e81Var = b7Var.f4745e;
            if (e81Var != null && e81Var.p() != -9223372036854775807L) {
                b7Var.m(f7 * ((float) b7Var.f4745e.p()));
            }
        }
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        boolean z10;
        l1 l1Var2;
        int b10;
        int c10;
        boolean z11;
        int c11;
        int d = l1Var.d();
        g.s sVar = (g.s) this.f297b;
        Context context = sVar.f10101e;
        int d10 = l1Var.d();
        ActionBarContextView actionBarContextView = sVar.f10119y;
        int i10 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f10119y.getLayoutParams();
            boolean z12 = true;
            if (sVar.f10119y.isShown()) {
                if (sVar.f10110l0 == null) {
                    sVar.f10110l0 = new Rect();
                    sVar.m0 = new Rect();
                }
                Rect rect = sVar.f10110l0;
                Rect rect2 = sVar.m0;
                rect.set(l1Var.b(), l1Var.d(), l1Var.c(), l1Var.a());
                ViewGroup viewGroup = sVar.J;
                Method method = s3.f15890a;
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
                l1 f7 = i0.f(sVar.J);
                if (f7 == null) {
                    b10 = 0;
                } else {
                    b10 = f7.b();
                }
                if (f7 == null) {
                    c10 = 0;
                } else {
                    c10 = f7.c();
                }
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                if (i11 > 0 && sVar.L == null) {
                    View view2 = new View(context);
                    sVar.L = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    sVar.J.addView(sVar.L, -1, layoutParams);
                } else {
                    View view3 = sVar.L;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            sVar.L.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = sVar.L;
                if (view4 == null) {
                    z12 = false;
                }
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = sVar.L;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        c11 = f0.e.c(context, 2131099654);
                    } else {
                        c11 = f0.e.c(context, 2131099653);
                    }
                    view5.setBackgroundColor(c11);
                }
                if (!sVar.Q && z12) {
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
                sVar.f10119y.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view6 = sVar.L;
        if (view6 != null) {
            if (z10) {
                i10 = 0;
            }
            view6.setVisibility(i10);
        }
        if (d != d10) {
            l1Var2 = l1Var.f(l1Var.b(), d10, l1Var.c(), l1Var.a());
        } else {
            l1Var2 = l1Var;
        }
        return i0.h(view, l1Var2);
    }

    @Override
    public p9 R() {
        switch (this.f296a) {
            case 21:
                return (z) this.f297b;
            default:
                return (w4) this.f297b;
        }
    }

    @Override
    public ii.a T() {
        switch (this.f296a) {
            case 21:
                return ((z) this.f297b).f12204a;
            default:
                return ((w4) this.f297b).f12204a;
        }
    }

    @Override
    public void U(long j3) {
        b7 b7Var = (b7) this.f297b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.f5347r0 = j3;
        k8Var.f5331j = true;
        b7Var.y(true);
    }

    @Override
    public void V(float f7, int i10) {
        ((le.j) this.f297b).i(f7);
    }

    @Override
    public boolean W() {
        switch (this.f296a) {
            case 21:
                z zVar = (z) this.f297b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.f12204a;
                    if (r3Var.f12615a.T4()) {
                        return true;
                    }
                }
                return false;
            default:
                w4 w4Var = (w4) this.f297b;
                q3 q3Var = w4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = w4Var.f12204a;
                    if (q3Var.f12589a.T4()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public void X(boolean z10) {
        b2 b2Var;
        kc kcVar = ((yb) ((b7) this.f297b)).C0;
        mb mbVar = kcVar.f5443v1;
        if (mbVar != null) {
            b2 b2Var2 = null;
            if (!z10 && (mbVar.getSelectedEntity() instanceof b2)) {
                kcVar.f5443v1.D0(null, true);
            } else if (z10 && !(kcVar.f5443v1.getSelectedEntity() instanceof b2)) {
                j6 j6Var = kcVar.f5443v1.R0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < j6Var.getChildCount()) {
                        View childAt = j6Var.getChildAt(i11);
                        if (childAt instanceof b2) {
                            b2Var = (b2) childAt;
                            break;
                        }
                        i11++;
                    } else {
                        b2Var = null;
                        break;
                    }
                }
                if (b2Var != null) {
                    mb mbVar2 = kcVar.f5443v1;
                    j6 j6Var2 = mbVar2.R0;
                    while (true) {
                        if (i10 >= j6Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = j6Var2.getChildAt(i10);
                        if (childAt2 instanceof b2) {
                            b2Var2 = (b2) childAt2;
                            break;
                        }
                        i10++;
                    }
                    mbVar2.D0(b2Var2, true);
                }
            }
        }
    }

    @Override
    public void Y() {
        ii.e2 e2Var = (ii.e2) this.f297b;
        int i10 = 0;
        ii.e2.Y(e2Var, false, true);
        int i11 = e2Var.I0;
        if (i11 != 2) {
            i10 = i11;
        }
        e2Var.x0(i10, true);
    }

    @Override
    public float Y0() {
        return q.b(9.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) * 2) + ((di.k) this.f297b).Z, 0);
    }

    @Override
    public void Z(int i10, int i11) {
        switch (this.f296a) {
            case 21:
                z zVar = (z) this.f297b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.f12204a;
                    i2 i2Var = r3Var.f12615a.Q3;
                    if (i2Var != null) {
                        i2Var.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                w4 w4Var = (w4) this.f297b;
                q3 q3Var = w4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = w4Var.f12204a;
                    i2 i2Var2 = q3Var.f12589a.Q3;
                    if (i2Var2 != null) {
                        i2Var2.f(i10, i11);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public long a(long j3) {
        return 0L;
    }

    @Override
    public void a0(int i10, float f7, float f10, le.e eVar) {
        ((le.j) this.f297b).i(f7);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f296a) {
            case 4:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                n1 n1Var = (n1) ((m1) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(n1Var.f16820b);
                int i10 = n7.j.f16798a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                ((v) this.f297b).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    n1Var.f16819a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            case 18:
                h7.f fVar = new h7.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = q7.a.f44844a;
                obtain3.writeStrongBinder(fVar);
                q7.a.b(obtain3, (g7.f) this.f297b);
                q7.a.b(obtain3, gVar);
                ((h7.b) ((h7.d) ((h7.e) obj).u())).G0(obtain3, 6);
                return;
            default:
                a6.l lVar = new a6.l((TaskCompletionSource) obj2);
                i7.i iVar = (i7.i) ((i7.c) obj).u();
                Parcel K0 = iVar.K0();
                int i12 = i7.f.f11991a;
                K0.writeStrongBinder(lVar);
                i7.f.c(K0, (x5.e) this.f297b);
                iVar.L0(K0, 1);
                return;
        }
    }

    @Override
    public void b(i1 i1Var) {
        switch (this.f296a) {
            case 21:
                r3 r3Var = ((z) this.f297b).O;
                if (r3Var != null) {
                    x3 x3Var = r3Var.f12615a;
                    x3.N1(x3Var, i1Var);
                    x3Var.f12770o3.P(i1Var, true);
                    return;
                }
                return;
            default:
                q3 q3Var = ((w4) this.f297b).N;
                if (q3Var != null) {
                    x3 x3Var2 = q3Var.f12589a;
                    x3.N1(x3Var2, i1Var);
                    x3Var2.f12770o3.P(i1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public void b0(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.f297b;
        k8 k8Var = b7Var.d;
        if (k8Var != null && (arrayList = k8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((k8) b7Var.d.T.get(i10)).V = f7;
        }
    }

    @Override
    public int c(long j3) {
        if (j3 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public void c0(float f7) {
        b7 b7Var = (b7) this.f297b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.F = f7;
        k8Var.f5331j = true;
        b7Var.w(true);
    }

    @Override
    public void d(int i10) {
        e0 e0Var = ((b7) this.f297b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                d0 d0Var = (d0) obj;
                if (d0Var.f4869a == i10) {
                    d0Var.f4870b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public void d0(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.f297b;
        Handler handler = eVar.f15151f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f15152n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (kVar == ((l.d) arrayList.get(i10)).f15145b) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            dVar = (l.d) arrayList.get(i11);
        }
        handler.postAtTime(new p(this, dVar, mVar, kVar, false, 1), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override
    public void e(w3 w3Var, View view) {
        ii.e2 e2Var = (ii.e2) this.f297b;
        b80 H = b80.H(e2Var, view);
        H.Q = true;
        e2Var.getParentActivity();
        e2Var.getResourceProvider();
        e2Var.f12345x0 = k4.b(H, e2Var, w3Var, false);
    }

    @Override
    public boolean e0() {
        return true;
    }

    @Override
    public int e1() {
        return ((di.k) this.f297b).f8379a0;
    }

    @Override
    public boolean f(float f7) {
        boolean z10;
        ii.e2 e2Var = (ii.e2) this.f297b;
        FrameLayout frameLayout = e2Var.f12341v0;
        if (frameLayout != null) {
            int[] iArr = new int[2];
            frameLayout.getLocationOnScreen(iArr);
            if (f7 >= iArr[1]) {
                z10 = true;
                ii.e2.Y(e2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        ii.e2.Y(e2Var, z10, true);
        return z10;
    }

    @Override
    public b80 f0(View view) {
        return b80.H((ii.e2) this.f297b, view);
    }

    @Override
    public void g() {
        switch (this.f296a) {
            case 21:
                z zVar = (z) this.f297b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    x3.Q1(r3Var.f12615a, zVar.f12204a);
                    return;
                }
                return;
            default:
                w4 w4Var = (w4) this.f297b;
                q3 q3Var = w4Var.N;
                if (q3Var != null) {
                    x3.Q1(q3Var.f12589a, w4Var.f12204a);
                    return;
                }
                return;
        }
    }

    @Override
    public void g0() {
        switch (this.f296a) {
            case 21:
                z zVar = (z) this.f297b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.f12204a;
                    x3 x3Var = r3Var.f12615a;
                    i2 i2Var = x3Var.Q3;
                    if (i2Var != null) {
                        i2Var.g();
                    }
                    x3Var.f12770o3.onContentChanged();
                    return;
                }
                return;
            default:
                w4 w4Var = (w4) this.f297b;
                q3 q3Var = w4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = w4Var.f12204a;
                    x3 x3Var2 = q3Var.f12589a;
                    i2 i2Var2 = x3Var2.Q3;
                    if (i2Var2 != null) {
                        i2Var2.g();
                    }
                    x3Var2.f12770o3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public void h(float f7) {
        b7 b7Var = (b7) this.f297b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.f5353u0 = f7;
        k8Var.f5331j = true;
        b7Var.c();
    }

    @Override
    public void h0(float f7) {
        b7 b7Var = (b7) this.f297b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.E = f7;
        k8Var.f5331j = true;
        b7Var.w(true);
    }

    @Override
    public void i0() {
        ii.e2 e2Var = (ii.e2) this.f297b;
        e2Var.z0();
        e2Var.C0();
    }

    @Override
    public void j(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.f297b;
        g0 g0Var = (g0) k0Var.F.pollLast();
        if (g0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = g0Var.f2609a;
        int i10 = g0Var.f2610b;
        androidx.fragment.app.s l4 = k0Var.f2620c.l(str);
        if (l4 == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            return;
        }
        l4.x(i10, aVar.f2082a, aVar.f2083b);
    }

    @Override
    public long j0() {
        return 0L;
    }

    @Override
    public void k(float f7) {
        b7 b7Var = (b7) this.f297b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.G = f7;
        k8Var.f5331j = true;
        b7Var.c();
    }

    @Override
    public void k0(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.f297b;
        k8 k8Var = b7Var.d;
        if (k8Var != null && (arrayList = k8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((k8) b7Var.d.T.get(i10)).W = f7;
        }
    }

    @Override
    public void l(long j3, boolean z10) {
        b7 b7Var = (b7) this.f297b;
        if (!z10) {
            b7Var.m(j3);
            return;
        }
        e81 e81Var = b7Var.f4745e;
        if (e81Var != null) {
            e81Var.L(j3, true);
        } else if (b7Var.j()) {
            b7Var.E.m(j3, true);
        } else {
            e81 e81Var2 = b7Var.f4771y;
            if (e81Var2 != null) {
                e81Var2.L(j3, false);
            }
        }
    }

    @Override
    public void l0(float f7) {
        k8 k8Var = ((b7) this.f297b).d;
        if (k8Var == null) {
            return;
        }
        k8Var.f5311a0 = f7;
        k8Var.f5331j = true;
    }

    @Override
    public long m(int i10) {
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
    public void m0() {
        ((b7) this.f297b).q(null);
    }

    @Override
    public long n(long j3, long j10) {
        return 0L;
    }

    @Override
    public void o(f6 f6Var, String str) {
        ii.e2 e2Var = (ii.e2) this.f297b;
        if (e2Var.f12348z0 == null) {
            e2Var.f12348z0 = new p3(new ei.f(this, 16), e2Var.getResourceProvider());
        }
        e2Var.f12348z0.d(f6Var, str);
    }

    @Override
    public void o0(u3 u3Var, View view) {
        ii.e2 e2Var = (ii.e2) this.f297b;
        b80 H = b80.H(e2Var, view);
        H.Q = true;
        e2Var.f12345x0 = k4.c(H, e2Var, e2Var.getParentActivity(), e2Var.getResourceProvider(), u3Var, false);
    }

    @Override
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.f297b).f8148c, "joinApplication", task);
    }

    @Override
    public void onContentChanged() {
        ii.e2 e2Var = (ii.e2) this.f297b;
        if (e2Var.f12347y0 != null) {
            boolean n32 = e2Var.P.n3();
            e2Var.L0 = n32;
            e2Var.f12347y0.h(n32);
            e2Var.f12347y0.invalidate();
        }
        e2Var.C0();
        Runnable runnable = e2Var.M0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override
    public long p(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public long p0(long j3) {
        return 1L;
    }

    @Override
    public Object p2() {
        Class cls = (Class) this.f297b;
        try {
            return fb.s.f9835a.a(cls);
        } catch (Exception e7) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e7);
        }
    }

    @Override
    public m2.j q(long j3) {
        return (m2.j) this.f297b;
    }

    @Override
    public long q0(long j3, long j10) {
        return 1L;
    }

    @Override
    public void r(int i10) {
        ((ii.e2) this.f297b).o0(74, i10);
    }

    @Override
    public void s() {
        b7 b7Var = (b7) this.f297b;
        b7Var.s(null, null, true);
        kc kcVar = ((yb) b7Var).C0;
        yb ybVar = kcVar.X0;
        if (ybVar != null) {
            ybVar.s(null, null, true);
        }
        mb mbVar = kcVar.f5443v1;
        if (mbVar != null) {
            mbVar.q0();
        }
        ac acVar = kcVar.f5383c1;
        if (acVar != null) {
            acVar.setHasRoundVideo(false);
        }
        k8 k8Var = kcVar.K1;
        if (k8Var != null) {
            File file = k8Var.f5341o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                kcVar.K1.f5341o0 = null;
            }
            if (kcVar.K1.f5343p0 != null) {
                try {
                    new File(kcVar.K1.f5343p0).delete();
                } catch (Exception unused2) {
                }
                kcVar.K1.f5343p0 = null;
            }
        }
    }

    @Override
    public void s0(float f7) {
        b7 b7Var = (b7) this.f297b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.f5351t0 = f7;
        k8Var.f5331j = true;
        b7Var.y(true);
    }

    @Override
    public void t() {
        int i10;
        ii.e2 e2Var = (ii.e2) this.f297b;
        k3 k3Var = e2Var.P.f12782u3;
        if (k3Var != null && k3Var.y() && e2Var.P.D4()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        e2Var.x0(i10, true);
        e2Var.y0();
        e2Var.w0();
    }

    @Override
    public void t0(int i10, long j3) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.f297b;
        k8 k8Var = b7Var.d;
        if (k8Var != null && (arrayList = k8Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((k8) b7Var.d.T.get(i10)).X = j3;
        }
    }

    @Override
    public void u(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f297b).f15151f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public void u0(long j3) {
        b7 b7Var = (b7) this.f297b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.D = j3;
        k8Var.f5331j = true;
        b7Var.w(true);
    }

    @Override
    public k4.d v(y2.i r4, long r5, long r7, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: a4.m.v(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public void v0() {
        switch (this.f296a) {
            case 21:
                z zVar = (z) this.f297b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.f12204a;
                    x3.P1(r3Var.f12615a);
                    return;
                }
                return;
            default:
                w4 w4Var = (w4) this.f297b;
                q3 q3Var = w4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = w4Var.f12204a;
                    x3.P1(q3Var.f12589a);
                    return;
                }
                return;
        }
    }

    @Override
    public void w(l.k kVar) {
        n4 n4Var = ((ActionMenuView) this.f297b).K;
        if (n4Var != null) {
            n4Var.w(kVar);
        }
    }

    @Override
    public void w0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.p pVar = (androidx.biometric.p) this.f297b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.f2238l0.d(null);
        }
    }

    @Override
    public void x(y2.i iVar, long j3, long j10, int i10) {
        t tVar;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.f297b;
        if (i10 == 0) {
            long j11 = oVar.f50418a;
            tVar = new t(oVar.f50419b);
        } else {
            long j12 = oVar.f50418a;
            Uri uri = oVar.d.f10162c;
            tVar = new t(j10);
        }
        hVar.f15277q.s(tVar, oVar.f50420c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public void x0(y2.i iVar, long j3, long j10, boolean z10) {
        ((l2.h) this.f297b).w((y2.o) iVar, j10);
    }

    @Override
    public void y(y2.i iVar, long j3, long j10) {
        int size;
        int i10;
        long j11;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.f297b;
        long j12 = oVar.f50418a;
        Uri uri = oVar.d.f10162c;
        t tVar = new t(j10);
        hVar.f15273m.getClass();
        hVar.f15277q.p(tVar, oVar.f50420c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f50422f;
        m2.c cVar2 = hVar.H;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f15991m.size();
        }
        long j13 = cVar.b(0).f16010b;
        int i11 = 0;
        while (i11 < size && hVar.H.b(i11).f16010b < j13) {
            i11++;
        }
        if (cVar.d) {
            if (size - i11 > cVar.f15991m.size()) {
                e2.a.n("DashMediaSource", "Loaded out of sync manifest");
            } else {
                j11 = -9223372036854775807L;
                long j14 = hVar.N;
                if (j14 != -9223372036854775807L) {
                    i10 = i11;
                    if (cVar.h * 1000 <= j14) {
                        e2.a.n("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.N);
                    }
                } else {
                    i10 = i11;
                }
                hVar.M = 0;
            }
            int i12 = hVar.M;
            hVar.M = i12 + 1;
            if (i12 < hVar.f15273m.L3(oVar.f50420c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.M - 1) * 1000, 5000));
                return;
            }
            hVar.C = new IOException();
            return;
        }
        i10 = i11;
        j11 = -9223372036854775807L;
        hVar.H = cVar;
        hVar.I = cVar.d & hVar.I;
        hVar.J = j3 - j10;
        hVar.K = j3;
        hVar.O += i10;
        synchronized (hVar.f15280t) {
            try {
                if (oVar.f50419b.f10194a.equals(hVar.F)) {
                    Uri uri2 = hVar.H.f15989k;
                    if (uri2 == null) {
                        uri2 = z8.a(oVar.d.f10162c);
                    }
                    hVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = hVar.H;
        if (cVar3.d && hVar.L == j11) {
            lf.g gVar = cVar3.f15987i;
            if (gVar != null) {
                String str = gVar.f15488b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                hVar.x(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                hVar.v();
                                return;
                            }
                        }
                        hVar.z(gVar, new ob.a(12));
                        return;
                    }
                    hVar.z(gVar, new Object());
                    return;
                }
                try {
                    hVar.L = e2.d0.T(gVar.f15489c) - hVar.K;
                    hVar.y(true);
                    return;
                } catch (s0 e7) {
                    hVar.x(e7);
                    return;
                }
            }
            hVar.v();
            return;
        }
        hVar.y(true);
    }

    public c6.o y0() {
        c6.o oVar = (c6.o) this.f297b;
        if (oVar.f4349a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.f4352e)) {
                if (!Double.isNaN(oVar.f4353f) && oVar.f4353f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    @Override
    public List z(long j3) {
        if (j3 >= 0) {
            return (List) this.f297b;
        }
        return Collections.EMPTY_LIST;
    }

    public boolean z0() {
        x0 x0Var = ((com.google.android.gms.common.api.internal.j0) this.f297b).d;
        if (x0Var != null && x0Var.b()) {
            return true;
        }
        return false;
    }

    public m(a6.i iVar) {
        this.f296a = 6;
        this.f297b = (r) iVar.f326b;
    }

    public m(com.google.android.gms.common.api.j jVar, o6.a aVar, int i10) {
        this.f296a = i10;
        this.f297b = aVar;
    }

    public m(Object obj, int i10) {
        this.f296a = i10;
        this.f297b = obj;
    }

    public m(MediaInfo mediaInfo) {
        this.f296a = 7;
        c6.o oVar = new c6.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f297b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public m(JSONObject jSONObject) {
        this.f296a = 7;
        this.f297b = new c6.o(jSONObject);
    }

    public m(ba.c cVar) {
        this.f296a = 12;
        this.f297b = new File(cVar.f3721b, "com.crashlytics.settings.json");
    }

    @Override
    public void K() {
    }

    @Override
    public void r0() {
    }

    @Override
    public void Q(int i10) {
    }

    @Override
    public void S(boolean z10) {
    }

    @Override
    public void n0(boolean z10) {
    }

    @Override
    public void P(i1 i1Var, boolean z10) {
    }

    @Override
    public long i(long j3, long j10) {
        return j10;
    }
}
