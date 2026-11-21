package l5;
public final class a {
    public final Integer f19695a;
    public final Object f19696b;
    public final d f19697c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f19695a = num;
        if (obj != null) {
            this.f19696b = obj;
            this.f19697c = dVar;
            this.d = bVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public static a a(Object obj) {
        return new a(null, obj, d.f19700a, null);
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.d;
            Integer num = aVar.f19695a;
            Integer num2 = this.f19695a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f19696b.equals(aVar.f19696b) && this.f19697c.equals(aVar.f19697c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Integer num = this.f19695a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f19696b.hashCode()) * 1000003) ^ this.f19697c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i7 = bVar.hashCode();
        }
        return (i7 ^ hashCode2) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.f19695a + ", payload=" + this.f19696b + ", priority=" + this.f19697c + ", productData=" + this.d + ", eventContext=null}";
    }
}
