package defpackage;
public final class tab {
    public static final tab c = new tab(-9223372036854775807L, false);
    public long a;
    public boolean b;

    public tab(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final void a(long j) {
        this.a = hq6.r(this.a, j);
    }

    public final void b(boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        a(j);
    }

    public final void c(float f) {
        a(Float.floatToIntBits(f));
    }
}
