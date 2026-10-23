package kotlin.jvm.internal;
public final class k implements c {
    public final Class f15762a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f15762a = jClass;
    }

    @Override
    public final Class a() {
        return this.f15762a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f15762a, ((k) obj).f15762a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15762a.hashCode();
    }

    public final String toString() {
        return this.f15762a + " (Kotlin reflection is not available)";
    }
}
