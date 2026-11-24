package defpackage;
public final class i86 {
    public final byte a;
    public final long b;

    public i86(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean a() {
        byte b = this.a;
        if (b == 0 || b == 1) {
            return true;
        }
        return false;
    }
}
