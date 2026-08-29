package ja;
public final class e0 {
    public final n0 f11327a;
    public final b f11328b;

    public e0(n0 n0Var, b bVar) {
        this.f11327a = n0Var;
        this.f11328b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e0) {
                e0 e0Var = (e0) obj;
                if (!this.f11327a.equals(e0Var.f11327a) || !this.f11328b.equals(e0Var.f11328b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f11327a.hashCode();
        return this.f11328b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f11327a + ", applicationInfo=" + this.f11328b + ')';
    }
}
