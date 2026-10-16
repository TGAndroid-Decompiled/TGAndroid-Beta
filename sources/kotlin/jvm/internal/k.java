package kotlin.jvm.internal;
public final class k implements c {
    public final Class f14361a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f14361a = jClass;
    }

    @Override
    public final Class a() {
        return this.f14361a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f14361a, ((k) obj).f14361a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14361a.hashCode();
    }

    public final String toString() {
        return this.f14361a + " (Kotlin reflection is not available)";
    }
}
