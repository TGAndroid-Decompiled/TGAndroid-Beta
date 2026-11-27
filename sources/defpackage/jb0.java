package defpackage;

import j$.util.Objects;
public final class jb0 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final jb0 a() {
        ?? obj = new Object();
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.b = this.b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb0)) {
            return false;
        }
        jb0 jb0Var = (jb0) obj;
        if (this.c == jb0Var.c && this.d == jb0Var.d && this.e == jb0Var.e && this.f == jb0Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
