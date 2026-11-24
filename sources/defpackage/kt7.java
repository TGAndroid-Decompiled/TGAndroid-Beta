package defpackage;
public final class kt7 implements aj2 {
    public final Class a;

    public kt7(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kt7) {
            if (rr5.a(this.a, ((kt7) obj).a)) {
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
