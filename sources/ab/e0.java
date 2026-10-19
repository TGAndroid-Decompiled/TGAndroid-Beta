package ab;
public final class e0 {
    public final n0 f392a;
    public final b f393b;

    public e0(n0 n0Var, b bVar) {
        this.f392a = n0Var;
        this.f393b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e0) {
                e0 e0Var = (e0) obj;
                if (!this.f392a.equals(e0Var.f392a) || !this.f393b.equals(e0Var.f393b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f392a.hashCode();
        return this.f393b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f392a + ", applicationInfo=" + this.f393b + ')';
    }
}
