package kotlin.jvm.internal;
public final class k implements c {
    public final Class f15112a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f15112a = jClass;
    }

    @Override
    public final Class a() {
        return this.f15112a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f15112a, ((k) obj).f15112a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15112a.hashCode();
    }

    public final String toString() {
        return this.f15112a + " (Kotlin reflection is not available)";
    }
}
