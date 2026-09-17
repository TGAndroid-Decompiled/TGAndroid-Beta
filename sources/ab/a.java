package ab;

import kotlin.jvm.internal.i;
import w9.j;
public final class a {
    public final ie.d f388a;
    public j f389b = null;

    public a(ie.d dVar) {
        this.f388a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f388a.equals(aVar.f388a) || !i.a(this.f389b, aVar.f389b)) {
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
        int hashCode2 = this.f388a.hashCode() * 31;
        j jVar = this.f389b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f388a + ", subscriber=" + this.f389b + ')';
    }
}
