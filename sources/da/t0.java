package da;
public final class t0 extends q2 {
    public final long f8216a;
    public final String f8217b;
    public final k2 f8218c;
    public final l2 d;
    public final m2 f8219e;
    public final p2 f8220f;

    public t0(long j3, String str, k2 k2Var, l2 l2Var, m2 m2Var, p2 p2Var) {
        this.f8216a = j3;
        this.f8217b = str;
        this.f8218c = k2Var;
        this.d = l2Var;
        this.f8219e = m2Var;
        this.f8220f = p2Var;
    }

    public final s0 a() {
        ?? obj = new Object();
        obj.f8205a = this.f8216a;
        obj.f8206b = this.f8217b;
        obj.f8207c = this.f8218c;
        obj.d = this.d;
        obj.f8208e = this.f8219e;
        obj.f8209f = this.f8220f;
        obj.f8210g = (byte) 1;
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
            p2 p2Var2 = t0Var.f8220f;
            m2 m2Var2 = t0Var.f8219e;
            if (this.f8216a == t0Var.f8216a && this.f8217b.equals(t0Var.f8217b) && this.f8218c.equals(t0Var.f8218c) && this.d.equals(t0Var.d) && ((m2Var = this.f8219e) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((p2Var = this.f8220f) != null ? p2Var.equals(p2Var2) : p2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8216a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f8217b.hashCode()) * 1000003) ^ this.f8218c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i7 = 0;
        m2 m2Var = this.f8219e;
        if (m2Var == null) {
            hashCode = 0;
        } else {
            hashCode = m2Var.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        p2 p2Var = this.f8220f;
        if (p2Var != null) {
            i7 = p2Var.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f8216a + ", type=" + this.f8217b + ", app=" + this.f8218c + ", device=" + this.d + ", log=" + this.f8219e + ", rollouts=" + this.f8220f + "}";
    }
}
