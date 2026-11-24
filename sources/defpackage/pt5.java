package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;
public abstract class pt5 implements bt5, ig2 {
    public static final long a;
    public static final long b;
    public static final int c = 0;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;

    static {
        Unsafe unsafe = ex.a;
        b = unsafe.objectFieldOffset(pt5.class.getDeclaredField("_state$volatile"));
        a = unsafe.objectFieldOffset(pt5.class.getDeclaredField("_parentHandle$volatile"));
    }

    public pt5(boolean z) {
        v14 v14Var;
        if (z) {
            v14Var = fad.g;
        } else {
            v14Var = fad.f;
        }
        this._state$volatile = v14Var;
    }

    public static gg2 E(qb6 qb6Var) {
        while (qb6Var.i()) {
            qb6Var = qb6Var.h();
        }
        while (true) {
            qb6Var = qb6Var.g();
            if (!qb6Var.i()) {
                if (qb6Var instanceof gg2) {
                    return (gg2) qb6Var;
                }
                if (qb6Var instanceof rj7) {
                    return null;
                }
            }
        }
    }

    public static String L(Object obj) {
        if (obj instanceof it5) {
            it5 it5Var = (it5) obj;
            if (it5Var.d()) {
                return "Cancelling";
            }
            if (it5Var.e()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof en5) {
            if (((en5) obj).isActive()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof fp2) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    public static CancellationException M(pt5 pt5Var, Throwable th) {
        CancellationException cancellationException;
        pt5Var.getClass();
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            return new ct5(pt5Var.l(), th, pt5Var);
        }
        return cancellationException;
    }

    public boolean A() {
        return this instanceof ok0;
    }

    public final boolean B(Object obj) {
        Object N;
        do {
            N = N(v(), obj);
            if (N == fad.a) {
                return false;
            }
            if (N == fad.b) {
                return true;
            }
        } while (N == fad.c);
        f(N);
        return true;
    }

    public final Object C(Object obj) {
        Object N;
        fp2 fp2Var;
        do {
            N = N(v(), obj);
            if (N == fad.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof fp2) {
                    fp2Var = (fp2) obj;
                } else {
                    fp2Var = null;
                }
                if (fp2Var != null) {
                    th = fp2Var.a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (N == fad.c);
        return N;
    }

    public String D() {
        return getClass().getSimpleName();
    }

    public final void F(rj7 rj7Var, Throwable th) {
        rj7Var.c(new c56(4), 4);
        Object f = rj7Var.f();
        f.getClass();
        qb6 qb6Var = (qb6) f;
        ?? r1 = 0;
        while (!qb6Var.equals(rj7Var)) {
            if ((qb6Var instanceof ft5) && ((ft5) qb6Var).k()) {
                try {
                    ((ft5) qb6Var).l(th);
                } catch (Throwable th2) {
                    if (r1 != 0) {
                        tfe.a(r1, th2);
                    } else {
                        r1 = new RuntimeException("Exception in completion handler " + qb6Var + " for " + ((Object) this), th2);
                    }
                }
            }
            qb6Var = qb6Var.g();
            r1 = r1;
        }
        if (r1 != 0) {
            x(r1);
        }
        k(th);
    }

    public final void I(v14 v14Var) {
        dn5 dn5Var;
        ?? qb6Var = new qb6();
        if (v14Var.a) {
            dn5Var = qb6Var;
        } else {
            dn5Var = new dn5(qb6Var);
        }
        while (true) {
            Unsafe unsafe = ex.a;
            long j = b;
            pt5 pt5Var = this;
            v14 v14Var2 = v14Var;
            if (unsafe.compareAndSwapObject(pt5Var, j, v14Var2, dn5Var) || unsafe.getObjectVolatile(pt5Var, j) != v14Var2) {
                return;
            }
            this = pt5Var;
            v14Var = v14Var2;
        }
    }

    public final void J(ft5 ft5Var) {
        ft5 ft5Var2;
        pt5 pt5Var;
        qb6 qb6Var = new qb6();
        Unsafe unsafe = ex.a;
        unsafe.putObjectVolatile(qb6Var, qb6.b, ft5Var);
        long j = qb6.a;
        unsafe.putObjectVolatile(qb6Var, j, ft5Var);
        loop0: while (true) {
            if (ft5Var.f() != ft5Var) {
                ft5Var2 = ft5Var;
                break;
            }
            while (true) {
                Unsafe unsafe2 = ex.a;
                ft5Var2 = ft5Var;
                if (unsafe2.compareAndSwapObject(ft5Var2, qb6.a, ft5Var, qb6Var)) {
                    qb6Var.e(ft5Var2);
                    break loop0;
                }
                pt5Var = this;
                ft5Var = ft5Var2;
                if (unsafe2.getObjectVolatile(ft5Var2, j) != ft5Var2) {
                    break;
                }
                this = pt5Var;
            }
            this = pt5Var;
        }
        qb6 g = ft5Var2.g();
        while (true) {
            Unsafe unsafe3 = ex.a;
            long j2 = b;
            pt5 pt5Var2 = this;
            if (unsafe3.compareAndSwapObject(pt5Var2, j2, ft5Var2, g) || unsafe3.getObjectVolatile(pt5Var2, j2) != ft5Var2) {
                return;
            }
            this = pt5Var2;
        }
    }

    public final int K(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof v14;
        long j = b;
        if (z) {
            if (((v14) obj).a) {
                return 0;
            }
            while (true) {
                Unsafe unsafe2 = ex.a;
                pt5 pt5Var = this;
                Object obj2 = obj;
                if (unsafe2.compareAndSwapObject(pt5Var, b, obj2, fad.g)) {
                    return 1;
                }
                if (unsafe2.getObjectVolatile(pt5Var, j) == obj2) {
                    this = pt5Var;
                    obj = obj2;
                } else {
                    return -1;
                }
            }
        } else {
            pt5 pt5Var2 = this;
            Object obj3 = obj;
            if (obj3 instanceof dn5) {
                rj7 rj7Var = ((dn5) obj3).a;
                do {
                    pt5 pt5Var3 = pt5Var2;
                    unsafe = ex.a;
                    Object obj4 = obj3;
                    boolean compareAndSwapObject = unsafe.compareAndSwapObject(pt5Var3, b, obj4, rj7Var);
                    pt5Var2 = pt5Var3;
                    obj3 = obj4;
                    if (compareAndSwapObject) {
                        return 1;
                    }
                } while (unsafe.getObjectVolatile(pt5Var2, j) == obj3);
                return -1;
            }
            return 0;
        }
    }

    public final Object N(Object obj, Object obj2) {
        fn5 fn5Var;
        it5 it5Var;
        fp2 fp2Var;
        Unsafe unsafe;
        long j;
        if (!(obj instanceof en5)) {
            return fad.a;
        }
        if (((obj instanceof v14) || (obj instanceof ft5)) && !(obj instanceof gg2) && !(obj2 instanceof fp2)) {
            en5 en5Var = (en5) obj;
            if (obj2 instanceof en5) {
                fn5Var = new fn5((en5) obj2);
            } else {
                fn5Var = obj2;
            }
            while (true) {
                Unsafe unsafe2 = ex.a;
                long j2 = b;
                pt5 pt5Var = this;
                if (unsafe2.compareAndSwapObject(pt5Var, j2, en5Var, fn5Var)) {
                    pt5Var.G(obj2);
                    pt5Var.n(en5Var, obj2);
                    return obj2;
                } else if (unsafe2.getObjectVolatile(pt5Var, j2) != en5Var) {
                    return fad.c;
                } else {
                    this = pt5Var;
                }
            }
        } else {
            pt5 pt5Var2 = this;
            en5 en5Var2 = (en5) obj;
            rj7 u = pt5Var2.u(en5Var2);
            if (u == null) {
                return fad.c;
            }
            Throwable th = null;
            if (en5Var2 instanceof it5) {
                it5Var = (it5) en5Var2;
            } else {
                it5Var = null;
            }
            if (it5Var == null) {
                it5Var = new it5(u, null);
            }
            it5 it5Var2 = it5Var;
            synchronized (it5Var2) {
                if (it5Var2.e()) {
                    return fad.a;
                }
                ex.a.putIntVolatile(it5Var2, it5.c, 1);
                if (it5Var2 != en5Var2) {
                    do {
                        unsafe = ex.a;
                        j = b;
                        pt5 pt5Var3 = pt5Var2;
                        pt5Var2 = pt5Var3;
                        if (!unsafe.compareAndSwapObject(pt5Var3, j, en5Var2, it5Var2)) {
                        }
                    } while (unsafe.getObjectVolatile(pt5Var2, j) == en5Var2);
                    return fad.c;
                }
                boolean d = it5Var2.d();
                if (obj2 instanceof fp2) {
                    fp2Var = (fp2) obj2;
                } else {
                    fp2Var = null;
                }
                if (fp2Var != null) {
                    it5Var2.a(fp2Var.a);
                }
                Throwable c2 = it5Var2.c();
                if (!d) {
                    th = c2;
                }
                if (th != null) {
                    pt5Var2.F(u, th);
                }
                gg2 E = E(u);
                if (E != null && pt5Var2.O(it5Var2, E, obj2)) {
                    return fad.b;
                }
                u.c(new c56(2), 2);
                gg2 E2 = E(u);
                if (E2 != null && pt5Var2.O(it5Var2, E2, obj2)) {
                    return fad.b;
                }
                return pt5Var2.p(it5Var2, obj2);
            }
        }
    }

    public final boolean O(it5 it5Var, gg2 gg2Var, Object obj) {
        while (nle.c(gg2Var.e, false, new ht5(this, it5Var, gg2Var, obj)) == sj7.a) {
            gg2Var = E(gg2Var);
            if (gg2Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final fg2 attachChild(ig2 ig2Var) {
        pt5 pt5Var;
        fp2 fp2Var;
        fp2 fp2Var2;
        gg2 gg2Var = new gg2(ig2Var);
        gg2Var.d = this;
        loop0: while (true) {
            Object v = this.v();
            if (v instanceof v14) {
                v14 v14Var = (v14) v;
                if (v14Var.a) {
                    while (true) {
                        Unsafe unsafe = ex.a;
                        long j = b;
                        pt5Var = this;
                        if (unsafe.compareAndSwapObject(pt5Var, j, v, gg2Var)) {
                            break loop0;
                        } else if (unsafe.getObjectVolatile(pt5Var, j) == v) {
                            this = pt5Var;
                        }
                    }
                } else {
                    pt5Var = this;
                    pt5Var.I(v14Var);
                }
                this = pt5Var;
            } else {
                pt5Var = this;
                boolean z = v instanceof en5;
                sj7 sj7Var = sj7.a;
                Throwable th = null;
                if (z) {
                    rj7 b2 = ((en5) v).b();
                    if (b2 == null) {
                        pt5Var.J((ft5) v);
                        this = pt5Var;
                    } else if (!b2.c(gg2Var, 7)) {
                        boolean c2 = b2.c(gg2Var, 3);
                        Object v2 = pt5Var.v();
                        if (v2 instanceof it5) {
                            th = ((it5) v2).c();
                        } else {
                            if (v2 instanceof fp2) {
                                fp2Var2 = (fp2) v2;
                            } else {
                                fp2Var2 = null;
                            }
                            if (fp2Var2 != null) {
                                th = fp2Var2.a;
                            }
                        }
                        gg2Var.l(th);
                        if (c2) {
                            break loop0;
                        }
                        return sj7Var;
                    }
                } else {
                    Object v3 = pt5Var.v();
                    if (v3 instanceof fp2) {
                        fp2Var = (fp2) v3;
                    } else {
                        fp2Var = null;
                    }
                    if (fp2Var != null) {
                        th = fp2Var.a;
                    }
                    gg2Var.l(th);
                    return sj7Var;
                }
            }
        }
        return gg2Var;
    }

    public final Object await(fw2 fw2Var) {
        return h(fw2Var);
    }

    @Override
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new ct5(l(), null, this);
        }
        j(cancellationException);
    }

    @Override
    public final Object fold(Object obj, eq4 eq4Var) {
        return eq4Var.invoke(obj, this);
    }

    public void g(Object obj) {
        f(obj);
    }

    @Override
    public final qw2 get(rw2 rw2Var) {
        return kud.a(this, rw2Var);
    }

    @Override
    public final CancellationException getCancellationException() {
        Object v = v();
        CancellationException cancellationException = null;
        if (v instanceof it5) {
            Throwable c2 = ((it5) v).c();
            if (c2 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c2 instanceof CancellationException) {
                    cancellationException = (CancellationException) c2;
                }
                if (cancellationException == null) {
                    return new ct5(concat, c2, this);
                }
                return cancellationException;
            }
            wn4.n(this, "Job is still new or active: ");
            return null;
        } else if (!(v instanceof en5)) {
            if (v instanceof fp2) {
                return M(this, ((fp2) v).a);
            }
            return new ct5(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            wn4.n(this, "Job is still new or active: ");
            return null;
        }
    }

    @Override
    public final n4a getChildren() {
        return new t4a(new lt5(null, this), (byte) 0);
    }

    public final Object getCompleted() {
        return q();
    }

    public final Throwable getCompletionExceptionOrNull() {
        fp2 fp2Var;
        Object v = v();
        if (!(v instanceof en5)) {
            if (v instanceof fp2) {
                fp2Var = (fp2) v;
            } else {
                fp2Var = null;
            }
            if (fp2Var == null) {
                return null;
            }
            return fp2Var.a;
        }
        sc8.j("This job has not completed yet");
        return null;
    }

    @Override
    public final rw2 getKey() {
        return pd5.c;
    }

    public final Object h(fw2 fw2Var) {
        Object v;
        do {
            v = v();
            if (!(v instanceof en5)) {
                if (!(v instanceof fp2)) {
                    return fad.a(v);
                }
                throw ((fp2) v).a;
            }
        } while (K(v) < 0);
        gt5 gt5Var = new gt5(dle.a(fw2Var), this);
        gt5Var.s();
        gt5Var.v(new ia1(nle.c(this, true, new za9(gt5Var)), (byte) 2));
        return gt5Var.q();
    }

    public final boolean i(java.lang.Object r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt5.i(java.lang.Object):boolean");
    }

    @Override
    public final no3 invokeOnCompletion(boolean z, boolean z2, qp4 qp4Var) {
        ft5 mr5Var;
        if (z) {
            mr5Var = new lr5(qp4Var);
        } else {
            mr5Var = new mr5(qp4Var);
        }
        return z(z2, mr5Var);
    }

    @Override
    public final boolean isActive() {
        Object v = v();
        if ((v instanceof en5) && ((en5) v).isActive()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isCancelled() {
        Object v = v();
        if (!(v instanceof fp2)) {
            if (!(v instanceof it5) || !((it5) v).d()) {
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
    public final Object join(fw2 fw2Var) {
        Object v;
        g5c g5cVar;
        do {
            v = v();
            boolean z = v instanceof en5;
            g5cVar = g5c.a;
            if (!z) {
                nle.a(fw2Var.getContext());
                return g5cVar;
            }
        } while (K(v) < 0);
        na1 na1Var = new na1(1, dle.a(fw2Var));
        na1Var.s();
        na1Var.v(new ia1(nle.c(this, true, new ab9(na1Var)), (byte) 2));
        Object q = na1Var.q();
        bx2 bx2Var = bx2.a;
        if (q != bx2Var) {
            q = g5cVar;
        }
        if (q == bx2Var) {
            return q;
        }
        return g5cVar;
    }

    public final boolean k(Throwable th) {
        if (!A()) {
            boolean z = th instanceof CancellationException;
            fg2 fg2Var = (fg2) ex.a.getObjectVolatile(this, a);
            if (fg2Var != null && fg2Var != sj7.a) {
                if (!fg2Var.a(th) && !z) {
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
    public final sw2 minusKey(rw2 rw2Var) {
        return kud.b(this, rw2Var);
    }

    public final void n(en5 en5Var, Object obj) {
        fp2 fp2Var;
        Throwable th;
        Unsafe unsafe = ex.a;
        long j = a;
        fg2 fg2Var = (fg2) unsafe.getObjectVolatile((Object) this, j);
        if (fg2Var != null) {
            fg2Var.dispose();
            unsafe.putObjectVolatile((Object) this, j, sj7.a);
        }
        ?? r1 = 0;
        if (obj instanceof fp2) {
            fp2Var = (fp2) obj;
        } else {
            fp2Var = null;
        }
        if (fp2Var != null) {
            th = fp2Var.a;
        } else {
            th = null;
        }
        if (en5Var instanceof ft5) {
            try {
                ((ft5) en5Var).l(th);
                return;
            } catch (Throwable th2) {
                x(new RuntimeException("Exception in completion handler " + en5Var + " for " + ((Object) this), th2));
                return;
            }
        }
        rj7 b2 = en5Var.b();
        if (b2 != null) {
            b2.c(new c56(1), 1);
            Object f = b2.f();
            f.getClass();
            qb6 qb6Var = (qb6) f;
            while (!qb6Var.equals(b2)) {
                if (qb6Var instanceof ft5) {
                    try {
                        ((ft5) qb6Var).l(th);
                    } catch (Throwable th3) {
                        if (r1 != 0) {
                            tfe.a(r1, th3);
                        } else {
                            r1 = new RuntimeException("Exception in completion handler " + qb6Var + " for " + ((Object) this), th3);
                        }
                    }
                }
                qb6Var = qb6Var.g();
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
        pt5 pt5Var = (pt5) obj;
        Object v = pt5Var.v();
        CancellationException cancellationException = null;
        if (v instanceof it5) {
            th = ((it5) v).c();
        } else if (v instanceof fp2) {
            th = ((fp2) v).a;
        } else if (!(v instanceof en5)) {
            th = null;
        } else {
            wn4.n(v, "Cannot be cancelling child in this state: ");
            return null;
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        if (cancellationException == null) {
            return new ct5("Parent job is ".concat(L(v)), th, pt5Var);
        }
        return cancellationException;
    }

    public final Object p(it5 it5Var, Object obj) {
        fp2 fp2Var;
        it5 it5Var2;
        Throwable th;
        Throwable r;
        fn5 fn5Var;
        pt5 pt5Var;
        it5 it5Var3;
        Throwable th2 = null;
        if (obj instanceof fp2) {
            fp2Var = (fp2) obj;
        } else {
            fp2Var = null;
        }
        if (fp2Var != null) {
            th2 = fp2Var.a;
        }
        synchronized (it5Var) {
            try {
                it5Var.d();
                ArrayList f = it5Var.f(th2);
                r = r(it5Var, f);
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
                                    tfe.a(r, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        it5Var2 = it5Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                it5Var2 = it5Var;
                th = th5;
            }
        }
        if (r != null && r != th2) {
            obj = new fp2(r, false);
        }
        if (r != null && (k(r) || w(r))) {
            obj.getClass();
            ex.a.compareAndSwapInt((fp2) obj, fp2.b, 0, 1);
        }
        G(obj);
        if (obj instanceof en5) {
            fn5Var = new fn5((en5) obj);
        } else {
            fn5Var = obj;
        }
        while (true) {
            Unsafe unsafe = ex.a;
            long j = b;
            pt5Var = this;
            it5Var3 = it5Var;
            if (unsafe.compareAndSwapObject(pt5Var, j, it5Var3, fn5Var) || unsafe.getObjectVolatile(pt5Var, j) != it5Var3) {
                break;
            }
            this = pt5Var;
            it5Var = it5Var3;
        }
        pt5Var.n(it5Var3, obj);
        return obj;
    }

    @Override
    public final sw2 plus(sw2 sw2Var) {
        return kud.c(this, sw2Var);
    }

    public final Object q() {
        Object v = v();
        if (!(v instanceof en5)) {
            if (!(v instanceof fp2)) {
                return fad.a(v);
            }
            throw ((fp2) v).a;
        }
        sc8.j("This job has not completed yet");
        return null;
    }

    public final Throwable r(it5 it5Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!it5Var.d()) {
                return null;
            }
            return new ct5(l(), null, this);
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
        if (th2 instanceof mob) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof mob)) {
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
        return this instanceof cp2;
    }

    public final String toString() {
        return (D() + '{' + L(v()) + '}') + '@' + s83.a(this);
    }

    public final rj7 u(en5 en5Var) {
        rj7 b2 = en5Var.b();
        if (b2 == null) {
            if (en5Var instanceof v14) {
                return new qb6();
            }
            if (en5Var instanceof ft5) {
                J((ft5) en5Var);
                return null;
            }
            wn4.n(en5Var, "State should have list: ");
            return null;
        }
        return b2;
    }

    public final Object v() {
        return ex.a.getObjectVolatile(this, b);
    }

    public boolean w(Throwable th) {
        return false;
    }

    public final void y(bt5 bt5Var) {
        long j = a;
        sj7 sj7Var = sj7.a;
        if (bt5Var == null) {
            ex.a.putObjectVolatile(this, j, sj7Var);
            return;
        }
        bt5Var.start();
        fg2 attachChild = bt5Var.attachChild(this);
        Unsafe unsafe = ex.a;
        unsafe.putObjectVolatile(this, j, attachChild);
        if (!(v() instanceof en5)) {
            attachChild.dispose();
            unsafe.putObjectVolatile(this, j, sj7Var);
        }
    }

    public final defpackage.no3 z(boolean r7, defpackage.ft5 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt5.z(boolean, ft5):no3");
    }

    @Override
    public final no3 invokeOnCompletion(qp4 qp4Var) {
        return z(true, new mr5(qp4Var));
    }

    public final void H() {
    }

    public void G(Object obj) {
    }

    public void f(Object obj) {
    }

    public void x(gp2 gp2Var) {
        throw gp2Var;
    }
}
