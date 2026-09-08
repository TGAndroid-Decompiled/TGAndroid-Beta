package kotlin.jvm.internal;
public final class k implements c {
    public final Class f15075a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f15075a = jClass;
    }

    @Override
    public final Class a() {
        return this.f15075a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f15075a, ((k) obj).f15075a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15075a.hashCode();
    }

    public final String toString() {
        return this.f15075a + " (Kotlin reflection is not available)";
    }
}
