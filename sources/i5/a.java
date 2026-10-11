package i5;
public final class a {
    public final Integer f12008a;
    public final Object f12009b;
    public final d f12010c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f12008a = num;
        if (obj != null) {
            this.f12009b = obj;
            this.f12010c = dVar;
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
            Integer num = aVar.f12008a;
            Integer num2 = this.f12008a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f12009b.equals(aVar.f12009b) && this.f12010c.equals(aVar.f12010c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f12008a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f12009b.hashCode()) * 1000003) ^ this.f12010c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f12008a + ", payload=" + this.f12009b + ", priority=" + this.f12010c + ", productData=" + this.d + "}";
    }
}
