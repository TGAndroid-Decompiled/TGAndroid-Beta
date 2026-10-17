package ab;
public final class e0 {
    public final n0 f393a;
    public final b f394b;

    public e0(n0 n0Var, b bVar) {
        this.f393a = n0Var;
        this.f394b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e0) {
                e0 e0Var = (e0) obj;
                if (!this.f393a.equals(e0Var.f393a) || !this.f394b.equals(e0Var.f394b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f393a.hashCode();
        return this.f394b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f393a + ", applicationInfo=" + this.f394b + ')';
    }
}
