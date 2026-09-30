package kotlin.jvm.internal;
public final class k implements c {
    public final Class f13919a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f13919a = jClass;
    }

    @Override
    public final Class a() {
        return this.f13919a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f13919a, ((k) obj).f13919a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13919a.hashCode();
    }

    public final String toString() {
        return this.f13919a + " (Kotlin reflection is not available)";
    }
}
