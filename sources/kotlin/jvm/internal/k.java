package kotlin.jvm.internal;
public final class k implements c {
    public final Class f13877a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f13877a = jClass;
    }

    @Override
    public final Class a() {
        return this.f13877a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f13877a, ((k) obj).f13877a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13877a.hashCode();
    }

    public final String toString() {
        return this.f13877a + " (Kotlin reflection is not available)";
    }
}
