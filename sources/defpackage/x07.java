package defpackage;

import java.util.ArrayList;
public final class x07 implements w33 {
    public static final rq2 b = new rq2(new v41(new g31((byte) 14), hi7.b), new v41(new g31((byte) 15), hi7.c));
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
            long j3 = ((x33) arrayList.get(i)).b;
            long j4 = ((x33) arrayList.get(i)).d;
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
    public final boolean b(x33 x33Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        long j2 = x33Var.b;
        if (j2 != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        if (x33Var.c != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        gre.f(z2);
        if (j2 <= j && j < x33Var.d) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((x33) arrayList.get(size)).b) {
                arrayList.add(size + 1, x33Var);
                return z3;
            }
        }
        arrayList.add(0, x33Var);
        return z3;
    }

    @Override
    public final mm5 c(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((x33) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    x33 x33Var = (x33) arrayList.get(i);
                    if (j >= x33Var.b && j < x33Var.d) {
                        arrayList2.add(x33Var);
                    }
                    if (j < x33Var.b) {
                        break;
                    }
                }
                w59 w = mm5.w(b, arrayList2);
                jm5 p = mm5.p();
                for (int i2 = 0; i2 < w.d; i2++) {
                    p.d(((x33) w.get(i2)).a);
                }
                return p.f();
            }
        }
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final long d(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((x33) arrayList.get(0)).b) {
                long j2 = ((x33) arrayList.get(0)).b;
                for (int i = 0; i < arrayList.size(); i++) {
                    long j3 = ((x33) arrayList.get(i)).b;
                    long j4 = ((x33) arrayList.get(i)).d;
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
                int i2 = (j > ((x33) arrayList.get(i)).b ? 1 : (j == ((x33) arrayList.get(i)).b ? 0 : -1));
                if (i2 > 0 && j > ((x33) arrayList.get(i)).d) {
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
