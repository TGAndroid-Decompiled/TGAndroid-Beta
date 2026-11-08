package n5;
public final class q extends c0 {
    public final Integer f20466a;

    public q(Integer num) {
        this.f20466a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        Integer num = this.f20466a;
        q qVar = (q) ((c0) obj);
        if (num == null) {
            if (qVar.f20466a == null) {
                return true;
            }
            return false;
        }
        return num.equals(qVar.f20466a);
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f20466a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f20466a + "}";
    }
}
