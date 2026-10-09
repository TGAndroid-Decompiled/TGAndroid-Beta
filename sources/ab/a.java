package ab;

import kotlin.jvm.internal.i;
import w9.j;
public final class a {
    public final je.d f389a;
    public j f390b = null;

    public a(je.d dVar) {
        this.f389a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f389a.equals(aVar.f389a) || !i.a(this.f390b, aVar.f390b)) {
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
        int hashCode2 = this.f389a.hashCode() * 31;
        j jVar = this.f390b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f389a + ", subscriber=" + this.f390b + ')';
    }
}
