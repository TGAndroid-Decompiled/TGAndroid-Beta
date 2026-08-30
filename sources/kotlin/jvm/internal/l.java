package kotlin.jvm.internal;
public final class l implements d {
    public final Class f10986a;

    public l(Class jClass) {
        j.e(jClass, "jClass");
        this.f10986a = jClass;
    }

    @Override
    public final Class a() {
        return this.f10986a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (j.a(this.f10986a, ((l) obj).f10986a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10986a.hashCode();
    }

    public final String toString() {
        return this.f10986a + " (Kotlin reflection is not available)";
    }
}
