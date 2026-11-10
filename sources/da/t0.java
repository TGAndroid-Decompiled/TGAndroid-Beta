package da;
public final class t0 extends q2 {
    public final long f8521a;
    public final String f8522b;
    public final k2 f8523c;
    public final l2 d;
    public final m2 f8524e;
    public final p2 f8525f;

    public t0(long j3, String str, k2 k2Var, l2 l2Var, m2 m2Var, p2 p2Var) {
        this.f8521a = j3;
        this.f8522b = str;
        this.f8523c = k2Var;
        this.d = l2Var;
        this.f8524e = m2Var;
        this.f8525f = p2Var;
    }

    public final s0 a() {
        ?? obj = new Object();
        obj.f8510a = this.f8521a;
        obj.f8511b = this.f8522b;
        obj.f8512c = this.f8523c;
        obj.d = this.d;
        obj.f8513e = this.f8524e;
        obj.f8514f = this.f8525f;
        obj.f8515g = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        m2 m2Var;
        p2 p2Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q2) {
            t0 t0Var = (t0) ((q2) obj);
            p2 p2Var2 = t0Var.f8525f;
            m2 m2Var2 = t0Var.f8524e;
            if (this.f8521a == t0Var.f8521a && this.f8522b.equals(t0Var.f8522b) && this.f8523c.equals(t0Var.f8523c) && this.d.equals(t0Var.d) && ((m2Var = this.f8524e) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((p2Var = this.f8525f) != null ? p2Var.equals(p2Var2) : p2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8521a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f8522b.hashCode()) * 1000003) ^ this.f8523c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i7 = 0;
        m2 m2Var = this.f8524e;
        if (m2Var == null) {
            hashCode = 0;
        } else {
            hashCode = m2Var.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        p2 p2Var = this.f8525f;
        if (p2Var != null) {
            i7 = p2Var.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f8521a + ", type=" + this.f8522b + ", app=" + this.f8523c + ", device=" + this.d + ", log=" + this.f8524e + ", rollouts=" + this.f8525f + "}";
    }
}
