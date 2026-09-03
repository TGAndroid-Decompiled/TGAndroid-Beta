package la;
public final class b0 {
    public final k0 f11848a;
    public final b f11849b;

    public b0(k0 k0Var, b bVar) {
        this.f11848a = k0Var;
        this.f11849b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                if (!this.f11848a.equals(b0Var.f11848a) || !this.f11849b.equals(b0Var.f11849b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f11848a.hashCode();
        return this.f11849b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f11848a + ", applicationInfo=" + this.f11849b + ')';
    }
}
