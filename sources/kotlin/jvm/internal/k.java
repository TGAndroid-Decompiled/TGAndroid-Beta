package kotlin.jvm.internal;
public final class k implements c {
    public final Class f13680a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f13680a = jClass;
    }

    @Override
    public final Class a() {
        return this.f13680a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f13680a, ((k) obj).f13680a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13680a.hashCode();
    }

    public final String toString() {
        return this.f13680a + " (Kotlin reflection is not available)";
    }
}
