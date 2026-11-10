package c4;
public final class g implements Comparable {
    public final long f5279a;
    public final byte[] f5280b;

    public g(long j3, byte[] bArr) {
        this.f5279a = j3;
        this.f5280b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f5279a, ((g) obj).f5279a);
    }
}
