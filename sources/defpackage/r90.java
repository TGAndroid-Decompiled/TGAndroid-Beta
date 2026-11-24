package defpackage;
public final class r90 extends o03 {
    public final long a;
    public final String b;
    public final t90 c;
    public final da0 d;
    public final ea0 e;
    public final ia0 f;

    public r90(long j, String str, t90 t90Var, da0 da0Var, ea0 ea0Var, ia0 ia0Var) {
        this.a = j;
        this.b = str;
        this.c = t90Var;
        this.d = da0Var;
        this.e = ea0Var;
        this.f = ia0Var;
    }

    public final q90 a() {
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
            if (obj instanceof o03) {
                r90 r90Var = (r90) ((o03) obj);
                if (this.a == r90Var.a && this.b.equals(r90Var.b) && this.c.equals(r90Var.c) && this.d.equals(r90Var.d)) {
                    ea0 ea0Var = r90Var.e;
                    ea0 ea0Var2 = this.e;
                    if (ea0Var2 == null) {
                        if (ea0Var != null) {
                            return false;
                        }
                    } else if (!ea0Var2.equals(ea0Var)) {
                        return false;
                    }
                    ia0 ia0Var = r90Var.f;
                    ia0 ia0Var2 = this.f;
                    if (ia0Var2 == null) {
                        if (ia0Var == null) {
                            return true;
                        }
                        return false;
                    } else if (ia0Var2.equals(ia0Var)) {
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
        ea0 ea0Var = this.e;
        if (ea0Var == null) {
            hashCode = 0;
        } else {
            hashCode = ea0Var.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        ia0 ia0Var = this.f;
        if (ia0Var != null) {
            i = ia0Var.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
