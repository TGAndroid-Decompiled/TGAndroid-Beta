package j5;
public final class a {
    public final Integer f15508a;
    public final Object f15509b;
    public final d f15510c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f15508a = num;
        if (obj != null) {
            this.f15509b = obj;
            this.f15510c = dVar;
            this.d = bVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.d;
            Integer num = aVar.f15508a;
            Integer num2 = this.f15508a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f15509b.equals(aVar.f15509b) && this.f15510c.equals(aVar.f15510c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f15508a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f15509b.hashCode()) * 1000003) ^ this.f15510c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f15508a + ", payload=" + this.f15509b + ", priority=" + this.f15510c + ", productData=" + this.d + "}";
    }
}
