package defpackage;

import j$.util.Objects;
public final class hc0 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final hc0 a() {
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
        if (!(obj instanceof hc0)) {
            return false;
        }
        hc0 hc0Var = (hc0) obj;
        if (this.c == hc0Var.c && this.d == hc0Var.d && this.e == hc0Var.e && this.f == hc0Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
