package ab;
public final class e0 {
    public final n0 f394a;
    public final b f395b;

    public e0(n0 n0Var, b bVar) {
        this.f394a = n0Var;
        this.f395b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e0) {
                e0 e0Var = (e0) obj;
                if (!this.f394a.equals(e0Var.f394a) || !this.f395b.equals(e0Var.f395b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f394a.hashCode();
        return this.f395b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f394a + ", applicationInfo=" + this.f395b + ')';
    }
}
