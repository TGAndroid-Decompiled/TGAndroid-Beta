package defpackage;
public final class p90 {
    public final Integer a;
    public final Object b;
    public final pm8 c;
    public final ja0 d;

    public p90(Integer num, Object obj, pm8 pm8Var, ja0 ja0Var) {
        this.a = num;
        if (obj != null) {
            this.b = obj;
            this.c = pm8Var;
            this.d = ja0Var;
            return;
        }
        p3d.h("Null payload");
        throw null;
    }

    public static p90 a(Object obj) {
        return new p90(null, obj, pm8.a, null);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof p90) {
                p90 p90Var = (p90) obj;
                Integer num = p90Var.a;
                Integer num2 = this.a;
                if (num2 == null) {
                    if (num != null) {
                        return false;
                    }
                } else if (!num2.equals(num)) {
                    return false;
                }
                if (this.b.equals(p90Var.b) && this.c.equals(p90Var.c)) {
                    ja0 ja0Var = p90Var.d;
                    ja0 ja0Var2 = this.d;
                    if (ja0Var2 == null) {
                        if (ja0Var == null) {
                            return true;
                        }
                        return false;
                    } else if (ja0Var2.equals(ja0Var)) {
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
        int i = 0;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        ja0 ja0Var = this.d;
        if (ja0Var != null) {
            i = ja0Var.hashCode();
        }
        return (hashCode2 ^ i) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=" + this.d + ", eventContext=null}";
    }
}
