package kotlin.jvm.internal;
public final class l implements d {
    public final Class f19212a;

    public l(Class jClass) {
        j.e(jClass, "jClass");
        this.f19212a = jClass;
    }

    @Override
    public final Class a() {
        return this.f19212a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (j.a(this.f19212a, ((l) obj).f19212a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19212a.hashCode();
    }

    public final String toString() {
        return this.f19212a + " (Kotlin reflection is not available)";
    }
}
