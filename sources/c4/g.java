package c4;
public final class g implements Comparable {
    public final long f4379a;
    public final byte[] f4380b;

    public g(long j3, byte[] bArr) {
        this.f4379a = j3;
        this.f4380b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f4379a, ((g) obj).f4379a);
    }
}
