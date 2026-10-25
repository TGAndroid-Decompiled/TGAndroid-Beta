package cb;

import kotlin.jvm.internal.i;
import y9.j;
public final class a {
    public final le.d f6171a;
    public j f6172b = null;

    public a(le.d dVar) {
        this.f6171a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f6171a.equals(aVar.f6171a) || !i.a(this.f6172b, aVar.f6172b)) {
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
        int hashCode2 = this.f6171a.hashCode() * 31;
        j jVar = this.f6172b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f6171a + ", subscriber=" + this.f6172b + ')';
    }
}
