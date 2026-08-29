package kotlin.jvm.internal;
public final class l implements d {
    public final Class f13923a;

    public l(Class jClass) {
        j.e(jClass, "jClass");
        this.f13923a = jClass;
    }

    @Override
    public final Class a() {
        return this.f13923a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (j.a(this.f13923a, ((l) obj).f13923a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13923a.hashCode();
    }

    public final String toString() {
        return this.f13923a + " (Kotlin reflection is not available)";
    }
}
