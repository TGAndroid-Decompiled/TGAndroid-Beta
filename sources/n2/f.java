package n2;
public final class f {
    public static final f d = new Object().a();
    public final boolean f21087a;
    public final boolean f21088b;
    public final boolean f21089c;

    public f(ia.a aVar) {
        this.f21087a = aVar.f16174a;
        this.f21088b = aVar.f16175b;
        this.f21089c = aVar.f16176c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f21087a == fVar.f21087a && this.f21088b == fVar.f21088b && this.f21089c == fVar.f21089c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f21087a ? 1 : 0) << 2) + ((this.f21088b ? 1 : 0) << 1) + (this.f21089c ? 1 : 0);
    }
}
