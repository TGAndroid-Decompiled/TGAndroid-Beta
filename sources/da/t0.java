package da;
public final class t0 extends q2 {
    public final long f7905a;
    public final String f7906b;
    public final k2 f7907c;
    public final l2 d;
    public final m2 f7908e;
    public final p2 f7909f;

    public t0(long j3, String str, k2 k2Var, l2 l2Var, m2 m2Var, p2 p2Var) {
        this.f7905a = j3;
        this.f7906b = str;
        this.f7907c = k2Var;
        this.d = l2Var;
        this.f7908e = m2Var;
        this.f7909f = p2Var;
    }

    public final s0 a() {
        ?? obj = new Object();
        obj.f7894a = this.f7905a;
        obj.f7895b = this.f7906b;
        obj.f7896c = this.f7907c;
        obj.d = this.d;
        obj.f7897e = this.f7908e;
        obj.f7898f = this.f7909f;
        obj.f7899g = (byte) 1;
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
            p2 p2Var2 = t0Var.f7909f;
            m2 m2Var2 = t0Var.f7908e;
            if (this.f7905a == t0Var.f7905a && this.f7906b.equals(t0Var.f7906b) && this.f7907c.equals(t0Var.f7907c) && this.d.equals(t0Var.d) && ((m2Var = this.f7908e) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((p2Var = this.f7909f) != null ? p2Var.equals(p2Var2) : p2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f7905a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f7906b.hashCode()) * 1000003) ^ this.f7907c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i7 = 0;
        m2 m2Var = this.f7908e;
        if (m2Var == null) {
            hashCode = 0;
        } else {
            hashCode = m2Var.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        p2 p2Var = this.f7909f;
        if (p2Var != null) {
            i7 = p2Var.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f7905a + ", type=" + this.f7906b + ", app=" + this.f7907c + ", device=" + this.d + ", log=" + this.f7908e + ", rollouts=" + this.f7909f + "}";
    }
}
