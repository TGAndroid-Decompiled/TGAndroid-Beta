package i5;
public final class a {
    public final Integer f10981a;
    public final Object f10982b;
    public final d f10983c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f10981a = num;
        if (obj != null) {
            this.f10982b = obj;
            this.f10983c = dVar;
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
            Integer num = aVar.f10981a;
            Integer num2 = this.f10981a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f10982b.equals(aVar.f10982b) && this.f10983c.equals(aVar.f10983c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f10981a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f10982b.hashCode()) * 1000003) ^ this.f10983c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f10981a + ", payload=" + this.f10982b + ", priority=" + this.f10983c + ", productData=" + this.d + "}";
    }
}
