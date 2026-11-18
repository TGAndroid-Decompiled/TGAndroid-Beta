package c4;
public final class g implements Comparable {
    public final long f4382a;
    public final byte[] f4383b;

    public g(long j3, byte[] bArr) {
        this.f4382a = j3;
        this.f4383b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f4382a, ((g) obj).f4382a);
    }
}
