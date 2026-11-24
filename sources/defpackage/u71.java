package defpackage;

import j$.util.Objects;
public final class u71 extends ja {
    public final int c;
    public String d;
    public String e;
    public int f;
    public long g;
    public int h;
    public boolean i;
    public boolean j;

    public u71(int i, String str) {
        super(i, true);
        this.c = -1;
        this.d = str;
    }

    public static u71 b(int i, long j, String str, int i2) {
        u71 u71Var = new u71(11);
        u71Var.f = i;
        u71Var.d = str;
        u71Var.g = j;
        u71Var.h = i2;
        u71Var.j = false;
        return u71Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u71.class == obj.getClass()) {
                u71 u71Var = (u71) obj;
                int i = this.a;
                if (i == u71Var.a) {
                    if (i != 9 && i != 10 && i != 8 && i != 4 && i != 2 && i != 0 && i != 13) {
                        if (i == 3) {
                            return Objects.equals(this.d, u71Var.d);
                        }
                        if (i == 1) {
                            return Objects.equals(this.e, u71Var.e);
                        }
                        if (i == 11) {
                            if (this.f != u71Var.f || this.g != u71Var.g) {
                                return false;
                            }
                        } else if (i != 7 || this.c != u71Var.c) {
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

    public u71(int i, int i2) {
        super(7, true);
        this.c = i;
    }

    public u71(int i) {
        super(i, true);
        this.c = -1;
    }
}
