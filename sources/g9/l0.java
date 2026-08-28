package g9;
public final class l0 extends a2 {
    public final long f7585a;
    public final String f7586b;
    public final u1 f7587c;
    public final v1 d;
    public final w1 f7588e;
    public final z1 f7589f;

    public l0(long j10, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f7585a = j10;
        this.f7586b = str;
        this.f7587c = u1Var;
        this.d = v1Var;
        this.f7588e = w1Var;
        this.f7589f = z1Var;
    }

    public final com.google.firebase.messaging.m a() {
        ?? obj = new Object();
        obj.f4160a = Long.valueOf(this.f7585a);
        obj.f4161b = this.f7586b;
        obj.f4162c = this.f7587c;
        obj.d = this.d;
        obj.f4163e = this.f7588e;
        obj.f4164f = this.f7589f;
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
            z1 z1Var2 = l0Var.f7589f;
            w1 w1Var2 = l0Var.f7588e;
            if (this.f7585a == l0Var.f7585a && this.f7586b.equals(l0Var.f7586b) && this.f7587c.equals(l0Var.f7587c) && this.d.equals(l0Var.d) && ((w1Var = this.f7588e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f7589f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f7585a;
        int hashCode2 = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f7586b.hashCode()) * 1000003) ^ this.f7587c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i9 = 0;
        w1 w1Var = this.f7588e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f7589f;
        if (z1Var != null) {
            i9 = z1Var.hashCode();
        }
        return i10 ^ i9;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f7585a + ", type=" + this.f7586b + ", app=" + this.f7587c + ", device=" + this.d + ", log=" + this.f7588e + ", rollouts=" + this.f7589f + "}";
    }
}
