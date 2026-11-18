package n2;
public final class f {
    public static final f d = new Object().a();
    public final boolean f21090a;
    public final boolean f21091b;
    public final boolean f21092c;

    public f(ia.a aVar) {
        this.f21090a = aVar.f16180a;
        this.f21091b = aVar.f16181b;
        this.f21092c = aVar.f16182c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f21090a == fVar.f21090a && this.f21091b == fVar.f21091b && this.f21092c == fVar.f21092c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f21090a ? 1 : 0) << 2) + ((this.f21091b ? 1 : 0) << 1) + (this.f21092c ? 1 : 0);
    }
}
