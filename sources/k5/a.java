package k5;
public final class a {
    public final Integer f16872a;
    public final Object f16873b;
    public final d f16874c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f16872a = num;
        if (obj != null) {
            this.f16873b = obj;
            this.f16874c = dVar;
            this.d = bVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public static a a(Object obj) {
        return new a(null, obj, d.f16877a, null);
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.d;
            Integer num = aVar.f16872a;
            Integer num2 = this.f16872a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f16873b.equals(aVar.f16873b) && this.f16874c.equals(aVar.f16874c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i3 = 0;
        Integer num = this.f16872a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f16873b.hashCode()) * 1000003) ^ this.f16874c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i3 = bVar.hashCode();
        }
        return (i3 ^ hashCode2) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.f16872a + ", payload=" + this.f16873b + ", priority=" + this.f16874c + ", productData=" + this.d + ", eventContext=null}";
    }
}
