package defpackage;

import j$.util.Objects;
public final class nj6 implements Comparable {
    public final long a;
    public final long b;
    public final long c;

    public nj6(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((nj6) obj).a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj6)) {
            return false;
        }
        nj6 nj6Var = (nj6) obj;
        if (this.a == nj6Var.a && this.b == nj6Var.b && this.c == nj6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c));
    }
}
