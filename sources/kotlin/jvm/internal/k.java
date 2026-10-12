package kotlin.jvm.internal;
public final class k implements c {
    public final Class f14359a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f14359a = jClass;
    }

    @Override
    public final Class a() {
        return this.f14359a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f14359a, ((k) obj).f14359a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14359a.hashCode();
    }

    public final String toString() {
        return this.f14359a + " (Kotlin reflection is not available)";
    }
}
