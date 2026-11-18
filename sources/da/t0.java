package da;
public final class t0 extends q2 {
    public final long f8187a;
    public final String f8188b;
    public final k2 f8189c;
    public final l2 d;
    public final m2 f8190e;
    public final p2 f8191f;

    public t0(long j3, String str, k2 k2Var, l2 l2Var, m2 m2Var, p2 p2Var) {
        this.f8187a = j3;
        this.f8188b = str;
        this.f8189c = k2Var;
        this.d = l2Var;
        this.f8190e = m2Var;
        this.f8191f = p2Var;
    }

    public final s0 a() {
        ?? obj = new Object();
        obj.f8176a = this.f8187a;
        obj.f8177b = this.f8188b;
        obj.f8178c = this.f8189c;
        obj.d = this.d;
        obj.f8179e = this.f8190e;
        obj.f8180f = this.f8191f;
        obj.f8181g = (byte) 1;
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
            p2 p2Var2 = t0Var.f8191f;
            m2 m2Var2 = t0Var.f8190e;
            if (this.f8187a == t0Var.f8187a && this.f8188b.equals(t0Var.f8188b) && this.f8189c.equals(t0Var.f8189c) && this.d.equals(t0Var.d) && ((m2Var = this.f8190e) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((p2Var = this.f8191f) != null ? p2Var.equals(p2Var2) : p2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8187a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f8188b.hashCode()) * 1000003) ^ this.f8189c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i7 = 0;
        m2 m2Var = this.f8190e;
        if (m2Var == null) {
            hashCode = 0;
        } else {
            hashCode = m2Var.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        p2 p2Var = this.f8191f;
        if (p2Var != null) {
            i7 = p2Var.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f8187a + ", type=" + this.f8188b + ", app=" + this.f8189c + ", device=" + this.d + ", log=" + this.f8190e + ", rollouts=" + this.f8191f + "}";
    }
}
