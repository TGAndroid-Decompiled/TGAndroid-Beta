package l5;
public final class a {
    public final Integer f19698a;
    public final Object f19699b;
    public final d f19700c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f19698a = num;
        if (obj != null) {
            this.f19699b = obj;
            this.f19700c = dVar;
            this.d = bVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public static a a(Object obj) {
        return new a(null, obj, d.f19703a, null);
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.d;
            Integer num = aVar.f19698a;
            Integer num2 = this.f19698a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f19699b.equals(aVar.f19699b) && this.f19700c.equals(aVar.f19700c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Integer num = this.f19698a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f19699b.hashCode()) * 1000003) ^ this.f19700c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i7 = bVar.hashCode();
        }
        return (i7 ^ hashCode2) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.f19698a + ", payload=" + this.f19699b + ", priority=" + this.f19700c + ", productData=" + this.d + ", eventContext=null}";
    }
}
