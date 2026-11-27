package defpackage;

import java.util.ArrayList;
public final class e37 implements o43 {
    public static final kr2 b = new kr2(new d51(new p31((byte) 14), qk7.b), new d51(new p31((byte) 15), qk7.c));
    public final ArrayList a = new ArrayList();

    @Override
    public final long a(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j3 = ((p43) arrayList.get(i)).b;
            long j4 = ((p43) arrayList.get(i)).d;
            if (j < j3) {
                if (j2 == -9223372036854775807L) {
                    j2 = j3;
                } else {
                    j2 = Math.min(j2, j3);
                }
            } else {
                if (j < j4) {
                    if (j2 == -9223372036854775807L) {
                        j2 = j4;
                    } else {
                        j2 = Math.min(j2, j4);
                    }
                }
                i++;
            }
        }
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final boolean b(p43 p43Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        long j2 = p43Var.b;
        if (j2 != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        if (p43Var.c != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        yve.f(z2);
        if (j2 <= j && j < p43Var.d) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((p43) arrayList.get(size)).b) {
                arrayList.add(size + 1, p43Var);
                return z3;
            }
        }
        arrayList.add(0, p43Var);
        return z3;
    }

    @Override
    public final po5 c(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((p43) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    p43 p43Var = (p43) arrayList.get(i);
                    if (j >= p43Var.b && j < p43Var.d) {
                        arrayList2.add(p43Var);
                    }
                    if (j < p43Var.b) {
                        break;
                    }
                }
                j99 w = po5.w(b, arrayList2);
                mo5 p = po5.p();
                for (int i2 = 0; i2 < w.d; i2++) {
                    p.d(((p43) w.get(i2)).a);
                }
                return p.f();
            }
        }
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final long d(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((p43) arrayList.get(0)).b) {
                long j2 = ((p43) arrayList.get(0)).b;
                for (int i = 0; i < arrayList.size(); i++) {
                    long j3 = ((p43) arrayList.get(i)).b;
                    long j4 = ((p43) arrayList.get(i)).d;
                    if (j4 <= j) {
                        j2 = Math.max(j2, j4);
                    } else if (j3 > j) {
                        break;
                    } else {
                        j2 = Math.max(j2, j3);
                    }
                }
                return j2;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override
    public final void e(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                int i2 = (j > ((p43) arrayList.get(i)).b ? 1 : (j == ((p43) arrayList.get(i)).b ? 0 : -1));
                if (i2 > 0 && j > ((p43) arrayList.get(i)).d) {
                    arrayList.remove(i);
                    i--;
                } else if (i2 < 0) {
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
