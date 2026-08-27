package ja;

import f9.k;
import kotlin.jvm.internal.j;

public final class a {

    public final rd.d f12865a;

    public k f12866b = null;

    public a(rd.d dVar) {
        this.f12865a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12865a.equals(aVar.f12865a) && j.a(this.f12866b, aVar.f12866b);
    }

    public final int hashCode() {
        int iHashCode = this.f12865a.hashCode() * 31;
        k kVar = this.f12866b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f12865a + ", subscriber=" + this.f12866b + ')';
    }
}
