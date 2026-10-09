package i5;
public final class a {
    public final Integer f12009a;
    public final Object f12010b;
    public final d f12011c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f12009a = num;
        if (obj != null) {
            this.f12010b = obj;
            this.f12011c = dVar;
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
            Integer num = aVar.f12009a;
            Integer num2 = this.f12009a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f12010b.equals(aVar.f12010b) && this.f12011c.equals(aVar.f12011c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f12009a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f12010b.hashCode()) * 1000003) ^ this.f12011c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f12009a + ", payload=" + this.f12010b + ", priority=" + this.f12011c + ", productData=" + this.d + "}";
    }
}
