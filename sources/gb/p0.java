package gb;
public final class p0 {
    public final w0 f13390a;
    public final b f13391b;

    public p0(w0 w0Var, b bVar) {
        m mVar = m.f13378b;
        this.f13390a = w0Var;
        this.f13391b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p0) {
                p0 p0Var = (p0) obj;
                m mVar = m.f13378b;
                if (!this.f13390a.equals(p0Var.f13390a) || !this.f13391b.equals(p0Var.f13391b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f13390a.hashCode();
        return this.f13391b.hashCode() + ((hashCode + (m.f13378b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + m.f13378b + ", sessionData=" + this.f13390a + ", applicationInfo=" + this.f13391b + ')';
    }
}
