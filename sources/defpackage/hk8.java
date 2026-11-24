package defpackage;
public final class hk8 extends fla {
    public final byte a;
    public final long b;
    public final long c;

    public hk8(long j, long j2, byte b) {
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

    public static long d(long j, xu7 xu7Var) {
        long A = xu7Var.A();
        if ((128 & A) != 0) {
            return ((((A & 1) << 32) | xu7Var.C()) + j) & 8589934591L;
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
                return ls6.p(sb, this.c, " }");
            default:
                StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb2.append(this.b);
                sb2.append(", playbackPositionUs= ");
                return ls6.p(sb2, this.c, " }");
        }
    }
}
