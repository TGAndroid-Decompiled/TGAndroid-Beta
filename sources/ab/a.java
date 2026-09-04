package ab;

import kotlin.jvm.internal.i;
import w9.j;
public final class a {
    public final ie.d f376a;
    public j f377b = null;

    public a(ie.d dVar) {
        this.f376a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f376a.equals(aVar.f376a) || !i.a(this.f377b, aVar.f377b)) {
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
        int hashCode2 = this.f376a.hashCode() * 31;
        j jVar = this.f377b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f376a + ", subscriber=" + this.f377b + ')';
    }
}
