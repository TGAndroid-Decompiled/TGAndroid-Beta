package defpackage;
public final class da0 extends j03 {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public da0(Double d, int i, boolean z, int i2, long j, long j2) {
        this.a = d;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j03) {
            j03 j03Var = (j03) obj;
            Double d = this.a;
            if (d != null ? d.equals(((da0) j03Var).a) : ((da0) j03Var).a == null) {
                da0 da0Var = (da0) j03Var;
                if (this.b == da0Var.b && this.c == da0Var.c && this.d == da0Var.d && this.e == da0Var.e && this.f == da0Var.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        Double d = this.a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ this.b) * 1000003;
        if (this.c) {
            i = 1231;
        } else {
            i = 1237;
        }
        long j = this.e;
        long j2 = this.f;
        return ((((((i2 ^ i) * 1000003) ^ this.d) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.a);
        sb.append(", batteryVelocity=");
        sb.append(this.b);
        sb.append(", proximityOn=");
        sb.append(this.c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.e);
        sb.append(", diskUsed=");
        return kt6.q(sb, this.f, "}");
    }
}
