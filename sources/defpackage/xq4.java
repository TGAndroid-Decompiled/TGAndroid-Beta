package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public final class xq4 {
    public final um4 a;
    public final u8a b;
    public final gp4 c;
    public boolean d = false;
    public int e = -1;

    public xq4(um4 um4Var, u8a u8aVar, ClassLoader classLoader, eq4 eq4Var, Bundle bundle) {
        this.a = um4Var;
        this.b = u8aVar;
        wq4 wq4Var = (wq4) bundle.getParcelable("state");
        gp4 a = eq4Var.a(wq4Var.a);
        a.e = wq4Var.b;
        a.E = wq4Var.c;
        a.G = wq4Var.d;
        a.H = true;
        a.O = wq4Var.e;
        a.P = wq4Var.f;
        a.Q = wq4Var.h;
        a.T = wq4Var.n;
        a.x = wq4Var.r;
        a.S = wq4Var.s;
        a.R = wq4Var.w;
        a.d0 = z26.values()[wq4Var.x];
        a.n = wq4Var.y;
        a.r = wq4Var.E;
        a.Y = wq4Var.F;
        this.c = a;
        a.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a.N(bundle2);
        if (kq4.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    public final void a() {
        boolean K = kq4.K(3);
        gp4 gp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + gp4Var);
        }
        Bundle bundle = gp4Var.b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        gp4Var.M.R();
        gp4Var.a = 3;
        gp4Var.V = false;
        gp4Var.w();
        if (gp4Var.V) {
            if (kq4.K(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + gp4Var);
            }
            gp4Var.b = null;
            lq4 lq4Var = gp4Var.M;
            lq4Var.H = false;
            lq4Var.I = false;
            lq4Var.O.g = false;
            lq4Var.u(4);
            this.a.b(gp4Var, false);
            return;
        }
        xi4.i(gp4Var, " did not call through to super.onActivityCreated()");
    }

    public final void b() {
        boolean K = kq4.K(3);
        gp4 gp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ATTACHED: " + gp4Var);
        }
        gp4 gp4Var2 = gp4Var.h;
        xq4 xq4Var = null;
        u8a u8aVar = this.b;
        if (gp4Var2 != null) {
            xq4 xq4Var2 = (xq4) ((HashMap) u8aVar.b).get(gp4Var2.e);
            if (xq4Var2 != null) {
                gp4Var.n = gp4Var.h.e;
                gp4Var.h = null;
                xq4Var = xq4Var2;
            } else {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(gp4Var);
                gp4 gp4Var3 = gp4Var.h;
                sb.append(" declared target fragment ");
                sb.append(gp4Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
        } else {
            String str = gp4Var.n;
            if (str != null && (xq4Var = (xq4) ((HashMap) u8aVar.b).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(gp4Var);
                sb2.append(" declared target fragment ");
                grb.i(c00.k(sb2, gp4Var.n, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (xq4Var != null) {
            xq4Var.j();
        }
        kq4 kq4Var = gp4Var.K;
        gp4Var.L = kq4Var.w;
        gp4Var.N = kq4Var.y;
        um4 um4Var = this.a;
        um4Var.z(gp4Var, false);
        ArrayList arrayList = gp4Var.i0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((dp4) obj).a();
        }
        arrayList.clear();
        gp4Var.M.b(gp4Var.L, gp4Var.h(), gp4Var);
        gp4Var.a = 0;
        gp4Var.V = false;
        gp4Var.y(gp4Var.L.b);
        if (gp4Var.V) {
            Iterator it = gp4Var.K.p.iterator();
            while (it.hasNext()) {
                ((oq4) it.next()).a();
            }
            lq4 lq4Var = gp4Var.M;
            lq4Var.H = false;
            lq4Var.I = false;
            lq4Var.O.g = false;
            lq4Var.u(0);
            um4Var.f(gp4Var, false);
            return;
        }
        xi4.i(gp4Var, " did not call through to super.onAttach()");
    }

    public final int c() {
        tc3 tc3Var;
        gp4 gp4Var = this.c;
        if (gp4Var.K == null) {
            return gp4Var.a;
        }
        int i = this.e;
        int ordinal = gp4Var.d0.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i = Math.min(i, -1);
                    }
                } else {
                    i = Math.min(i, 5);
                }
            } else {
                i = Math.min(i, 1);
            }
        } else {
            i = Math.min(i, 0);
        }
        if (gp4Var.E) {
            boolean z = gp4Var.F;
            int i2 = this.e;
            if (z) {
                i = Math.max(i2, 2);
            } else if (i2 < 4) {
                i = Math.min(i, gp4Var.a);
            } else {
                i = Math.min(i, 1);
            }
        }
        if (gp4Var.G && gp4Var.W == null) {
            i = Math.min(i, 4);
        }
        if (!gp4Var.w) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = gp4Var.W;
        if (viewGroup != null) {
            gp4Var.p().I().getClass();
            Object tag = viewGroup.getTag(2131296663);
            if (tag instanceof tc3) {
                tc3Var = (tc3) tag;
            } else {
                tc3Var = new tc3(viewGroup);
                viewGroup.setTag(2131296663, tc3Var);
            }
            Iterator it = tc3Var.b.iterator();
            if (!it.hasNext()) {
                Iterator it2 = tc3Var.c.iterator();
                if (it2.hasNext()) {
                    poa poaVar = (poa) it2.next();
                    throw null;
                }
            } else {
                poa poaVar2 = (poa) it.next();
                throw null;
            }
        }
        if (gp4Var.x) {
            if (gp4Var.v()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        if (gp4Var.X && gp4Var.a < 5) {
            i = Math.min(i, 4);
        }
        if (gp4Var.y) {
            i = Math.max(i, 3);
        }
        if (kq4.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + gp4Var);
        }
        return i;
    }

    public final void d() {
        Bundle bundle;
        boolean K = kq4.K(3);
        gp4 gp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto CREATED: " + gp4Var);
        }
        Bundle bundle2 = gp4Var.b;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!gp4Var.b0) {
            um4 um4Var = this.a;
            um4Var.B(gp4Var, false);
            gp4Var.M.R();
            gp4Var.a = 1;
            gp4Var.V = false;
            gp4Var.e0.a(new Object());
            gp4Var.z(bundle);
            gp4Var.b0 = true;
            if (gp4Var.V) {
                gp4Var.e0.e(y26.ON_CREATE);
                um4Var.h(gp4Var, false);
                return;
            }
            xi4.i(gp4Var, " did not call through to super.onCreate()");
            return;
        }
        gp4Var.a = 1;
        gp4Var.L();
    }

    public final void e() {
        Bundle bundle;
        String str;
        gp4 gp4Var = this.c;
        if (gp4Var.E) {
            return;
        }
        if (kq4.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + gp4Var);
        }
        Bundle bundle2 = gp4Var.b;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater D = gp4Var.D(bundle);
        ViewGroup viewGroup2 = gp4Var.W;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = gp4Var.P;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) gp4Var.K.x.b(i);
                    if (viewGroup == null) {
                        if (!gp4Var.H && !gp4Var.G) {
                            try {
                                str = gp4Var.K().getResources().getResourceName(gp4Var.P);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(gp4Var.P) + " (" + str + ") for fragment " + gp4Var);
                        }
                    } else if (!(viewGroup instanceof kp4)) {
                        yq4 yq4Var = zq4.a;
                        zq4.b(new pq4(gp4Var, "Attempting to add fragment " + gp4Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        zq4.a(gp4Var).getClass();
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + gp4Var + " for a container view with no id");
                }
            }
        }
        gp4Var.W = viewGroup;
        gp4Var.J(D, viewGroup, bundle);
        gp4Var.a = 2;
    }

    public final void f() {
        boolean z;
        boolean z2;
        gp4 o;
        boolean K = kq4.K(3);
        gp4 gp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATED: " + gp4Var);
        }
        boolean z3 = true;
        int i = 0;
        if (gp4Var.x && !gp4Var.v()) {
            z = true;
        } else {
            z = false;
        }
        u8a u8aVar = this.b;
        if (z) {
            u8aVar.I(gp4Var.e, null);
        } else {
            nq4 nq4Var = (nq4) u8aVar.d;
            if (nq4Var.b.containsKey(gp4Var.e) && nq4Var.e) {
                z2 = nq4Var.f;
            } else {
                z2 = true;
            }
            if (!z2) {
                String str = gp4Var.n;
                if (str != null && (o = u8aVar.o(str)) != null && o.T) {
                    gp4Var.h = o;
                }
                gp4Var.a = 0;
                return;
            }
        }
        ip4 ip4Var = gp4Var.L;
        if (ip4Var != null) {
            z3 = ((nq4) u8aVar.d).f;
        } else {
            Context context = ip4Var.b;
            if (context instanceof Activity) {
                z3 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z || z3) {
            ((nq4) u8aVar.d).c(gp4Var, false);
        }
        gp4Var.M.l();
        gp4Var.e0.e(y26.ON_DESTROY);
        gp4Var.a = 0;
        gp4Var.V = false;
        gp4Var.b0 = false;
        gp4Var.A();
        if (gp4Var.V) {
            this.a.o(gp4Var, false);
            ArrayList r = u8aVar.r();
            int size = r.size();
            while (i < size) {
                Object obj = r.get(i);
                i++;
                xq4 xq4Var = (xq4) obj;
                if (xq4Var != null) {
                    gp4 gp4Var2 = xq4Var.c;
                    if (gp4Var.e.equals(gp4Var2.n)) {
                        gp4Var2.h = gp4Var;
                        gp4Var2.n = null;
                    }
                }
            }
            String str2 = gp4Var.n;
            if (str2 != null) {
                gp4Var.h = u8aVar.o(str2);
            }
            u8aVar.z(this);
            return;
        }
        xi4.i(gp4Var, " did not call through to super.onDestroy()");
    }

    public final void g() {
        boolean K = kq4.K(3);
        gp4 gp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + gp4Var);
        }
        gp4Var.M.u(1);
        gp4Var.a = 1;
        gp4Var.V = false;
        gp4Var.B();
        if (gp4Var.V) {
            koa koaVar = ((ta6) new pq8(gp4Var.f(), ta6.d).n(ta6.class)).b;
            int i = koaVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((sa6) koaVar.b[i2]).j();
            }
            gp4Var.I = false;
            this.a.N(gp4Var, false);
            gp4Var.W = null;
            gp4Var.f0.i(null);
            gp4Var.F = false;
            return;
        }
        xi4.i(gp4Var, " did not call through to super.onDestroyView()");
    }

    public final void h() {
        boolean z;
        boolean K = kq4.K(3);
        gp4 gp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + gp4Var);
        }
        gp4Var.a = -1;
        gp4Var.V = false;
        gp4Var.C();
        if (gp4Var.V) {
            lq4 lq4Var = gp4Var.M;
            if (!lq4Var.J) {
                lq4Var.l();
                gp4Var.M = new kq4();
            }
            this.a.r(gp4Var, false);
            gp4Var.a = -1;
            gp4Var.L = null;
            gp4Var.N = null;
            gp4Var.K = null;
            if (!gp4Var.x || gp4Var.v()) {
                nq4 nq4Var = (nq4) this.b.d;
                if (nq4Var.b.containsKey(gp4Var.e) && nq4Var.e) {
                    z = nq4Var.f;
                } else {
                    z = true;
                }
                if (!z) {
                    return;
                }
            }
            if (kq4.K(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + gp4Var);
            }
            gp4Var.s();
            return;
        }
        xi4.i(gp4Var, " did not call through to super.onDetach()");
    }

    public final void i() {
        Bundle bundle;
        gp4 gp4Var = this.c;
        if (gp4Var.E && gp4Var.F && !gp4Var.I) {
            if (kq4.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + gp4Var);
            }
            Bundle bundle2 = gp4Var.b;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            gp4Var.J(gp4Var.D(bundle), null, bundle);
        }
    }

    public final void j() {
        u8a u8aVar = this.b;
        boolean z = this.d;
        gp4 gp4Var = this.c;
        if (z) {
            if (kq4.K(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + gp4Var);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int c = c();
                int i = gp4Var.a;
                if (c != i) {
                    if (c > i) {
                        switch (i + 1) {
                            case 0:
                                b();
                                continue;
                            case 1:
                                d();
                                continue;
                            case 2:
                                i();
                                e();
                                continue;
                            case 3:
                                a();
                                continue;
                            case 4:
                                gp4Var.a = 4;
                                continue;
                            case 5:
                                n();
                                continue;
                            case 6:
                                gp4Var.a = 6;
                                continue;
                            case 7:
                                m();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i - 1) {
                            case -1:
                                h();
                                continue;
                            case 0:
                                f();
                                continue;
                            case 1:
                                g();
                                gp4Var.a = 1;
                                continue;
                            case 2:
                                gp4Var.F = false;
                                gp4Var.a = 2;
                                continue;
                            case 3:
                                if (kq4.K(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + gp4Var);
                                }
                                gp4Var.a = 3;
                                continue;
                            case 4:
                                o();
                                continue;
                            case 5:
                                gp4Var.a = 5;
                                continue;
                            case 6:
                                k();
                                continue;
                            default:
                                continue;
                        }
                    }
                    z2 = true;
                } else {
                    if (!z2 && i == -1 && gp4Var.x && !gp4Var.v()) {
                        if (kq4.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + gp4Var);
                        }
                        ((nq4) u8aVar.d).c(gp4Var, true);
                        u8aVar.z(this);
                        if (kq4.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + gp4Var);
                        }
                        gp4Var.s();
                    }
                    if (gp4Var.a0) {
                        kq4 kq4Var = gp4Var.K;
                        if (kq4Var != null && gp4Var.w && kq4.L(gp4Var)) {
                            kq4Var.G = true;
                        }
                        gp4Var.a0 = false;
                        gp4Var.M.o();
                    }
                    return;
                }
            }
        } finally {
            this.d = false;
        }
    }

    public final void k() {
        boolean K = kq4.K(3);
        gp4 gp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom RESUMED: " + gp4Var);
        }
        gp4Var.M.u(5);
        gp4Var.e0.e(y26.ON_PAUSE);
        gp4Var.a = 6;
        gp4Var.V = false;
        gp4Var.E();
        if (gp4Var.V) {
            this.a.x(gp4Var, false);
        } else {
            xi4.i(gp4Var, " did not call through to super.onPause()");
        }
    }

    public final void l(ClassLoader classLoader) {
        gp4 gp4Var = this.c;
        Bundle bundle = gp4Var.b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (gp4Var.b.getBundle("savedInstanceState") == null) {
                gp4Var.b.putBundle("savedInstanceState", new Bundle());
            }
            try {
                gp4Var.c = gp4Var.b.getSparseParcelableArray("viewState");
                gp4Var.d = gp4Var.b.getBundle("viewRegistryState");
                wq4 wq4Var = (wq4) gp4Var.b.getParcelable("state");
                if (wq4Var != null) {
                    gp4Var.n = wq4Var.y;
                    gp4Var.r = wq4Var.E;
                    gp4Var.Y = wq4Var.F;
                }
                if (!gp4Var.Y) {
                    gp4Var.X = true;
                }
            } catch (BadParcelableException e) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + gp4Var, e);
            }
        }
    }

    public final void m() {
        View view;
        boolean K = kq4.K(3);
        gp4 gp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto RESUMED: " + gp4Var);
        }
        fp4 fp4Var = gp4Var.Z;
        if (fp4Var == null) {
            view = null;
        } else {
            view = fp4Var.i;
        }
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        gp4Var.j().i = null;
        gp4Var.M.R();
        gp4Var.M.A(true);
        gp4Var.a = 7;
        gp4Var.V = false;
        gp4Var.F();
        if (gp4Var.V) {
            gp4Var.e0.e(y26.ON_RESUME);
            lq4 lq4Var = gp4Var.M;
            lq4Var.H = false;
            lq4Var.I = false;
            lq4Var.O.g = false;
            lq4Var.u(7);
            this.a.I(gp4Var, false);
            this.b.I(gp4Var.e, null);
            gp4Var.b = null;
            gp4Var.c = null;
            gp4Var.d = null;
            return;
        }
        xi4.i(gp4Var, " did not call through to super.onResume()");
    }

    public final void n() {
        boolean K = kq4.K(3);
        gp4 gp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto STARTED: " + gp4Var);
        }
        gp4Var.M.R();
        gp4Var.M.A(true);
        gp4Var.a = 5;
        gp4Var.V = false;
        gp4Var.H();
        if (gp4Var.V) {
            gp4Var.e0.e(y26.ON_START);
            lq4 lq4Var = gp4Var.M;
            lq4Var.H = false;
            lq4Var.I = false;
            lq4Var.O.g = false;
            lq4Var.u(5);
            this.a.K(gp4Var, false);
            return;
        }
        xi4.i(gp4Var, " did not call through to super.onStart()");
    }

    public final void o() {
        boolean K = kq4.K(3);
        gp4 gp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom STARTED: " + gp4Var);
        }
        lq4 lq4Var = gp4Var.M;
        lq4Var.I = true;
        lq4Var.O.g = true;
        lq4Var.u(4);
        gp4Var.e0.e(y26.ON_STOP);
        gp4Var.a = 4;
        gp4Var.V = false;
        gp4Var.I();
        if (gp4Var.V) {
            this.a.L(gp4Var, false);
        } else {
            xi4.i(gp4Var, " did not call through to super.onStop()");
        }
    }

    public xq4(um4 um4Var, u8a u8aVar, gp4 gp4Var) {
        this.a = um4Var;
        this.b = u8aVar;
        this.c = gp4Var;
    }

    public xq4(um4 um4Var, u8a u8aVar, gp4 gp4Var, Bundle bundle) {
        this.a = um4Var;
        this.b = u8aVar;
        this.c = gp4Var;
        gp4Var.c = null;
        gp4Var.d = null;
        gp4Var.J = 0;
        gp4Var.F = false;
        gp4Var.w = false;
        gp4 gp4Var2 = gp4Var.h;
        gp4Var.n = gp4Var2 != null ? gp4Var2.e : null;
        gp4Var.h = null;
        gp4Var.b = bundle;
        gp4Var.f = bundle.getBundle("arguments");
    }
}
