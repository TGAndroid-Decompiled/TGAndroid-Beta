package defpackage;
public final class na0 {
    public final Integer a;
    public final Object b;
    public final fl8 c;
    public final hb0 d;

    public na0(Integer num, Object obj, fl8 fl8Var, hb0 hb0Var) {
        this.a = num;
        if (obj != null) {
            this.b = obj;
            this.c = fl8Var;
            this.d = hb0Var;
            return;
        }
        gxc.d("Null payload");
        throw null;
    }

    public static na0 a(Object obj) {
        return new na0(null, obj, fl8.a, null);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof na0) {
                na0 na0Var = (na0) obj;
                Integer num = na0Var.a;
                Integer num2 = this.a;
                if (num2 == null) {
                    if (num != null) {
                        return false;
                    }
                } else if (!num2.equals(num)) {
                    return false;
                }
                if (this.b.equals(na0Var.b) && this.c.equals(na0Var.c)) {
                    hb0 hb0Var = na0Var.d;
                    hb0 hb0Var2 = this.d;
                    if (hb0Var2 == null) {
                        if (hb0Var == null) {
                            return true;
                        }
                        return false;
                    } else if (hb0Var2.equals(hb0Var)) {
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
        hb0 hb0Var = this.d;
        if (hb0Var != null) {
            i = hb0Var.hashCode();
        }
        return (hashCode2 ^ i) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=" + this.d + ", eventContext=null}";
    }
}
