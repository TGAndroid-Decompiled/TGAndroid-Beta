package c4;
public final class g implements Comparable {
    public final long f5274a;
    public final byte[] f5275b;

    public g(long j3, byte[] bArr) {
        this.f5274a = j3;
        this.f5275b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f5274a, ((g) obj).f5274a);
    }
}
