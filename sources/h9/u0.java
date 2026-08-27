package h9;

public final class u0 extends v1 {

    public final Double f8830a;

    public final int f8831b;

    public final boolean f8832c;
    public final int d;

    public final long f8833e;

    public final long f8834f;

    public u0(Double d, int i10, boolean z10, int i11, long j10, long j11) {
        this.f8830a = d;
        this.f8831b = i10;
        this.f8832c = z10;
        this.d = i11;
        this.f8833e = j10;
        this.f8834f = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.f8830a;
            if (d != null ? d.equals(((u0) v1Var).f8830a) : ((u0) v1Var).f8830a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.f8831b == u0Var.f8831b && this.f8832c == u0Var.f8832c && this.d == u0Var.d && this.f8833e == u0Var.f8833e && this.f8834f == u0Var.f8834f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.f8830a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f8831b) * 1000003) ^ (this.f8832c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j10 = this.f8833e;
        long j11 = this.f8834f;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f8830a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f8831b);
        sb2.append(", proximityOn=");
        sb2.append(this.f8832c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.f8833e);
        sb2.append(", diskUsed=");
        return a9.p.o(sb2, this.f8834f, "}");
    }
}
