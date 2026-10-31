package bb;
public final class e0 {
    public final n0 f2550a;
    public final b f2551b;

    public e0(n0 n0Var, b bVar) {
        this.f2550a = n0Var;
        this.f2551b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e0) {
                e0 e0Var = (e0) obj;
                if (!this.f2550a.equals(e0Var.f2550a) || !this.f2551b.equals(e0Var.f2551b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f2550a.hashCode();
        return this.f2551b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f2550a + ", applicationInfo=" + this.f2551b + ')';
    }
}
