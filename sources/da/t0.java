package da;
public final class t0 extends q2 {
    public final long f7908a;
    public final String f7909b;
    public final k2 f7910c;
    public final l2 d;
    public final m2 f7911e;
    public final p2 f7912f;

    public t0(long j3, String str, k2 k2Var, l2 l2Var, m2 m2Var, p2 p2Var) {
        this.f7908a = j3;
        this.f7909b = str;
        this.f7910c = k2Var;
        this.d = l2Var;
        this.f7911e = m2Var;
        this.f7912f = p2Var;
    }

    public final s0 a() {
        ?? obj = new Object();
        obj.f7897a = this.f7908a;
        obj.f7898b = this.f7909b;
        obj.f7899c = this.f7910c;
        obj.d = this.d;
        obj.f7900e = this.f7911e;
        obj.f7901f = this.f7912f;
        obj.f7902g = (byte) 1;
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
            p2 p2Var2 = t0Var.f7912f;
            m2 m2Var2 = t0Var.f7911e;
            if (this.f7908a == t0Var.f7908a && this.f7909b.equals(t0Var.f7909b) && this.f7910c.equals(t0Var.f7910c) && this.d.equals(t0Var.d) && ((m2Var = this.f7911e) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((p2Var = this.f7912f) != null ? p2Var.equals(p2Var2) : p2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f7908a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f7909b.hashCode()) * 1000003) ^ this.f7910c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i7 = 0;
        m2 m2Var = this.f7911e;
        if (m2Var == null) {
            hashCode = 0;
        } else {
            hashCode = m2Var.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        p2 p2Var = this.f7912f;
        if (p2Var != null) {
            i7 = p2Var.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f7908a + ", type=" + this.f7909b + ", app=" + this.f7910c + ", device=" + this.d + ", log=" + this.f7911e + ", rollouts=" + this.f7912f + "}";
    }
}
