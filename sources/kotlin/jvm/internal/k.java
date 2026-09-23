package kotlin.jvm.internal;
public final class k implements c {
    public final Class f13668a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f13668a = jClass;
    }

    @Override
    public final Class a() {
        return this.f13668a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f13668a, ((k) obj).f13668a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13668a.hashCode();
    }

    public final String toString() {
        return this.f13668a + " (Kotlin reflection is not available)";
    }
}
