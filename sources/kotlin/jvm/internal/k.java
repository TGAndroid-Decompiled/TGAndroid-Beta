package kotlin.jvm.internal;
public final class k implements c {
    public final Class f15693a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f15693a = jClass;
    }

    @Override
    public final Class a() {
        return this.f15693a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f15693a, ((k) obj).f15693a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15693a.hashCode();
    }

    public final String toString() {
        return this.f15693a + " (Kotlin reflection is not available)";
    }
}
