package kotlin.jvm.internal;
public final class l implements d {
    public final Class f19147a;

    public l(Class jClass) {
        j.e(jClass, "jClass");
        this.f19147a = jClass;
    }

    @Override
    public final Class a() {
        return this.f19147a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (j.a(this.f19147a, ((l) obj).f19147a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19147a.hashCode();
    }

    public final String toString() {
        return this.f19147a + " (Kotlin reflection is not available)";
    }
}
