package da;
public final class t0 extends q2 {
    public final long f8182a;
    public final String f8183b;
    public final k2 f8184c;
    public final l2 d;
    public final m2 f8185e;
    public final p2 f8186f;

    public t0(long j3, String str, k2 k2Var, l2 l2Var, m2 m2Var, p2 p2Var) {
        this.f8182a = j3;
        this.f8183b = str;
        this.f8184c = k2Var;
        this.d = l2Var;
        this.f8185e = m2Var;
        this.f8186f = p2Var;
    }

    public final s0 a() {
        ?? obj = new Object();
        obj.f8171a = this.f8182a;
        obj.f8172b = this.f8183b;
        obj.f8173c = this.f8184c;
        obj.d = this.d;
        obj.f8174e = this.f8185e;
        obj.f8175f = this.f8186f;
        obj.f8176g = (byte) 1;
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
            p2 p2Var2 = t0Var.f8186f;
            m2 m2Var2 = t0Var.f8185e;
            if (this.f8182a == t0Var.f8182a && this.f8183b.equals(t0Var.f8183b) && this.f8184c.equals(t0Var.f8184c) && this.d.equals(t0Var.d) && ((m2Var = this.f8185e) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((p2Var = this.f8186f) != null ? p2Var.equals(p2Var2) : p2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8182a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f8183b.hashCode()) * 1000003) ^ this.f8184c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i7 = 0;
        m2 m2Var = this.f8185e;
        if (m2Var == null) {
            hashCode = 0;
        } else {
            hashCode = m2Var.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        p2 p2Var = this.f8186f;
        if (p2Var != null) {
            i7 = p2Var.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f8182a + ", type=" + this.f8183b + ", app=" + this.f8184c + ", device=" + this.d + ", log=" + this.f8185e + ", rollouts=" + this.f8186f + "}";
    }
}
