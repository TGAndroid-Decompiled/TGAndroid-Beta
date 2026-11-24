package defpackage;

import j$.util.Objects;
public final class r00 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final nz g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public r00(q00 q00Var) {
        this.a = q00Var.a;
        this.b = q00Var.b;
        this.c = q00Var.c;
        this.d = q00Var.d;
        this.e = q00Var.e;
        this.f = q00Var.f;
        this.g = q00Var.g;
        this.h = q00Var.h;
        this.i = q00Var.i;
        this.j = q00Var.j;
        this.k = q00Var.k;
    }

    public final q00 a() {
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
            if (obj != null && r00.class == obj.getClass()) {
                r00 r00Var = (r00) obj;
                if (this.a == r00Var.a && this.b == r00Var.b && this.c == r00Var.c && this.d == r00Var.d && this.e == r00Var.e && this.f == r00Var.f && this.h == r00Var.h && this.i == r00Var.i && this.j == r00Var.j && this.k == r00Var.k && this.g.equals(r00Var.g)) {
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
