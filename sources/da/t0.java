package da;
public final class t0 extends q2 {
    public final long f8190a;
    public final String f8191b;
    public final k2 f8192c;
    public final l2 d;
    public final m2 f8193e;
    public final p2 f8194f;

    public t0(long j3, String str, k2 k2Var, l2 l2Var, m2 m2Var, p2 p2Var) {
        this.f8190a = j3;
        this.f8191b = str;
        this.f8192c = k2Var;
        this.d = l2Var;
        this.f8193e = m2Var;
        this.f8194f = p2Var;
    }

    public final s0 a() {
        ?? obj = new Object();
        obj.f8179a = this.f8190a;
        obj.f8180b = this.f8191b;
        obj.f8181c = this.f8192c;
        obj.d = this.d;
        obj.f8182e = this.f8193e;
        obj.f8183f = this.f8194f;
        obj.f8184g = (byte) 1;
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
            p2 p2Var2 = t0Var.f8194f;
            m2 m2Var2 = t0Var.f8193e;
            if (this.f8190a == t0Var.f8190a && this.f8191b.equals(t0Var.f8191b) && this.f8192c.equals(t0Var.f8192c) && this.d.equals(t0Var.d) && ((m2Var = this.f8193e) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((p2Var = this.f8194f) != null ? p2Var.equals(p2Var2) : p2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8190a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f8191b.hashCode()) * 1000003) ^ this.f8192c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i7 = 0;
        m2 m2Var = this.f8193e;
        if (m2Var == null) {
            hashCode = 0;
        } else {
            hashCode = m2Var.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        p2 p2Var = this.f8194f;
        if (p2Var != null) {
            i7 = p2Var.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f8190a + ", type=" + this.f8191b + ", app=" + this.f8192c + ", device=" + this.d + ", log=" + this.f8193e + ", rollouts=" + this.f8194f + "}";
    }
}
