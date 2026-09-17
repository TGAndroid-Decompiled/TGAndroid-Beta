package i5;
public final class a {
    public final Integer f11854a;
    public final Object f11855b;
    public final d f11856c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f11854a = num;
        if (obj != null) {
            this.f11855b = obj;
            this.f11856c = dVar;
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
            Integer num = aVar.f11854a;
            Integer num2 = this.f11854a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f11855b.equals(aVar.f11855b) && this.f11856c.equals(aVar.f11856c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f11854a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f11855b.hashCode()) * 1000003) ^ this.f11856c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f11854a + ", payload=" + this.f11855b + ", priority=" + this.f11856c + ", productData=" + this.d + "}";
    }
}
