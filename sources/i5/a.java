package i5;
public final class a {
    public final Integer f12735a;
    public final Object f12736b;
    public final d f12737c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f12735a = num;
        if (obj != null) {
            this.f12736b = obj;
            this.f12737c = dVar;
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
            Integer num = aVar.f12735a;
            Integer num2 = this.f12735a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f12736b.equals(aVar.f12736b) && this.f12737c.equals(aVar.f12737c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f12735a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f12736b.hashCode()) * 1000003) ^ this.f12737c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f12735a + ", payload=" + this.f12736b + ", priority=" + this.f12737c + ", productData=" + this.d + "}";
    }
}
