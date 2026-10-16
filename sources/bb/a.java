package bb;

import kotlin.jvm.internal.i;
import x9.j;
public final class a {
    public final ke.d f2619a;
    public j f2620b = null;

    public a(ke.d dVar) {
        this.f2619a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f2619a.equals(aVar.f2619a) || !i.a(this.f2620b, aVar.f2620b)) {
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
        int hashCode2 = this.f2619a.hashCode() * 31;
        j jVar = this.f2620b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f2619a + ", subscriber=" + this.f2620b + ')';
    }
}
