package la;
public final class b0 {
    public final k0 f12146a;
    public final b f12147b;

    public b0(k0 k0Var, b bVar) {
        this.f12146a = k0Var;
        this.f12147b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                if (!this.f12146a.equals(b0Var.f12146a) || !this.f12147b.equals(b0Var.f12147b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f12146a.hashCode();
        return this.f12147b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f12146a + ", applicationInfo=" + this.f12147b + ')';
    }
}
