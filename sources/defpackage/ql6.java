package defpackage;

import j$.util.Objects;
public final class ql6 implements Comparable {
    public final long a;
    public final long b;
    public final long c;

    public ql6(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((ql6) obj).a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql6)) {
            return false;
        }
        ql6 ql6Var = (ql6) obj;
        if (this.a == ql6Var.a && this.b == ql6Var.b && this.c == ql6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c));
    }
}
