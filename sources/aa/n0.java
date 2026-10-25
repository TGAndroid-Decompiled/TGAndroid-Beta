package aa;
public final class n0 extends c2 {
    public final long f1158a;
    public final String f1159b;
    public final w1 f1160c;
    public final x1 d;
    public final y1 e;
    public final b2 f1161f;

    public n0(long j10, String str, w1 w1Var, x1 x1Var, y1 y1Var, b2 b2Var) {
        this.f1158a = j10;
        this.f1159b = str;
        this.f1160c = w1Var;
        this.d = x1Var;
        this.e = y1Var;
        this.f1161f = b2Var;
    }

    public final m0 a() {
        ?? obj = new Object();
        obj.f1150a = Long.valueOf(this.f1158a);
        obj.f1151b = this.f1159b;
        obj.f1152c = this.f1160c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f1153f = this.f1161f;
        return obj;
    }

    public final boolean equals(Object obj) {
        y1 y1Var;
        b2 b2Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            n0 n0Var = (n0) ((c2) obj);
            b2 b2Var2 = n0Var.f1161f;
            y1 y1Var2 = n0Var.e;
            if (this.f1158a == n0Var.f1158a && this.f1159b.equals(n0Var.f1159b) && this.f1160c.equals(n0Var.f1160c) && this.d.equals(n0Var.d) && ((y1Var = this.e) != null ? y1Var.equals(y1Var2) : y1Var2 == null) && ((b2Var = this.f1161f) != null ? b2Var.equals(b2Var2) : b2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f1158a;
        int hashCode2 = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f1159b.hashCode()) * 1000003) ^ this.f1160c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        y1 y1Var = this.e;
        if (y1Var == null) {
            hashCode = 0;
        } else {
            hashCode = y1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        b2 b2Var = this.f1161f;
        if (b2Var != null) {
            i10 = b2Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f1158a + ", type=" + this.f1159b + ", app=" + this.f1160c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f1161f + "}";
    }
}
