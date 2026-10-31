package cb;

import kotlin.jvm.internal.i;
import x9.j;
public final class a {
    public final ce.d f4087a;
    public j f4088b = null;

    public a(ce.d dVar) {
        this.f4087a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f4087a.equals(aVar.f4087a) || !i.a(this.f4088b, aVar.f4088b)) {
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
        int hashCode2 = this.f4087a.hashCode() * 31;
        j jVar = this.f4088b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f4087a + ", subscriber=" + this.f4088b + ')';
    }
}
