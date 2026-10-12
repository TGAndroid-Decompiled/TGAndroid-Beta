package kotlin.jvm.internal;
public final class k implements c {
    public final Class f14924a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f14924a = jClass;
    }

    @Override
    public final Class a() {
        return this.f14924a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f14924a, ((k) obj).f14924a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14924a.hashCode();
    }

    public final String toString() {
        return this.f14924a + " (Kotlin reflection is not available)";
    }
}
