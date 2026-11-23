package gb;
public final class o0 {
    public final v0 f13423a;
    public final b f13424b;

    public o0(v0 v0Var, b bVar) {
        m mVar = m.f13414b;
        this.f13423a = v0Var;
        this.f13424b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                m mVar = m.f13414b;
                if (!this.f13423a.equals(o0Var.f13423a) || !this.f13424b.equals(o0Var.f13424b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f13423a.hashCode();
        return this.f13424b.hashCode() + ((hashCode + (m.f13414b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + m.f13414b + ", sessionData=" + this.f13423a + ", applicationInfo=" + this.f13424b + ')';
    }
}
