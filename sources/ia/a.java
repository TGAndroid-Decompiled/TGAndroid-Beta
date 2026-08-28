package ia;

import e9.k;
import kotlin.jvm.internal.i;
public final class a {
    public final qd.d f11063a;
    public k f11064b = null;

    public a(qd.d dVar) {
        this.f11063a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f11063a.equals(aVar.f11063a) || !i.a(this.f11064b, aVar.f11064b)) {
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
        int hashCode2 = this.f11063a.hashCode() * 31;
        k kVar = this.f11064b;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f11063a + ", subscriber=" + this.f11064b + ')';
    }
}
