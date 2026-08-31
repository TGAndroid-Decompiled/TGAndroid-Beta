package k9;
public final class l0 extends a2 {
    public final long f10940a;
    public final String f10941b;
    public final u1 f10942c;
    public final v1 d;
    public final w1 f10943e;
    public final z1 f10944f;

    public l0(long j10, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f10940a = j10;
        this.f10941b = str;
        this.f10942c = u1Var;
        this.d = v1Var;
        this.f10943e = w1Var;
        this.f10944f = z1Var;
    }

    public final a9.a a() {
        ?? obj = new Object();
        obj.f155a = Long.valueOf(this.f10940a);
        obj.f156b = this.f10941b;
        obj.f157c = this.f10942c;
        obj.d = this.d;
        obj.f158e = this.f10943e;
        obj.f159f = this.f10944f;
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
            z1 z1Var2 = l0Var.f10944f;
            w1 w1Var2 = l0Var.f10943e;
            if (this.f10940a == l0Var.f10940a && this.f10941b.equals(l0Var.f10941b) && this.f10942c.equals(l0Var.f10942c) && this.d.equals(l0Var.d) && ((w1Var = this.f10943e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f10944f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f10940a;
        int hashCode2 = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f10941b.hashCode()) * 1000003) ^ this.f10942c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.f10943e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f10944f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f10940a + ", type=" + this.f10941b + ", app=" + this.f10942c + ", device=" + this.d + ", log=" + this.f10943e + ", rollouts=" + this.f10944f + "}";
    }
}
