package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;
public class na1 extends jo3 implements la1, cx2, akc {
    public static final long f;
    public static final long h;
    public static final long n;
    private volatile int _decisionAndIndex$volatile;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;
    public final fw2 d;
    public final sw2 e;

    static {
        Unsafe unsafe = ex.a;
        f = unsafe.objectFieldOffset(na1.class.getDeclaredField("_decisionAndIndex$volatile"));
        n = unsafe.objectFieldOffset(na1.class.getDeclaredField("_state$volatile"));
        h = unsafe.objectFieldOffset(na1.class.getDeclaredField("_parentHandle$volatile"));
    }

    public na1(int i, fw2 fw2Var) {
        super(i);
        this.d = fw2Var;
        this.e = fw2Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = h9.a;
    }

    public static Object D(tj7 tj7Var, Object obj, int i, gq4 gq4Var) {
        ja1 ja1Var;
        if (obj instanceof fp2) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (gq4Var == null && !(tj7Var instanceof ja1)) {
            return obj;
        }
        if (tj7Var instanceof ja1) {
            ja1Var = (ja1) tj7Var;
        } else {
            ja1Var = null;
        }
        return new dp2(obj, ja1Var, gq4Var, (CancellationException) null, 16);
    }

    public static void x(tj7 tj7Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + tj7Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, gq4 gq4Var) {
        B(obj, this.c, gq4Var);
    }

    public final void B(Object obj, int i, gq4 gq4Var) {
        na1 na1Var;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof tj7) {
                Object D = D((tj7) objectVolatile, obj, i, gq4Var);
                while (true) {
                    Unsafe unsafe2 = ex.a;
                    na1Var = this;
                    if (unsafe2.compareAndSwapObject(na1Var, n, objectVolatile, D)) {
                        if (!na1Var.w()) {
                            na1Var.n();
                        }
                        na1Var.o(i);
                        return;
                    } else if (unsafe2.getObjectVolatile(na1Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = na1Var;
                    }
                }
            } else {
                na1 na1Var2 = this;
                if (objectVolatile instanceof pa1) {
                    pa1 pa1Var = (pa1) objectVolatile;
                    if (unsafe.compareAndSwapInt(pa1Var, pa1.c, 0, 1)) {
                        if (gq4Var != null) {
                            na1Var2.k(gq4Var, pa1Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                wn4.n(obj, "Already resumed, but proposed with update ");
                return;
            }
            this = na1Var;
        }
    }

    public final void C(vw2 vw2Var) {
        ho3 ho3Var;
        vw2 vw2Var2;
        int i;
        fw2 fw2Var = this.d;
        if (fw2Var instanceof ho3) {
            ho3Var = (ho3) fw2Var;
        } else {
            ho3Var = null;
        }
        if (ho3Var != null) {
            vw2Var2 = ho3Var.d;
        } else {
            vw2Var2 = null;
        }
        if (vw2Var2 == vw2Var) {
            i = 4;
        } else {
            i = this.c;
        }
        B(g5c.a, i, null);
    }

    public final lo5 E(Object obj, gq4 gq4Var) {
        na1 na1Var;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof tj7) {
                Object D = D((tj7) objectVolatile, obj, this.c, gq4Var);
                while (true) {
                    Unsafe unsafe2 = ex.a;
                    na1Var = this;
                    if (unsafe2.compareAndSwapObject(na1Var, n, objectVolatile, D)) {
                        boolean w = na1Var.w();
                        lo5 lo5Var = v43.a;
                        if (!w) {
                            na1Var.n();
                        }
                        return lo5Var;
                    } else if (unsafe2.getObjectVolatile(na1Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = na1Var;
                    }
                }
            } else {
                return null;
            }
            this = na1Var;
        }
    }

    @Override
    public final void a(nv9 nv9Var, int i) {
        while (true) {
            Unsafe unsafe = ex.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) == 536870911) {
                na1 na1Var = this;
                if (unsafe.compareAndSwapInt(na1Var, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                    na1Var.v(nv9Var);
                    return;
                }
                this = na1Var;
            } else {
                sc8.j("invokeOnCancellation should be called at most once");
                return;
            }
        }
    }

    @Override
    public final lo5 b(Object obj, gq4 gq4Var) {
        return E(obj, gq4Var);
    }

    @Override
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        na1 na1Var;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof tj7)) {
                if (!(objectVolatile instanceof fp2)) {
                    if (objectVolatile instanceof dp2) {
                        dp2 dp2Var = (dp2) objectVolatile;
                        if (dp2Var.e == null) {
                            dp2 a = dp2.a(dp2Var, null, cancellationException, 15);
                            while (true) {
                                Unsafe unsafe2 = ex.a;
                                na1 na1Var2 = this;
                                if (unsafe2.compareAndSwapObject(na1Var2, n, objectVolatile, a)) {
                                    ja1 ja1Var = dp2Var.b;
                                    if (ja1Var != null) {
                                        na1Var2.j(ja1Var, cancellationException);
                                    }
                                    gq4 gq4Var = dp2Var.c;
                                    if (gq4Var != null) {
                                        na1Var2.k(gq4Var, cancellationException, dp2Var.a);
                                        return;
                                    }
                                    return;
                                } else if (unsafe2.getObjectVolatile(na1Var2, j) != objectVolatile) {
                                    cancellationException2 = cancellationException;
                                    na1Var = na1Var2;
                                    break;
                                } else {
                                    this = na1Var2;
                                }
                            }
                        } else {
                            sc8.j("Must be called at most once");
                            return;
                        }
                    } else {
                        na1 na1Var3 = this;
                        CancellationException cancellationException3 = cancellationException;
                        dp2 dp2Var2 = new dp2(objectVolatile, (ja1) null, (gq4) null, cancellationException3, 14);
                        cancellationException2 = cancellationException3;
                        while (true) {
                            dp2 dp2Var3 = dp2Var2;
                            Unsafe unsafe3 = ex.a;
                            na1Var = na1Var3;
                            boolean compareAndSwapObject = unsafe3.compareAndSwapObject(na1Var, n, objectVolatile, dp2Var3);
                            dp2Var2 = dp2Var3;
                            if (compareAndSwapObject) {
                                return;
                            }
                            if (unsafe3.getObjectVolatile(na1Var, j) != objectVolatile) {
                                break;
                            }
                            na1Var3 = na1Var;
                        }
                    }
                    cancellationException = cancellationException2;
                    this = na1Var;
                } else {
                    return;
                }
            } else {
                sc8.j("Not completed");
                return;
            }
        }
    }

    @Override
    public final fw2 d() {
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
        if (obj instanceof dp2) {
            return ((dp2) obj).a;
        }
        return obj;
    }

    @Override
    public final cx2 getCallerFrame() {
        fw2 fw2Var = this.d;
        if (fw2Var instanceof cx2) {
            return (cx2) fw2Var;
        }
        return null;
    }

    @Override
    public final sw2 getContext() {
        return this.e;
    }

    @Override
    public final Object i() {
        return r();
    }

    public final void j(ja1 ja1Var, Throwable th) {
        try {
            ja1Var.a(th);
        } catch (Throwable th2) {
            c9e.a(this.e, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(gq4 gq4Var, Throwable th, Object obj) {
        sw2 sw2Var = this.e;
        try {
            gq4Var.a(th, obj, sw2Var);
        } catch (Throwable th2) {
            c9e.a(sw2Var, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(nv9 nv9Var, Throwable th) {
        sw2 sw2Var = this.e;
        int intVolatile = ex.a.getIntVolatile(this, f) & 536870911;
        if (intVolatile != 536870911) {
            try {
                nv9Var.h(intVolatile, sw2Var);
                return;
            } catch (Throwable th2) {
                c9e.a(sw2Var, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        sc8.j("The index for Segment.onCancellation(..) is broken");
    }

    public final boolean m(Throwable th) {
        na1 na1Var;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            boolean z = false;
            if (!(objectVolatile instanceof tj7)) {
                return false;
            }
            if ((objectVolatile instanceof ja1) || (objectVolatile instanceof nv9)) {
                z = true;
            }
            pa1 pa1Var = new pa1(this, th, z);
            while (true) {
                Unsafe unsafe2 = ex.a;
                na1Var = this;
                if (unsafe2.compareAndSwapObject(na1Var, n, objectVolatile, pa1Var)) {
                    tj7 tj7Var = (tj7) objectVolatile;
                    if (tj7Var instanceof ja1) {
                        na1Var.j((ja1) objectVolatile, th);
                    } else if (tj7Var instanceof nv9) {
                        na1Var.l((nv9) objectVolatile, th);
                    }
                    if (!na1Var.w()) {
                        na1Var.n();
                    }
                    na1Var.o(na1Var.c);
                    return true;
                } else if (unsafe2.getObjectVolatile(na1Var, j) != objectVolatile) {
                    break;
                } else {
                    this = na1Var;
                }
            }
            this = na1Var;
        }
    }

    public final void n() {
        Unsafe unsafe = ex.a;
        long j = h;
        no3 no3Var = (no3) unsafe.getObjectVolatile(this, j);
        if (no3Var == null) {
            return;
        }
        no3Var.dispose();
        unsafe.putObjectVolatile(this, j, sj7.a);
    }

    public final void o(int i) {
        boolean z;
        boolean z2;
        while (true) {
            Unsafe unsafe = ex.a;
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
                    fw2 fw2Var = this.d;
                    if (!z && (fw2Var instanceof ho3)) {
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
                            ho3 ho3Var = (ho3) fw2Var;
                            vw2 vw2Var = ho3Var.d;
                            sw2 context = ho3Var.e.getContext();
                            if (vw2Var.d(context)) {
                                vw2Var.c(context, this);
                                return;
                            }
                            d44 a = dnb.a();
                            if (a.c >= 4294967296L) {
                                ks ksVar = a.e;
                                if (ksVar == null) {
                                    ksVar = new ks();
                                    a.e = ksVar;
                                }
                                ksVar.addLast(this);
                                return;
                            }
                            a.g(true);
                            try {
                                eee.a(this, fw2Var, true);
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
                    eee.a(this, fw2Var, z);
                    return;
                }
                sc8.j("Already resumed");
                return;
            }
            na1 na1Var = this;
            if (unsafe.compareAndSwapInt(na1Var, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            }
            this = na1Var;
        }
    }

    public Throwable p(pt5 pt5Var) {
        return pt5Var.getCancellationException();
    }

    public final Object q() {
        bt5 bt5Var;
        boolean w = w();
        while (true) {
            Unsafe unsafe = ex.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i == 2) {
                    if (w) {
                        this.z();
                    }
                    Object r = this.r();
                    if (!(r instanceof fp2)) {
                        int i2 = this.c;
                        if ((i2 == 1 || i2 == 2) && (bt5Var = (bt5) this.e.get(pd5.c)) != null && !bt5Var.isActive()) {
                            CancellationException cancellationException = bt5Var.getCancellationException();
                            this.c(cancellationException);
                            throw cancellationException;
                        }
                        return this.g(r);
                    }
                    throw ((fp2) r).a;
                }
                sc8.j("Already suspended");
                return null;
            }
            na1 na1Var = this;
            if (unsafe.compareAndSwapInt(na1Var, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((no3) unsafe.getObjectVolatile(na1Var, h)) == null) {
                    na1Var.t();
                }
                if (w) {
                    na1Var.z();
                }
                return bx2.a;
            }
            this = na1Var;
        }
    }

    public final Object r() {
        return ex.a.getObjectVolatile(this, n);
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a = ta9.a(obj);
        if (a != null) {
            obj = new fp2(a, false);
        }
        B(obj, this.c, null);
    }

    public final void s() {
        no3 t = t();
        if (t != null && !(r() instanceof tj7)) {
            t.dispose();
            ex.a.putObjectVolatile(this, h, sj7.a);
        }
    }

    public final no3 t() {
        bt5 bt5Var = (bt5) this.e.get(pd5.c);
        if (bt5Var == null) {
            return null;
        }
        no3 c = nle.c(bt5Var, true, new eg2(this));
        while (true) {
            Unsafe unsafe = ex.a;
            long j = h;
            na1 na1Var = this;
            if (unsafe.compareAndSwapObject(na1Var, j, (Object) null, c) || unsafe.getObjectVolatile(na1Var, j) != null) {
                break;
            }
            this = na1Var;
        }
        return c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(y());
        sb.append('(');
        sb.append(s83.d(this.d));
        sb.append("){");
        Object r = r();
        if (r instanceof tj7) {
            str = "Active";
        } else if (r instanceof pa1) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(s83.a(this));
        return sb.toString();
    }

    public final void u(qp4 qp4Var) {
        v(new ia1(qp4Var, (byte) 1));
    }

    public final void v(defpackage.tj7 r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na1.v(tj7):void");
    }

    public final boolean w() {
        if (this.c == 2) {
            if (ex.a.getObjectVolatile((ho3) this.d, ho3.n) != null) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na1.z():void");
    }
}
