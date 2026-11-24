package defpackage;
public final class jr7 implements mh2 {
    public final Class a;

    public jr7(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jr7) {
            if (rp5.a(this.a, ((jr7) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
