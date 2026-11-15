package gb;
public final class o0 {
    public final v0 f13077a;
    public final b f13078b;

    public o0(v0 v0Var, b bVar) {
        m mVar = m.f13068b;
        this.f13077a = v0Var;
        this.f13078b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                m mVar = m.f13068b;
                if (!this.f13077a.equals(o0Var.f13077a) || !this.f13078b.equals(o0Var.f13078b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f13077a.hashCode();
        return this.f13078b.hashCode() + ((hashCode + (m.f13068b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + m.f13068b + ", sessionData=" + this.f13077a + ", applicationInfo=" + this.f13078b + ')';
    }
}
