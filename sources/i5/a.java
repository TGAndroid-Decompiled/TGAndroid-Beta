package i5;
public final class a {
    public final Integer f12707a;
    public final Object f12708b;
    public final d f12709c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f12707a = num;
        if (obj != null) {
            this.f12708b = obj;
            this.f12709c = dVar;
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
            Integer num = aVar.f12707a;
            Integer num2 = this.f12707a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f12708b.equals(aVar.f12708b) && this.f12709c.equals(aVar.f12709c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f12707a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f12708b.hashCode()) * 1000003) ^ this.f12709c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f12707a + ", payload=" + this.f12708b + ", priority=" + this.f12709c + ", productData=" + this.d + "}";
    }
}
