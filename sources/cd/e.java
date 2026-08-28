package cd;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f2370a == eVar.f2370a && this.f2371b == eVar.f2371b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2370a * 31) + this.f2371b;
    }

    public final boolean isEmpty() {
        if (this.f2370a > this.f2371b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f2370a + ".." + this.f2371b;
    }
}
