package kotlin.jvm.internal;
public final class k implements c {
    public final Class f15215a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f15215a = jClass;
    }

    @Override
    public final Class a() {
        return this.f15215a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f15215a, ((k) obj).f15215a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15215a.hashCode();
    }

    public final String toString() {
        return this.f15215a + " (Kotlin reflection is not available)";
    }
}
