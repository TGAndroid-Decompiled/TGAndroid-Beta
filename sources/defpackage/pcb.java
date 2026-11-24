package defpackage;
public final class pcb implements Comparable {
    public final long a;
    public final byte[] b;

    public pcb(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((pcb) obj).a);
    }
}
