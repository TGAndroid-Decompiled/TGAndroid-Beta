package gb;
public final class o0 {
    public final v0 f13391a;
    public final b f13392b;

    public o0(v0 v0Var, b bVar) {
        m mVar = m.f13382b;
        this.f13391a = v0Var;
        this.f13392b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                m mVar = m.f13382b;
                if (!this.f13391a.equals(o0Var.f13391a) || !this.f13392b.equals(o0Var.f13392b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f13391a.hashCode();
        return this.f13392b.hashCode() + ((hashCode + (m.f13382b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + m.f13382b + ", sessionData=" + this.f13391a + ", applicationInfo=" + this.f13392b + ')';
    }
}
