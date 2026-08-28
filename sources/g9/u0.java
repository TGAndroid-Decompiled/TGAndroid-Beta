package g9;
public final class u0 extends v1 {
    public final Double f7659a;
    public final int f7660b;
    public final boolean f7661c;
    public final int d;
    public final long f7662e;
    public final long f7663f;

    public u0(Double d, int i9, boolean z10, int i10, long j10, long j11) {
        this.f7659a = d;
        this.f7660b = i9;
        this.f7661c = z10;
        this.d = i10;
        this.f7662e = j10;
        this.f7663f = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.f7659a;
            if (d != null ? d.equals(((u0) v1Var).f7659a) : ((u0) v1Var).f7659a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.f7660b == u0Var.f7660b && this.f7661c == u0Var.f7661c && this.d == u0Var.d && this.f7662e == u0Var.f7662e && this.f7663f == u0Var.f7663f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9;
        Double d = this.f7659a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ this.f7660b) * 1000003;
        if (this.f7661c) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        long j10 = this.f7662e;
        long j11 = this.f7663f;
        return ((((((i10 ^ i9) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f7659a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f7660b);
        sb2.append(", proximityOn=");
        sb2.append(this.f7661c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.f7662e);
        sb2.append(", diskUsed=");
        return aa.d.q(sb2, this.f7663f, "}");
    }
}
