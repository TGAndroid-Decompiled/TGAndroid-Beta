package i5;
public final class a {
    public final Integer f12007a;
    public final Object f12008b;
    public final d f12009c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f12007a = num;
        if (obj != null) {
            this.f12008b = obj;
            this.f12009c = dVar;
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
            Integer num = aVar.f12007a;
            Integer num2 = this.f12007a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f12008b.equals(aVar.f12008b) && this.f12009c.equals(aVar.f12009c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f12007a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f12008b.hashCode()) * 1000003) ^ this.f12009c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f12007a + ", payload=" + this.f12008b + ", priority=" + this.f12009c + ", productData=" + this.d + "}";
    }
}
