package kotlin.jvm.internal;
public final class k implements c {
    public final Class f13904a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f13904a = jClass;
    }

    @Override
    public final Class a() {
        return this.f13904a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f13904a, ((k) obj).f13904a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13904a.hashCode();
    }

    public final String toString() {
        return this.f13904a + " (Kotlin reflection is not available)";
    }
}
