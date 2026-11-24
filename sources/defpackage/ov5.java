package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;
public abstract class ov5 implements av5, wh2 {
    public static final long a;
    public static final long b;
    public static final int c = 0;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;

    static {
        Unsafe unsafe = fy.a;
        b = unsafe.objectFieldOffset(ov5.class.getDeclaredField("_state$volatile"));
        a = unsafe.objectFieldOffset(ov5.class.getDeclaredField("_parentHandle$volatile"));
    }

    public ov5(boolean z) {
        g34 g34Var;
        if (z) {
            g34Var = hcd.g;
        } else {
            g34Var = hcd.f;
        }
        this._state$volatile = g34Var;
    }

    public static uh2 E(pd6 pd6Var) {
        while (pd6Var.i()) {
            pd6Var = pd6Var.h();
        }
        while (true) {
            pd6Var = pd6Var.g();
            if (!pd6Var.i()) {
                if (pd6Var instanceof uh2) {
                    return (uh2) pd6Var;
                }
                if (pd6Var instanceof ul7) {
                    return null;
                }
            }
        }
    }

    public static String L(Object obj) {
        if (obj instanceof hv5) {
            hv5 hv5Var = (hv5) obj;
            if (hv5Var.d()) {
                return "Cancelling";
            }
            if (hv5Var.e()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof ep5) {
            if (((ep5) obj).isActive()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof qq2) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    public static CancellationException M(ov5 ov5Var, Throwable th) {
        CancellationException cancellationException;
        ov5Var.getClass();
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            return new bv5(ov5Var.l(), th, ov5Var);
        }
        return cancellationException;
    }

    public boolean A() {
        return this instanceof ol0;
    }

    public final boolean B(Object obj) {
        Object N;
        do {
            N = N(v(), obj);
            if (N == hcd.a) {
                return false;
            }
            if (N == hcd.b) {
                return true;
            }
        } while (N == hcd.c);
        f(N);
        return true;
    }

    public final Object C(Object obj) {
        Object N;
        qq2 qq2Var;
        do {
            N = N(v(), obj);
            if (N == hcd.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof qq2) {
                    qq2Var = (qq2) obj;
                } else {
                    qq2Var = null;
                }
                if (qq2Var != null) {
                    th = qq2Var.a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (N == hcd.c);
        return N;
    }

    public String D() {
        return getClass().getSimpleName();
    }

    public final void F(ul7 ul7Var, Throwable th) {
        ul7Var.c(new c76(4), 4);
        Object f = ul7Var.f();
        f.getClass();
        pd6 pd6Var = (pd6) f;
        ?? r1 = 0;
        while (!pd6Var.equals(ul7Var)) {
            if ((pd6Var instanceof ev5) && ((ev5) pd6Var).k()) {
                try {
                    ((ev5) pd6Var).l(th);
                } catch (Throwable th2) {
                    if (r1 != 0) {
                        uhe.a(r1, th2);
                    } else {
                        r1 = new RuntimeException("Exception in completion handler " + pd6Var + " for " + ((Object) this), th2);
                    }
                }
            }
            pd6Var = pd6Var.g();
            r1 = r1;
        }
        if (r1 != 0) {
            x(r1);
        }
        k(th);
    }

    public final void I(g34 g34Var) {
        dp5 dp5Var;
        ?? pd6Var = new pd6();
        if (g34Var.a) {
            dp5Var = pd6Var;
        } else {
            dp5Var = new dp5(pd6Var);
        }
        while (true) {
            Unsafe unsafe = fy.a;
            long j = b;
            ov5 ov5Var = this;
            g34 g34Var2 = g34Var;
            if (unsafe.compareAndSwapObject(ov5Var, j, g34Var2, dp5Var) || unsafe.getObjectVolatile(ov5Var, j) != g34Var2) {
                return;
            }
            this = ov5Var;
            g34Var = g34Var2;
        }
    }

    public final void J(ev5 ev5Var) {
        ev5 ev5Var2;
        ov5 ov5Var;
        pd6 pd6Var = new pd6();
        Unsafe unsafe = fy.a;
        unsafe.putObjectVolatile(pd6Var, pd6.b, ev5Var);
        long j = pd6.a;
        unsafe.putObjectVolatile(pd6Var, j, ev5Var);
        loop0: while (true) {
            if (ev5Var.f() != ev5Var) {
                ev5Var2 = ev5Var;
                break;
            }
            while (true) {
                Unsafe unsafe2 = fy.a;
                ev5Var2 = ev5Var;
                if (unsafe2.compareAndSwapObject(ev5Var2, pd6.a, ev5Var, pd6Var)) {
                    pd6Var.e(ev5Var2);
                    break loop0;
                }
                ov5Var = this;
                ev5Var = ev5Var2;
                if (unsafe2.getObjectVolatile(ev5Var2, j) != ev5Var2) {
                    break;
                }
                this = ov5Var;
            }
            this = ov5Var;
        }
        pd6 g = ev5Var2.g();
        while (true) {
            Unsafe unsafe3 = fy.a;
            long j2 = b;
            ov5 ov5Var2 = this;
            if (unsafe3.compareAndSwapObject(ov5Var2, j2, ev5Var2, g) || unsafe3.getObjectVolatile(ov5Var2, j2) != ev5Var2) {
                return;
            }
            this = ov5Var2;
        }
    }

    public final int K(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof g34;
        long j = b;
        if (z) {
            if (((g34) obj).a) {
                return 0;
            }
            while (true) {
                Unsafe unsafe2 = fy.a;
                ov5 ov5Var = this;
                Object obj2 = obj;
                if (unsafe2.compareAndSwapObject(ov5Var, b, obj2, hcd.g)) {
                    return 1;
                }
                if (unsafe2.getObjectVolatile(ov5Var, j) == obj2) {
                    this = ov5Var;
                    obj = obj2;
                } else {
                    return -1;
                }
            }
        } else {
            ov5 ov5Var2 = this;
            Object obj3 = obj;
            if (obj3 instanceof dp5) {
                ul7 ul7Var = ((dp5) obj3).a;
                do {
                    ov5 ov5Var3 = ov5Var2;
                    unsafe = fy.a;
                    Object obj4 = obj3;
                    boolean compareAndSwapObject = unsafe.compareAndSwapObject(ov5Var3, b, obj4, ul7Var);
                    ov5Var2 = ov5Var3;
                    obj3 = obj4;
                    if (compareAndSwapObject) {
                        return 1;
                    }
                } while (unsafe.getObjectVolatile(ov5Var2, j) == obj3);
                return -1;
            }
            return 0;
        }
    }

    public final Object N(Object obj, Object obj2) {
        fp5 fp5Var;
        hv5 hv5Var;
        qq2 qq2Var;
        Unsafe unsafe;
        long j;
        if (!(obj instanceof ep5)) {
            return hcd.a;
        }
        if (((obj instanceof g34) || (obj instanceof ev5)) && !(obj instanceof uh2) && !(obj2 instanceof qq2)) {
            ep5 ep5Var = (ep5) obj;
            if (obj2 instanceof ep5) {
                fp5Var = new fp5((ep5) obj2);
            } else {
                fp5Var = obj2;
            }
            while (true) {
                Unsafe unsafe2 = fy.a;
                long j2 = b;
                ov5 ov5Var = this;
                if (unsafe2.compareAndSwapObject(ov5Var, j2, ep5Var, fp5Var)) {
                    ov5Var.G(obj2);
                    ov5Var.n(ep5Var, obj2);
                    return obj2;
                } else if (unsafe2.getObjectVolatile(ov5Var, j2) != ep5Var) {
                    return hcd.c;
                } else {
                    this = ov5Var;
                }
            }
        } else {
            ov5 ov5Var2 = this;
            ep5 ep5Var2 = (ep5) obj;
            ul7 u = ov5Var2.u(ep5Var2);
            if (u == null) {
                return hcd.c;
            }
            Throwable th = null;
            if (ep5Var2 instanceof hv5) {
                hv5Var = (hv5) ep5Var2;
            } else {
                hv5Var = null;
            }
            if (hv5Var == null) {
                hv5Var = new hv5(u, null);
            }
            hv5 hv5Var2 = hv5Var;
            synchronized (hv5Var2) {
                if (hv5Var2.e()) {
                    return hcd.a;
                }
                fy.a.putIntVolatile(hv5Var2, hv5.c, 1);
                if (hv5Var2 != ep5Var2) {
                    do {
                        unsafe = fy.a;
                        j = b;
                        ov5 ov5Var3 = ov5Var2;
                        ov5Var2 = ov5Var3;
                        if (!unsafe.compareAndSwapObject(ov5Var3, j, ep5Var2, hv5Var2)) {
                        }
                    } while (unsafe.getObjectVolatile(ov5Var2, j) == ep5Var2);
                    return hcd.c;
                }
                boolean d = hv5Var2.d();
                if (obj2 instanceof qq2) {
                    qq2Var = (qq2) obj2;
                } else {
                    qq2Var = null;
                }
                if (qq2Var != null) {
                    hv5Var2.a(qq2Var.a);
                }
                Throwable c2 = hv5Var2.c();
                if (!d) {
                    th = c2;
                }
                if (th != null) {
                    ov5Var2.F(u, th);
                }
                uh2 E = E(u);
                if (E != null && ov5Var2.O(hv5Var2, E, obj2)) {
                    return hcd.b;
                }
                u.c(new c76(2), 2);
                uh2 E2 = E(u);
                if (E2 != null && ov5Var2.O(hv5Var2, E2, obj2)) {
                    return hcd.b;
                }
                return ov5Var2.p(hv5Var2, obj2);
            }
        }
    }

    public final boolean O(hv5 hv5Var, uh2 uh2Var, Object obj) {
        while (pne.c(uh2Var.e, false, new gv5(this, hv5Var, uh2Var, obj)) == vl7.a) {
            uh2Var = E(uh2Var);
            if (uh2Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final th2 attachChild(wh2 wh2Var) {
        ov5 ov5Var;
        qq2 qq2Var;
        qq2 qq2Var2;
        uh2 uh2Var = new uh2(wh2Var);
        uh2Var.d = this;
        loop0: while (true) {
            Object v = this.v();
            if (v instanceof g34) {
                g34 g34Var = (g34) v;
                if (g34Var.a) {
                    while (true) {
                        Unsafe unsafe = fy.a;
                        long j = b;
                        ov5Var = this;
                        if (unsafe.compareAndSwapObject(ov5Var, j, v, uh2Var)) {
                            break loop0;
                        } else if (unsafe.getObjectVolatile(ov5Var, j) == v) {
                            this = ov5Var;
                        }
                    }
                } else {
                    ov5Var = this;
                    ov5Var.I(g34Var);
                }
                this = ov5Var;
            } else {
                ov5Var = this;
                boolean z = v instanceof ep5;
                vl7 vl7Var = vl7.a;
                Throwable th = null;
                if (z) {
                    ul7 b2 = ((ep5) v).b();
                    if (b2 == null) {
                        ov5Var.J((ev5) v);
                        this = ov5Var;
                    } else if (!b2.c(uh2Var, 7)) {
                        boolean c2 = b2.c(uh2Var, 3);
                        Object v2 = ov5Var.v();
                        if (v2 instanceof hv5) {
                            th = ((hv5) v2).c();
                        } else {
                            if (v2 instanceof qq2) {
                                qq2Var2 = (qq2) v2;
                            } else {
                                qq2Var2 = null;
                            }
                            if (qq2Var2 != null) {
                                th = qq2Var2.a;
                            }
                        }
                        uh2Var.l(th);
                        if (c2) {
                            break loop0;
                        }
                        return vl7Var;
                    }
                } else {
                    Object v3 = ov5Var.v();
                    if (v3 instanceof qq2) {
                        qq2Var = (qq2) v3;
                    } else {
                        qq2Var = null;
                    }
                    if (qq2Var != null) {
                        th = qq2Var.a;
                    }
                    uh2Var.l(th);
                    return vl7Var;
                }
            }
        }
        return uh2Var;
    }

    public final Object await(px2 px2Var) {
        return h(px2Var);
    }

    @Override
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new bv5(l(), null, this);
        }
        j(cancellationException);
    }

    @Override
    public final Object fold(Object obj, fs4 fs4Var) {
        return fs4Var.invoke(obj, this);
    }

    public void g(Object obj) {
        f(obj);
    }

    @Override
    public final ay2 get(by2 by2Var) {
        return nwd.a(this, by2Var);
    }

    @Override
    public final CancellationException getCancellationException() {
        Object v = v();
        CancellationException cancellationException = null;
        if (v instanceof hv5) {
            Throwable c2 = ((hv5) v).c();
            if (c2 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c2 instanceof CancellationException) {
                    cancellationException = (CancellationException) c2;
                }
                if (cancellationException == null) {
                    return new bv5(concat, c2, this);
                }
                return cancellationException;
            }
            zo4.p(this, "Job is still new or active: ");
            return null;
        } else if (!(v instanceof ep5)) {
            if (v instanceof qq2) {
                return M(this, ((qq2) v).a);
            }
            return new bv5(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            zo4.p(this, "Job is still new or active: ");
            return null;
        }
    }

    @Override
    public final p6a getChildren() {
        return new v6a(new kv5(null, this), (byte) 0);
    }

    public final Object getCompleted() {
        return q();
    }

    public final Throwable getCompletionExceptionOrNull() {
        qq2 qq2Var;
        Object v = v();
        if (!(v instanceof ep5)) {
            if (v instanceof qq2) {
                qq2Var = (qq2) v;
            } else {
                qq2Var = null;
            }
            if (qq2Var == null) {
                return null;
            }
            return qq2Var.a;
        }
        dq9.m("This job has not completed yet");
        return null;
    }

    @Override
    public final by2 getKey() {
        return nf5.c;
    }

    public final Object h(px2 px2Var) {
        Object v;
        do {
            v = v();
            if (!(v instanceof ep5)) {
                if (!(v instanceof qq2)) {
                    return hcd.a(v);
                }
                throw ((qq2) v).a;
            }
        } while (K(v) < 0);
        fv5 fv5Var = new fv5(fne.a(px2Var), this);
        fv5Var.s();
        fv5Var.v(new qb1(pne.c(this, true, new zc9(fv5Var)), (byte) 2));
        return fv5Var.q();
    }

    public final boolean i(java.lang.Object r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov5.i(java.lang.Object):boolean");
    }

    @Override
    public final xp3 invokeOnCompletion(boolean z, boolean z2, rr4 rr4Var) {
        ev5 lt5Var;
        if (z) {
            lt5Var = new kt5(rr4Var);
        } else {
            lt5Var = new lt5(rr4Var);
        }
        return z(z2, lt5Var);
    }

    @Override
    public final boolean isActive() {
        Object v = v();
        if ((v instanceof ep5) && ((ep5) v).isActive()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isCancelled() {
        Object v = v();
        if (!(v instanceof qq2)) {
            if (!(v instanceof hv5) || !((hv5) v).d()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void j(CancellationException cancellationException) {
        i(cancellationException);
    }

    @Override
    public final Object join(px2 px2Var) {
        Object v;
        g7c g7cVar;
        do {
            v = v();
            boolean z = v instanceof ep5;
            g7cVar = g7c.a;
            if (!z) {
                pne.a(px2Var.getContext());
                return g7cVar;
            }
        } while (K(v) < 0);
        vb1 vb1Var = new vb1(1, fne.a(px2Var));
        vb1Var.s();
        vb1Var.v(new qb1(pne.c(this, true, new ad9(vb1Var)), (byte) 2));
        Object q = vb1Var.q();
        ly2 ly2Var = ly2.a;
        if (q != ly2Var) {
            q = g7cVar;
        }
        if (q == ly2Var) {
            return q;
        }
        return g7cVar;
    }

    public final boolean k(Throwable th) {
        if (!A()) {
            boolean z = th instanceof CancellationException;
            th2 th2Var = (th2) fy.a.getObjectVolatile(this, a);
            if (th2Var != null && th2Var != vl7.a) {
                if (!th2Var.a(th) && !z) {
                    return false;
                }
                return true;
            }
            return z;
        }
        return true;
    }

    public String l() {
        return "Job was cancelled";
    }

    public boolean m(Throwable th) {
        if (!(th instanceof CancellationException)) {
            if (i(th) && s()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final cy2 minusKey(by2 by2Var) {
        return nwd.b(this, by2Var);
    }

    public final void n(ep5 ep5Var, Object obj) {
        qq2 qq2Var;
        Throwable th;
        Unsafe unsafe = fy.a;
        long j = a;
        th2 th2Var = (th2) unsafe.getObjectVolatile((Object) this, j);
        if (th2Var != null) {
            th2Var.dispose();
            unsafe.putObjectVolatile((Object) this, j, vl7.a);
        }
        ?? r1 = 0;
        if (obj instanceof qq2) {
            qq2Var = (qq2) obj;
        } else {
            qq2Var = null;
        }
        if (qq2Var != null) {
            th = qq2Var.a;
        } else {
            th = null;
        }
        if (ep5Var instanceof ev5) {
            try {
                ((ev5) ep5Var).l(th);
                return;
            } catch (Throwable th2) {
                x(new RuntimeException("Exception in completion handler " + ep5Var + " for " + ((Object) this), th2));
                return;
            }
        }
        ul7 b2 = ep5Var.b();
        if (b2 != null) {
            b2.c(new c76(1), 1);
            Object f = b2.f();
            f.getClass();
            pd6 pd6Var = (pd6) f;
            while (!pd6Var.equals(b2)) {
                if (pd6Var instanceof ev5) {
                    try {
                        ((ev5) pd6Var).l(th);
                    } catch (Throwable th3) {
                        if (r1 != 0) {
                            uhe.a(r1, th3);
                        } else {
                            r1 = new RuntimeException("Exception in completion handler " + pd6Var + " for " + ((Object) this), th3);
                        }
                    }
                }
                pd6Var = pd6Var.g();
                r1 = r1;
            }
            if (r1 != 0) {
                x(r1);
            }
        }
    }

    public final Throwable o(Object obj) {
        Throwable th;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        ov5 ov5Var = (ov5) obj;
        Object v = ov5Var.v();
        CancellationException cancellationException = null;
        if (v instanceof hv5) {
            th = ((hv5) v).c();
        } else if (v instanceof qq2) {
            th = ((qq2) v).a;
        } else if (!(v instanceof ep5)) {
            th = null;
        } else {
            zo4.p(v, "Cannot be cancelling child in this state: ");
            return null;
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        if (cancellationException == null) {
            return new bv5("Parent job is ".concat(L(v)), th, ov5Var);
        }
        return cancellationException;
    }

    public final Object p(hv5 hv5Var, Object obj) {
        qq2 qq2Var;
        hv5 hv5Var2;
        Throwable th;
        Throwable r;
        fp5 fp5Var;
        ov5 ov5Var;
        hv5 hv5Var3;
        Throwable th2 = null;
        if (obj instanceof qq2) {
            qq2Var = (qq2) obj;
        } else {
            qq2Var = null;
        }
        if (qq2Var != null) {
            th2 = qq2Var.a;
        }
        synchronized (hv5Var) {
            try {
                hv5Var.d();
                ArrayList f = hv5Var.f(th2);
                r = r(hv5Var, f);
                if (r != null) {
                    try {
                        if (f.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f.size()));
                            int size = f.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = f.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != r && th3 != r && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    uhe.a(r, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        hv5Var2 = hv5Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                hv5Var2 = hv5Var;
                th = th5;
            }
        }
        if (r != null && r != th2) {
            obj = new qq2(r, false);
        }
        if (r != null && (k(r) || w(r))) {
            obj.getClass();
            fy.a.compareAndSwapInt((qq2) obj, qq2.b, 0, 1);
        }
        G(obj);
        if (obj instanceof ep5) {
            fp5Var = new fp5((ep5) obj);
        } else {
            fp5Var = obj;
        }
        while (true) {
            Unsafe unsafe = fy.a;
            long j = b;
            ov5Var = this;
            hv5Var3 = hv5Var;
            if (unsafe.compareAndSwapObject(ov5Var, j, hv5Var3, fp5Var) || unsafe.getObjectVolatile(ov5Var, j) != hv5Var3) {
                break;
            }
            this = ov5Var;
            hv5Var = hv5Var3;
        }
        ov5Var.n(hv5Var3, obj);
        return obj;
    }

    @Override
    public final cy2 plus(cy2 cy2Var) {
        return nwd.c(this, cy2Var);
    }

    public final Object q() {
        Object v = v();
        if (!(v instanceof ep5)) {
            if (!(v instanceof qq2)) {
                return hcd.a(v);
            }
            throw ((qq2) v).a;
        }
        dq9.m("This job has not completed yet");
        return null;
    }

    public final Throwable r(hv5 hv5Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!hv5Var.d()) {
                return null;
            }
            return new bv5(l(), null, this);
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = arrayList.get(i2);
                i2++;
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof nqb) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof nqb)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean s() {
        return true;
    }

    @Override
    public final boolean start() {
        int K;
        do {
            K = K(v());
            if (K == 0) {
                return false;
            }
        } while (K != 1);
        return true;
    }

    public boolean t() {
        return this instanceof nq2;
    }

    public final String toString() {
        return (D() + '{' + L(v()) + '}') + '@' + ea3.a(this);
    }

    public final ul7 u(ep5 ep5Var) {
        ul7 b2 = ep5Var.b();
        if (b2 == null) {
            if (ep5Var instanceof g34) {
                return new pd6();
            }
            if (ep5Var instanceof ev5) {
                J((ev5) ep5Var);
                return null;
            }
            zo4.p(ep5Var, "State should have list: ");
            return null;
        }
        return b2;
    }

    public final Object v() {
        return fy.a.getObjectVolatile(this, b);
    }

    public boolean w(Throwable th) {
        return false;
    }

    public final void y(av5 av5Var) {
        long j = a;
        vl7 vl7Var = vl7.a;
        if (av5Var == null) {
            fy.a.putObjectVolatile(this, j, vl7Var);
            return;
        }
        av5Var.start();
        th2 attachChild = av5Var.attachChild(this);
        Unsafe unsafe = fy.a;
        unsafe.putObjectVolatile(this, j, attachChild);
        if (!(v() instanceof ep5)) {
            attachChild.dispose();
            unsafe.putObjectVolatile(this, j, vl7Var);
        }
    }

    public final defpackage.xp3 z(boolean r7, defpackage.ev5 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov5.z(boolean, ev5):xp3");
    }

    @Override
    public final xp3 invokeOnCompletion(rr4 rr4Var) {
        return z(true, new lt5(rr4Var));
    }

    public final void H() {
    }

    public void G(Object obj) {
    }

    public void f(Object obj) {
    }

    public void x(rq2 rq2Var) {
        throw rq2Var;
    }
}
