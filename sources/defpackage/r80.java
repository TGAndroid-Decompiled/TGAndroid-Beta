package defpackage;
public final class r80 extends dz2 {
    public final long a;
    public final String b;
    public final t80 c;
    public final d90 d;
    public final e90 e;
    public final i90 f;

    public r80(long j, String str, t80 t80Var, d90 d90Var, e90 e90Var, i90 i90Var) {
        this.a = j;
        this.b = str;
        this.c = t80Var;
        this.d = d90Var;
        this.e = e90Var;
        this.f = i90Var;
    }

    public final q80 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof dz2) {
                r80 r80Var = (r80) ((dz2) obj);
                if (this.a == r80Var.a && this.b.equals(r80Var.b) && this.c.equals(r80Var.c) && this.d.equals(r80Var.d)) {
                    e90 e90Var = r80Var.e;
                    e90 e90Var2 = this.e;
                    if (e90Var2 == null) {
                        if (e90Var != null) {
                            return false;
                        }
                    } else if (!e90Var2.equals(e90Var)) {
                        return false;
                    }
                    i90 i90Var = r80Var.f;
                    i90 i90Var2 = this.f;
                    if (i90Var2 == null) {
                        if (i90Var == null) {
                            return true;
                        }
                        return false;
                    } else if (i90Var2.equals(i90Var)) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.a;
        int hashCode2 = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i = 0;
        e90 e90Var = this.e;
        if (e90Var == null) {
            hashCode = 0;
        } else {
            hashCode = e90Var.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        i90 i90Var = this.f;
        if (i90Var != null) {
            i = i90Var.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
