package bb;
public final class e0 {
    public final n0 f3750a;
    public final b f3751b;

    public e0(n0 n0Var, b bVar) {
        this.f3750a = n0Var;
        this.f3751b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e0) {
                e0 e0Var = (e0) obj;
                if (!this.f3750a.equals(e0Var.f3750a) || !this.f3751b.equals(e0Var.f3751b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f3750a.hashCode();
        return this.f3751b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f3750a + ", applicationInfo=" + this.f3751b + ')';
    }
}
