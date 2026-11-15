package kotlin.jvm.internal;
public final class l implements d {
    public final Class f18752a;

    public l(Class jClass) {
        j.e(jClass, "jClass");
        this.f18752a = jClass;
    }

    @Override
    public final Class a() {
        return this.f18752a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (j.a(this.f18752a, ((l) obj).f18752a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18752a.hashCode();
    }

    public final String toString() {
        return this.f18752a + " (Kotlin reflection is not available)";
    }
}
