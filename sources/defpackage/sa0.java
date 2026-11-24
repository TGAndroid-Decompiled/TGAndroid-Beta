package defpackage;
public final class sa0 extends q84 {
    public final Integer a;

    public sa0(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q84)) {
            return false;
        }
        Integer num = this.a;
        sa0 sa0Var = (sa0) ((q84) obj);
        if (num == null) {
            if (sa0Var.a == null) {
                return true;
            }
            return false;
        }
        return num.equals(sa0Var.a);
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
