package gb;
public final class o0 {
    public final v0 f13386a;
    public final b f13387b;

    public o0(v0 v0Var, b bVar) {
        m mVar = m.f13377b;
        this.f13386a = v0Var;
        this.f13387b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                m mVar = m.f13377b;
                if (!this.f13386a.equals(o0Var.f13386a) || !this.f13387b.equals(o0Var.f13387b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f13386a.hashCode();
        return this.f13387b.hashCode() + ((hashCode + (m.f13377b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + m.f13377b + ", sessionData=" + this.f13386a + ", applicationInfo=" + this.f13387b + ')';
    }
}
