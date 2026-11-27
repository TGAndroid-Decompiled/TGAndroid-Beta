package defpackage;

import j$.util.Objects;
public final class v61 extends ka {
    public final int c;
    public String d;
    public String e;
    public int f;
    public long g;
    public int h;
    public boolean i;
    public boolean j;

    public v61(int i, String str) {
        super(i, true);
        this.c = -1;
        this.d = str;
    }

    public static v61 b(int i, long j, String str, int i2) {
        v61 v61Var = new v61(11);
        v61Var.f = i;
        v61Var.d = str;
        v61Var.g = j;
        v61Var.h = i2;
        v61Var.j = false;
        return v61Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v61.class == obj.getClass()) {
                v61 v61Var = (v61) obj;
                int i = this.a;
                if (i == v61Var.a) {
                    if (i != 9 && i != 10 && i != 8 && i != 4 && i != 2 && i != 0 && i != 13) {
                        if (i == 3) {
                            return Objects.equals(this.d, v61Var.d);
                        }
                        if (i == 1) {
                            return Objects.equals(this.e, v61Var.e);
                        }
                        if (i == 11) {
                            if (this.f != v61Var.f || this.g != v61Var.g) {
                                return false;
                            }
                        } else if (i != 7 || this.c != v61Var.c) {
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

    public v61(int i, int i2) {
        super(7, true);
        this.c = i;
    }

    public v61(int i) {
        super(i, true);
        this.c = -1;
    }
}
