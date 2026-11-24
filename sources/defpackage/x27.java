package defpackage;

import java.util.ArrayList;
public final class x27 implements h53 {
    public static final cs2 b = new cs2(new c61(new o41((byte) 14), jk7.b), new c61(new o41((byte) 15), jk7.c));
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
            long j3 = ((i53) arrayList.get(i)).b;
            long j4 = ((i53) arrayList.get(i)).d;
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
    public final boolean b(i53 i53Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        long j2 = i53Var.b;
        if (j2 != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        jte.f(z);
        if (i53Var.c != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        jte.f(z2);
        if (j2 <= j && j < i53Var.d) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((i53) arrayList.get(size)).b) {
                arrayList.add(size + 1, i53Var);
                return z3;
            }
        }
        arrayList.add(0, i53Var);
        return z3;
    }

    @Override
    public final mo5 c(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((i53) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    i53 i53Var = (i53) arrayList.get(i);
                    if (j >= i53Var.b && j < i53Var.d) {
                        arrayList2.add(i53Var);
                    }
                    if (j < i53Var.b) {
                        break;
                    }
                }
                y79 w = mo5.w(b, arrayList2);
                jo5 p = mo5.p();
                for (int i2 = 0; i2 < w.d; i2++) {
                    p.d(((i53) w.get(i2)).a);
                }
                return p.f();
            }
        }
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final long d(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((i53) arrayList.get(0)).b) {
                long j2 = ((i53) arrayList.get(0)).b;
                for (int i = 0; i < arrayList.size(); i++) {
                    long j3 = ((i53) arrayList.get(i)).b;
                    long j4 = ((i53) arrayList.get(i)).d;
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
                int i2 = (j > ((i53) arrayList.get(i)).b ? 1 : (j == ((i53) arrayList.get(i)).b ? 0 : -1));
                if (i2 > 0 && j > ((i53) arrayList.get(i)).d) {
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
