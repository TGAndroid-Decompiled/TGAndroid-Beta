package ed;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f5882a == eVar.f5882a && this.f5883b == eVar.f5883b) {
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
        return (this.f5882a * 31) + this.f5883b;
    }

    public final boolean isEmpty() {
        if (this.f5882a > this.f5883b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f5882a + ".." + this.f5883b;
    }
}
