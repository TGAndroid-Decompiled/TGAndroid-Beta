package da;
public final class g1 extends l2 {
    public final Double f8059a;
    public final int f8060b;
    public final boolean f8061c;
    public final int d;
    public final long f8062e;
    public final long f8063f;

    public g1(Double d, int i7, boolean z10, int i10, long j3, long j10) {
        this.f8059a = d;
        this.f8060b = i7;
        this.f8061c = z10;
        this.d = i10;
        this.f8062e = j3;
        this.f8063f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l2) {
            l2 l2Var = (l2) obj;
            Double d = this.f8059a;
            if (d != null ? d.equals(((g1) l2Var).f8059a) : ((g1) l2Var).f8059a == null) {
                g1 g1Var = (g1) l2Var;
                if (this.f8060b == g1Var.f8060b && this.f8061c == g1Var.f8061c && this.d == g1Var.d && this.f8062e == g1Var.f8062e && this.f8063f == g1Var.f8063f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7;
        Double d = this.f8059a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ this.f8060b) * 1000003;
        if (this.f8061c) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        long j3 = this.f8062e;
        long j10 = this.f8063f;
        return ((((((i10 ^ i7) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f8059a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f8060b);
        sb2.append(", proximityOn=");
        sb2.append(this.f8061c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.f8062e);
        sb2.append(", diskUsed=");
        return a8.p0.r(sb2, this.f8063f, "}");
    }
}
