package c4;
public final class g implements Comparable {
    public final long f4101a;
    public final byte[] f4102b;

    public g(long j3, byte[] bArr) {
        this.f4101a = j3;
        this.f4102b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f4101a, ((g) obj).f4101a);
    }
}
