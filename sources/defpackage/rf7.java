package defpackage;
public final class rf7 implements jd7 {
    public final long a;
    public final long b;
    public final long c;

    public rf7(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override
    public final fm4 a() {
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
        if (!(obj instanceof rf7)) {
            return false;
        }
        rf7 rf7Var = (rf7) obj;
        if (this.a == rf7Var.a && this.b == rf7Var.b && this.c == rf7Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b = zne.b(this.b);
        return zne.b(this.c) + ((b + ((zne.b(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    @Override
    public final void b(hr6 hr6Var) {
    }
}
