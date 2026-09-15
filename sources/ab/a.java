package ab;

import kotlin.jvm.internal.i;
import w9.j;
public final class a {
    public final ie.d f362a;
    public j f363b = null;

    public a(ie.d dVar) {
        this.f362a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f362a.equals(aVar.f362a) || !i.a(this.f363b, aVar.f363b)) {
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
        int hashCode2 = this.f362a.hashCode() * 31;
        j jVar = this.f363b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f362a + ", subscriber=" + this.f363b + ')';
    }
}
