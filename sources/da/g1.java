package da;
public final class g1 extends l2 {
    public final Double f8364a;
    public final int f8365b;
    public final boolean f8366c;
    public final int d;
    public final long f8367e;
    public final long f8368f;

    public g1(Double d, int i7, boolean z9, int i10, long j3, long j10) {
        this.f8364a = d;
        this.f8365b = i7;
        this.f8366c = z9;
        this.d = i10;
        this.f8367e = j3;
        this.f8368f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l2) {
            l2 l2Var = (l2) obj;
            Double d = this.f8364a;
            if (d != null ? d.equals(((g1) l2Var).f8364a) : ((g1) l2Var).f8364a == null) {
                g1 g1Var = (g1) l2Var;
                if (this.f8365b == g1Var.f8365b && this.f8366c == g1Var.f8366c && this.d == g1Var.d && this.f8367e == g1Var.f8367e && this.f8368f == g1Var.f8368f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7;
        Double d = this.f8364a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ this.f8365b) * 1000003;
        if (this.f8366c) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        long j3 = this.f8367e;
        long j10 = this.f8368f;
        return ((((((i10 ^ i7) * 1000003) ^ this.d) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f8364a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f8365b);
        sb2.append(", proximityOn=");
        sb2.append(this.f8366c);
        sb2.append(", orientation=");
        sb2.append(this.d);
        sb2.append(", ramUsed=");
        sb2.append(this.f8367e);
        sb2.append(", diskUsed=");
        return a8.p0.r(sb2, this.f8368f, "}");
    }
}
