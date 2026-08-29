package i9;
public final class l0 extends a2 {
    public final long f8720a;
    public final String f8721b;
    public final u1 f8722c;
    public final v1 d;
    public final w1 f8723e;
    public final z1 f8724f;

    public l0(long j10, String str, u1 u1Var, v1 v1Var, w1 w1Var, z1 z1Var) {
        this.f8720a = j10;
        this.f8721b = str;
        this.f8722c = u1Var;
        this.d = v1Var;
        this.f8723e = w1Var;
        this.f8724f = z1Var;
    }

    public final bg.c2 a() {
        ?? obj = new Object();
        obj.f2118a = Long.valueOf(this.f8720a);
        obj.f2119b = this.f8721b;
        obj.f2120c = this.f8722c;
        obj.d = this.d;
        obj.f2121e = this.f8723e;
        obj.f2122f = this.f8724f;
        return obj;
    }

    public final boolean equals(Object obj) {
        w1 w1Var;
        z1 z1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2) {
            l0 l0Var = (l0) ((a2) obj);
            z1 z1Var2 = l0Var.f8724f;
            w1 w1Var2 = l0Var.f8723e;
            if (this.f8720a == l0Var.f8720a && this.f8721b.equals(l0Var.f8721b) && this.f8722c.equals(l0Var.f8722c) && this.d.equals(l0Var.d) && ((w1Var = this.f8723e) != null ? w1Var.equals(w1Var2) : w1Var2 == null) && ((z1Var = this.f8724f) != null ? z1Var.equals(z1Var2) : z1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f8720a;
        int hashCode2 = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f8721b.hashCode()) * 1000003) ^ this.f8722c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i10 = 0;
        w1 w1Var = this.f8723e;
        if (w1Var == null) {
            hashCode = 0;
        } else {
            hashCode = w1Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        z1 z1Var = this.f8724f;
        if (z1Var != null) {
            i10 = z1Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f8720a + ", type=" + this.f8721b + ", app=" + this.f8722c + ", device=" + this.d + ", log=" + this.f8723e + ", rollouts=" + this.f8724f + "}";
    }
}
