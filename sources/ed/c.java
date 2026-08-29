package ed;
public final class c extends a {
    static {
        new a((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        c cVar;
        char c3;
        char c6;
        if (obj instanceof c) {
            char c10 = this.f5875a;
            char c11 = this.f5876b;
            if (c10 < c11 || c10 == c11 || (c3 = (cVar = (c) obj).f5875a) < (c6 = cVar.f5876b) || c3 == c6) {
                c cVar2 = (c) obj;
                if (c10 == cVar2.f5875a && c11 == cVar2.f5876b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        char c3 = this.f5875a;
        char c6 = this.f5876b;
        if (c3 < c6 || c3 == c6) {
            return (c3 * 31) + c6;
        }
        return -1;
    }

    public final String toString() {
        return this.f5875a + ".." + this.f5876b;
    }
}
