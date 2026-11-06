package da;
public final class t0 extends q2 {
    public final long f8518a;
    public final String f8519b;
    public final k2 f8520c;
    public final l2 d;
    public final m2 f8521e;
    public final p2 f8522f;

    public t0(long j3, String str, k2 k2Var, l2 l2Var, m2 m2Var, p2 p2Var) {
        this.f8518a = j3;
        this.f8519b = str;
        this.f8520c = k2Var;
        this.d = l2Var;
        this.f8521e = m2Var;
        this.f8522f = p2Var;
    }

    public final s0 a() {
        ?? obj = new Object();
        obj.f8507a = this.f8518a;
        obj.f8508b = this.f8519b;
        obj.f8509c = this.f8520c;
        obj.d = this.d;
        obj.f8510e = this.f8521e;
        obj.f8511f = this.f8522f;
        obj.f8512g = (byte) 1;
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
            p2 p2Var2 = t0Var.f8522f;
            m2 m2Var2 = t0Var.f8521e;
            if (this.f8518a == t0Var.f8518a && this.f8519b.equals(t0Var.f8519b) && this.f8520c.equals(t0Var.f8520c) && this.d.equals(t0Var.d) && ((m2Var = this.f8521e) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((p2Var = this.f8522f) != null ? p2Var.equals(p2Var2) : p2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8518a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f8519b.hashCode()) * 1000003) ^ this.f8520c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i7 = 0;
        m2 m2Var = this.f8521e;
        if (m2Var == null) {
            hashCode = 0;
        } else {
            hashCode = m2Var.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        p2 p2Var = this.f8522f;
        if (p2Var != null) {
            i7 = p2Var.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f8518a + ", type=" + this.f8519b + ", app=" + this.f8520c + ", device=" + this.d + ", log=" + this.f8521e + ", rollouts=" + this.f8522f + "}";
    }
}
