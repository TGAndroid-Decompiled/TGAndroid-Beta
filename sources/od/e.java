package od;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f14147a == eVar.f14147a && this.f14148b == eVar.f14148b) {
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
        return (this.f14147a * 31) + this.f14148b;
    }

    public final boolean isEmpty() {
        if (this.f14147a > this.f14148b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f14147a + ".." + this.f14148b;
    }
}
