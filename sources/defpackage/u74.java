package defpackage;
public final class u74 {
    public final int a;
    public final long b;

    public u74(long j, int i, long j2) {
        this.a = i;
        this.b = j2;
    }

    public final int hashCode() {
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }
}
