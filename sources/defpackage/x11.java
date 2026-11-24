package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class x11 implements amc {
    public Object a = a21.p;
    public vb1 b;
    public final y11 c;

    public x11(y11 y11Var) {
        this.c = y11Var;
    }

    @Override
    public final void a(qx9 qx9Var, int i) {
        vb1 vb1Var = this.b;
        if (vb1Var != null) {
            vb1Var.a(qx9Var, i);
        }
    }

    public final Object b(km4 km4Var) {
        pk1 pk1Var;
        pk1 pk1Var2;
        Object obj = this.a;
        boolean z = true;
        if (obj == a21.p || obj == a21.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y11.f;
            y11 y11Var = this.c;
            pk1 pk1Var3 = (pk1) atomicReferenceFieldUpdater.get(y11Var);
            while (true) {
                if (y11Var.s()) {
                    this.a = a21.l;
                    Throwable k = y11Var.k();
                    if (k == null) {
                        z = false;
                    } else {
                        int i = poa.a;
                        throw k;
                    }
                } else {
                    long andIncrement = y11.c.getAndIncrement(y11Var);
                    long j = a21.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (pk1Var3.d != j2) {
                        pk1 h = y11Var.h(j2, pk1Var3);
                        if (h != null) {
                            pk1Var = h;
                        } else {
                            continue;
                        }
                    } else {
                        pk1Var = pk1Var3;
                    }
                    Object C = y11Var.C(pk1Var, i2, andIncrement, null);
                    du2 du2Var = a21.m;
                    if (C != du2Var) {
                        du2 du2Var2 = a21.o;
                        if (C == du2Var2) {
                            if (andIncrement < y11Var.o()) {
                                pk1Var.b();
                            }
                            pk1Var3 = pk1Var;
                        } else if (C == a21.n) {
                            vb1 a = lsd.a(fne.a(km4Var));
                            try {
                                this.b = a;
                                Object C2 = y11Var.C(pk1Var, i2, andIncrement, this);
                                if (C2 == du2Var) {
                                    a(pk1Var, i2);
                                } else {
                                    if (C2 == du2Var2) {
                                        if (andIncrement < y11Var.o()) {
                                            pk1Var.b();
                                        }
                                        pk1 pk1Var4 = (pk1) y11.f.get(y11Var);
                                        while (true) {
                                            if (y11Var.s()) {
                                                vb1 vb1Var = this.b;
                                                vb1Var.getClass();
                                                this.b = null;
                                                this.a = a21.l;
                                                Throwable k2 = y11Var.k();
                                                if (k2 == null) {
                                                    vb1Var.resumeWith(Boolean.FALSE);
                                                } else {
                                                    vb1Var.resumeWith(new sc9(k2));
                                                }
                                            } else {
                                                long andIncrement2 = y11.c.getAndIncrement(y11Var);
                                                long j3 = a21.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (pk1Var4.d != j4) {
                                                    pk1 h2 = y11Var.h(j4, pk1Var4);
                                                    if (h2 != null) {
                                                        pk1Var2 = h2;
                                                    } else {
                                                        continue;
                                                    }
                                                } else {
                                                    pk1Var2 = pk1Var4;
                                                }
                                                C2 = y11Var.C(pk1Var2, i3, andIncrement2, this);
                                                qx9 qx9Var = pk1Var2;
                                                if (C2 == a21.m) {
                                                    a(qx9Var, i3);
                                                    break;
                                                } else if (C2 == a21.o) {
                                                    if (andIncrement2 < y11Var.o()) {
                                                        qx9Var.b();
                                                    }
                                                    pk1Var4 = qx9Var;
                                                } else if (C2 != a21.n) {
                                                    qx9Var.b();
                                                } else {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                            }
                                        }
                                    } else {
                                        pk1Var.b();
                                    }
                                    this.a = C2;
                                    this.b = null;
                                    a.A(Boolean.TRUE, null);
                                }
                                return a.q();
                            } catch (Throwable th) {
                                a.z();
                                throw th;
                            }
                        } else {
                            pk1Var.b();
                            this.a = C;
                        }
                    } else {
                        dq9.m("unreachable");
                        return null;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
