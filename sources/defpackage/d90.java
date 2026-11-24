package defpackage;
public final class d90 extends yy2 {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public d90(Double d, int i, boolean z, int i2, long j, long j2) {
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
        if (obj instanceof yy2) {
            yy2 yy2Var = (yy2) obj;
            Double d = this.a;
            if (d != null ? d.equals(((d90) yy2Var).a) : ((d90) yy2Var).a == null) {
                d90 d90Var = (d90) yy2Var;
                if (this.b == d90Var.b && this.c == d90Var.c && this.d == d90Var.d && this.e == d90Var.e && this.f == d90Var.f) {
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
        return ls6.p(sb, this.f, "}");
    }
}
