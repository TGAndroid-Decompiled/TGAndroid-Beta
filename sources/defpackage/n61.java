package defpackage;

import j$.util.Objects;
public final class n61 extends ja {
    public final int c;
    public String d;
    public String e;
    public int f;
    public long g;
    public int h;
    public boolean i;
    public boolean j;

    public n61(int i, String str) {
        super(i, true);
        this.c = -1;
        this.d = str;
    }

    public static n61 b(int i, long j, String str, int i2) {
        n61 n61Var = new n61(11);
        n61Var.f = i;
        n61Var.d = str;
        n61Var.g = j;
        n61Var.h = i2;
        n61Var.j = false;
        return n61Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n61.class == obj.getClass()) {
                n61 n61Var = (n61) obj;
                int i = this.a;
                if (i == n61Var.a) {
                    if (i != 9 && i != 10 && i != 8 && i != 4 && i != 2 && i != 0 && i != 13) {
                        if (i == 3) {
                            return Objects.equals(this.d, n61Var.d);
                        }
                        if (i == 1) {
                            return Objects.equals(this.e, n61Var.e);
                        }
                        if (i == 11) {
                            if (this.f != n61Var.f || this.g != n61Var.g) {
                                return false;
                            }
                        } else if (i != 7 || this.c != n61Var.c) {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public n61(int i, int i2) {
        super(7, true);
        this.c = i;
    }

    public n61(int i) {
        super(i, true);
        this.c = -1;
    }
}
