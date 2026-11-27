package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
public final class rh5 implements at9 {
    public final int a;
    public final vh5 b;
    public int c = -1;

    public rh5(vh5 vh5Var, int i) {
        this.b = vh5Var;
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
        yve.f(z);
        vh5 vh5Var = this.b;
        vh5Var.g();
        vh5Var.b0.getClass();
        int[] iArr = vh5Var.b0;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 == -1) {
            if (vh5Var.a0.contains(vh5Var.Z.a(i))) {
                i2 = -3;
            }
            i2 = -2;
        } else {
            boolean[] zArr = vh5Var.e0;
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
    public final void g() {
        int i = this.c;
        vh5 vh5Var = this.b;
        if (i != -2) {
            if (i == -1) {
                vh5Var.B();
                return;
            } else if (i != -3) {
                vh5Var.B();
                vh5Var.M[i].C();
                return;
            } else {
                return;
            }
        }
        vh5Var.g();
        throw new IOException(qd4.y("Unable to bind a sample queue to TrackGroup with MIME type ", vh5Var.Z.a(this.a).d[0].t, "."));
    }

    @Override
    public final int i(ym4 ym4Var, s93 s93Var, int i) {
        ko4 ko4Var;
        if (this.c == -3) {
            s93Var.addFlag(4);
            return -4;
        }
        if (c()) {
            int i2 = this.c;
            vh5 vh5Var = this.b;
            ArrayList arrayList = vh5Var.E;
            if (!vh5Var.z()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((vg5) arrayList.get(i4)).w;
                        int length = vh5Var.M.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (vh5Var.e0[i6] && vh5Var.M[i6].E() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    gcc.Y(0, i4, arrayList);
                    vg5 vg5Var = (vg5) arrayList.get(0);
                    ko4 ko4Var2 = vg5Var.d;
                    if (!ko4Var2.equals(vh5Var.X)) {
                        vh5Var.w.i(vh5Var.b, ko4Var2, vg5Var.e, vg5Var.f, vg5Var.h);
                    }
                    vh5Var.X = ko4Var2;
                }
                if (arrayList.isEmpty() || ((vg5) arrayList.get(0)).h()) {
                    int F = vh5Var.M[i2].F(ym4Var, s93Var, i, vh5Var.k0);
                    if (F == -5) {
                        ko4 ko4Var3 = (ko4) ym4Var.c;
                        ko4Var3.getClass();
                        if (i2 == vh5Var.S) {
                            int b = ype.b(vh5Var.M[i2].E());
                            while (i3 < arrayList.size() && ((vg5) arrayList.get(i3)).w != b) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                ko4Var = ((vg5) arrayList.get(i3)).d;
                            } else {
                                ko4Var = vh5Var.W;
                                ko4Var.getClass();
                            }
                            ko4Var3 = ko4Var3.d(ko4Var);
                        }
                        ym4Var.c = ko4Var3;
                    }
                    return F;
                }
            }
        }
        return -3;
    }

    @Override
    public final boolean k() {
        if (this.c != -3) {
            if (c()) {
                int i = this.c;
                vh5 vh5Var = this.b;
                if (vh5Var.z() || !vh5Var.M[i].A(vh5Var.k0)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int o(long j) {
        Object next;
        Object obj;
        if (c()) {
            int i = this.c;
            vh5 vh5Var = this.b;
            if (!vh5Var.z()) {
                uh5 uh5Var = vh5Var.M[i];
                int x = uh5Var.x(j, vh5Var.k0);
                ArrayList arrayList = vh5Var.E;
                if (arrayList != null) {
                    if (!arrayList.isEmpty()) {
                        obj = c00.g(1, arrayList);
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
                vg5 vg5Var = (vg5) obj;
                if (vg5Var != null && !vg5Var.h()) {
                    x = Math.min(x, vg5Var.g(i) - uh5Var.v());
                }
                uh5Var.L(x);
                return x;
            }
            return 0;
        }
        return 0;
    }
}
