package i9;
public final class u0 extends v1 {
    public final Double f8794a;
    public final int f8795b;
    public final boolean f8796c;
    public final int d;
    public final long f8797e;
    public final long f8798f;

    public u0(Double d, int i10, boolean z10, int i11, long j10, long j11) {
        this.f8794a = d;
        this.f8795b = i10;
        this.f8796c = z10;
        this.d = i11;
        this.f8797e = j10;
        this.f8798f = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.f8794a;
            if (d != null ? d.equals(((u0) v1Var).f8794a) : ((u0) v1Var).f8794a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.f8795b == u0Var.f8795b && this.f8796c == u0Var.f8796c && this.d == u0Var.d && this.f8797e == u0Var.f8797e && this.f8798f == u0Var.f8798f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d = this.f8794a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f8795b) * 1000003;
        if (this.f8796c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        long j10 = this.f8797e;
        long j11 = this.f8798f;
        return ((((((i11 ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f8794a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f8795b);
        sb2.append(", proximityOn=");
        sb2.append(this.f8796c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.f8797e);
        sb2.append(", diskUsed=");
        return a4.w.p(sb2, this.f8798f, "}");
    }
}
