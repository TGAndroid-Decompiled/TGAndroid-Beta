package b4;
public final class g implements Comparable {
    public final long f2359a;
    public final byte[] f2360b;

    public g(long j10, byte[] bArr) {
        this.f2359a = j10;
        this.f2360b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f2359a, ((g) obj).f2359a);
    }
}
