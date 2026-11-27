package defpackage;

import j$.util.Objects;
public final class s00 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final oz g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public s00(r00 r00Var) {
        this.a = r00Var.a;
        this.b = r00Var.b;
        this.c = r00Var.c;
        this.d = r00Var.d;
        this.e = r00Var.e;
        this.f = r00Var.f;
        this.g = r00Var.g;
        this.h = r00Var.h;
        this.i = r00Var.i;
        this.j = r00Var.j;
        this.k = r00Var.k;
    }

    public final r00 a() {
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
            if (obj != null && s00.class == obj.getClass()) {
                s00 s00Var = (s00) obj;
                if (this.a == s00Var.a && this.b == s00Var.b && this.c == s00Var.c && this.d == s00Var.d && this.e == s00Var.e && this.f == s00Var.f && this.h == s00Var.h && this.i == s00Var.i && this.j == s00Var.j && this.k == s00Var.k && this.g.equals(s00Var.g)) {
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
