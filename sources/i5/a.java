package i5;
public final class a {
    public final Integer f8202a;
    public final Object f8203b;
    public final d f8204c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f8202a = num;
        if (obj != null) {
            this.f8203b = obj;
            this.f8204c = dVar;
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
            Integer num = aVar.f8202a;
            Integer num2 = this.f8202a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f8203b.equals(aVar.f8203b) && this.f8204c.equals(aVar.f8204c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f8202a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f8203b.hashCode()) * 1000003) ^ this.f8204c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f8202a + ", payload=" + this.f8203b + ", priority=" + this.f8204c + ", productData=" + this.d + "}";
    }
}
