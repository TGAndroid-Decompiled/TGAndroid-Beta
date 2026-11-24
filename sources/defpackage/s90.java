package defpackage;
public final class s90 extends h74 {
    public final Integer a;

    public s90(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h74)) {
            return false;
        }
        Integer num = this.a;
        s90 s90Var = (s90) ((h74) obj);
        if (num == null) {
            if (s90Var.a == null) {
                return true;
            }
            return false;
        }
        return num.equals(s90Var.a);
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
