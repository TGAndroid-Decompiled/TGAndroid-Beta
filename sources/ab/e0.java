package ab;
public final class e0 {
    public final n0 f390a;
    public final b f391b;

    public e0(n0 n0Var, b bVar) {
        this.f390a = n0Var;
        this.f391b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e0) {
                e0 e0Var = (e0) obj;
                if (!this.f390a.equals(e0Var.f390a) || !this.f391b.equals(e0Var.f391b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f390a.hashCode();
        return this.f391b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f390a + ", applicationInfo=" + this.f391b + ')';
    }
}
