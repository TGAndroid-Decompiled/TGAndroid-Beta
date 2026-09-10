package ab;

import kotlin.jvm.internal.i;
import w9.j;
public final class a {
    public final ie.d f360a;
    public j f361b = null;

    public a(ie.d dVar) {
        this.f360a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f360a.equals(aVar.f360a) || !i.a(this.f361b, aVar.f361b)) {
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
        int hashCode2 = this.f360a.hashCode() * 31;
        j jVar = this.f361b;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f360a + ", subscriber=" + this.f361b + ')';
    }
}
