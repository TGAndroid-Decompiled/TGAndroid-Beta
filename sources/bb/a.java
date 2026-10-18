package bb;

import kotlin.jvm.internal.i;
import x9.j;
public final class a {
    public final ke.d f4232a;
    public j f4233b = null;

    public a(ke.d dVar) {
        this.f4232a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f4232a.equals(aVar.f4232a) || !i.a(this.f4233b, aVar.f4233b)) {
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
        int hashCode2 = this.f4232a.hashCode() * 31;
        j jVar = this.f4233b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f4232a + ", subscriber=" + this.f4233b + ')';
    }
}
