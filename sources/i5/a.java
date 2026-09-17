package i5;
public final class a {
    public final Integer f11880a;
    public final Object f11881b;
    public final d f11882c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f11880a = num;
        if (obj != null) {
            this.f11881b = obj;
            this.f11882c = dVar;
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
            Integer num = aVar.f11880a;
            Integer num2 = this.f11880a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f11881b.equals(aVar.f11881b) && this.f11882c.equals(aVar.f11882c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f11880a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f11881b.hashCode()) * 1000003) ^ this.f11882c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f11880a + ", payload=" + this.f11881b + ", priority=" + this.f11882c + ", productData=" + this.d + "}";
    }
}
