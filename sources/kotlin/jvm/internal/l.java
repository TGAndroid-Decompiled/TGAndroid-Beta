package kotlin.jvm.internal;
public final class l implements d {
    public final Class f19113a;

    public l(Class jClass) {
        j.e(jClass, "jClass");
        this.f19113a = jClass;
    }

    @Override
    public final Class a() {
        return this.f19113a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (j.a(this.f19113a, ((l) obj).f19113a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19113a.hashCode();
    }

    public final String toString() {
        return this.f19113a + " (Kotlin reflection is not available)";
    }
}
