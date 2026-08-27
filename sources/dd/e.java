package dd;

public final class e extends d {
    public static final e d = new e(1, 0, 1);

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f4914a == eVar.f4914a && this.f4915b == eVar.f4915b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f4914a * 31) + this.f4915b;
    }

    public final boolean isEmpty() {
        return this.f4914a > this.f4915b;
    }

    public final String toString() {
        return this.f4914a + ".." + this.f4915b;
    }
}
