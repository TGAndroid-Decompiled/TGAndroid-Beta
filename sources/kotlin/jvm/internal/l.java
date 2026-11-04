package kotlin.jvm.internal;
public final class l implements d {
    public final Class f17356a;

    public l(Class jClass) {
        j.e(jClass, "jClass");
        this.f17356a = jClass;
    }

    @Override
    public final Class a() {
        return this.f17356a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (j.a(this.f17356a, ((l) obj).f17356a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17356a.hashCode();
    }

    public final String toString() {
        return this.f17356a + " (Kotlin reflection is not available)";
    }
}
