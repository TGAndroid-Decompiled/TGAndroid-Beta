package defpackage;
public final class oab implements Comparable {
    public final long a;
    public final byte[] b;

    public oab(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((oab) obj).a);
    }
}
