package defpackage;
public final class u90 extends c84 {
    public final Integer a;

    public u90(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c84)) {
            return false;
        }
        Integer num = this.a;
        u90 u90Var = (u90) ((c84) obj);
        if (num == null) {
            if (u90Var.a == null) {
                return true;
            }
            return false;
        }
        return num.equals(u90Var.a);
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return 1000003 ^ hashCode;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }
}
