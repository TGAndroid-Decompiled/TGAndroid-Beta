package defpackage;
public final class t80 extends yz2 {
    public final long a;
    public final String b;
    public final v80 c;
    public final f90 d;
    public final g90 e;
    public final k90 f;

    public t80(long j, String str, v80 v80Var, f90 f90Var, g90 g90Var, k90 k90Var) {
        this.a = j;
        this.b = str;
        this.c = v80Var;
        this.d = f90Var;
        this.e = g90Var;
        this.f = k90Var;
    }

    public final s80 a() {
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
            if (obj instanceof yz2) {
                t80 t80Var = (t80) ((yz2) obj);
                if (this.a == t80Var.a && this.b.equals(t80Var.b) && this.c.equals(t80Var.c) && this.d.equals(t80Var.d)) {
                    g90 g90Var = t80Var.e;
                    g90 g90Var2 = this.e;
                    if (g90Var2 == null) {
                        if (g90Var != null) {
                            return false;
                        }
                    } else if (!g90Var2.equals(g90Var)) {
                        return false;
                    }
                    k90 k90Var = t80Var.f;
                    k90 k90Var2 = this.f;
                    if (k90Var2 == null) {
                        if (k90Var == null) {
                            return true;
                        }
                        return false;
                    } else if (k90Var2.equals(k90Var)) {
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
        g90 g90Var = this.e;
        if (g90Var == null) {
            hashCode = 0;
        } else {
            hashCode = g90Var.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        k90 k90Var = this.f;
        if (k90Var != null) {
            i = k90Var.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
