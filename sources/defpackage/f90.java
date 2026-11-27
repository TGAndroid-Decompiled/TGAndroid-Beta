package defpackage;
public final class f90 extends tz2 {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public f90(Double d, int i, boolean z, int i2, long j, long j2) {
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
        if (obj instanceof tz2) {
            tz2 tz2Var = (tz2) obj;
            Double d = this.a;
            if (d != null ? d.equals(((f90) tz2Var).a) : ((f90) tz2Var).a == null) {
                f90 f90Var = (f90) tz2Var;
                if (this.b == f90Var.b && this.c == f90Var.c && this.d == f90Var.d && this.e == f90Var.e && this.f == f90Var.f) {
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
        return qu6.p(sb, this.f, "}");
    }
}
