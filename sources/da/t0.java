package da;
public final class t0 extends q2 {
    public final long f8181a;
    public final String f8182b;
    public final k2 f8183c;
    public final l2 d;
    public final m2 f8184e;
    public final p2 f8185f;

    public t0(long j3, String str, k2 k2Var, l2 l2Var, m2 m2Var, p2 p2Var) {
        this.f8181a = j3;
        this.f8182b = str;
        this.f8183c = k2Var;
        this.d = l2Var;
        this.f8184e = m2Var;
        this.f8185f = p2Var;
    }

    public final s0 a() {
        ?? obj = new Object();
        obj.f8170a = this.f8181a;
        obj.f8171b = this.f8182b;
        obj.f8172c = this.f8183c;
        obj.d = this.d;
        obj.f8173e = this.f8184e;
        obj.f8174f = this.f8185f;
        obj.f8175g = (byte) 1;
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
            p2 p2Var2 = t0Var.f8185f;
            m2 m2Var2 = t0Var.f8184e;
            if (this.f8181a == t0Var.f8181a && this.f8182b.equals(t0Var.f8182b) && this.f8183c.equals(t0Var.f8183c) && this.d.equals(t0Var.d) && ((m2Var = this.f8184e) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((p2Var = this.f8185f) != null ? p2Var.equals(p2Var2) : p2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8181a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f8182b.hashCode()) * 1000003) ^ this.f8183c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i7 = 0;
        m2 m2Var = this.f8184e;
        if (m2Var == null) {
            hashCode = 0;
        } else {
            hashCode = m2Var.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        p2 p2Var = this.f8185f;
        if (p2Var != null) {
            i7 = p2Var.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f8181a + ", type=" + this.f8182b + ", app=" + this.f8183c + ", device=" + this.d + ", log=" + this.f8184e + ", rollouts=" + this.f8185f + "}";
    }
}
