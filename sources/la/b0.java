package la;
public final class b0 {
    public final k0 f11738a;
    public final b f11739b;

    public b0(k0 k0Var, b bVar) {
        this.f11738a = k0Var;
        this.f11739b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                if (!this.f11738a.equals(b0Var.f11738a) || !this.f11739b.equals(b0Var.f11739b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f11738a.hashCode();
        return this.f11739b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f11738a + ", applicationInfo=" + this.f11739b + ')';
    }
}
