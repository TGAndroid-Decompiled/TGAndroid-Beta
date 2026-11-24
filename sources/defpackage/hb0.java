package defpackage;
public final class hb0 {
    public final Integer a;

    public hb0(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hb0) {
            return this.a.equals(((hb0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
