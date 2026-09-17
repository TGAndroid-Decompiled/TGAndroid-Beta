package i5;
public final class a {
    public final Integer f10991a;
    public final Object f10992b;
    public final d f10993c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f10991a = num;
        if (obj != null) {
            this.f10992b = obj;
            this.f10993c = dVar;
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
            Integer num = aVar.f10991a;
            Integer num2 = this.f10991a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f10992b.equals(aVar.f10992b) && this.f10993c.equals(aVar.f10993c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f10991a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f10992b.hashCode()) * 1000003) ^ this.f10993c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f10991a + ", payload=" + this.f10992b + ", priority=" + this.f10993c + ", productData=" + this.d + "}";
    }
}
