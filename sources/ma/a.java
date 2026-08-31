package ma;

import i9.k;
import kotlin.jvm.internal.j;
public final class a {
    public final ud.d f13602a;
    public k f13603b = null;

    public a(ud.d dVar) {
        this.f13602a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f13602a.equals(aVar.f13602a) || !j.a(this.f13603b, aVar.f13603b)) {
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
        int hashCode2 = this.f13602a.hashCode() * 31;
        k kVar = this.f13603b;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f13602a + ", subscriber=" + this.f13603b + ')';
    }
}
