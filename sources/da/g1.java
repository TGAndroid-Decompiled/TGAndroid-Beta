package da;
public final class g1 extends l2 {
    public final Double f7751a;
    public final int f7752b;
    public final boolean f7753c;
    public final int d;
    public final long f7754e;
    public final long f7755f;

    public g1(Double d, int i7, boolean z10, int i10, long j3, long j10) {
        this.f7751a = d;
        this.f7752b = i7;
        this.f7753c = z10;
        this.d = i10;
        this.f7754e = j3;
        this.f7755f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l2) {
            l2 l2Var = (l2) obj;
            Double d = this.f7751a;
            if (d != null ? d.equals(((g1) l2Var).f7751a) : ((g1) l2Var).f7751a == null) {
                g1 g1Var = (g1) l2Var;
                if (this.f7752b == g1Var.f7752b && this.f7753c == g1Var.f7753c && this.d == g1Var.d && this.f7754e == g1Var.f7754e && this.f7755f == g1Var.f7755f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7;
        Double d = this.f7751a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ this.f7752b) * 1000003;
        if (this.f7753c) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        long j3 = this.f7754e;
        long j10 = this.f7755f;
        return ((((((i10 ^ i7) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f7751a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f7752b);
        sb2.append(", proximityOn=");
        sb2.append(this.f7753c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.f7754e);
        sb2.append(", diskUsed=");
        return a8.p0.r(sb2, this.f7755f, "}");
    }
}
