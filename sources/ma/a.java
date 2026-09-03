package ma;

import i9.k;
import kotlin.jvm.internal.j;
public final class a {
    public final ud.d f13870a;
    public k f13871b = null;

    public a(ud.d dVar) {
        this.f13870a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f13870a.equals(aVar.f13870a) || !j.a(this.f13871b, aVar.f13871b)) {
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
        int hashCode2 = this.f13870a.hashCode() * 31;
        k kVar = this.f13871b;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f13870a + ", subscriber=" + this.f13871b + ')';
    }
}
