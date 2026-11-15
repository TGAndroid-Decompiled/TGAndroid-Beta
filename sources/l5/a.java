package l5;
public final class a {
    public final Integer f19303a;
    public final Object f19304b;
    public final d f19305c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f19303a = num;
        if (obj != null) {
            this.f19304b = obj;
            this.f19305c = dVar;
            this.d = bVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public static a a(Object obj) {
        return new a(null, obj, d.f19308a, null);
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.d;
            Integer num = aVar.f19303a;
            Integer num2 = this.f19303a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f19304b.equals(aVar.f19304b) && this.f19305c.equals(aVar.f19305c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Integer num = this.f19303a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f19304b.hashCode()) * 1000003) ^ this.f19305c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i7 = bVar.hashCode();
        }
        return (i7 ^ hashCode2) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.f19303a + ", payload=" + this.f19304b + ", priority=" + this.f19305c + ", productData=" + this.d + ", eventContext=null}";
    }
}
