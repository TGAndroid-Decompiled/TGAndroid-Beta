package j5;
public final class a {
    public final Integer f15507a;
    public final Object f15508b;
    public final d f15509c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f15507a = num;
        if (obj != null) {
            this.f15508b = obj;
            this.f15509c = dVar;
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
            Integer num = aVar.f15507a;
            Integer num2 = this.f15507a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f15508b.equals(aVar.f15508b) && this.f15509c.equals(aVar.f15509c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f15507a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f15508b.hashCode()) * 1000003) ^ this.f15509c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f15507a + ", payload=" + this.f15508b + ", priority=" + this.f15509c + ", productData=" + this.d + "}";
    }
}
