package ha;
public final class e0 {
    public final n0 f10292a;
    public final b f10293b;

    public e0(n0 n0Var, b bVar) {
        this.f10292a = n0Var;
        this.f10293b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e0) {
                e0 e0Var = (e0) obj;
                if (!this.f10292a.equals(e0Var.f10292a) || !this.f10293b.equals(e0Var.f10293b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f10292a.hashCode();
        return this.f10293b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f10292a + ", applicationInfo=" + this.f10293b + ')';
    }
}
