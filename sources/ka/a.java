package ka;

import g9.k;
import kotlin.jvm.internal.j;
public final class a {
    public final sd.d f13586a;
    public k f13587b = null;

    public a(sd.d dVar) {
        this.f13586a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f13586a.equals(aVar.f13586a) || !j.a(this.f13587b, aVar.f13587b)) {
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
        int hashCode2 = this.f13586a.hashCode() * 31;
        k kVar = this.f13587b;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f13586a + ", subscriber=" + this.f13587b + ')';
    }
}
