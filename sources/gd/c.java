package gd;
public final class c extends a {
    static {
        new a((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        c cVar;
        char c3;
        char c10;
        if (obj instanceof c) {
            char c11 = this.f7015a;
            char c12 = this.f7016b;
            if (c11 < c12 || c11 == c12 || (c3 = (cVar = (c) obj).f7015a) < (c10 = cVar.f7016b) || c3 == c10) {
                c cVar2 = (c) obj;
                if (c11 == cVar2.f7015a && c12 == cVar2.f7016b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        char c3 = this.f7015a;
        char c10 = this.f7016b;
        if (c3 < c10 || c3 == c10) {
            return (c3 * 31) + c10;
        }
        return -1;
    }

    public final String toString() {
        return this.f7015a + ".." + this.f7016b;
    }
}
