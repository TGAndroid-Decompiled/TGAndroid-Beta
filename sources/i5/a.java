package i5;
public final class a {
    public final Integer f8201a;
    public final Object f8202b;
    public final d f8203c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f8201a = num;
        if (obj != null) {
            this.f8202b = obj;
            this.f8203c = dVar;
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
            Integer num = aVar.f8201a;
            Integer num2 = this.f8201a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f8202b.equals(aVar.f8202b) && this.f8203c.equals(aVar.f8203c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f8201a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f8202b.hashCode()) * 1000003) ^ this.f8203c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f8201a + ", payload=" + this.f8202b + ", priority=" + this.f8203c + ", productData=" + this.d + "}";
    }
}
