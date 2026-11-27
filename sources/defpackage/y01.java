package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class y01 implements noc {
    public Object a = b11.p;
    public va1 b;
    public final z01 c;

    public y01(z01 z01Var) {
        this.c = z01Var;
    }

    @Override
    public final void a(hz9 hz9Var, int i) {
        va1 va1Var = this.b;
        if (va1Var != null) {
            va1Var.a(hz9Var, i);
        }
    }

    public final Object b(om4 om4Var) {
        qj1 qj1Var;
        qj1 qj1Var2;
        Object obj = this.a;
        boolean z = true;
        if (obj == b11.p || obj == b11.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z01.f;
            z01 z01Var = this.c;
            qj1 qj1Var3 = (qj1) atomicReferenceFieldUpdater.get(z01Var);
            while (true) {
                if (z01Var.s()) {
                    this.a = b11.l;
                    Throwable k = z01Var.k();
                    if (k == null) {
                        z = false;
                    } else {
                        int i = lqa.a;
                        throw k;
                    }
                } else {
                    long andIncrement = z01.c.getAndIncrement(z01Var);
                    long j = b11.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (qj1Var3.d != j2) {
                        qj1 h = z01Var.h(j2, qj1Var3);
                        if (h != null) {
                            qj1Var = h;
                        } else {
                            continue;
                        }
                    } else {
                        qj1Var = qj1Var3;
                    }
                    Object C = z01Var.C(qj1Var, i2, andIncrement, null);
                    ow5 ow5Var = b11.m;
                    if (C != ow5Var) {
                        ow5 ow5Var2 = b11.o;
                        if (C == ow5Var2) {
                            if (andIncrement < z01Var.o()) {
                                qj1Var.b();
                            }
                            qj1Var3 = qj1Var;
                        } else if (C == b11.n) {
                            va1 a = yud.a(xpe.a(om4Var));
                            try {
                                this.b = a;
                                Object C2 = z01Var.C(qj1Var, i2, andIncrement, this);
                                if (C2 == ow5Var) {
                                    a(qj1Var, i2);
                                } else {
                                    if (C2 == ow5Var2) {
                                        if (andIncrement < z01Var.o()) {
                                            qj1Var.b();
                                        }
                                        qj1 qj1Var4 = (qj1) z01.f.get(z01Var);
                                        while (true) {
                                            if (z01Var.s()) {
                                                va1 va1Var = this.b;
                                                va1Var.getClass();
                                                this.b = null;
                                                this.a = b11.l;
                                                Throwable k2 = z01Var.k();
                                                if (k2 == null) {
                                                    va1Var.resumeWith(Boolean.FALSE);
                                                } else {
                                                    va1Var.resumeWith(new ge9(k2));
                                                }
                                            } else {
                                                long andIncrement2 = z01.c.getAndIncrement(z01Var);
                                                long j3 = b11.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (qj1Var4.d != j4) {
                                                    qj1 h2 = z01Var.h(j4, qj1Var4);
                                                    if (h2 != null) {
                                                        qj1Var2 = h2;
                                                    } else {
                                                        continue;
                                                    }
                                                } else {
                                                    qj1Var2 = qj1Var4;
                                                }
                                                C2 = z01Var.C(qj1Var2, i3, andIncrement2, this);
                                                hz9 hz9Var = qj1Var2;
                                                if (C2 == b11.m) {
                                                    a(hz9Var, i3);
                                                    break;
                                                } else if (C2 == b11.o) {
                                                    if (andIncrement2 < z01Var.o()) {
                                                        hz9Var.b();
                                                    }
                                                    qj1Var4 = hz9Var;
                                                } else if (C2 != b11.n) {
                                                    hz9Var.b();
                                                } else {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                            }
                                        }
                                    } else {
                                        qj1Var.b();
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
                            qj1Var.b();
                            this.a = C;
                        }
                    } else {
                        grb.i("unreachable");
                        return null;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
