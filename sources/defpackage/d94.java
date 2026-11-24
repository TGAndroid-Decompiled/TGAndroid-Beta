package defpackage;
public final class d94 {
    public final int a;
    public final long b;

    public d94(long j, int i, long j2) {
        this.a = i;
        this.b = j2;
    }

    public final int hashCode() {
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }
}
