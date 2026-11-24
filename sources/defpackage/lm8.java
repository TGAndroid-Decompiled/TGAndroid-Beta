package defpackage;
public final class lm8 extends gna {
    public final byte a;
    public final long b;
    public final long c;

    public lm8(long j, long j2, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = j;
                this.c = j2;
                return;
            default:
                this.b = j2;
                this.c = j;
                return;
        }
    }

    public static long d(long j, yw7 yw7Var) {
        long A = yw7Var.A();
        if ((128 & A) != 0) {
            return ((((A & 1) << 32) | yw7Var.C()) + j) & 8589934591L;
        }
        return -9223372036854775807L;
    }

    @Override
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return kt6.q(sb, this.c, " }");
            default:
                StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb2.append(this.b);
                sb2.append(", playbackPositionUs= ");
                return kt6.q(sb2, this.c, " }");
        }
    }
}
