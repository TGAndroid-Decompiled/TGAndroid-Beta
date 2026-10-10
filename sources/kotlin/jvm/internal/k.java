package kotlin.jvm.internal;
public final class k implements c {
    public final Class f15180a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f15180a = jClass;
    }

    @Override
    public final Class a() {
        return this.f15180a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f15180a, ((k) obj).f15180a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15180a.hashCode();
    }

    public final String toString() {
        return this.f15180a + " (Kotlin reflection is not available)";
    }
}
