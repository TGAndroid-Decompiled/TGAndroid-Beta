package gd;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f7022a == eVar.f7022a && this.f7023b == eVar.f7023b) {
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
        return (this.f7022a * 31) + this.f7023b;
    }

    public final boolean isEmpty() {
        if (this.f7022a > this.f7023b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f7022a + ".." + this.f7023b;
    }
}
