package gb;
public final class o0 {
    public final v0 f13394a;
    public final b f13395b;

    public o0(v0 v0Var, b bVar) {
        m mVar = m.f13385b;
        this.f13394a = v0Var;
        this.f13395b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                m mVar = m.f13385b;
                if (!this.f13394a.equals(o0Var.f13394a) || !this.f13395b.equals(o0Var.f13395b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f13394a.hashCode();
        return this.f13395b.hashCode() + ((hashCode + (m.f13385b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + m.f13385b + ", sessionData=" + this.f13394a + ", applicationInfo=" + this.f13395b + ')';
    }
}
