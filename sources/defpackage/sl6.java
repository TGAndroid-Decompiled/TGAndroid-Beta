package defpackage;

import j$.util.Objects;
public final class sl6 implements Comparable {
    public final long a;
    public final long b;
    public final long c;

    public sl6(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((sl6) obj).a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl6)) {
            return false;
        }
        sl6 sl6Var = (sl6) obj;
        if (this.a == sl6Var.a && this.b == sl6Var.b && this.c == sl6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c));
    }
}
