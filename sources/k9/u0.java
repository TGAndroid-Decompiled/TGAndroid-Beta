package k9;
public final class u0 extends v1 {
    public final Double f10232a;
    public final int f10233b;
    public final boolean f10234c;
    public final int d;
    public final long e;
    public final long f10235f;

    public u0(Double d, int i10, boolean z4, int i11, long j10, long j11) {
        this.f10232a = d;
        this.f10233b = i10;
        this.f10234c = z4;
        this.d = i11;
        this.e = j10;
        this.f10235f = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.f10232a;
            if (d != null ? d.equals(((u0) v1Var).f10232a) : ((u0) v1Var).f10232a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.f10233b == u0Var.f10233b && this.f10234c == u0Var.f10234c && this.d == u0Var.d && this.e == u0Var.e && this.f10235f == u0Var.f10235f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d = this.f10232a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f10233b) * 1000003;
        if (this.f10234c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        long j10 = this.e;
        long j11 = this.f10235f;
        return ((((((i11 ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f10232a);
        sb.append(", batteryVelocity=");
        sb.append(this.f10233b);
        sb.append(", proximityOn=");
        sb.append(this.f10234c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.e);
        sb.append(", diskUsed=");
        return android.support.v4.media.a.q(sb, this.f10235f, "}");
    }
}
