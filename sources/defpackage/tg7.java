package defpackage;

import java.io.File;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;
public final class tg7 extends vw5 implements qp4 {
    public final byte b;
    public final Serializable c;
    public final Object d;

    public tg7(Serializable serializable, Object obj, byte b) {
        super(1);
        this.b = b;
        this.c = serializable;
        this.d = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        Object ej1Var;
        hj1 hj1Var;
        akc akcVar;
        g5c g5cVar;
        Throwable th;
        byte b = this.b;
        Object obj2 = this.d;
        Serializable serializable = this.c;
        g5c g5cVar2 = g5c.a;
        switch (b) {
            case 0:
                if (rp5.a((String) obj, ((File) serializable).getName())) {
                    fl8 fl8Var = (fl8) obj2;
                    Object d = fl8Var.d(g5cVar2);
                    if (!(d instanceof fj1)) {
                        g5c g5cVar3 = (g5c) d;
                    } else {
                        Object obj3 = ((gj1) ipd.a(new ai1(fl8Var, null, (byte) 2))).a;
                    }
                }
                return g5cVar2;
            default:
                Throwable th2 = (Throwable) obj;
                ((s73) serializable).invoke(th2);
                q01 q01Var = (q01) ((c5a) obj2).d;
                q01Var.c(th2, false);
                do {
                    q01Var.getClass();
                    Unsafe unsafe = ex.a;
                    long longVolatile = unsafe.getLongVolatile(q01Var, q01.y);
                    long longVolatile2 = unsafe.getLongVolatile(q01Var, q01.F);
                    if (q01Var.r(longVolatile2, true)) {
                        ej1Var = new ej1(q01Var.k());
                    } else {
                        int i = (longVolatile > (longVolatile2 & 1152921504606846975L) ? 1 : (longVolatile == (longVolatile2 & 1152921504606846975L) ? 0 : -1));
                        fj1 fj1Var = gj1.b;
                        if (i < 0) {
                            lo5 lo5Var = s01.k;
                            hj1 hj1Var2 = (hj1) unsafe.getObjectVolatile(q01Var, q01.x);
                            while (true) {
                                if (q01Var.s()) {
                                    ej1Var = new ej1(q01Var.k());
                                } else {
                                    long andIncrement = q01.c.getAndIncrement(q01Var);
                                    long j = s01.b;
                                    long j2 = andIncrement / j;
                                    int i2 = (int) (andIncrement % j);
                                    if (hj1Var2.d != j2) {
                                        hj1 h = q01Var.h(j2, hj1Var2);
                                        if (h != null) {
                                            hj1Var = h;
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        hj1Var = hj1Var2;
                                    }
                                    ej1Var = q01Var.C(hj1Var, i2, andIncrement, lo5Var);
                                    hj1Var2 = hj1Var;
                                    if (ej1Var == s01.m) {
                                        if (lo5Var instanceof akc) {
                                            akcVar = (akc) lo5Var;
                                        } else {
                                            akcVar = null;
                                        }
                                        if (akcVar != null) {
                                            akcVar.a(hj1Var2, i2);
                                        }
                                        q01Var.F(andIncrement);
                                        hj1Var2.i();
                                    } else if (ej1Var == s01.o) {
                                        if (andIncrement < q01Var.o()) {
                                            hj1Var2.b();
                                        }
                                    } else if (ej1Var != s01.n) {
                                        hj1Var2.b();
                                    } else {
                                        sc8.j("unexpected");
                                        ej1Var = null;
                                    }
                                }
                            }
                        }
                        ej1Var = fj1Var;
                    }
                    if (ej1Var instanceof fj1) {
                        ej1Var = null;
                    }
                    if (ej1Var != null) {
                        cp2 cp2Var = ((d17) ej1Var).b;
                        if (th2 == null) {
                            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                        } else {
                            th = th2;
                        }
                        cp2Var.P(th);
                        g5cVar = g5cVar2;
                        continue;
                    } else {
                        g5cVar = null;
                        continue;
                    }
                } while (g5cVar != null);
                return g5cVar2;
        }
    }
}
