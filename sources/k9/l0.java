package k9;
public final class l0 extends a2 {
    public final long f10189a;
    public final String f10190b;
    public final u1 f10191c;
    public final v1 d;
    public final w1 e;
    public final z1 f10192f;

    public l0(long j10, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f10189a = j10;
        this.f10190b = str;
        this.f10191c = u1Var;
        this.d = v1Var;
        this.e = w1Var;
        this.f10192f = z1Var;
    }

    public final a9.a a() {
        ?? obj = new Object();
        obj.f143a = Long.valueOf(this.f10189a);
        obj.f144b = this.f10190b;
        obj.f145c = this.f10191c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f146f = this.f10192f;
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
            z1 z1Var2 = l0Var.f10192f;
            w1 w1Var2 = l0Var.e;
            if (this.f10189a == l0Var.f10189a && this.f10190b.equals(l0Var.f10190b) && this.f10191c.equals(l0Var.f10191c) && this.d.equals(l0Var.d) && ((w1Var = this.e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f10192f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f10189a;
        int hashCode2 = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f10190b.hashCode()) * 1000003) ^ this.f10191c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f10192f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f10189a + ", type=" + this.f10190b + ", app=" + this.f10191c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f10192f + "}";
    }
}
