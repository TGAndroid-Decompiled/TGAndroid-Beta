package kotlin.jvm.internal;
public final class k implements c {
    public final Class f11441a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f11441a = jClass;
    }

    @Override
    public final Class a() {
        return this.f11441a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f11441a, ((k) obj).f11441a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11441a.hashCode();
    }

    public final String toString() {
        return this.f11441a + " (Kotlin reflection is not available)";
    }
}
