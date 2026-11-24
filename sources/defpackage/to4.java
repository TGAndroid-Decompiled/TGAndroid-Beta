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
public final class to4 {
    public final wk4 a;
    public final wtc b;
    public final bn4 c;
    public boolean d = false;
    public int e = -1;

    public to4(wk4 wk4Var, wtc wtcVar, ClassLoader classLoader, ao4 ao4Var, Bundle bundle) {
        this.a = wk4Var;
        this.b = wtcVar;
        so4 so4Var = (so4) bundle.getParcelable("state");
        bn4 a = ao4Var.a(so4Var.a);
        a.e = so4Var.b;
        a.E = so4Var.c;
        a.G = so4Var.d;
        a.H = true;
        a.O = so4Var.e;
        a.P = so4Var.f;
        a.Q = so4Var.h;
        a.T = so4Var.n;
        a.x = so4Var.r;
        a.S = so4Var.s;
        a.R = so4Var.w;
        a.d0 = v06.values()[so4Var.x];
        a.n = so4Var.y;
        a.r = so4Var.E;
        a.Y = so4Var.F;
        this.c = a;
        a.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a.N(bundle2);
        if (go4.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    public final void a() {
        boolean K = go4.K(3);
        bn4 bn4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + bn4Var);
        }
        Bundle bundle = bn4Var.b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        bn4Var.M.R();
        bn4Var.a = 3;
        bn4Var.V = false;
        bn4Var.w();
        if (bn4Var.V) {
            if (go4.K(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + bn4Var);
            }
            bn4Var.b = null;
            ho4 ho4Var = bn4Var.M;
            ho4Var.H = false;
            ho4Var.I = false;
            ho4Var.O.g = false;
            ho4Var.u(4);
            this.a.b(bn4Var, false);
            return;
        }
        wn4.h(bn4Var, " did not call through to super.onActivityCreated()");
    }

    public final void b() {
        boolean K = go4.K(3);
        bn4 bn4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ATTACHED: " + bn4Var);
        }
        bn4 bn4Var2 = bn4Var.h;
        to4 to4Var = null;
        wtc wtcVar = this.b;
        if (bn4Var2 != null) {
            to4 to4Var2 = (to4) ((HashMap) wtcVar.b).get(bn4Var2.e);
            if (to4Var2 != null) {
                bn4Var.n = bn4Var.h.e;
                bn4Var.h = null;
                to4Var = to4Var2;
            } else {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(bn4Var);
                bn4 bn4Var3 = bn4Var.h;
                sb.append(" declared target fragment ");
                sb.append(bn4Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
        } else {
            String str = bn4Var.n;
            if (str != null && (to4Var = (to4) ((HashMap) wtcVar.b).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(bn4Var);
                sb2.append(" declared target fragment ");
                sc8.j(b00.j(sb2, bn4Var.n, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (to4Var != null) {
            to4Var.j();
        }
        go4 go4Var = bn4Var.K;
        bn4Var.L = go4Var.w;
        bn4Var.N = go4Var.y;
        wk4 wk4Var = this.a;
        wk4Var.F(bn4Var, false);
        ArrayList arrayList = bn4Var.i0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ym4) obj).a();
        }
        arrayList.clear();
        bn4Var.M.b(bn4Var.L, bn4Var.h(), bn4Var);
        bn4Var.a = 0;
        bn4Var.V = false;
        bn4Var.y(bn4Var.L.b);
        if (bn4Var.V) {
            Iterator it = bn4Var.K.p.iterator();
            while (it.hasNext()) {
                ((ko4) it.next()).a();
            }
            ho4 ho4Var = bn4Var.M;
            ho4Var.H = false;
            ho4Var.I = false;
            ho4Var.O.g = false;
            ho4Var.u(0);
            wk4Var.j(bn4Var, false);
            return;
        }
        wn4.h(bn4Var, " did not call through to super.onAttach()");
    }

    public final int c() {
        ac3 ac3Var;
        bn4 bn4Var = this.c;
        if (bn4Var.K == null) {
            return bn4Var.a;
        }
        int i = this.e;
        int ordinal = bn4Var.d0.ordinal();
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
        if (bn4Var.E) {
            boolean z = bn4Var.F;
            int i2 = this.e;
            if (z) {
                i = Math.max(i2, 2);
            } else if (i2 < 4) {
                i = Math.min(i, bn4Var.a);
            } else {
                i = Math.min(i, 1);
            }
        }
        if (bn4Var.G && bn4Var.W == null) {
            i = Math.min(i, 4);
        }
        if (!bn4Var.w) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = bn4Var.W;
        if (viewGroup != null) {
            bn4Var.p().I().getClass();
            Object tag = viewGroup.getTag(2131296663);
            if (tag instanceof ac3) {
                ac3Var = (ac3) tag;
            } else {
                ac3Var = new ac3(viewGroup);
                viewGroup.setTag(2131296663, ac3Var);
            }
            Iterator it = ac3Var.b.iterator();
            if (!it.hasNext()) {
                Iterator it2 = ac3Var.c.iterator();
                if (it2.hasNext()) {
                    vka vkaVar = (vka) it2.next();
                    throw null;
                }
            } else {
                vka vkaVar2 = (vka) it.next();
                throw null;
            }
        }
        if (bn4Var.x) {
            if (bn4Var.v()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        if (bn4Var.X && bn4Var.a < 5) {
            i = Math.min(i, 4);
        }
        if (bn4Var.y) {
            i = Math.max(i, 3);
        }
        if (go4.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + bn4Var);
        }
        return i;
    }

    public final void d() {
        Bundle bundle;
        boolean K = go4.K(3);
        bn4 bn4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto CREATED: " + bn4Var);
        }
        Bundle bundle2 = bn4Var.b;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!bn4Var.b0) {
            wk4 wk4Var = this.a;
            wk4Var.K(bn4Var, false);
            bn4Var.M.R();
            bn4Var.a = 1;
            bn4Var.V = false;
            bn4Var.e0.a(new Object());
            bn4Var.z(bundle);
            bn4Var.b0 = true;
            if (bn4Var.V) {
                bn4Var.e0.e(u06.ON_CREATE);
                wk4Var.v(bn4Var, false);
                return;
            }
            wn4.h(bn4Var, " did not call through to super.onCreate()");
            return;
        }
        bn4Var.a = 1;
        bn4Var.L();
    }

    public final void e() {
        Bundle bundle;
        String str;
        bn4 bn4Var = this.c;
        if (bn4Var.E) {
            return;
        }
        if (go4.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + bn4Var);
        }
        Bundle bundle2 = bn4Var.b;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater D = bn4Var.D(bundle);
        ViewGroup viewGroup2 = bn4Var.W;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = bn4Var.P;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) bn4Var.K.x.b(i);
                    if (viewGroup == null) {
                        if (!bn4Var.H && !bn4Var.G) {
                            try {
                                str = bn4Var.K().getResources().getResourceName(bn4Var.P);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(bn4Var.P) + " (" + str + ") for fragment " + bn4Var);
                        }
                    } else if (!(viewGroup instanceof fn4)) {
                        uo4 uo4Var = vo4.a;
                        vo4.b(new lo4(bn4Var, "Attempting to add fragment " + bn4Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        vo4.a(bn4Var).getClass();
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + bn4Var + " for a container view with no id");
                }
            }
        }
        bn4Var.W = viewGroup;
        bn4Var.J(D, viewGroup, bundle);
        bn4Var.a = 2;
    }

    public final void f() {
        boolean z;
        boolean z2;
        bn4 m;
        boolean K = go4.K(3);
        bn4 bn4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATED: " + bn4Var);
        }
        boolean z3 = true;
        int i = 0;
        if (bn4Var.x && !bn4Var.v()) {
            z = true;
        } else {
            z = false;
        }
        wtc wtcVar = this.b;
        if (z) {
            wtcVar.B(bn4Var.e, null);
        } else {
            jo4 jo4Var = (jo4) wtcVar.d;
            if (jo4Var.b.containsKey(bn4Var.e) && jo4Var.e) {
                z2 = jo4Var.f;
            } else {
                z2 = true;
            }
            if (!z2) {
                String str = bn4Var.n;
                if (str != null && (m = wtcVar.m(str)) != null && m.T) {
                    bn4Var.h = m;
                }
                bn4Var.a = 0;
                return;
            }
        }
        dn4 dn4Var = bn4Var.L;
        if (dn4Var != null) {
            z3 = ((jo4) wtcVar.d).f;
        } else {
            Context context = dn4Var.b;
            if (context instanceof Activity) {
                z3 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z || z3) {
            ((jo4) wtcVar.d).c(bn4Var, false);
        }
        bn4Var.M.l();
        bn4Var.e0.e(u06.ON_DESTROY);
        bn4Var.a = 0;
        bn4Var.V = false;
        bn4Var.b0 = false;
        bn4Var.A();
        if (bn4Var.V) {
            this.a.A(bn4Var, false);
            ArrayList q = wtcVar.q();
            int size = q.size();
            while (i < size) {
                Object obj = q.get(i);
                i++;
                to4 to4Var = (to4) obj;
                if (to4Var != null) {
                    bn4 bn4Var2 = to4Var.c;
                    if (bn4Var.e.equals(bn4Var2.n)) {
                        bn4Var2.h = bn4Var;
                        bn4Var2.n = null;
                    }
                }
            }
            String str2 = bn4Var.n;
            if (str2 != null) {
                bn4Var.h = wtcVar.m(str2);
            }
            wtcVar.v(this);
            return;
        }
        wn4.h(bn4Var, " did not call through to super.onDestroy()");
    }

    public final void g() {
        boolean K = go4.K(3);
        bn4 bn4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + bn4Var);
        }
        bn4Var.M.u(1);
        bn4Var.a = 1;
        bn4Var.V = false;
        bn4Var.B();
        if (bn4Var.V) {
            qka qkaVar = ((p86) new g29(bn4Var.f(), p86.d).k(p86.class)).b;
            int i = qkaVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((o86) qkaVar.b[i2]).j();
            }
            bn4Var.I = false;
            this.a.T(bn4Var, false);
            bn4Var.W = null;
            bn4Var.f0.i(null);
            bn4Var.F = false;
            return;
        }
        wn4.h(bn4Var, " did not call through to super.onDestroyView()");
    }

    public final void h() {
        boolean z;
        boolean K = go4.K(3);
        bn4 bn4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + bn4Var);
        }
        bn4Var.a = -1;
        bn4Var.V = false;
        bn4Var.C();
        if (bn4Var.V) {
            ho4 ho4Var = bn4Var.M;
            if (!ho4Var.J) {
                ho4Var.l();
                bn4Var.M = new go4();
            }
            this.a.B(bn4Var, false);
            bn4Var.a = -1;
            bn4Var.L = null;
            bn4Var.N = null;
            bn4Var.K = null;
            if (!bn4Var.x || bn4Var.v()) {
                jo4 jo4Var = (jo4) this.b.d;
                if (jo4Var.b.containsKey(bn4Var.e) && jo4Var.e) {
                    z = jo4Var.f;
                } else {
                    z = true;
                }
                if (!z) {
                    return;
                }
            }
            if (go4.K(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + bn4Var);
            }
            bn4Var.s();
            return;
        }
        wn4.h(bn4Var, " did not call through to super.onDetach()");
    }

    public final void i() {
        Bundle bundle;
        bn4 bn4Var = this.c;
        if (bn4Var.E && bn4Var.F && !bn4Var.I) {
            if (go4.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + bn4Var);
            }
            Bundle bundle2 = bn4Var.b;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            bn4Var.J(bn4Var.D(bundle), null, bundle);
        }
    }

    public final void j() {
        wtc wtcVar = this.b;
        boolean z = this.d;
        bn4 bn4Var = this.c;
        if (z) {
            if (go4.K(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + bn4Var);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int c = c();
                int i = bn4Var.a;
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
                                bn4Var.a = 4;
                                continue;
                            case 5:
                                n();
                                continue;
                            case 6:
                                bn4Var.a = 6;
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
                                bn4Var.a = 1;
                                continue;
                            case 2:
                                bn4Var.F = false;
                                bn4Var.a = 2;
                                continue;
                            case 3:
                                if (go4.K(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + bn4Var);
                                }
                                bn4Var.a = 3;
                                continue;
                            case 4:
                                o();
                                continue;
                            case 5:
                                bn4Var.a = 5;
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
                    if (!z2 && i == -1 && bn4Var.x && !bn4Var.v()) {
                        if (go4.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + bn4Var);
                        }
                        ((jo4) wtcVar.d).c(bn4Var, true);
                        wtcVar.v(this);
                        if (go4.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + bn4Var);
                        }
                        bn4Var.s();
                    }
                    if (bn4Var.a0) {
                        go4 go4Var = bn4Var.K;
                        if (go4Var != null && bn4Var.w && go4.L(bn4Var)) {
                            go4Var.G = true;
                        }
                        bn4Var.a0 = false;
                        bn4Var.M.o();
                    }
                    return;
                }
            }
        } finally {
            this.d = false;
        }
    }

    public final void k() {
        boolean K = go4.K(3);
        bn4 bn4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom RESUMED: " + bn4Var);
        }
        bn4Var.M.u(5);
        bn4Var.e0.e(u06.ON_PAUSE);
        bn4Var.a = 6;
        bn4Var.V = false;
        bn4Var.E();
        if (bn4Var.V) {
            this.a.E(bn4Var, false);
        } else {
            wn4.h(bn4Var, " did not call through to super.onPause()");
        }
    }

    public final void l(ClassLoader classLoader) {
        bn4 bn4Var = this.c;
        Bundle bundle = bn4Var.b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (bn4Var.b.getBundle("savedInstanceState") == null) {
                bn4Var.b.putBundle("savedInstanceState", new Bundle());
            }
            try {
                bn4Var.c = bn4Var.b.getSparseParcelableArray("viewState");
                bn4Var.d = bn4Var.b.getBundle("viewRegistryState");
                so4 so4Var = (so4) bn4Var.b.getParcelable("state");
                if (so4Var != null) {
                    bn4Var.n = so4Var.y;
                    bn4Var.r = so4Var.E;
                    bn4Var.Y = so4Var.F;
                }
                if (!bn4Var.Y) {
                    bn4Var.X = true;
                }
            } catch (BadParcelableException e) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + bn4Var, e);
            }
        }
    }

    public final void m() {
        View view;
        boolean K = go4.K(3);
        bn4 bn4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto RESUMED: " + bn4Var);
        }
        an4 an4Var = bn4Var.Z;
        if (an4Var == null) {
            view = null;
        } else {
            view = an4Var.i;
        }
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        bn4Var.j().i = null;
        bn4Var.M.R();
        bn4Var.M.A(true);
        bn4Var.a = 7;
        bn4Var.V = false;
        bn4Var.F();
        if (bn4Var.V) {
            bn4Var.e0.e(u06.ON_RESUME);
            ho4 ho4Var = bn4Var.M;
            ho4Var.H = false;
            ho4Var.I = false;
            ho4Var.O.g = false;
            ho4Var.u(7);
            this.a.M(bn4Var, false);
            this.b.B(bn4Var.e, null);
            bn4Var.b = null;
            bn4Var.c = null;
            bn4Var.d = null;
            return;
        }
        wn4.h(bn4Var, " did not call through to super.onResume()");
    }

    public final void n() {
        boolean K = go4.K(3);
        bn4 bn4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto STARTED: " + bn4Var);
        }
        bn4Var.M.R();
        bn4Var.M.A(true);
        bn4Var.a = 5;
        bn4Var.V = false;
        bn4Var.H();
        if (bn4Var.V) {
            bn4Var.e0.e(u06.ON_START);
            ho4 ho4Var = bn4Var.M;
            ho4Var.H = false;
            ho4Var.I = false;
            ho4Var.O.g = false;
            ho4Var.u(5);
            this.a.Q(bn4Var, false);
            return;
        }
        wn4.h(bn4Var, " did not call through to super.onStart()");
    }

    public final void o() {
        boolean K = go4.K(3);
        bn4 bn4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom STARTED: " + bn4Var);
        }
        ho4 ho4Var = bn4Var.M;
        ho4Var.I = true;
        ho4Var.O.g = true;
        ho4Var.u(4);
        bn4Var.e0.e(u06.ON_STOP);
        bn4Var.a = 4;
        bn4Var.V = false;
        bn4Var.I();
        if (bn4Var.V) {
            this.a.R(bn4Var, false);
        } else {
            wn4.h(bn4Var, " did not call through to super.onStop()");
        }
    }

    public to4(wk4 wk4Var, wtc wtcVar, bn4 bn4Var) {
        this.a = wk4Var;
        this.b = wtcVar;
        this.c = bn4Var;
    }

    public to4(wk4 wk4Var, wtc wtcVar, bn4 bn4Var, Bundle bundle) {
        this.a = wk4Var;
        this.b = wtcVar;
        this.c = bn4Var;
        bn4Var.c = null;
        bn4Var.d = null;
        bn4Var.J = 0;
        bn4Var.F = false;
        bn4Var.w = false;
        bn4 bn4Var2 = bn4Var.h;
        bn4Var.n = bn4Var2 != null ? bn4Var2.e : null;
        bn4Var.h = null;
        bn4Var.b = bundle;
        bn4Var.f = bundle.getBundle("arguments");
    }
}
