package kotlin.jvm.internal;
public final class k implements c {
    public final Class f15111a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f15111a = jClass;
    }

    @Override
    public final Class a() {
        return this.f15111a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f15111a, ((k) obj).f15111a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15111a.hashCode();
    }

    public final String toString() {
        return this.f15111a + " (Kotlin reflection is not available)";
    }
}
