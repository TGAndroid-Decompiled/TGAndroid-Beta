package kotlin.jvm.internal;
public final class l implements d {
    public final Class f17613a;

    public l(Class jClass) {
        j.e(jClass, "jClass");
        this.f17613a = jClass;
    }

    @Override
    public final Class a() {
        return this.f17613a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (j.a(this.f17613a, ((l) obj).f17613a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17613a.hashCode();
    }

    public final String toString() {
        return this.f17613a + " (Kotlin reflection is not available)";
    }
}
