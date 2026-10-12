package kotlin.jvm.internal;
public final class k implements c {
    public final Class f14925a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f14925a = jClass;
    }

    @Override
    public final Class a() {
        return this.f14925a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f14925a, ((k) obj).f14925a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14925a.hashCode();
    }

    public final String toString() {
        return this.f14925a + " (Kotlin reflection is not available)";
    }
}
