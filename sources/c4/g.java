package c4;
public final class g implements Comparable {
    public final long f4374a;
    public final byte[] f4375b;

    public g(long j3, byte[] bArr) {
        this.f4374a = j3;
        this.f4375b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f4374a, ((g) obj).f4374a);
    }
}
