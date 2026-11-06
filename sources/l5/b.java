package l5;
public final class b {
    public final Integer f18170a;

    public b(Integer num) {
        this.f18170a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        Integer num = ((b) obj).f18170a;
        Integer num2 = this.f18170a;
        if (num2 == null) {
            if (num == null) {
                return true;
            }
            return false;
        }
        return num2.equals(num);
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f18170a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f18170a + "}";
    }
}
