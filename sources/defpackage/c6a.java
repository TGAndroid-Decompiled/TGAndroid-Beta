package defpackage;
public final class c6a {
    public final i6a a;
    public final sr b;

    public c6a(i6a i6aVar, sr srVar) {
        this.a = i6aVar;
        this.b = srVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c6a) {
                c6a c6aVar = (c6a) obj;
                if (!this.a.equals(c6aVar.a) || !this.b.equals(c6aVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        return this.b.hashCode() + ((hashCode + (n44.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + n44.SESSION_START + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
