package c4;
public final class g implements Comparable {
    public final long f4411a;
    public final byte[] f4412b;

    public g(long j3, byte[] bArr) {
        this.f4411a = j3;
        this.f4412b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f4411a, ((g) obj).f4411a);
    }
}
