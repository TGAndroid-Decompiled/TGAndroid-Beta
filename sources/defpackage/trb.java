package defpackage;
public final class trb {
    public long a;
    public final long b;

    public trb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final String toString() {
        return "Entry{count=" + this.a + ", delta=" + this.b + '}';
    }
}
