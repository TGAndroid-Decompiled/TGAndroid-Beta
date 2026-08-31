package k9;
public final class u0 extends v1 {
    public final Double f11014a;
    public final int f11015b;
    public final boolean f11016c;
    public final int d;
    public final long f11017e;
    public final long f11018f;

    public u0(Double d, int i10, boolean z4, int i11, long j10, long j11) {
        this.f11014a = d;
        this.f11015b = i10;
        this.f11016c = z4;
        this.d = i11;
        this.f11017e = j10;
        this.f11018f = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            v1 v1Var = (v1) obj;
            Double d = this.f11014a;
            if (d != null ? d.equals(((u0) v1Var).f11014a) : ((u0) v1Var).f11014a == null) {
                u0 u0Var = (u0) v1Var;
                if (this.f11015b == u0Var.f11015b && this.f11016c == u0Var.f11016c && this.d == u0Var.d && this.f11017e == u0Var.f11017e && this.f11018f == u0Var.f11018f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d = this.f11014a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f11015b) * 1000003;
        if (this.f11016c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        long j10 = this.f11017e;
        long j11 = this.f11018f;
        return ((((((i11 ^ i10) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f11014a);
        sb.append(", batteryVelocity=");
        sb.append(this.f11015b);
        sb.append(", proximityOn=");
        sb.append(this.f11016c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.f11017e);
        sb.append(", diskUsed=");
        return android.support.v4.media.a.q(sb, this.f11018f, "}");
    }
}
