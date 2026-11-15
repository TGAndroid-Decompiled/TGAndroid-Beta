package c4;
public final class g implements Comparable {
    public final long f4098a;
    public final byte[] f4099b;

    public g(long j3, byte[] bArr) {
        this.f4098a = j3;
        this.f4099b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f4098a, ((g) obj).f4098a);
    }
}
