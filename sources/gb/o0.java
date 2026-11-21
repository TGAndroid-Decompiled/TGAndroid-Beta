package gb;
public final class o0 {
    public final v0 f13420a;
    public final b f13421b;

    public o0(v0 v0Var, b bVar) {
        m mVar = m.f13411b;
        this.f13420a = v0Var;
        this.f13421b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                m mVar = m.f13411b;
                if (!this.f13420a.equals(o0Var.f13420a) || !this.f13421b.equals(o0Var.f13421b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f13420a.hashCode();
        return this.f13421b.hashCode() + ((hashCode + (m.f13411b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + m.f13411b + ", sessionData=" + this.f13420a + ", applicationInfo=" + this.f13421b + ')';
    }
}
