package defpackage;
public final class ao9 {
    public long a = Long.MIN_VALUE;
    public long b = Long.MIN_VALUE;
    public long c = Long.MIN_VALUE;
    public long d;

    public ao9(long j) {
        this.d = j;
    }

    public final long a() {
        long j = this.c;
        if (j == Long.MIN_VALUE) {
            return 0L;
        }
        return Math.max(1L, this.d) + j;
    }
}
