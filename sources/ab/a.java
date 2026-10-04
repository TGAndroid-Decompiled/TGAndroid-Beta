package ab;

import kotlin.jvm.internal.i;
import w9.j;
public final class a {
    public final ie.d f391a;
    public j f392b = null;

    public a(ie.d dVar) {
        this.f391a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f391a.equals(aVar.f391a) || !i.a(this.f392b, aVar.f392b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f391a.hashCode() * 31;
        j jVar = this.f392b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f391a + ", subscriber=" + this.f392b + ')';
    }
}
