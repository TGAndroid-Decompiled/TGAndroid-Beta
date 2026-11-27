package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;
public class va1 extends ap3 implements ta1, wx2, noc {
    public static final long f;
    public static final long h;
    public static final long n;
    private volatile int _decisionAndIndex$volatile;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;
    public final zw2 d;
    public final mx2 e;

    static {
        Unsafe unsafe = fx.a;
        f = unsafe.objectFieldOffset(va1.class.getDeclaredField("_decisionAndIndex$volatile"));
        n = unsafe.objectFieldOffset(va1.class.getDeclaredField("_state$volatile"));
        h = unsafe.objectFieldOffset(va1.class.getDeclaredField("_parentHandle$volatile"));
    }

    public va1(int i, zw2 zw2Var) {
        super(i);
        this.d = zw2Var;
        this.e = zw2Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = i9.a;
    }

    public static Object D(sm7 sm7Var, Object obj, int i, ks4 ks4Var) {
        ra1 ra1Var;
        if (obj instanceof yp2) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (ks4Var == null && !(sm7Var instanceof ra1)) {
            return obj;
        }
        if (sm7Var instanceof ra1) {
            ra1Var = (ra1) sm7Var;
        } else {
            ra1Var = null;
        }
        return new wp2(obj, ra1Var, ks4Var, (CancellationException) null, 16);
    }

    public static void x(sm7 sm7Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + sm7Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, ks4 ks4Var) {
        B(obj, this.c, ks4Var);
    }

    public final void B(Object obj, int i, ks4 ks4Var) {
        va1 va1Var;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof sm7) {
                Object D = D((sm7) objectVolatile, obj, i, ks4Var);
                while (true) {
                    Unsafe unsafe2 = fx.a;
                    va1Var = this;
                    if (unsafe2.compareAndSwapObject(va1Var, n, objectVolatile, D)) {
                        if (!va1Var.w()) {
                            va1Var.n();
                        }
                        va1Var.o(i);
                        return;
                    } else if (unsafe2.getObjectVolatile(va1Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = va1Var;
                    }
                }
            } else {
                va1 va1Var2 = this;
                if (objectVolatile instanceof xa1) {
                    xa1 xa1Var = (xa1) objectVolatile;
                    if (unsafe.compareAndSwapInt(xa1Var, xa1.c, 0, 1)) {
                        if (ks4Var != null) {
                            va1Var2.k(ks4Var, xa1Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                lq5.i(obj, "Already resumed, but proposed with update ");
                return;
            }
            this = va1Var;
        }
    }

    public final void C(px2 px2Var) {
        yo3 yo3Var;
        px2 px2Var2;
        int i;
        zw2 zw2Var = this.d;
        if (zw2Var instanceof yo3) {
            yo3Var = (yo3) zw2Var;
        } else {
            yo3Var = null;
        }
        if (yo3Var != null) {
            px2Var2 = yo3Var.d;
        } else {
            px2Var2 = null;
        }
        if (px2Var2 == px2Var) {
            i = 4;
        } else {
            i = this.c;
        }
        B(g9c.a, i, null);
    }

    public final ow5 E(Object obj, ks4 ks4Var) {
        va1 va1Var;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof sm7) {
                Object D = D((sm7) objectVolatile, obj, this.c, ks4Var);
                while (true) {
                    Unsafe unsafe2 = fx.a;
                    va1Var = this;
                    if (unsafe2.compareAndSwapObject(va1Var, n, objectVolatile, D)) {
                        boolean w = va1Var.w();
                        ow5 ow5Var = n53.a;
                        if (!w) {
                            va1Var.n();
                        }
                        return ow5Var;
                    } else if (unsafe2.getObjectVolatile(va1Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = va1Var;
                    }
                }
            } else {
                return null;
            }
            this = va1Var;
        }
    }

    @Override
    public final void a(hz9 hz9Var, int i) {
        while (true) {
            Unsafe unsafe = fx.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) == 536870911) {
                va1 va1Var = this;
                if (unsafe.compareAndSwapInt(va1Var, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                    va1Var.v(hz9Var);
                    return;
                }
                this = va1Var;
            } else {
                grb.i("invokeOnCancellation should be called at most once");
                return;
            }
        }
    }

    @Override
    public final ow5 b(Object obj, ks4 ks4Var) {
        return E(obj, ks4Var);
    }

    @Override
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        va1 va1Var;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof sm7)) {
                if (!(objectVolatile instanceof yp2)) {
                    if (objectVolatile instanceof wp2) {
                        wp2 wp2Var = (wp2) objectVolatile;
                        if (wp2Var.e == null) {
                            wp2 a = wp2.a(wp2Var, null, cancellationException, 15);
                            while (true) {
                                Unsafe unsafe2 = fx.a;
                                va1 va1Var2 = this;
                                if (unsafe2.compareAndSwapObject(va1Var2, n, objectVolatile, a)) {
                                    ra1 ra1Var = wp2Var.b;
                                    if (ra1Var != null) {
                                        va1Var2.j(ra1Var, cancellationException);
                                    }
                                    ks4 ks4Var = wp2Var.c;
                                    if (ks4Var != null) {
                                        va1Var2.k(ks4Var, cancellationException, wp2Var.a);
                                        return;
                                    }
                                    return;
                                } else if (unsafe2.getObjectVolatile(va1Var2, j) != objectVolatile) {
                                    cancellationException2 = cancellationException;
                                    va1Var = va1Var2;
                                    break;
                                } else {
                                    this = va1Var2;
                                }
                            }
                        } else {
                            grb.i("Must be called at most once");
                            return;
                        }
                    } else {
                        va1 va1Var3 = this;
                        CancellationException cancellationException3 = cancellationException;
                        wp2 wp2Var2 = new wp2(objectVolatile, (ra1) null, (ks4) null, cancellationException3, 14);
                        cancellationException2 = cancellationException3;
                        while (true) {
                            wp2 wp2Var3 = wp2Var2;
                            Unsafe unsafe3 = fx.a;
                            va1Var = va1Var3;
                            boolean compareAndSwapObject = unsafe3.compareAndSwapObject(va1Var, n, objectVolatile, wp2Var3);
                            wp2Var2 = wp2Var3;
                            if (compareAndSwapObject) {
                                return;
                            }
                            if (unsafe3.getObjectVolatile(va1Var, j) != objectVolatile) {
                                break;
                            }
                            va1Var3 = va1Var;
                        }
                    }
                    cancellationException = cancellationException2;
                    this = va1Var;
                } else {
                    return;
                }
            } else {
                grb.i("Not completed");
                return;
            }
        }
    }

    @Override
    public final zw2 d() {
        return this.d;
    }

    @Override
    public final void e(Object obj) {
        o(this.c);
    }

    @Override
    public final Throwable f(Object obj) {
        Throwable f2 = super.f(obj);
        if (f2 != null) {
            return f2;
        }
        return null;
    }

    @Override
    public final Object g(Object obj) {
        if (obj instanceof wp2) {
            return ((wp2) obj).a;
        }
        return obj;
    }

    @Override
    public final wx2 getCallerFrame() {
        zw2 zw2Var = this.d;
        if (zw2Var instanceof wx2) {
            return (wx2) zw2Var;
        }
        return null;
    }

    @Override
    public final mx2 getContext() {
        return this.e;
    }

    @Override
    public final Object i() {
        return r();
    }

    public final void j(ra1 ra1Var, Throwable th) {
        try {
            ra1Var.a(th);
        } catch (Throwable th2) {
            sde.a(this.e, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(ks4 ks4Var, Throwable th, Object obj) {
        mx2 mx2Var = this.e;
        try {
            ks4Var.a(th, obj, mx2Var);
        } catch (Throwable th2) {
            sde.a(mx2Var, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(hz9 hz9Var, Throwable th) {
        mx2 mx2Var = this.e;
        int intVolatile = fx.a.getIntVolatile(this, f) & 536870911;
        if (intVolatile != 536870911) {
            try {
                hz9Var.h(intVolatile, mx2Var);
                return;
            } catch (Throwable th2) {
                sde.a(mx2Var, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        grb.i("The index for Segment.onCancellation(..) is broken");
    }

    public final boolean m(Throwable th) {
        va1 va1Var;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            boolean z = false;
            if (!(objectVolatile instanceof sm7)) {
                return false;
            }
            if ((objectVolatile instanceof ra1) || (objectVolatile instanceof hz9)) {
                z = true;
            }
            xa1 xa1Var = new xa1(this, th, z);
            while (true) {
                Unsafe unsafe2 = fx.a;
                va1Var = this;
                if (unsafe2.compareAndSwapObject(va1Var, n, objectVolatile, xa1Var)) {
                    sm7 sm7Var = (sm7) objectVolatile;
                    if (sm7Var instanceof ra1) {
                        va1Var.j((ra1) objectVolatile, th);
                    } else if (sm7Var instanceof hz9) {
                        va1Var.l((hz9) objectVolatile, th);
                    }
                    if (!va1Var.w()) {
                        va1Var.n();
                    }
                    va1Var.o(va1Var.c);
                    return true;
                } else if (unsafe2.getObjectVolatile(va1Var, j) != objectVolatile) {
                    break;
                } else {
                    this = va1Var;
                }
            }
            this = va1Var;
        }
    }

    public final void n() {
        Unsafe unsafe = fx.a;
        long j = h;
        ep3 ep3Var = (ep3) unsafe.getObjectVolatile(this, j);
        if (ep3Var == null) {
            return;
        }
        ep3Var.dispose();
        unsafe.putObjectVolatile(this, j, rm7.a);
    }

    public final void o(int i) {
        boolean z;
        boolean z2;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    boolean z3 = false;
                    if (i == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zw2 zw2Var = this.d;
                    if (!z && (zw2Var instanceof yo3)) {
                        if (i != 1 && i != 2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        int i3 = this.c;
                        if (i3 == 1 || i3 == 2) {
                            z3 = true;
                        }
                        if (z2 == z3) {
                            yo3 yo3Var = (yo3) zw2Var;
                            px2 px2Var = yo3Var.d;
                            mx2 context = yo3Var.e.getContext();
                            if (px2Var.d(context)) {
                                px2Var.c(context, this);
                                return;
                            }
                            z44 a = crb.a();
                            if (a.c >= 4294967296L) {
                                ls lsVar = a.e;
                                if (lsVar == null) {
                                    lsVar = new ls();
                                    a.e = lsVar;
                                }
                                lsVar.addLast(this);
                                return;
                            }
                            a.g(true);
                            try {
                                vie.a(this, zw2Var, true);
                                do {
                                } while (a.i());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                    vie.a(this, zw2Var, z);
                    return;
                }
                grb.i("Already resumed");
                return;
            }
            va1 va1Var = this;
            if (unsafe.compareAndSwapInt(va1Var, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            }
            this = va1Var;
        }
    }

    public Throwable p(sv5 sv5Var) {
        return sv5Var.getCancellationException();
    }

    public final Object q() {
        ev5 ev5Var;
        boolean w = w();
        while (true) {
            Unsafe unsafe = fx.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i == 2) {
                    if (w) {
                        this.z();
                    }
                    Object r = this.r();
                    if (!(r instanceof yp2)) {
                        int i2 = this.c;
                        if ((i2 == 1 || i2 == 2) && (ev5Var = (ev5) this.e.get(qf5.c)) != null && !ev5Var.isActive()) {
                            CancellationException cancellationException = ev5Var.getCancellationException();
                            this.c(cancellationException);
                            throw cancellationException;
                        }
                        return this.g(r);
                    }
                    throw ((yp2) r).a;
                }
                grb.i("Already suspended");
                return null;
            }
            va1 va1Var = this;
            if (unsafe.compareAndSwapInt(va1Var, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((ep3) unsafe.getObjectVolatile(va1Var, h)) == null) {
                    va1Var.t();
                }
                if (w) {
                    va1Var.z();
                }
                return vx2.a;
            }
            this = va1Var;
        }
    }

    public final Object r() {
        return fx.a.getObjectVolatile(this, n);
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a = he9.a(obj);
        if (a != null) {
            obj = new yp2(a, false);
        }
        B(obj, this.c, null);
    }

    public final void s() {
        ep3 t = t();
        if (t != null && !(r() instanceof sm7)) {
            t.dispose();
            fx.a.putObjectVolatile(this, h, rm7.a);
        }
    }

    public final ep3 t() {
        ev5 ev5Var = (ev5) this.e.get(qf5.c);
        if (ev5Var == null) {
            return null;
        }
        ep3 c = gqe.c(ev5Var, true, new wg2(this));
        while (true) {
            Unsafe unsafe = fx.a;
            long j = h;
            va1 va1Var = this;
            if (unsafe.compareAndSwapObject(va1Var, j, (Object) null, c) || unsafe.getObjectVolatile(va1Var, j) != null) {
                break;
            }
            this = va1Var;
        }
        return c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(y());
        sb.append('(');
        sb.append(l93.d(this.d));
        sb.append("){");
        Object r = r();
        if (r instanceof sm7) {
            str = "Active";
        } else if (r instanceof xa1) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(l93.a(this));
        return sb.toString();
    }

    public final void u(ur4 ur4Var) {
        v(new qa1(ur4Var, (byte) 1));
    }

    public final void v(defpackage.sm7 r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va1.v(sm7):void");
    }

    public final boolean w() {
        if (this.c == 2) {
            if (fx.a.getObjectVolatile((yo3) this.d, yo3.n) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va1.z():void");
    }
}
