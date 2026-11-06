package c4;
public final class g implements Comparable {
    public final long f5276a;
    public final byte[] f5277b;

    public g(long j3, byte[] bArr) {
        this.f5276a = j3;
        this.f5277b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f5276a, ((g) obj).f5276a);
    }
}
