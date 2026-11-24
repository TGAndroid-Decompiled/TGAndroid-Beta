package defpackage;
public final class n90 {
    public final Integer a;
    public final Object b;
    public final cj8 c;
    public final ha0 d;

    public n90(Integer num, Object obj, cj8 cj8Var, ha0 ha0Var) {
        this.a = num;
        if (obj != null) {
            this.b = obj;
            this.c = cj8Var;
            this.d = ha0Var;
            return;
        }
        fvc.f("Null payload");
        throw null;
    }

    public static n90 a(Object obj) {
        return new n90(null, obj, cj8.a, null);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof n90) {
                n90 n90Var = (n90) obj;
                Integer num = n90Var.a;
                Integer num2 = this.a;
                if (num2 == null) {
                    if (num != null) {
                        return false;
                    }
                } else if (!num2.equals(num)) {
                    return false;
                }
                if (this.b.equals(n90Var.b) && this.c.equals(n90Var.c)) {
                    ha0 ha0Var = n90Var.d;
                    ha0 ha0Var2 = this.d;
                    if (ha0Var2 == null) {
                        if (ha0Var == null) {
                            return true;
                        }
                        return false;
                    } else if (ha0Var2.equals(ha0Var)) {
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
        ha0 ha0Var = this.d;
        if (ha0Var != null) {
            i = ha0Var.hashCode();
        }
        return (hashCode2 ^ i) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=" + this.d + ", eventContext=null}";
    }
}
