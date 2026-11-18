package kotlin.jvm.internal;
public final class l implements d {
    public final Class f19119a;

    public l(Class jClass) {
        j.e(jClass, "jClass");
        this.f19119a = jClass;
    }

    @Override
    public final Class a() {
        return this.f19119a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (j.a(this.f19119a, ((l) obj).f19119a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19119a.hashCode();
    }

    public final String toString() {
        return this.f19119a + " (Kotlin reflection is not available)";
    }
}
