package da;
public final class g1 extends l2 {
    public final Double f7748a;
    public final int f7749b;
    public final boolean f7750c;
    public final int d;
    public final long f7751e;
    public final long f7752f;

    public g1(Double d, int i7, boolean z10, int i10, long j3, long j10) {
        this.f7748a = d;
        this.f7749b = i7;
        this.f7750c = z10;
        this.d = i10;
        this.f7751e = j3;
        this.f7752f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l2) {
            l2 l2Var = (l2) obj;
            Double d = this.f7748a;
            if (d != null ? d.equals(((g1) l2Var).f7748a) : ((g1) l2Var).f7748a == null) {
                g1 g1Var = (g1) l2Var;
                if (this.f7749b == g1Var.f7749b && this.f7750c == g1Var.f7750c && this.d == g1Var.d && this.f7751e == g1Var.f7751e && this.f7752f == g1Var.f7752f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7;
        Double d = this.f7748a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ this.f7749b) * 1000003;
        if (this.f7750c) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        long j3 = this.f7751e;
        long j10 = this.f7752f;
        return ((((((i10 ^ i7) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f7748a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f7749b);
        sb2.append(", proximityOn=");
        sb2.append(this.f7750c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.f7751e);
        sb2.append(", diskUsed=");
        return a8.p0.r(sb2, this.f7752f, "}");
    }
}
