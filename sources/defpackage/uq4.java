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
public final class uq4 {
    public final wm4 a;
    public final e7a b;
    public final dp4 c;
    public boolean d = false;
    public int e = -1;

    public uq4(wm4 wm4Var, e7a e7aVar, ClassLoader classLoader, bq4 bq4Var, Bundle bundle) {
        this.a = wm4Var;
        this.b = e7aVar;
        tq4 tq4Var = (tq4) bundle.getParcelable("state");
        dp4 a = bq4Var.a(tq4Var.a);
        a.e = tq4Var.b;
        a.E = tq4Var.c;
        a.G = tq4Var.d;
        a.H = true;
        a.O = tq4Var.e;
        a.P = tq4Var.f;
        a.Q = tq4Var.h;
        a.T = tq4Var.n;
        a.x = tq4Var.r;
        a.S = tq4Var.s;
        a.R = tq4Var.w;
        a.d0 = v26.values()[tq4Var.x];
        a.n = tq4Var.y;
        a.r = tq4Var.E;
        a.Y = tq4Var.F;
        this.c = a;
        a.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a.N(bundle2);
        if (hq4.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    public final void a() {
        boolean K = hq4.K(3);
        dp4 dp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + dp4Var);
        }
        Bundle bundle = dp4Var.b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        dp4Var.M.R();
        dp4Var.a = 3;
        dp4Var.V = false;
        dp4Var.w();
        if (dp4Var.V) {
            if (hq4.K(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + dp4Var);
            }
            dp4Var.b = null;
            iq4 iq4Var = dp4Var.M;
            iq4Var.H = false;
            iq4Var.I = false;
            iq4Var.O.g = false;
            iq4Var.u(4);
            this.a.b(dp4Var, false);
            return;
        }
        zo4.h(dp4Var, " did not call through to super.onActivityCreated()");
    }

    public final void b() {
        boolean K = hq4.K(3);
        dp4 dp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto ATTACHED: " + dp4Var);
        }
        dp4 dp4Var2 = dp4Var.h;
        uq4 uq4Var = null;
        e7a e7aVar = this.b;
        if (dp4Var2 != null) {
            uq4 uq4Var2 = (uq4) ((HashMap) e7aVar.b).get(dp4Var2.e);
            if (uq4Var2 != null) {
                dp4Var.n = dp4Var.h.e;
                dp4Var.h = null;
                uq4Var = uq4Var2;
            } else {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(dp4Var);
                dp4 dp4Var3 = dp4Var.h;
                sb.append(" declared target fragment ");
                sb.append(dp4Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
        } else {
            String str = dp4Var.n;
            if (str != null && (uq4Var = (uq4) ((HashMap) e7aVar.b).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(dp4Var);
                sb2.append(" declared target fragment ");
                dq9.m(b10.j(sb2, dp4Var.n, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (uq4Var != null) {
            uq4Var.j();
        }
        hq4 hq4Var = dp4Var.K;
        dp4Var.L = hq4Var.w;
        dp4Var.N = hq4Var.y;
        wm4 wm4Var = this.a;
        wm4Var.I(dp4Var, false);
        ArrayList arrayList = dp4Var.i0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ap4) obj).a();
        }
        arrayList.clear();
        dp4Var.M.b(dp4Var.L, dp4Var.h(), dp4Var);
        dp4Var.a = 0;
        dp4Var.V = false;
        dp4Var.y(dp4Var.L.b);
        if (dp4Var.V) {
            Iterator it = dp4Var.K.p.iterator();
            while (it.hasNext()) {
                ((lq4) it.next()).a();
            }
            iq4 iq4Var = dp4Var.M;
            iq4Var.H = false;
            iq4Var.I = false;
            iq4Var.O.g = false;
            iq4Var.u(0);
            wm4Var.q(dp4Var, false);
            return;
        }
        zo4.h(dp4Var, " did not call through to super.onAttach()");
    }

    public final int c() {
        md3 md3Var;
        dp4 dp4Var = this.c;
        if (dp4Var.K == null) {
            return dp4Var.a;
        }
        int i = this.e;
        int ordinal = dp4Var.d0.ordinal();
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
        if (dp4Var.E) {
            boolean z = dp4Var.F;
            int i2 = this.e;
            if (z) {
                i = Math.max(i2, 2);
            } else if (i2 < 4) {
                i = Math.min(i, dp4Var.a);
            } else {
                i = Math.min(i, 1);
            }
        }
        if (dp4Var.G && dp4Var.W == null) {
            i = Math.min(i, 4);
        }
        if (!dp4Var.w) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = dp4Var.W;
        if (viewGroup != null) {
            dp4Var.p().I().getClass();
            Object tag = viewGroup.getTag(2131296663);
            if (tag instanceof md3) {
                md3Var = (md3) tag;
            } else {
                md3Var = new md3(viewGroup);
                viewGroup.setTag(2131296663, md3Var);
            }
            Iterator it = md3Var.b.iterator();
            if (!it.hasNext()) {
                Iterator it2 = md3Var.c.iterator();
                if (it2.hasNext()) {
                    wma wmaVar = (wma) it2.next();
                    throw null;
                }
            } else {
                wma wmaVar2 = (wma) it.next();
                throw null;
            }
        }
        if (dp4Var.x) {
            if (dp4Var.v()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        if (dp4Var.X && dp4Var.a < 5) {
            i = Math.min(i, 4);
        }
        if (dp4Var.y) {
            i = Math.max(i, 3);
        }
        if (hq4.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + dp4Var);
        }
        return i;
    }

    public final void d() {
        Bundle bundle;
        boolean K = hq4.K(3);
        dp4 dp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto CREATED: " + dp4Var);
        }
        Bundle bundle2 = dp4Var.b;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!dp4Var.b0) {
            wm4 wm4Var = this.a;
            wm4Var.J(dp4Var, false);
            dp4Var.M.R();
            dp4Var.a = 1;
            dp4Var.V = false;
            dp4Var.e0.a(new Object());
            dp4Var.z(bundle);
            dp4Var.b0 = true;
            if (dp4Var.V) {
                dp4Var.e0.e(u26.ON_CREATE);
                wm4Var.t(dp4Var, false);
                return;
            }
            zo4.h(dp4Var, " did not call through to super.onCreate()");
            return;
        }
        dp4Var.a = 1;
        dp4Var.L();
    }

    public final void e() {
        Bundle bundle;
        String str;
        dp4 dp4Var = this.c;
        if (dp4Var.E) {
            return;
        }
        if (hq4.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + dp4Var);
        }
        Bundle bundle2 = dp4Var.b;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater D = dp4Var.D(bundle);
        ViewGroup viewGroup2 = dp4Var.W;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = dp4Var.P;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) dp4Var.K.x.b(i);
                    if (viewGroup == null) {
                        if (!dp4Var.H && !dp4Var.G) {
                            try {
                                str = dp4Var.K().getResources().getResourceName(dp4Var.P);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(dp4Var.P) + " (" + str + ") for fragment " + dp4Var);
                        }
                    } else if (!(viewGroup instanceof hp4)) {
                        vq4 vq4Var = wq4.a;
                        wq4.b(new mq4(dp4Var, "Attempting to add fragment " + dp4Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        wq4.a(dp4Var).getClass();
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + dp4Var + " for a container view with no id");
                }
            }
        }
        dp4Var.W = viewGroup;
        dp4Var.J(D, viewGroup, bundle);
        dp4Var.a = 2;
    }

    public final void f() {
        boolean z;
        boolean z2;
        dp4 n;
        boolean K = hq4.K(3);
        dp4 dp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATED: " + dp4Var);
        }
        boolean z3 = true;
        int i = 0;
        if (dp4Var.x && !dp4Var.v()) {
            z = true;
        } else {
            z = false;
        }
        e7a e7aVar = this.b;
        if (z) {
            e7aVar.I(dp4Var.e, null);
        } else {
            kq4 kq4Var = (kq4) e7aVar.d;
            if (kq4Var.b.containsKey(dp4Var.e) && kq4Var.e) {
                z2 = kq4Var.f;
            } else {
                z2 = true;
            }
            if (!z2) {
                String str = dp4Var.n;
                if (str != null && (n = e7aVar.n(str)) != null && n.T) {
                    dp4Var.h = n;
                }
                dp4Var.a = 0;
                return;
            }
        }
        fp4 fp4Var = dp4Var.L;
        if (fp4Var != null) {
            z3 = ((kq4) e7aVar.d).f;
        } else {
            Context context = fp4Var.b;
            if (context instanceof Activity) {
                z3 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z || z3) {
            ((kq4) e7aVar.d).c(dp4Var, false);
        }
        dp4Var.M.l();
        dp4Var.e0.e(u26.ON_DESTROY);
        dp4Var.a = 0;
        dp4Var.V = false;
        dp4Var.b0 = false;
        dp4Var.A();
        if (dp4Var.V) {
            this.a.u(dp4Var, false);
            ArrayList s = e7aVar.s();
            int size = s.size();
            while (i < size) {
                Object obj = s.get(i);
                i++;
                uq4 uq4Var = (uq4) obj;
                if (uq4Var != null) {
                    dp4 dp4Var2 = uq4Var.c;
                    if (dp4Var.e.equals(dp4Var2.n)) {
                        dp4Var2.h = dp4Var;
                        dp4Var2.n = null;
                    }
                }
            }
            String str2 = dp4Var.n;
            if (str2 != null) {
                dp4Var.h = e7aVar.n(str2);
            }
            e7aVar.z(this);
            return;
        }
        zo4.h(dp4Var, " did not call through to super.onDestroy()");
    }

    public final void g() {
        boolean K = hq4.K(3);
        dp4 dp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + dp4Var);
        }
        dp4Var.M.u(1);
        dp4Var.a = 1;
        dp4Var.V = false;
        dp4Var.B();
        if (dp4Var.V) {
            rma rmaVar = ((oa6) new et8(dp4Var.f(), oa6.d).l(oa6.class)).b;
            int i = rmaVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((na6) rmaVar.b[i2]).j();
            }
            dp4Var.I = false;
            this.a.P(dp4Var, false);
            dp4Var.W = null;
            dp4Var.f0.i(null);
            dp4Var.F = false;
            return;
        }
        zo4.h(dp4Var, " did not call through to super.onDestroyView()");
    }

    public final void h() {
        boolean z;
        boolean K = hq4.K(3);
        dp4 dp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + dp4Var);
        }
        dp4Var.a = -1;
        dp4Var.V = false;
        dp4Var.C();
        if (dp4Var.V) {
            iq4 iq4Var = dp4Var.M;
            if (!iq4Var.J) {
                iq4Var.l();
                dp4Var.M = new hq4();
            }
            this.a.x(dp4Var, false);
            dp4Var.a = -1;
            dp4Var.L = null;
            dp4Var.N = null;
            dp4Var.K = null;
            if (!dp4Var.x || dp4Var.v()) {
                kq4 kq4Var = (kq4) this.b.d;
                if (kq4Var.b.containsKey(dp4Var.e) && kq4Var.e) {
                    z = kq4Var.f;
                } else {
                    z = true;
                }
                if (!z) {
                    return;
                }
            }
            if (hq4.K(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + dp4Var);
            }
            dp4Var.s();
            return;
        }
        zo4.h(dp4Var, " did not call through to super.onDetach()");
    }

    public final void i() {
        Bundle bundle;
        dp4 dp4Var = this.c;
        if (dp4Var.E && dp4Var.F && !dp4Var.I) {
            if (hq4.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + dp4Var);
            }
            Bundle bundle2 = dp4Var.b;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            dp4Var.J(dp4Var.D(bundle), null, bundle);
        }
    }

    public final void j() {
        e7a e7aVar = this.b;
        boolean z = this.d;
        dp4 dp4Var = this.c;
        if (z) {
            if (hq4.K(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + dp4Var);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int c = c();
                int i = dp4Var.a;
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
                                dp4Var.a = 4;
                                continue;
                            case 5:
                                n();
                                continue;
                            case 6:
                                dp4Var.a = 6;
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
                                dp4Var.a = 1;
                                continue;
                            case 2:
                                dp4Var.F = false;
                                dp4Var.a = 2;
                                continue;
                            case 3:
                                if (hq4.K(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + dp4Var);
                                }
                                dp4Var.a = 3;
                                continue;
                            case 4:
                                o();
                                continue;
                            case 5:
                                dp4Var.a = 5;
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
                    if (!z2 && i == -1 && dp4Var.x && !dp4Var.v()) {
                        if (hq4.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + dp4Var);
                        }
                        ((kq4) e7aVar.d).c(dp4Var, true);
                        e7aVar.z(this);
                        if (hq4.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + dp4Var);
                        }
                        dp4Var.s();
                    }
                    if (dp4Var.a0) {
                        hq4 hq4Var = dp4Var.K;
                        if (hq4Var != null && dp4Var.w && hq4.L(dp4Var)) {
                            hq4Var.G = true;
                        }
                        dp4Var.a0 = false;
                        dp4Var.M.o();
                    }
                    return;
                }
            }
        } finally {
            this.d = false;
        }
    }

    public final void k() {
        boolean K = hq4.K(3);
        dp4 dp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom RESUMED: " + dp4Var);
        }
        dp4Var.M.u(5);
        dp4Var.e0.e(u26.ON_PAUSE);
        dp4Var.a = 6;
        dp4Var.V = false;
        dp4Var.E();
        if (dp4Var.V) {
            this.a.E(dp4Var, false);
        } else {
            zo4.h(dp4Var, " did not call through to super.onPause()");
        }
    }

    public final void l(ClassLoader classLoader) {
        dp4 dp4Var = this.c;
        Bundle bundle = dp4Var.b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (dp4Var.b.getBundle("savedInstanceState") == null) {
                dp4Var.b.putBundle("savedInstanceState", new Bundle());
            }
            try {
                dp4Var.c = dp4Var.b.getSparseParcelableArray("viewState");
                dp4Var.d = dp4Var.b.getBundle("viewRegistryState");
                tq4 tq4Var = (tq4) dp4Var.b.getParcelable("state");
                if (tq4Var != null) {
                    dp4Var.n = tq4Var.y;
                    dp4Var.r = tq4Var.E;
                    dp4Var.Y = tq4Var.F;
                }
                if (!dp4Var.Y) {
                    dp4Var.X = true;
                }
            } catch (BadParcelableException e) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + dp4Var, e);
            }
        }
    }

    public final void m() {
        View view;
        boolean K = hq4.K(3);
        dp4 dp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto RESUMED: " + dp4Var);
        }
        cp4 cp4Var = dp4Var.Z;
        if (cp4Var == null) {
            view = null;
        } else {
            view = cp4Var.i;
        }
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        dp4Var.j().i = null;
        dp4Var.M.R();
        dp4Var.M.A(true);
        dp4Var.a = 7;
        dp4Var.V = false;
        dp4Var.F();
        if (dp4Var.V) {
            dp4Var.e0.e(u26.ON_RESUME);
            iq4 iq4Var = dp4Var.M;
            iq4Var.H = false;
            iq4Var.I = false;
            iq4Var.O.g = false;
            iq4Var.u(7);
            this.a.K(dp4Var, false);
            this.b.I(dp4Var.e, null);
            dp4Var.b = null;
            dp4Var.c = null;
            dp4Var.d = null;
            return;
        }
        zo4.h(dp4Var, " did not call through to super.onResume()");
    }

    public final void n() {
        boolean K = hq4.K(3);
        dp4 dp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "moveto STARTED: " + dp4Var);
        }
        dp4Var.M.R();
        dp4Var.M.A(true);
        dp4Var.a = 5;
        dp4Var.V = false;
        dp4Var.H();
        if (dp4Var.V) {
            dp4Var.e0.e(u26.ON_START);
            iq4 iq4Var = dp4Var.M;
            iq4Var.H = false;
            iq4Var.I = false;
            iq4Var.O.g = false;
            iq4Var.u(5);
            this.a.N(dp4Var, false);
            return;
        }
        zo4.h(dp4Var, " did not call through to super.onStart()");
    }

    public final void o() {
        boolean K = hq4.K(3);
        dp4 dp4Var = this.c;
        if (K) {
            Log.d("FragmentManager", "movefrom STARTED: " + dp4Var);
        }
        iq4 iq4Var = dp4Var.M;
        iq4Var.I = true;
        iq4Var.O.g = true;
        iq4Var.u(4);
        dp4Var.e0.e(u26.ON_STOP);
        dp4Var.a = 4;
        dp4Var.V = false;
        dp4Var.I();
        if (dp4Var.V) {
            this.a.O(dp4Var, false);
        } else {
            zo4.h(dp4Var, " did not call through to super.onStop()");
        }
    }

    public uq4(wm4 wm4Var, e7a e7aVar, dp4 dp4Var) {
        this.a = wm4Var;
        this.b = e7aVar;
        this.c = dp4Var;
    }

    public uq4(wm4 wm4Var, e7a e7aVar, dp4 dp4Var, Bundle bundle) {
        this.a = wm4Var;
        this.b = e7aVar;
        this.c = dp4Var;
        dp4Var.c = null;
        dp4Var.d = null;
        dp4Var.J = 0;
        dp4Var.F = false;
        dp4Var.w = false;
        dp4 dp4Var2 = dp4Var.h;
        dp4Var.n = dp4Var2 != null ? dp4Var2.e : null;
        dp4Var.h = null;
        dp4Var.b = bundle;
        dp4Var.f = bundle.getBundle("arguments");
    }
}
