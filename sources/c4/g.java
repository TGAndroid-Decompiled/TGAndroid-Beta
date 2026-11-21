package c4;
public final class g implements Comparable {
    public final long f4408a;
    public final byte[] f4409b;

    public g(long j3, byte[] bArr) {
        this.f4408a = j3;
        this.f4409b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.f4408a, ((g) obj).f4408a);
    }
}
