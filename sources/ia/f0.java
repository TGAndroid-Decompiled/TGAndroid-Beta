package ia;

public final class f0 {

    public final o0 f11007a;

    public final b f11008b;

    public f0(o0 o0Var, b bVar) {
        this.f11007a = o0Var;
        this.f11008b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f11007a.equals(f0Var.f11007a) && this.f11008b.equals(f0Var.f11008b);
    }

    public final int hashCode() {
        return this.f11008b.hashCode() + ((this.f11007a.hashCode() + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f11007a + ", applicationInfo=" + this.f11008b + ')';
    }
}
