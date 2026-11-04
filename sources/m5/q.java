package m5;
public final class q extends c0 {
    public final Integer f19154a;

    public q(Integer num) {
        this.f19154a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        Integer num = this.f19154a;
        q qVar = (q) ((c0) obj);
        if (num == null) {
            if (qVar.f19154a == null) {
                return true;
            }
            return false;
        }
        return num.equals(qVar.f19154a);
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f19154a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f19154a + "}";
    }
}
