package kotlin.jvm.internal;
public final class l implements d {
    public final Class f11336a;

    public l(Class jClass) {
        j.e(jClass, "jClass");
        this.f11336a = jClass;
    }

    @Override
    public final Class a() {
        return this.f11336a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (j.a(this.f11336a, ((l) obj).f11336a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11336a.hashCode();
    }

    public final String toString() {
        return this.f11336a + " (Kotlin reflection is not available)";
    }
}
