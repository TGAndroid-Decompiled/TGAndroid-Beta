package i5;
public final class a {
    public final Integer f12703a;
    public final Object f12704b;
    public final d f12705c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f12703a = num;
        if (obj != null) {
            this.f12704b = obj;
            this.f12705c = dVar;
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
            Integer num = aVar.f12703a;
            Integer num2 = this.f12703a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f12704b.equals(aVar.f12704b) && this.f12705c.equals(aVar.f12705c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f12703a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f12704b.hashCode()) * 1000003) ^ this.f12705c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f12703a + ", payload=" + this.f12704b + ", priority=" + this.f12705c + ", productData=" + this.d + "}";
    }
}
