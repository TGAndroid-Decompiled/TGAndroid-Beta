package l5;
public final class a {
    public final Integer f18167a;
    public final Object f18168b;
    public final d f18169c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f18167a = num;
        if (obj != null) {
            this.f18168b = obj;
            this.f18169c = dVar;
            this.d = bVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public static a a(Object obj) {
        return new a(null, obj, d.f18172a, null);
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.d;
            Integer num = aVar.f18167a;
            Integer num2 = this.f18167a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f18168b.equals(aVar.f18168b) && this.f18169c.equals(aVar.f18169c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Integer num = this.f18167a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f18168b.hashCode()) * 1000003) ^ this.f18169c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i7 = bVar.hashCode();
        }
        return (i7 ^ hashCode2) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.f18167a + ", payload=" + this.f18168b + ", priority=" + this.f18169c + ", productData=" + this.d + ", eventContext=null}";
    }
}
