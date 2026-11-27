package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;
public abstract class sv5 implements ev5, ah2 {
    public static final long a;
    public static final long b;
    public static final int c = 0;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;

    static {
        Unsafe unsafe = fx.a;
        b = unsafe.objectFieldOffset(sv5.class.getDeclaredField("_state$volatile"));
        a = unsafe.objectFieldOffset(sv5.class.getDeclaredField("_parentHandle$volatile"));
    }

    public sv5(boolean z) {
        q24 q24Var;
        if (z) {
            q24Var = yed.g;
        } else {
            q24Var = yed.f;
        }
        this._state$volatile = q24Var;
    }

    public static yg2 E(ud6 ud6Var) {
        while (ud6Var.i()) {
            ud6Var = ud6Var.h();
        }
        while (true) {
            ud6Var = ud6Var.g();
            if (!ud6Var.i()) {
                if (ud6Var instanceof yg2) {
                    return (yg2) ud6Var;
                }
                if (ud6Var instanceof qm7) {
                    return null;
                }
            }
        }
    }

    public static String L(Object obj) {
        if (obj instanceof lv5) {
            lv5 lv5Var = (lv5) obj;
            if (lv5Var.d()) {
                return "Cancelling";
            }
            if (lv5Var.e()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof hp5) {
            if (((hp5) obj).isActive()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof yp2) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    public static CancellationException M(sv5 sv5Var, Throwable th) {
        CancellationException cancellationException;
        sv5Var.getClass();
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            return new fv5(sv5Var.l(), th, sv5Var);
        }
        return cancellationException;
    }

    public boolean A() {
        return this instanceof pk0;
    }

    public final boolean B(Object obj) {
        Object N;
        do {
            N = N(v(), obj);
            if (N == yed.a) {
                return false;
            }
            if (N == yed.b) {
                return true;
            }
        } while (N == yed.c);
        f(N);
        return true;
    }

    public final Object C(Object obj) {
        Object N;
        yp2 yp2Var;
        do {
            N = N(v(), obj);
            if (N == yed.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof yp2) {
                    yp2Var = (yp2) obj;
                } else {
                    yp2Var = null;
                }
                if (yp2Var != null) {
                    th = yp2Var.a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (N == yed.c);
        return N;
    }

    public String D() {
        return getClass().getSimpleName();
    }

    public final void F(qm7 qm7Var, Throwable th) {
        qm7Var.c(new g76(4), 4);
        Object f = qm7Var.f();
        f.getClass();
        ud6 ud6Var = (ud6) f;
        ?? r1 = 0;
        while (!ud6Var.equals(qm7Var)) {
            if ((ud6Var instanceof iv5) && ((iv5) ud6Var).k()) {
                try {
                    ((iv5) ud6Var).l(th);
                } catch (Throwable th2) {
                    if (r1 != 0) {
                        kke.a(r1, th2);
                    } else {
                        r1 = new RuntimeException("Exception in completion handler " + ud6Var + " for " + ((Object) this), th2);
                    }
                }
            }
            ud6Var = ud6Var.g();
            r1 = r1;
        }
        if (r1 != 0) {
            x(r1);
        }
        k(th);
    }

    public final void I(q24 q24Var) {
        gp5 gp5Var;
        ?? ud6Var = new ud6();
        if (q24Var.a) {
            gp5Var = ud6Var;
        } else {
            gp5Var = new gp5(ud6Var);
        }
        while (true) {
            Unsafe unsafe = fx.a;
            long j = b;
            sv5 sv5Var = this;
            q24 q24Var2 = q24Var;
            if (unsafe.compareAndSwapObject(sv5Var, j, q24Var2, gp5Var) || unsafe.getObjectVolatile(sv5Var, j) != q24Var2) {
                return;
            }
            this = sv5Var;
            q24Var = q24Var2;
        }
    }

    public final void J(iv5 iv5Var) {
        iv5 iv5Var2;
        sv5 sv5Var;
        ud6 ud6Var = new ud6();
        Unsafe unsafe = fx.a;
        unsafe.putObjectVolatile(ud6Var, ud6.b, iv5Var);
        long j = ud6.a;
        unsafe.putObjectVolatile(ud6Var, j, iv5Var);
        loop0: while (true) {
            if (iv5Var.f() != iv5Var) {
                iv5Var2 = iv5Var;
                break;
            }
            while (true) {
                Unsafe unsafe2 = fx.a;
                iv5Var2 = iv5Var;
                if (unsafe2.compareAndSwapObject(iv5Var2, ud6.a, iv5Var, ud6Var)) {
                    ud6Var.e(iv5Var2);
                    break loop0;
                }
                sv5Var = this;
                iv5Var = iv5Var2;
                if (unsafe2.getObjectVolatile(iv5Var2, j) != iv5Var2) {
                    break;
                }
                this = sv5Var;
            }
            this = sv5Var;
        }
        ud6 g = iv5Var2.g();
        while (true) {
            Unsafe unsafe3 = fx.a;
            long j2 = b;
            sv5 sv5Var2 = this;
            if (unsafe3.compareAndSwapObject(sv5Var2, j2, iv5Var2, g) || unsafe3.getObjectVolatile(sv5Var2, j2) != iv5Var2) {
                return;
            }
            this = sv5Var2;
        }
    }

    public final int K(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof q24;
        long j = b;
        if (z) {
            if (((q24) obj).a) {
                return 0;
            }
            while (true) {
                Unsafe unsafe2 = fx.a;
                sv5 sv5Var = this;
                Object obj2 = obj;
                if (unsafe2.compareAndSwapObject(sv5Var, b, obj2, yed.g)) {
                    return 1;
                }
                if (unsafe2.getObjectVolatile(sv5Var, j) == obj2) {
                    this = sv5Var;
                    obj = obj2;
                } else {
                    return -1;
                }
            }
        } else {
            sv5 sv5Var2 = this;
            Object obj3 = obj;
            if (obj3 instanceof gp5) {
                qm7 qm7Var = ((gp5) obj3).a;
                do {
                    sv5 sv5Var3 = sv5Var2;
                    unsafe = fx.a;
                    Object obj4 = obj3;
                    boolean compareAndSwapObject = unsafe.compareAndSwapObject(sv5Var3, b, obj4, qm7Var);
                    sv5Var2 = sv5Var3;
                    obj3 = obj4;
                    if (compareAndSwapObject) {
                        return 1;
                    }
                } while (unsafe.getObjectVolatile(sv5Var2, j) == obj3);
                return -1;
            }
            return 0;
        }
    }

    public final Object N(Object obj, Object obj2) {
        ip5 ip5Var;
        lv5 lv5Var;
        yp2 yp2Var;
        Unsafe unsafe;
        long j;
        if (!(obj instanceof hp5)) {
            return yed.a;
        }
        if (((obj instanceof q24) || (obj instanceof iv5)) && !(obj instanceof yg2) && !(obj2 instanceof yp2)) {
            hp5 hp5Var = (hp5) obj;
            if (obj2 instanceof hp5) {
                ip5Var = new ip5((hp5) obj2);
            } else {
                ip5Var = obj2;
            }
            while (true) {
                Unsafe unsafe2 = fx.a;
                long j2 = b;
                sv5 sv5Var = this;
                if (unsafe2.compareAndSwapObject(sv5Var, j2, hp5Var, ip5Var)) {
                    sv5Var.G(obj2);
                    sv5Var.n(hp5Var, obj2);
                    return obj2;
                } else if (unsafe2.getObjectVolatile(sv5Var, j2) != hp5Var) {
                    return yed.c;
                } else {
                    this = sv5Var;
                }
            }
        } else {
            sv5 sv5Var2 = this;
            hp5 hp5Var2 = (hp5) obj;
            qm7 u = sv5Var2.u(hp5Var2);
            if (u == null) {
                return yed.c;
            }
            Throwable th = null;
            if (hp5Var2 instanceof lv5) {
                lv5Var = (lv5) hp5Var2;
            } else {
                lv5Var = null;
            }
            if (lv5Var == null) {
                lv5Var = new lv5(u, null);
            }
            lv5 lv5Var2 = lv5Var;
            synchronized (lv5Var2) {
                if (lv5Var2.e()) {
                    return yed.a;
                }
                fx.a.putIntVolatile(lv5Var2, lv5.c, 1);
                if (lv5Var2 != hp5Var2) {
                    do {
                        unsafe = fx.a;
                        j = b;
                        sv5 sv5Var3 = sv5Var2;
                        sv5Var2 = sv5Var3;
                        if (!unsafe.compareAndSwapObject(sv5Var3, j, hp5Var2, lv5Var2)) {
                        }
                    } while (unsafe.getObjectVolatile(sv5Var2, j) == hp5Var2);
                    return yed.c;
                }
                boolean d = lv5Var2.d();
                if (obj2 instanceof yp2) {
                    yp2Var = (yp2) obj2;
                } else {
                    yp2Var = null;
                }
                if (yp2Var != null) {
                    lv5Var2.a(yp2Var.a);
                }
                Throwable c2 = lv5Var2.c();
                if (!d) {
                    th = c2;
                }
                if (th != null) {
                    sv5Var2.F(u, th);
                }
                yg2 E = E(u);
                if (E != null && sv5Var2.O(lv5Var2, E, obj2)) {
                    return yed.b;
                }
                u.c(new g76(2), 2);
                yg2 E2 = E(u);
                if (E2 != null && sv5Var2.O(lv5Var2, E2, obj2)) {
                    return yed.b;
                }
                return sv5Var2.p(lv5Var2, obj2);
            }
        }
    }

    public final boolean O(lv5 lv5Var, yg2 yg2Var, Object obj) {
        while (gqe.c(yg2Var.e, false, new kv5(this, lv5Var, yg2Var, obj)) == rm7.a) {
            yg2Var = E(yg2Var);
            if (yg2Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final xg2 attachChild(ah2 ah2Var) {
        sv5 sv5Var;
        yp2 yp2Var;
        yp2 yp2Var2;
        yg2 yg2Var = new yg2(ah2Var);
        yg2Var.d = this;
        loop0: while (true) {
            Object v = this.v();
            if (v instanceof q24) {
                q24 q24Var = (q24) v;
                if (q24Var.a) {
                    while (true) {
                        Unsafe unsafe = fx.a;
                        long j = b;
                        sv5Var = this;
                        if (unsafe.compareAndSwapObject(sv5Var, j, v, yg2Var)) {
                            break loop0;
                        } else if (unsafe.getObjectVolatile(sv5Var, j) == v) {
                            this = sv5Var;
                        }
                    }
                } else {
                    sv5Var = this;
                    sv5Var.I(q24Var);
                }
                this = sv5Var;
            } else {
                sv5Var = this;
                boolean z = v instanceof hp5;
                rm7 rm7Var = rm7.a;
                Throwable th = null;
                if (z) {
                    qm7 b2 = ((hp5) v).b();
                    if (b2 == null) {
                        sv5Var.J((iv5) v);
                        this = sv5Var;
                    } else if (!b2.c(yg2Var, 7)) {
                        boolean c2 = b2.c(yg2Var, 3);
                        Object v2 = sv5Var.v();
                        if (v2 instanceof lv5) {
                            th = ((lv5) v2).c();
                        } else {
                            if (v2 instanceof yp2) {
                                yp2Var2 = (yp2) v2;
                            } else {
                                yp2Var2 = null;
                            }
                            if (yp2Var2 != null) {
                                th = yp2Var2.a;
                            }
                        }
                        yg2Var.l(th);
                        if (c2) {
                            break loop0;
                        }
                        return rm7Var;
                    }
                } else {
                    Object v3 = sv5Var.v();
                    if (v3 instanceof yp2) {
                        yp2Var = (yp2) v3;
                    } else {
                        yp2Var = null;
                    }
                    if (yp2Var != null) {
                        th = yp2Var.a;
                    }
                    yg2Var.l(th);
                    return rm7Var;
                }
            }
        }
        return yg2Var;
    }

    public final Object await(zw2 zw2Var) {
        return h(zw2Var);
    }

    @Override
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new fv5(l(), null, this);
        }
        j(cancellationException);
    }

    @Override
    public final Object fold(Object obj, is4 is4Var) {
        return is4Var.invoke(obj, this);
    }

    public void g(Object obj) {
        f(obj);
    }

    @Override
    public final kx2 get(lx2 lx2Var) {
        return azd.a(this, lx2Var);
    }

    @Override
    public final CancellationException getCancellationException() {
        Object v = v();
        CancellationException cancellationException = null;
        if (v instanceof lv5) {
            Throwable c2 = ((lv5) v).c();
            if (c2 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c2 instanceof CancellationException) {
                    cancellationException = (CancellationException) c2;
                }
                if (cancellationException == null) {
                    return new fv5(concat, c2, this);
                }
                return cancellationException;
            }
            lq5.i(this, "Job is still new or active: ");
            return null;
        } else if (!(v instanceof hp5)) {
            if (v instanceof yp2) {
                return M(this, ((yp2) v).a);
            }
            return new fv5(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            lq5.i(this, "Job is still new or active: ");
            return null;
        }
    }

    @Override
    public final f8a getChildren() {
        return new l8a(new ov5(null, this), (byte) 0);
    }

    public final Object getCompleted() {
        return q();
    }

    public final Throwable getCompletionExceptionOrNull() {
        yp2 yp2Var;
        Object v = v();
        if (!(v instanceof hp5)) {
            if (v instanceof yp2) {
                yp2Var = (yp2) v;
            } else {
                yp2Var = null;
            }
            if (yp2Var == null) {
                return null;
            }
            return yp2Var.a;
        }
        grb.i("This job has not completed yet");
        return null;
    }

    @Override
    public final lx2 getKey() {
        return qf5.c;
    }

    public final Object h(zw2 zw2Var) {
        Object v;
        do {
            v = v();
            if (!(v instanceof hp5)) {
                if (!(v instanceof yp2)) {
                    return yed.a(v);
                }
                throw ((yp2) v).a;
            }
        } while (K(v) < 0);
        jv5 jv5Var = new jv5(xpe.a(zw2Var), this);
        jv5Var.s();
        jv5Var.v(new qa1(gqe.c(this, true, new ne9(jv5Var)), (byte) 2));
        return jv5Var.q();
    }

    public final boolean i(java.lang.Object r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sv5.i(java.lang.Object):boolean");
    }

    @Override
    public final ep3 invokeOnCompletion(boolean z, boolean z2, ur4 ur4Var) {
        iv5 ot5Var;
        if (z) {
            ot5Var = new nt5(ur4Var);
        } else {
            ot5Var = new ot5(ur4Var);
        }
        return z(z2, ot5Var);
    }

    @Override
    public final boolean isActive() {
        Object v = v();
        if ((v instanceof hp5) && ((hp5) v).isActive()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isCancelled() {
        Object v = v();
        if (!(v instanceof yp2)) {
            if (!(v instanceof lv5) || !((lv5) v).d()) {
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
    public final Object join(zw2 zw2Var) {
        Object v;
        f9c f9cVar;
        do {
            v = v();
            boolean z = v instanceof hp5;
            f9cVar = f9c.a;
            if (!z) {
                gqe.a(zw2Var.getContext());
                return f9cVar;
            }
        } while (K(v) < 0);
        va1 va1Var = new va1(1, xpe.a(zw2Var));
        va1Var.s();
        va1Var.v(new qa1(gqe.c(this, true, new oe9(va1Var)), (byte) 2));
        Object q = va1Var.q();
        vx2 vx2Var = vx2.a;
        if (q != vx2Var) {
            q = f9cVar;
        }
        if (q == vx2Var) {
            return q;
        }
        return f9cVar;
    }

    public final boolean k(Throwable th) {
        if (!A()) {
            boolean z = th instanceof CancellationException;
            xg2 xg2Var = (xg2) fx.a.getObjectVolatile(this, a);
            if (xg2Var != null && xg2Var != rm7.a) {
                if (!xg2Var.a(th) && !z) {
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
    public final mx2 minusKey(lx2 lx2Var) {
        return azd.b(this, lx2Var);
    }

    public final void n(hp5 hp5Var, Object obj) {
        yp2 yp2Var;
        Throwable th;
        Unsafe unsafe = fx.a;
        long j = a;
        xg2 xg2Var = (xg2) unsafe.getObjectVolatile((Object) this, j);
        if (xg2Var != null) {
            xg2Var.dispose();
            unsafe.putObjectVolatile((Object) this, j, rm7.a);
        }
        ?? r1 = 0;
        if (obj instanceof yp2) {
            yp2Var = (yp2) obj;
        } else {
            yp2Var = null;
        }
        if (yp2Var != null) {
            th = yp2Var.a;
        } else {
            th = null;
        }
        if (hp5Var instanceof iv5) {
            try {
                ((iv5) hp5Var).l(th);
                return;
            } catch (Throwable th2) {
                x(new RuntimeException("Exception in completion handler " + hp5Var + " for " + ((Object) this), th2));
                return;
            }
        }
        qm7 b2 = hp5Var.b();
        if (b2 != null) {
            b2.c(new g76(1), 1);
            Object f = b2.f();
            f.getClass();
            ud6 ud6Var = (ud6) f;
            while (!ud6Var.equals(b2)) {
                if (ud6Var instanceof iv5) {
                    try {
                        ((iv5) ud6Var).l(th);
                    } catch (Throwable th3) {
                        if (r1 != 0) {
                            kke.a(r1, th3);
                        } else {
                            r1 = new RuntimeException("Exception in completion handler " + ud6Var + " for " + ((Object) this), th3);
                        }
                    }
                }
                ud6Var = ud6Var.g();
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
        sv5 sv5Var = (sv5) obj;
        Object v = sv5Var.v();
        CancellationException cancellationException = null;
        if (v instanceof lv5) {
            th = ((lv5) v).c();
        } else if (v instanceof yp2) {
            th = ((yp2) v).a;
        } else if (!(v instanceof hp5)) {
            th = null;
        } else {
            lq5.i(v, "Cannot be cancelling child in this state: ");
            return null;
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        if (cancellationException == null) {
            return new fv5("Parent job is ".concat(L(v)), th, sv5Var);
        }
        return cancellationException;
    }

    public final Object p(lv5 lv5Var, Object obj) {
        yp2 yp2Var;
        lv5 lv5Var2;
        Throwable th;
        Throwable r;
        ip5 ip5Var;
        sv5 sv5Var;
        lv5 lv5Var3;
        Throwable th2 = null;
        if (obj instanceof yp2) {
            yp2Var = (yp2) obj;
        } else {
            yp2Var = null;
        }
        if (yp2Var != null) {
            th2 = yp2Var.a;
        }
        synchronized (lv5Var) {
            try {
                lv5Var.d();
                ArrayList f = lv5Var.f(th2);
                r = r(lv5Var, f);
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
                                    kke.a(r, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        lv5Var2 = lv5Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                lv5Var2 = lv5Var;
                th = th5;
            }
        }
        if (r != null && r != th2) {
            obj = new yp2(r, false);
        }
        if (r != null && (k(r) || w(r))) {
            obj.getClass();
            fx.a.compareAndSwapInt((yp2) obj, yp2.b, 0, 1);
        }
        G(obj);
        if (obj instanceof hp5) {
            ip5Var = new ip5((hp5) obj);
        } else {
            ip5Var = obj;
        }
        while (true) {
            Unsafe unsafe = fx.a;
            long j = b;
            sv5Var = this;
            lv5Var3 = lv5Var;
            if (unsafe.compareAndSwapObject(sv5Var, j, lv5Var3, ip5Var) || unsafe.getObjectVolatile(sv5Var, j) != lv5Var3) {
                break;
            }
            this = sv5Var;
            lv5Var = lv5Var3;
        }
        sv5Var.n(lv5Var3, obj);
        return obj;
    }

    @Override
    public final mx2 plus(mx2 mx2Var) {
        return azd.c(this, mx2Var);
    }

    public final Object q() {
        Object v = v();
        if (!(v instanceof hp5)) {
            if (!(v instanceof yp2)) {
                return yed.a(v);
            }
            throw ((yp2) v).a;
        }
        grb.i("This job has not completed yet");
        return null;
    }

    public final Throwable r(lv5 lv5Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!lv5Var.d()) {
                return null;
            }
            return new fv5(l(), null, this);
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
        if (th2 instanceof msb) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof msb)) {
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
        return this instanceof vp2;
    }

    public final String toString() {
        return (D() + '{' + L(v()) + '}') + '@' + l93.a(this);
    }

    public final qm7 u(hp5 hp5Var) {
        qm7 b2 = hp5Var.b();
        if (b2 == null) {
            if (hp5Var instanceof q24) {
                return new ud6();
            }
            if (hp5Var instanceof iv5) {
                J((iv5) hp5Var);
                return null;
            }
            lq5.i(hp5Var, "State should have list: ");
            return null;
        }
        return b2;
    }

    public final Object v() {
        return fx.a.getObjectVolatile(this, b);
    }

    public boolean w(Throwable th) {
        return false;
    }

    public final void y(ev5 ev5Var) {
        long j = a;
        rm7 rm7Var = rm7.a;
        if (ev5Var == null) {
            fx.a.putObjectVolatile(this, j, rm7Var);
            return;
        }
        ev5Var.start();
        xg2 attachChild = ev5Var.attachChild(this);
        Unsafe unsafe = fx.a;
        unsafe.putObjectVolatile(this, j, attachChild);
        if (!(v() instanceof hp5)) {
            attachChild.dispose();
            unsafe.putObjectVolatile(this, j, rm7Var);
        }
    }

    public final defpackage.ep3 z(boolean r7, defpackage.iv5 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sv5.z(boolean, iv5):ep3");
    }

    @Override
    public final ep3 invokeOnCompletion(ur4 ur4Var) {
        return z(true, new ot5(ur4Var));
    }

    public final void H() {
    }

    public void G(Object obj) {
    }

    public void f(Object obj) {
    }

    public void x(zp2 zp2Var) {
        throw zp2Var;
    }
}
