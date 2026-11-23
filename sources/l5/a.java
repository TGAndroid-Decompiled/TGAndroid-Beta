package l5;
public final class a {
    public final Integer f19664a;
    public final Object f19665b;
    public final d f19666c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f19664a = num;
        if (obj != null) {
            this.f19665b = obj;
            this.f19666c = dVar;
            this.d = bVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public static a a(Object obj) {
        return new a(null, obj, d.f19669a, null);
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.d;
            Integer num = aVar.f19664a;
            Integer num2 = this.f19664a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f19665b.equals(aVar.f19665b) && this.f19666c.equals(aVar.f19666c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Integer num = this.f19664a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f19665b.hashCode()) * 1000003) ^ this.f19666c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i7 = bVar.hashCode();
        }
        return (i7 ^ hashCode2) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.f19664a + ", payload=" + this.f19665b + ", priority=" + this.f19666c + ", productData=" + this.d + ", eventContext=null}";
    }
}
