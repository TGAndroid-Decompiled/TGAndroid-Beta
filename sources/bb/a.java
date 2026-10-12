package bb;

import kotlin.jvm.internal.i;
import x9.j;
public final class a {
    public final ke.d f2615a;
    public j f2616b = null;

    public a(ke.d dVar) {
        this.f2615a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f2615a.equals(aVar.f2615a) || !i.a(this.f2616b, aVar.f2616b)) {
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
        int hashCode2 = this.f2615a.hashCode() * 31;
        j jVar = this.f2616b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f2615a + ", subscriber=" + this.f2616b + ')';
    }
}
