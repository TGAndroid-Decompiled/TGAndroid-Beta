package kotlin.jvm.internal;
public final class k implements c {
    public final Class f13903a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f13903a = jClass;
    }

    @Override
    public final Class a() {
        return this.f13903a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f13903a, ((k) obj).f13903a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13903a.hashCode();
    }

    public final String toString() {
        return this.f13903a + " (Kotlin reflection is not available)";
    }
}
