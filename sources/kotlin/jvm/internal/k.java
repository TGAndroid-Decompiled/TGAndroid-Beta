package kotlin.jvm.internal;
public final class k implements c {
    public final Class f11440a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f11440a = jClass;
    }

    @Override
    public final Class a() {
        return this.f11440a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f11440a, ((k) obj).f11440a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11440a.hashCode();
    }

    public final String toString() {
        return this.f11440a + " (Kotlin reflection is not available)";
    }
}
