package k9;
public final class l0 extends a2 {
    public final long f10169a;
    public final String f10170b;
    public final u1 f10171c;
    public final v1 d;
    public final w1 e;
    public final z1 f10172f;

    public l0(long j10, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f10169a = j10;
        this.f10170b = str;
        this.f10171c = u1Var;
        this.d = v1Var;
        this.e = w1Var;
        this.f10172f = z1Var;
    }

    public final a9.a a() {
        ?? obj = new Object();
        obj.f142a = Long.valueOf(this.f10169a);
        obj.f143b = this.f10170b;
        obj.f144c = this.f10171c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f145f = this.f10172f;
        return obj;
    }

    public final boolean equals(Object obj) {
        w1 w1Var;
        z1 z1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2) {
            l0 l0Var = (l0) ((a2) obj);
            z1 z1Var2 = l0Var.f10172f;
            w1 w1Var2 = l0Var.e;
            if (this.f10169a == l0Var.f10169a && this.f10170b.equals(l0Var.f10170b) && this.f10171c.equals(l0Var.f10171c) && this.d.equals(l0Var.d) && ((w1Var = this.e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f10172f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f10169a;
        int hashCode2 = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f10170b.hashCode()) * 1000003) ^ this.f10171c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f10172f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f10169a + ", type=" + this.f10170b + ", app=" + this.f10171c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f10172f + "}";
    }
}
