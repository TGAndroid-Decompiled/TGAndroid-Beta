package defpackage;
public final class iz0 {
    public final byte a = 1;
    public int b;
    public long c;
    public int d;

    public iz0(long j, int i, int i2) {
        this.c = j;
        this.b = i;
        this.d = i2;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("part{");
                sb.append(this.c);
                sb.append(", ch=");
                sb.append(this.b);
                sb.append(", q=");
                return de9.l(sb, this.d, "}");
            default:
                return super.toString();
        }
    }

    public iz0() {
    }
}
