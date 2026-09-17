package ab;

import kotlin.jvm.internal.i;
import w9.j;
public final class a {
    public final ie.d f364a;
    public j f365b = null;

    public a(ie.d dVar) {
        this.f364a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f364a.equals(aVar.f364a) || !i.a(this.f365b, aVar.f365b)) {
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
        int hashCode2 = this.f364a.hashCode() * 31;
        j jVar = this.f365b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f364a + ", subscriber=" + this.f365b + ')';
    }
}
