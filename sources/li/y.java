package li;
public final class y {
    public long f12330a = Long.MIN_VALUE;
    public long f12331b = Long.MIN_VALUE;
    public long f12332c = Long.MIN_VALUE;
    public long d;

    public y(long j10) {
        this.d = j10;
    }

    public final long a() {
        long j10 = this.f12332c;
        if (j10 == Long.MIN_VALUE) {
            return 0L;
        }
        return Math.max(1L, this.d) + j10;
    }
}
