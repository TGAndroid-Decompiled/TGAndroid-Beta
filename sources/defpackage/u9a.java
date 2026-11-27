package defpackage;
public final class u9a {
    public final aaa a;
    public final tr b;

    public u9a(aaa aaaVar, tr trVar) {
        this.a = aaaVar;
        this.b = trVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u9a) {
                u9a u9aVar = (u9a) obj;
                if (!this.a.equals(u9aVar.a) || !this.b.equals(u9aVar.b)) {
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
        return this.b.hashCode() + ((hashCode + (j54.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + j54.SESSION_START + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
