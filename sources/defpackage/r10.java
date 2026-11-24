package defpackage;

import j$.util.Objects;
public final class r10 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final o00 g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public r10(q10 q10Var) {
        this.a = q10Var.a;
        this.b = q10Var.b;
        this.c = q10Var.c;
        this.d = q10Var.d;
        this.e = q10Var.e;
        this.f = q10Var.f;
        this.g = q10Var.g;
        this.h = q10Var.h;
        this.i = q10Var.i;
        this.j = q10Var.j;
        this.k = q10Var.k;
    }

    public final q10 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && r10.class == obj.getClass()) {
                r10 r10Var = (r10) obj;
                if (this.a == r10Var.a && this.b == r10Var.b && this.c == r10Var.c && this.d == r10Var.d && this.e == r10Var.e && this.f == r10Var.f && this.h == r10Var.h && this.i == r10Var.i && this.j == r10Var.j && this.k == r10Var.k && this.g.equals(r10Var.g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
    }
}
