package l5;
public final class a {
    public final Integer f18173a;
    public final Object f18174b;
    public final d f18175c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f18173a = num;
        if (obj != null) {
            this.f18174b = obj;
            this.f18175c = dVar;
            this.d = bVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public static a a(Object obj) {
        return new a(null, obj, d.f18178a, null);
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.d;
            Integer num = aVar.f18173a;
            Integer num2 = this.f18173a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f18174b.equals(aVar.f18174b) && this.f18175c.equals(aVar.f18175c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Integer num = this.f18173a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f18174b.hashCode()) * 1000003) ^ this.f18175c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i7 = bVar.hashCode();
        }
        return (i7 ^ hashCode2) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.f18173a + ", payload=" + this.f18174b + ", priority=" + this.f18175c + ", productData=" + this.d + ", eventContext=null}";
    }
}
