package kotlin.jvm.internal;
public final class l implements d {
    public final Class f11096a;

    public l(Class jClass) {
        j.e(jClass, "jClass");
        this.f11096a = jClass;
    }

    @Override
    public final Class a() {
        return this.f11096a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (j.a(this.f11096a, ((l) obj).f11096a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11096a.hashCode();
    }

    public final String toString() {
        return this.f11096a + " (Kotlin reflection is not available)";
    }
}
