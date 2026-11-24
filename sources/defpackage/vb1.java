package defpackage;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;
public class vb1 extends tp3 implements tb1, my2, amc {
    public static final long f;
    public static final long h;
    public static final long n;
    private volatile int _decisionAndIndex$volatile;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;
    public final px2 d;
    public final cy2 e;

    static {
        Unsafe unsafe = fy.a;
        f = unsafe.objectFieldOffset(vb1.class.getDeclaredField("_decisionAndIndex$volatile"));
        n = unsafe.objectFieldOffset(vb1.class.getDeclaredField("_state$volatile"));
        h = unsafe.objectFieldOffset(vb1.class.getDeclaredField("_parentHandle$volatile"));
    }

    public vb1(int i, px2 px2Var) {
        super(i);
        this.d = px2Var;
        this.e = px2Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = h9.a;
    }

    public static Object D(wl7 wl7Var, Object obj, int i, hs4 hs4Var) {
        rb1 rb1Var;
        if (obj instanceof qq2) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (hs4Var == null && !(wl7Var instanceof rb1)) {
            return obj;
        }
        if (wl7Var instanceof rb1) {
            rb1Var = (rb1) wl7Var;
        } else {
            rb1Var = null;
        }
        return new oq2(obj, rb1Var, hs4Var, (CancellationException) null, 16);
    }

    public static void x(wl7 wl7Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + wl7Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, hs4 hs4Var) {
        B(obj, this.c, hs4Var);
    }

    public final void B(Object obj, int i, hs4 hs4Var) {
        vb1 vb1Var;
        while (true) {
            Unsafe unsafe = fy.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof wl7) {
                Object D = D((wl7) objectVolatile, obj, i, hs4Var);
                while (true) {
                    Unsafe unsafe2 = fy.a;
                    vb1Var = this;
                    if (unsafe2.compareAndSwapObject(vb1Var, n, objectVolatile, D)) {
                        if (!vb1Var.w()) {
                            vb1Var.n();
                        }
                        vb1Var.o(i);
                        return;
                    } else if (unsafe2.getObjectVolatile(vb1Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = vb1Var;
                    }
                }
            } else {
                vb1 vb1Var2 = this;
                if (objectVolatile instanceof xb1) {
                    xb1 xb1Var = (xb1) objectVolatile;
                    if (unsafe.compareAndSwapInt(xb1Var, xb1.c, 0, 1)) {
                        if (hs4Var != null) {
                            vb1Var2.k(hs4Var, xb1Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                zo4.p(obj, "Already resumed, but proposed with update ");
                return;
            }
            this = vb1Var;
        }
    }

    public final void C(fy2 fy2Var) {
        rp3 rp3Var;
        fy2 fy2Var2;
        int i;
        px2 px2Var = this.d;
        if (px2Var instanceof rp3) {
            rp3Var = (rp3) px2Var;
        } else {
            rp3Var = null;
        }
        if (rp3Var != null) {
            fy2Var2 = rp3Var.d;
        } else {
            fy2Var2 = null;
        }
        if (fy2Var2 == fy2Var) {
            i = 4;
        } else {
            i = this.c;
        }
        B(g7c.a, i, null);
    }

    public final du2 E(Object obj, hs4 hs4Var) {
        vb1 vb1Var;
        while (true) {
            Unsafe unsafe = fy.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof wl7) {
                Object D = D((wl7) objectVolatile, obj, this.c, hs4Var);
                while (true) {
                    Unsafe unsafe2 = fy.a;
                    vb1Var = this;
                    if (unsafe2.compareAndSwapObject(vb1Var, n, objectVolatile, D)) {
                        boolean w = vb1Var.w();
                        du2 du2Var = g63.a;
                        if (!w) {
                            vb1Var.n();
                        }
                        return du2Var;
                    } else if (unsafe2.getObjectVolatile(vb1Var, j) != objectVolatile) {
                        break;
                    } else {
                        this = vb1Var;
                    }
                }
            } else {
                return null;
            }
            this = vb1Var;
        }
    }

    @Override
    public final void a(qx9 qx9Var, int i) {
        while (true) {
            Unsafe unsafe = fy.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) == 536870911) {
                vb1 vb1Var = this;
                if (unsafe.compareAndSwapInt(vb1Var, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                    vb1Var.v(qx9Var);
                    return;
                }
                this = vb1Var;
            } else {
                dq9.m("invokeOnCancellation should be called at most once");
                return;
            }
        }
    }

    @Override
    public final du2 b(Object obj, hs4 hs4Var) {
        return E(obj, hs4Var);
    }

    @Override
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        vb1 vb1Var;
        while (true) {
            Unsafe unsafe = fy.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof wl7)) {
                if (!(objectVolatile instanceof qq2)) {
                    if (objectVolatile instanceof oq2) {
                        oq2 oq2Var = (oq2) objectVolatile;
                        if (oq2Var.e == null) {
                            oq2 a = oq2.a(oq2Var, null, cancellationException, 15);
                            while (true) {
                                Unsafe unsafe2 = fy.a;
                                vb1 vb1Var2 = this;
                                if (unsafe2.compareAndSwapObject(vb1Var2, n, objectVolatile, a)) {
                                    rb1 rb1Var = oq2Var.b;
                                    if (rb1Var != null) {
                                        vb1Var2.j(rb1Var, cancellationException);
                                    }
                                    hs4 hs4Var = oq2Var.c;
                                    if (hs4Var != null) {
                                        vb1Var2.k(hs4Var, cancellationException, oq2Var.a);
                                        return;
                                    }
                                    return;
                                } else if (unsafe2.getObjectVolatile(vb1Var2, j) != objectVolatile) {
                                    cancellationException2 = cancellationException;
                                    vb1Var = vb1Var2;
                                    break;
                                } else {
                                    this = vb1Var2;
                                }
                            }
                        } else {
                            dq9.m("Must be called at most once");
                            return;
                        }
                    } else {
                        vb1 vb1Var3 = this;
                        CancellationException cancellationException3 = cancellationException;
                        oq2 oq2Var2 = new oq2(objectVolatile, (rb1) null, (hs4) null, cancellationException3, 14);
                        cancellationException2 = cancellationException3;
                        while (true) {
                            oq2 oq2Var3 = oq2Var2;
                            Unsafe unsafe3 = fy.a;
                            vb1Var = vb1Var3;
                            boolean compareAndSwapObject = unsafe3.compareAndSwapObject(vb1Var, n, objectVolatile, oq2Var3);
                            oq2Var2 = oq2Var3;
                            if (compareAndSwapObject) {
                                return;
                            }
                            if (unsafe3.getObjectVolatile(vb1Var, j) != objectVolatile) {
                                break;
                            }
                            vb1Var3 = vb1Var;
                        }
                    }
                    cancellationException = cancellationException2;
                    this = vb1Var;
                } else {
                    return;
                }
            } else {
                dq9.m("Not completed");
                return;
            }
        }
    }

    @Override
    public final px2 d() {
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
        if (obj instanceof oq2) {
            return ((oq2) obj).a;
        }
        return obj;
    }

    @Override
    public final my2 getCallerFrame() {
        px2 px2Var = this.d;
        if (px2Var instanceof my2) {
            return (my2) px2Var;
        }
        return null;
    }

    @Override
    public final cy2 getContext() {
        return this.e;
    }

    @Override
    public final Object i() {
        return r();
    }

    public final void j(rb1 rb1Var, Throwable th) {
        try {
            rb1Var.a(th);
        } catch (Throwable th2) {
            dbe.a(this.e, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(hs4 hs4Var, Throwable th, Object obj) {
        cy2 cy2Var = this.e;
        try {
            hs4Var.a(th, obj, cy2Var);
        } catch (Throwable th2) {
            dbe.a(cy2Var, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(qx9 qx9Var, Throwable th) {
        cy2 cy2Var = this.e;
        int intVolatile = fy.a.getIntVolatile(this, f) & 536870911;
        if (intVolatile != 536870911) {
            try {
                qx9Var.h(intVolatile, cy2Var);
                return;
            } catch (Throwable th2) {
                dbe.a(cy2Var, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        dq9.m("The index for Segment.onCancellation(..) is broken");
    }

    public final boolean m(Throwable th) {
        vb1 vb1Var;
        while (true) {
            Unsafe unsafe = fy.a;
            long j = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            boolean z = false;
            if (!(objectVolatile instanceof wl7)) {
                return false;
            }
            if ((objectVolatile instanceof rb1) || (objectVolatile instanceof qx9)) {
                z = true;
            }
            xb1 xb1Var = new xb1(this, th, z);
            while (true) {
                Unsafe unsafe2 = fy.a;
                vb1Var = this;
                if (unsafe2.compareAndSwapObject(vb1Var, n, objectVolatile, xb1Var)) {
                    wl7 wl7Var = (wl7) objectVolatile;
                    if (wl7Var instanceof rb1) {
                        vb1Var.j((rb1) objectVolatile, th);
                    } else if (wl7Var instanceof qx9) {
                        vb1Var.l((qx9) objectVolatile, th);
                    }
                    if (!vb1Var.w()) {
                        vb1Var.n();
                    }
                    vb1Var.o(vb1Var.c);
                    return true;
                } else if (unsafe2.getObjectVolatile(vb1Var, j) != objectVolatile) {
                    break;
                } else {
                    this = vb1Var;
                }
            }
            this = vb1Var;
        }
    }

    public final void n() {
        Unsafe unsafe = fy.a;
        long j = h;
        xp3 xp3Var = (xp3) unsafe.getObjectVolatile(this, j);
        if (xp3Var == null) {
            return;
        }
        xp3Var.dispose();
        unsafe.putObjectVolatile(this, j, vl7.a);
    }

    public final void o(int i) {
        boolean z;
        boolean z2;
        while (true) {
            Unsafe unsafe = fy.a;
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
                    px2 px2Var = this.d;
                    if (!z && (px2Var instanceof rp3)) {
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
                            rp3 rp3Var = (rp3) px2Var;
                            fy2 fy2Var = rp3Var.d;
                            cy2 context = rp3Var.e.getContext();
                            if (fy2Var.d(context)) {
                                fy2Var.c(context, this);
                                return;
                            }
                            o54 a = epb.a();
                            if (a.c >= 4294967296L) {
                                lt ltVar = a.e;
                                if (ltVar == null) {
                                    ltVar = new lt();
                                    a.e = ltVar;
                                }
                                ltVar.addLast(this);
                                return;
                            }
                            a.g(true);
                            try {
                                fge.a(this, px2Var, true);
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
                    fge.a(this, px2Var, z);
                    return;
                }
                dq9.m("Already resumed");
                return;
            }
            vb1 vb1Var = this;
            if (unsafe.compareAndSwapInt(vb1Var, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            }
            this = vb1Var;
        }
    }

    public Throwable p(ov5 ov5Var) {
        return ov5Var.getCancellationException();
    }

    public final Object q() {
        av5 av5Var;
        boolean w = w();
        while (true) {
            Unsafe unsafe = fy.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i == 2) {
                    if (w) {
                        this.z();
                    }
                    Object r = this.r();
                    if (!(r instanceof qq2)) {
                        int i2 = this.c;
                        if ((i2 == 1 || i2 == 2) && (av5Var = (av5) this.e.get(nf5.c)) != null && !av5Var.isActive()) {
                            CancellationException cancellationException = av5Var.getCancellationException();
                            this.c(cancellationException);
                            throw cancellationException;
                        }
                        return this.g(r);
                    }
                    throw ((qq2) r).a;
                }
                dq9.m("Already suspended");
                return null;
            }
            vb1 vb1Var = this;
            if (unsafe.compareAndSwapInt(vb1Var, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((xp3) unsafe.getObjectVolatile(vb1Var, h)) == null) {
                    vb1Var.t();
                }
                if (w) {
                    vb1Var.z();
                }
                return ly2.a;
            }
            this = vb1Var;
        }
    }

    public final Object r() {
        return fy.a.getObjectVolatile(this, n);
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable a = tc9.a(obj);
        if (a != null) {
            obj = new qq2(a, false);
        }
        B(obj, this.c, null);
    }

    public final void s() {
        xp3 t = t();
        if (t != null && !(r() instanceof wl7)) {
            t.dispose();
            fy.a.putObjectVolatile(this, h, vl7.a);
        }
    }

    public final xp3 t() {
        av5 av5Var = (av5) this.e.get(nf5.c);
        if (av5Var == null) {
            return null;
        }
        xp3 c = pne.c(av5Var, true, new sh2(this));
        while (true) {
            Unsafe unsafe = fy.a;
            long j = h;
            vb1 vb1Var = this;
            if (unsafe.compareAndSwapObject(vb1Var, j, (Object) null, c) || unsafe.getObjectVolatile(vb1Var, j) != null) {
                break;
            }
            this = vb1Var;
        }
        return c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(y());
        sb.append('(');
        sb.append(ea3.d(this.d));
        sb.append("){");
        Object r = r();
        if (r instanceof wl7) {
            str = "Active";
        } else if (r instanceof xb1) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(ea3.a(this));
        return sb.toString();
    }

    public final void u(rr4 rr4Var) {
        v(new qb1(rr4Var, (byte) 1));
    }

    public final void v(defpackage.wl7 r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb1.v(wl7):void");
    }

    public final boolean w() {
        if (this.c == 2) {
            if (fy.a.getObjectVolatile((rp3) this.d, rp3.n) != null) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb1.z():void");
    }
}
