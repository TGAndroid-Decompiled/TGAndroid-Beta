package bb;

import kotlin.jvm.internal.i;
import x9.j;
public final class a {
    public final ke.d f4231a;
    public j f4232b = null;

    public a(ke.d dVar) {
        this.f4231a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f4231a.equals(aVar.f4231a) || !i.a(this.f4232b, aVar.f4232b)) {
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
        int hashCode2 = this.f4231a.hashCode() * 31;
        j jVar = this.f4232b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f4231a + ", subscriber=" + this.f4232b + ')';
    }
}
