package kotlin.jvm.internal;
public final class k implements c {
    public final Class f12572a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f12572a = jClass;
    }

    @Override
    public final Class a() {
        return this.f12572a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f12572a, ((k) obj).f12572a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12572a.hashCode();
    }

    public final String toString() {
        return this.f12572a + " (Kotlin reflection is not available)";
    }
}
