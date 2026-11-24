package defpackage;
public final class e8a {
    public final k8a a;
    public final ss b;

    public e8a(k8a k8aVar, ss ssVar) {
        this.a = k8aVar;
        this.b = ssVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e8a) {
                e8a e8aVar = (e8a) obj;
                if (!this.a.equals(e8aVar.a) || !this.b.equals(e8aVar.b)) {
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
        return this.b.hashCode() + ((hashCode + (y54.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + y54.SESSION_START + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
