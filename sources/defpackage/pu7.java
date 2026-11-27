package defpackage;
public final class pu7 implements ii2 {
    public final Class a;

    public pu7(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pu7) {
            if (ur5.a(this.a, ((pu7) obj).a)) {
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
