package db;
public final class o0 {
    public final w0 f8710a;
    public final b f8711b;

    public o0(w0 w0Var, b bVar) {
        m mVar = m.f8701b;
        this.f8710a = w0Var;
        this.f8711b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                m mVar = m.f8701b;
                if (!this.f8710a.equals(o0Var.f8710a) || !this.f8711b.equals(o0Var.f8711b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f8710a.hashCode();
        return this.f8711b.hashCode() + ((hashCode + (m.f8701b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + m.f8701b + ", sessionData=" + this.f8710a + ", applicationInfo=" + this.f8711b + ')';
    }
}
