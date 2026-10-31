package i5;
public final class b {
    public final Integer f8204a;

    public b(Integer num) {
        this.f8204a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        Integer num = ((b) obj).f8204a;
        Integer num2 = this.f8204a;
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
        Integer num = this.f8204a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f8204a + "}";
    }
}
