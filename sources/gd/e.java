package gd;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f6525a == eVar.f6525a && this.f6526b == eVar.f6526b) {
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
        return (this.f6525a * 31) + this.f6526b;
    }

    public final boolean isEmpty() {
        if (this.f6525a > this.f6526b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f6525a + ".." + this.f6526b;
    }
}
