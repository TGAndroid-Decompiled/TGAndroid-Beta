package i5;
public final class a {
    public final Integer f11318a;
    public final Object f11319b;
    public final d f11320c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f11318a = num;
        if (obj != null) {
            this.f11319b = obj;
            this.f11320c = dVar;
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
            Integer num = aVar.f11318a;
            Integer num2 = this.f11318a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f11319b.equals(aVar.f11319b) && this.f11320c.equals(aVar.f11320c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f11318a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f11319b.hashCode()) * 1000003) ^ this.f11320c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f11318a + ", payload=" + this.f11319b + ", priority=" + this.f11320c + ", productData=" + this.d + "}";
    }
}
