package defpackage;

import java.io.File;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;
public final class dj7 extends az5 implements ur4 {
    public final byte b;
    public final Serializable c;
    public final Object d;

    public dj7(Serializable serializable, Object obj, byte b) {
        super(1);
        this.b = b;
        this.c = serializable;
        this.d = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        Object nj1Var;
        qj1 qj1Var;
        noc nocVar;
        g9c g9cVar;
        Throwable th;
        byte b = this.b;
        Object obj2 = this.d;
        Serializable serializable = this.c;
        g9c g9cVar2 = g9c.a;
        switch (b) {
            case 0:
                if (ur5.a((String) obj, ((File) serializable).getName())) {
                    so8 so8Var = (so8) obj2;
                    Object d = so8Var.d(g9cVar2);
                    if (!(d instanceof oj1)) {
                        g9c g9cVar3 = (g9c) d;
                    } else {
                        Object obj3 = ((pj1) ytd.a(new ii1(so8Var, null, (byte) 2))).a;
                    }
                }
                return g9cVar2;
            default:
                Throwable th2 = (Throwable) obj;
                ((l83) serializable).invoke(th2);
                z01 z01Var = (z01) ((lyc) obj2).d;
                z01Var.c(th2, false);
                do {
                    z01Var.getClass();
                    Unsafe unsafe = fx.a;
                    long longVolatile = unsafe.getLongVolatile(z01Var, z01.y);
                    long longVolatile2 = unsafe.getLongVolatile(z01Var, z01.F);
                    if (z01Var.r(longVolatile2, true)) {
                        nj1Var = new nj1(z01Var.k());
                    } else {
                        int i = (longVolatile > (longVolatile2 & 1152921504606846975L) ? 1 : (longVolatile == (longVolatile2 & 1152921504606846975L) ? 0 : -1));
                        oj1 oj1Var = pj1.b;
                        if (i < 0) {
                            ow5 ow5Var = b11.k;
                            qj1 qj1Var2 = (qj1) unsafe.getObjectVolatile(z01Var, z01.x);
                            while (true) {
                                if (z01Var.s()) {
                                    nj1Var = new nj1(z01Var.k());
                                } else {
                                    long andIncrement = z01.c.getAndIncrement(z01Var);
                                    long j = b11.b;
                                    long j2 = andIncrement / j;
                                    int i2 = (int) (andIncrement % j);
                                    if (qj1Var2.d != j2) {
                                        qj1 h = z01Var.h(j2, qj1Var2);
                                        if (h != null) {
                                            qj1Var = h;
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        qj1Var = qj1Var2;
                                    }
                                    nj1Var = z01Var.C(qj1Var, i2, andIncrement, ow5Var);
                                    qj1Var2 = qj1Var;
                                    if (nj1Var == b11.m) {
                                        if (ow5Var instanceof noc) {
                                            nocVar = (noc) ow5Var;
                                        } else {
                                            nocVar = null;
                                        }
                                        if (nocVar != null) {
                                            nocVar.a(qj1Var2, i2);
                                        }
                                        z01Var.F(andIncrement);
                                        qj1Var2.i();
                                    } else if (nj1Var == b11.o) {
                                        if (andIncrement < z01Var.o()) {
                                            qj1Var2.b();
                                        }
                                    } else if (nj1Var != b11.n) {
                                        qj1Var2.b();
                                    } else {
                                        grb.i("unexpected");
                                        nj1Var = null;
                                    }
                                }
                            }
                        }
                        nj1Var = oj1Var;
                    }
                    if (nj1Var instanceof oj1) {
                        nj1Var = null;
                    }
                    if (nj1Var != null) {
                        vp2 vp2Var = ((k37) nj1Var).b;
                        if (th2 == null) {
                            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                        } else {
                            th = th2;
                        }
                        vp2Var.P(th);
                        g9cVar = g9cVar2;
                        continue;
                    } else {
                        g9cVar = null;
                        continue;
                    }
                } while (g9cVar != null);
                return g9cVar2;
        }
    }
}
