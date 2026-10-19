package bb;

import kotlin.jvm.internal.i;
import x9.j;
public final class a {
    public final ke.d f4230a;
    public j f4231b = null;

    public a(ke.d dVar) {
        this.f4230a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f4230a.equals(aVar.f4230a) || !i.a(this.f4231b, aVar.f4231b)) {
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
        int hashCode2 = this.f4230a.hashCode() * 31;
        j jVar = this.f4231b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f4230a + ", subscriber=" + this.f4231b + ')';
    }
}
