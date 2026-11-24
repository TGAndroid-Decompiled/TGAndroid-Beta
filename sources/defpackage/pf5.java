package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
public final class pf5 implements ip9 {
    public final int a;
    public final tf5 b;
    public int c = -1;

    public pf5(tf5 tf5Var, int i) {
        this.b = tf5Var;
        this.a = i;
    }

    @Override
    public final int a() {
        return 0;
    }

    @Override
    public final void b() {
        int i = this.c;
        tf5 tf5Var = this.b;
        if (i != -2) {
            if (i == -1) {
                tf5Var.C();
                return;
            } else if (i != -3) {
                tf5Var.C();
                tf5Var.M[i].C();
                return;
            } else {
                return;
            }
        }
        tf5Var.b();
        throw new IOException(tb4.y("Unable to bind a sample queue to TrackGroup with MIME type ", tf5Var.Z.a(this.a).d[0].t, "."));
    }

    public final void c() {
        boolean z;
        if (this.c == -1) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        tf5 tf5Var = this.b;
        tf5Var.b();
        tf5Var.b0.getClass();
        int[] iArr = tf5Var.b0;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 == -1) {
            if (tf5Var.a0.contains(tf5Var.Z.a(i))) {
                i2 = -3;
            }
            i2 = -2;
        } else {
            boolean[] zArr = tf5Var.e0;
            if (!zArr[i2]) {
                zArr[i2] = true;
            }
            i2 = -2;
        }
        this.c = i2;
    }

    public final boolean d() {
        int i = this.c;
        if (i != -1 && i != -3 && i != -2) {
            return true;
        }
        return false;
    }

    @Override
    public final int h(sk4 sk4Var, z83 z83Var, int i) {
        fm4 fm4Var;
        if (this.c == -3) {
            z83Var.addFlag(4);
            return -4;
        }
        if (d()) {
            int i2 = this.c;
            tf5 tf5Var = this.b;
            ArrayList arrayList = tf5Var.E;
            if (!tf5Var.A()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((te5) arrayList.get(i4)).w;
                        int length = tf5Var.M.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (tf5Var.e0[i6] && tf5Var.M[i6].E() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    g8c.Y(0, i4, arrayList);
                    te5 te5Var = (te5) arrayList.get(0);
                    fm4 fm4Var2 = te5Var.d;
                    if (!fm4Var2.equals(tf5Var.X)) {
                        tf5Var.w.i(tf5Var.b, fm4Var2, te5Var.e, te5Var.f, te5Var.h);
                    }
                    tf5Var.X = fm4Var2;
                }
                if (arrayList.isEmpty() || ((te5) arrayList.get(0)).h()) {
                    int F = tf5Var.M[i2].F(sk4Var, z83Var, i, tf5Var.k0);
                    if (F == -5) {
                        fm4 fm4Var3 = (fm4) sk4Var.c;
                        fm4Var3.getClass();
                        if (i2 == tf5Var.S) {
                            int b = gle.b(tf5Var.M[i2].E());
                            while (i3 < arrayList.size() && ((te5) arrayList.get(i3)).w != b) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                fm4Var = ((te5) arrayList.get(i3)).d;
                            } else {
                                fm4Var = tf5Var.W;
                                fm4Var.getClass();
                            }
                            fm4Var3 = fm4Var3.d(fm4Var);
                        }
                        sk4Var.c = fm4Var3;
                    }
                    return F;
                }
            }
        }
        return -3;
    }

    @Override
    public final boolean j() {
        if (this.c != -3) {
            if (d()) {
                int i = this.c;
                tf5 tf5Var = this.b;
                if (tf5Var.A() || !tf5Var.M[i].A(tf5Var.k0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int n(long j) {
        Object next;
        Object obj;
        if (d()) {
            int i = this.c;
            tf5 tf5Var = this.b;
            if (!tf5Var.A()) {
                sf5 sf5Var = tf5Var.M[i];
                int x = sf5Var.x(j, tf5Var.k0);
                ArrayList arrayList = tf5Var.E;
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        obj = b00.f(1, arrayList);
                    }
                    obj = null;
                } else {
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        do {
                            next = it.next();
                        } while (it.hasNext());
                        obj = next;
                    }
                    obj = null;
                }
                te5 te5Var = (te5) obj;
                if (te5Var != null && !te5Var.h()) {
                    x = Math.min(x, te5Var.g(i) - sf5Var.v());
                }
                sf5Var.L(x);
                return x;
            }
            return 0;
        }
        return 0;
    }
}
