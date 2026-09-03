package ma;

import i9.k;
import kotlin.jvm.internal.j;
public final class a {
    public final ud.d f13604a;
    public k f13605b = null;

    public a(ud.d dVar) {
        this.f13604a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f13604a.equals(aVar.f13604a) || !j.a(this.f13605b, aVar.f13605b)) {
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
        int hashCode2 = this.f13604a.hashCode() * 31;
        k kVar = this.f13605b;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f13604a + ", subscriber=" + this.f13605b + ')';
    }
}
