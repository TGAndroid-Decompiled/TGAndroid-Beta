package gb;
public final class p0 {
    public final x0 f13742a;
    public final b f13743b;

    public p0(x0 x0Var, b bVar) {
        n nVar = n.f13733b;
        this.f13742a = x0Var;
        this.f13743b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p0) {
                p0 p0Var = (p0) obj;
                n nVar = n.f13733b;
                if (!this.f13742a.equals(p0Var.f13742a) || !this.f13743b.equals(p0Var.f13743b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f13742a.hashCode();
        return this.f13743b.hashCode() + ((hashCode + (n.f13733b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + n.f13733b + ", sessionData=" + this.f13742a + ", applicationInfo=" + this.f13743b + ')';
    }
}
