package da;
public final class t0 extends q2 {
    public final long f8516a;
    public final String f8517b;
    public final k2 f8518c;
    public final l2 d;
    public final m2 f8519e;
    public final p2 f8520f;

    public t0(long j3, String str, k2 k2Var, l2 l2Var, m2 m2Var, p2 p2Var) {
        this.f8516a = j3;
        this.f8517b = str;
        this.f8518c = k2Var;
        this.d = l2Var;
        this.f8519e = m2Var;
        this.f8520f = p2Var;
    }

    public final s0 a() {
        ?? obj = new Object();
        obj.f8505a = this.f8516a;
        obj.f8506b = this.f8517b;
        obj.f8507c = this.f8518c;
        obj.d = this.d;
        obj.f8508e = this.f8519e;
        obj.f8509f = this.f8520f;
        obj.f8510g = (byte) 1;
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
            p2 p2Var2 = t0Var.f8520f;
            m2 m2Var2 = t0Var.f8519e;
            if (this.f8516a == t0Var.f8516a && this.f8517b.equals(t0Var.f8517b) && this.f8518c.equals(t0Var.f8518c) && this.d.equals(t0Var.d) && ((m2Var = this.f8519e) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((p2Var = this.f8520f) != null ? p2Var.equals(p2Var2) : p2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8516a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f8517b.hashCode()) * 1000003) ^ this.f8518c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i7 = 0;
        m2 m2Var = this.f8519e;
        if (m2Var == null) {
            hashCode = 0;
        } else {
            hashCode = m2Var.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        p2 p2Var = this.f8520f;
        if (p2Var != null) {
            i7 = p2Var.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f8516a + ", type=" + this.f8517b + ", app=" + this.f8518c + ", device=" + this.d + ", log=" + this.f8519e + ", rollouts=" + this.f8520f + "}";
    }
}
