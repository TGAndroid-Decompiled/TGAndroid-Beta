package od;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f14148a == eVar.f14148a && this.f14149b == eVar.f14149b) {
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
        return (this.f14148a * 31) + this.f14149b;
    }

    public final boolean isEmpty() {
        if (this.f14148a > this.f14149b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f14148a + ".." + this.f14149b;
    }
}
