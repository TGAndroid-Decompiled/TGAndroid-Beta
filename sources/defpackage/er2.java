package defpackage;

import java.util.List;
public final class er2 implements i8a {
    public final j99 a;
    public long b;

    public er2(List list, List list2) {
        boolean z;
        mo5 p = po5.p();
        if (list.size() == list2.size()) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        for (int i = 0; i < list.size(); i++) {
            p.c(new dr2((i8a) list.get(i), (List) list2.get(i)));
        }
        this.a = p.f();
        this.b = -9223372036854775807L;
    }

    @Override
    public final boolean e() {
        int i = 0;
        while (true) {
            j99 j99Var = this.a;
            if (i >= j99Var.d) {
                return false;
            }
            if (((dr2) j99Var.get(i)).a.e()) {
                return true;
            }
            i++;
        }
    }

    @Override
    public final long h() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            j99 j99Var = this.a;
            if (i >= j99Var.d) {
                break;
            }
            long h = ((dr2) j99Var.get(i)).a.h();
            if (h != Long.MIN_VALUE) {
                j = Math.min(j, h);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override
    public final boolean s(xa6 xa6Var) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        do {
            long h = h();
            if (h == Long.MIN_VALUE) {
                return z3;
            }
            int i = 0;
            z = false;
            while (true) {
                j99 j99Var = this.a;
                if (i < j99Var.d) {
                    long h2 = ((dr2) j99Var.get(i)).a.h();
                    if (h2 != Long.MIN_VALUE && h2 <= xa6Var.a) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (h2 == h || z2) {
                        z |= ((dr2) j99Var.get(i)).a.s(xa6Var);
                    }
                    i++;
                } else {
                    z3 |= z;
                }
            }
        } while (z);
        return z3;
    }

    @Override
    public final long t() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            j99 j99Var = this.a;
            if (i >= j99Var.d) {
                break;
            }
            dr2 dr2Var = (dr2) j99Var.get(i);
            long t = dr2Var.a.t();
            po5 po5Var = dr2Var.b;
            if ((po5Var.contains(1) || po5Var.contains(2) || po5Var.contains(4)) && t != Long.MIN_VALUE) {
                j = Math.min(j, t);
            }
            if (t != Long.MIN_VALUE) {
                j2 = Math.min(j2, t);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.b = j;
            return j;
        } else if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j3 = this.b;
            if (j3 != -9223372036854775807L) {
                return j3;
            }
            return j2;
        }
    }

    @Override
    public final void u(long j) {
        int i = 0;
        while (true) {
            j99 j99Var = this.a;
            if (i < j99Var.d) {
                ((dr2) j99Var.get(i)).u(j);
                i++;
            } else {
                return;
            }
        }
    }
}
