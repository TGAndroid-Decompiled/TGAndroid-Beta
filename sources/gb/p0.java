package gb;
public final class p0 {
    public final x0 f13740a;
    public final b f13741b;

    public p0(x0 x0Var, b bVar) {
        n nVar = n.f13731b;
        this.f13740a = x0Var;
        this.f13741b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p0) {
                p0 p0Var = (p0) obj;
                n nVar = n.f13731b;
                if (!this.f13740a.equals(p0Var.f13740a) || !this.f13741b.equals(p0Var.f13741b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f13740a.hashCode();
        return this.f13741b.hashCode() + ((hashCode + (n.f13731b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + n.f13731b + ", sessionData=" + this.f13740a + ", applicationInfo=" + this.f13741b + ')';
    }
}
