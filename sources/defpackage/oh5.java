package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
public final class oh5 implements jr9 {
    public final int a;
    public final sh5 b;
    public int c = -1;

    public oh5(sh5 sh5Var, int i) {
        this.b = sh5Var;
        this.a = i;
    }

    @Override
    public final int a() {
        return 0;
    }

    public final void b() {
        boolean z;
        if (this.c == -1) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        sh5 sh5Var = this.b;
        sh5Var.d();
        sh5Var.b0.getClass();
        int[] iArr = sh5Var.b0;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 == -1) {
            if (sh5Var.a0.contains(sh5Var.Z.a(i))) {
                i2 = -3;
            }
            i2 = -2;
        } else {
            boolean[] zArr = sh5Var.e0;
            if (!zArr[i2]) {
                zArr[i2] = true;
            }
            i2 = -2;
        }
        this.c = i2;
    }

    public final boolean c() {
        int i = this.c;
        if (i != -1 && i != -3 && i != -2) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        int i = this.c;
        sh5 sh5Var = this.b;
        if (i != -2) {
            if (i == -1) {
                sh5Var.C();
                return;
            } else if (i != -3) {
                sh5Var.C();
                sh5Var.M[i].C();
                return;
            } else {
                return;
            }
        }
        sh5Var.d();
        throw new IOException(kt6.o("Unable to bind a sample queue to TrackGroup with MIME type ", sh5Var.Z.a(this.a).d[0].t, "."));
    }

    @Override
    public final boolean i() {
        if (this.c != -3) {
            if (c()) {
                int i = this.c;
                sh5 sh5Var = this.b;
                if (sh5Var.z() || !sh5Var.M[i].A(sh5Var.k0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int m(long j) {
        Object next;
        Object obj;
        if (c()) {
            int i = this.c;
            sh5 sh5Var = this.b;
            if (!sh5Var.z()) {
                rh5 rh5Var = sh5Var.M[i];
                int x = rh5Var.x(j, sh5Var.k0);
                ArrayList arrayList = sh5Var.E;
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        obj = b10.f(1, arrayList);
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
                sg5 sg5Var = (sg5) obj;
                if (sg5Var != null && !sg5Var.h()) {
                    x = Math.min(x, sg5Var.g(i) - rh5Var.v());
                }
                rh5Var.L(x);
                return x;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final int p(mj4 mj4Var, la3 la3Var, int i) {
        go4 go4Var;
        if (this.c == -3) {
            la3Var.addFlag(4);
            return -4;
        }
        if (c()) {
            int i2 = this.c;
            sh5 sh5Var = this.b;
            ArrayList arrayList = sh5Var.E;
            if (!sh5Var.z()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((sg5) arrayList.get(i4)).w;
                        int length = sh5Var.M.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (sh5Var.e0[i6] && sh5Var.M[i6].E() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    hac.Y(0, i4, arrayList);
                    sg5 sg5Var = (sg5) arrayList.get(0);
                    go4 go4Var2 = sg5Var.d;
                    if (!go4Var2.equals(sh5Var.X)) {
                        sh5Var.w.i(sh5Var.b, go4Var2, sg5Var.e, sg5Var.f, sg5Var.h);
                    }
                    sh5Var.X = go4Var2;
                }
                if (arrayList.isEmpty() || ((sg5) arrayList.get(0)).h()) {
                    int F = sh5Var.M[i2].F(mj4Var, la3Var, i, sh5Var.k0);
                    if (F == -5) {
                        go4 go4Var3 = (go4) mj4Var.c;
                        go4Var3.getClass();
                        if (i2 == sh5Var.S) {
                            int b = ine.b(sh5Var.M[i2].E());
                            while (i3 < arrayList.size() && ((sg5) arrayList.get(i3)).w != b) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                go4Var = ((sg5) arrayList.get(i3)).d;
                            } else {
                                go4Var = sh5Var.W;
                                go4Var.getClass();
                            }
                            go4Var3 = go4Var3.d(go4Var);
                        }
                        mj4Var.c = go4Var3;
                    }
                    return F;
                }
            }
        }
        return -3;
    }
}
