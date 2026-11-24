package defpackage;
public final class nl6 {
    public long a;
    public int b;
    public int c;
    public Object d;

    public final long a() {
        int i;
        long j = this.a;
        if (j != -1 && j != 0) {
            wh7 wh7Var = (wh7) this.d;
            long j2 = j * wh7Var.g;
            int i2 = this.b;
            if (i2 != -1 && (i = this.c) != -1) {
                j2 -= i2 + i;
            }
            if (j2 > 0) {
                return hac.Z(wh7Var.d, j2 - 1);
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }
}
