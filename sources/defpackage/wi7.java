package defpackage;

import java.io.File;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;
public final class wi7 extends vy5 implements rr4 {
    public final byte b;
    public final Serializable c;
    public final Object d;

    public wi7(Serializable serializable, Object obj, byte b) {
        super(1);
        this.b = b;
        this.c = serializable;
        this.d = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        Object mk1Var;
        pk1 pk1Var;
        amc amcVar;
        g7c g7cVar;
        Throwable th;
        byte b = this.b;
        Object obj2 = this.d;
        Serializable serializable = this.c;
        g7c g7cVar2 = g7c.a;
        switch (b) {
            case 0:
                if (rr5.a((String) obj, ((File) serializable).getName())) {
                    hn8 hn8Var = (hn8) obj2;
                    Object d = hn8Var.d(g7cVar2);
                    if (!(d instanceof nk1)) {
                        g7c g7cVar3 = (g7c) d;
                    } else {
                        Object obj3 = ((ok1) lrd.a(new hj1(hn8Var, null, (byte) 2))).a;
                    }
                }
                return g7cVar2;
            default:
                Throwable th2 = (Throwable) obj;
                ((e93) serializable).invoke(th2);
                y11 y11Var = (y11) ((xvc) obj2).d;
                y11Var.c(th2, false);
                do {
                    y11Var.getClass();
                    Unsafe unsafe = fy.a;
                    long longVolatile = unsafe.getLongVolatile(y11Var, y11.y);
                    long longVolatile2 = unsafe.getLongVolatile(y11Var, y11.F);
                    if (y11Var.r(longVolatile2, true)) {
                        mk1Var = new mk1(y11Var.k());
                    } else {
                        int i = (longVolatile > (longVolatile2 & 1152921504606846975L) ? 1 : (longVolatile == (longVolatile2 & 1152921504606846975L) ? 0 : -1));
                        nk1 nk1Var = ok1.b;
                        if (i < 0) {
                            du2 du2Var = a21.k;
                            pk1 pk1Var2 = (pk1) unsafe.getObjectVolatile(y11Var, y11.x);
                            while (true) {
                                if (y11Var.s()) {
                                    mk1Var = new mk1(y11Var.k());
                                } else {
                                    long andIncrement = y11.c.getAndIncrement(y11Var);
                                    long j = a21.b;
                                    long j2 = andIncrement / j;
                                    int i2 = (int) (andIncrement % j);
                                    if (pk1Var2.d != j2) {
                                        pk1 h = y11Var.h(j2, pk1Var2);
                                        if (h != null) {
                                            pk1Var = h;
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        pk1Var = pk1Var2;
                                    }
                                    mk1Var = y11Var.C(pk1Var, i2, andIncrement, du2Var);
                                    pk1Var2 = pk1Var;
                                    if (mk1Var == a21.m) {
                                        if (du2Var instanceof amc) {
                                            amcVar = (amc) du2Var;
                                        } else {
                                            amcVar = null;
                                        }
                                        if (amcVar != null) {
                                            amcVar.a(pk1Var2, i2);
                                        }
                                        y11Var.F(andIncrement);
                                        pk1Var2.i();
                                    } else if (mk1Var == a21.o) {
                                        if (andIncrement < y11Var.o()) {
                                            pk1Var2.b();
                                        }
                                    } else if (mk1Var != a21.n) {
                                        pk1Var2.b();
                                    } else {
                                        dq9.m("unexpected");
                                        mk1Var = null;
                                    }
                                }
                            }
                        }
                        mk1Var = nk1Var;
                    }
                    if (mk1Var instanceof nk1) {
                        mk1Var = null;
                    }
                    if (mk1Var != null) {
                        nq2 nq2Var = ((d37) mk1Var).b;
                        if (th2 == null) {
                            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                        } else {
                            th = th2;
                        }
                        nq2Var.P(th);
                        g7cVar = g7cVar2;
                        continue;
                    } else {
                        g7cVar = null;
                        continue;
                    }
                } while (g7cVar != null);
                return g7cVar2;
        }
    }
}
