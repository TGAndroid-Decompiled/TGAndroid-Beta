package defpackage;
public final class leb implements Comparable {
    public final long a;
    public final byte[] b;

    public leb(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((leb) obj).a);
    }
}
