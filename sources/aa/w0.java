package aa;
public final class w0 extends x1 {
    public final Double f1219a;
    public final int f1220b;
    public final boolean f1221c;
    public final int d;
    public final long e;
    public final long f1222f;

    public w0(Double d, int i10, boolean z10, int i11, long j10, long j11) {
        this.f1219a = d;
        this.f1220b = i10;
        this.f1221c = z10;
        this.d = i11;
        this.e = j10;
        this.f1222f = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            x1 x1Var = (x1) obj;
            Double d = this.f1219a;
            if (d != null ? d.equals(((w0) x1Var).f1219a) : ((w0) x1Var).f1219a == null) {
                w0 w0Var = (w0) x1Var;
                if (this.f1220b == w0Var.f1220b && this.f1221c == w0Var.f1221c && this.d == w0Var.d && this.e == w0Var.e && this.f1222f == w0Var.f1222f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d = this.f1219a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f1220b) * 1000003;
        if (this.f1221c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        long j10 = this.e;
        long j11 = this.f1222f;
        return ((((((i11 ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f1219a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f1220b);
        sb2.append(", proximityOn=");
        sb2.append(this.f1221c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.e);
        sb2.append(", diskUsed=");
        return a1.g.r(sb2, this.f1222f, "}");
    }
}
