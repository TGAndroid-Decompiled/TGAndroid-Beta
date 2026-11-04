package ca;
public final class g1 extends l2 {
    public final Double f4387a;
    public final int f4388b;
    public final boolean f4389c;
    public final int d;
    public final long f4390e;
    public final long f4391f;

    public g1(Double d, int i3, boolean z10, int i10, long j10, long j11) {
        this.f4387a = d;
        this.f4388b = i3;
        this.f4389c = z10;
        this.d = i10;
        this.f4390e = j10;
        this.f4391f = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l2) {
            l2 l2Var = (l2) obj;
            Double d = this.f4387a;
            if (d != null ? d.equals(((g1) l2Var).f4387a) : ((g1) l2Var).f4387a == null) {
                g1 g1Var = (g1) l2Var;
                if (this.f4388b == g1Var.f4388b && this.f4389c == g1Var.f4389c && this.d == g1Var.d && this.f4390e == g1Var.f4390e && this.f4391f == g1Var.f4391f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i3;
        Double d = this.f4387a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ this.f4388b) * 1000003;
        if (this.f4389c) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        long j10 = this.f4390e;
        long j11 = this.f4391f;
        return ((((((i10 ^ i3) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f4387a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f4388b);
        sb2.append(", proximityOn=");
        sb2.append(this.f4389c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.f4390e);
        sb2.append(", diskUsed=");
        return a1.g.r(sb2, this.f4391f, "}");
    }
}
