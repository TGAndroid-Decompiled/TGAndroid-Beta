package l5;
public final class a {
    public final Integer f19667a;
    public final Object f19668b;
    public final d f19669c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f19667a = num;
        if (obj != null) {
            this.f19668b = obj;
            this.f19669c = dVar;
            this.d = bVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public static a a(Object obj) {
        return new a(null, obj, d.f19672a, null);
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.d;
            Integer num = aVar.f19667a;
            Integer num2 = this.f19667a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f19668b.equals(aVar.f19668b) && this.f19669c.equals(aVar.f19669c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Integer num = this.f19667a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f19668b.hashCode()) * 1000003) ^ this.f19669c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i7 = bVar.hashCode();
        }
        return (i7 ^ hashCode2) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.f19667a + ", payload=" + this.f19668b + ", priority=" + this.f19669c + ", productData=" + this.d + ", eventContext=null}";
    }
}
