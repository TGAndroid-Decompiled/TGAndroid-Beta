package defpackage;
public final class uh7 implements lf7 {
    public final long a;
    public final long b;
    public final long c;

    public uh7(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override
    public final go4 a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh7)) {
            return false;
        }
        uh7 uh7Var = (uh7) obj;
        if (this.a == uh7Var.a && this.b == uh7Var.b && this.c == uh7Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b = cqe.b(this.b);
        return cqe.b(this.c) + ((b + ((cqe.b(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override
    public final void b(ht6 ht6Var) {
    }
}
