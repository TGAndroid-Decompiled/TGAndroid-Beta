package dd;

public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        c cVar;
        char c10;
        char c11;
        if (!(obj instanceof c)) {
            return false;
        }
        char c12 = this.f4907a;
        char c13 = this.f4908b;
        if (c12 >= c13 && c12 != c13 && (c10 = (cVar = (c) obj).f4907a) >= (c11 = cVar.f4908b) && c10 != c11) {
            return true;
        }
        c cVar2 = (c) obj;
        return c12 == cVar2.f4907a && c13 == cVar2.f4908b;
    }

    public final int hashCode() {
        char c10 = this.f4907a;
        char c11 = this.f4908b;
        if (c10 >= c11 && c10 != c11) {
            return -1;
        }
        return (c10 * 31) + c11;
    }

    public final String toString() {
        return this.f4907a + ".." + this.f4908b;
    }
}
