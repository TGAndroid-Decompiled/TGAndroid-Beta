package ca;
public final class t0 extends q2 {
    public final long f4544a;
    public final String f4545b;
    public final k2 f4546c;
    public final l2 d;
    public final m2 f4547e;
    public final p2 f4548f;

    public t0(long j10, String str, k2 k2Var, l2 l2Var, m2 m2Var, p2 p2Var) {
        this.f4544a = j10;
        this.f4545b = str;
        this.f4546c = k2Var;
        this.d = l2Var;
        this.f4547e = m2Var;
        this.f4548f = p2Var;
    }

    public final s0 a() {
        ?? obj = new Object();
        obj.f4533a = this.f4544a;
        obj.f4534b = this.f4545b;
        obj.f4535c = this.f4546c;
        obj.d = this.d;
        obj.f4536e = this.f4547e;
        obj.f4537f = this.f4548f;
        obj.f4538g = (byte) 1;
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
            p2 p2Var2 = t0Var.f4548f;
            m2 m2Var2 = t0Var.f4547e;
            if (this.f4544a == t0Var.f4544a && this.f4545b.equals(t0Var.f4545b) && this.f4546c.equals(t0Var.f4546c) && this.d.equals(t0Var.d) && ((m2Var = this.f4547e) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((p2Var = this.f4548f) != null ? p2Var.equals(p2Var2) : p2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f4544a;
        int hashCode2 = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f4545b.hashCode()) * 1000003) ^ this.f4546c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i3 = 0;
        m2 m2Var = this.f4547e;
        if (m2Var == null) {
            hashCode = 0;
        } else {
            hashCode = m2Var.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        p2 p2Var = this.f4548f;
        if (p2Var != null) {
            i3 = p2Var.hashCode();
        }
        return i10 ^ i3;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f4544a + ", type=" + this.f4545b + ", app=" + this.f4546c + ", device=" + this.d + ", log=" + this.f4547e + ", rollouts=" + this.f4548f + "}";
    }
}
