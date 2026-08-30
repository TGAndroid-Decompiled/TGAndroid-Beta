package ma;

import i9.k;
import kotlin.jvm.internal.j;
public final class a {
    public final ud.d f13886a;
    public k f13887b = null;

    public a(ud.d dVar) {
        this.f13886a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f13886a.equals(aVar.f13886a) || !j.a(this.f13887b, aVar.f13887b)) {
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
        int hashCode2 = this.f13886a.hashCode() * 31;
        k kVar = this.f13887b;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f13886a + ", subscriber=" + this.f13887b + ')';
    }
}
