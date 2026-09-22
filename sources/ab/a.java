package ab;

import kotlin.jvm.internal.i;
import w9.j;
public final class a {
    public final ie.d f361a;
    public j f362b = null;

    public a(ie.d dVar) {
        this.f361a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f361a.equals(aVar.f361a) || !i.a(this.f362b, aVar.f362b)) {
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
        int hashCode2 = this.f361a.hashCode() * 31;
        j jVar = this.f362b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f361a + ", subscriber=" + this.f362b + ')';
    }
}
