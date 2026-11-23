package da;
public final class t0 extends q2 {
    public final long f8219a;
    public final String f8220b;
    public final k2 f8221c;
    public final l2 d;
    public final m2 f8222e;
    public final p2 f8223f;

    public t0(long j3, String str, k2 k2Var, l2 l2Var, m2 m2Var, p2 p2Var) {
        this.f8219a = j3;
        this.f8220b = str;
        this.f8221c = k2Var;
        this.d = l2Var;
        this.f8222e = m2Var;
        this.f8223f = p2Var;
    }

    public final s0 a() {
        ?? obj = new Object();
        obj.f8208a = this.f8219a;
        obj.f8209b = this.f8220b;
        obj.f8210c = this.f8221c;
        obj.d = this.d;
        obj.f8211e = this.f8222e;
        obj.f8212f = this.f8223f;
        obj.f8213g = (byte) 1;
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
            p2 p2Var2 = t0Var.f8223f;
            m2 m2Var2 = t0Var.f8222e;
            if (this.f8219a == t0Var.f8219a && this.f8220b.equals(t0Var.f8220b) && this.f8221c.equals(t0Var.f8221c) && this.d.equals(t0Var.d) && ((m2Var = this.f8222e) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((p2Var = this.f8223f) != null ? p2Var.equals(p2Var2) : p2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.f8219a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f8220b.hashCode()) * 1000003) ^ this.f8221c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i7 = 0;
        m2 m2Var = this.f8222e;
        if (m2Var == null) {
            hashCode = 0;
        } else {
            hashCode = m2Var.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        p2 p2Var = this.f8223f;
        if (p2Var != null) {
            i7 = p2Var.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f8219a + ", type=" + this.f8220b + ", app=" + this.f8221c + ", device=" + this.d + ", log=" + this.f8222e + ", rollouts=" + this.f8223f + "}";
    }
}
