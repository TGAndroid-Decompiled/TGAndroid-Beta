package kotlin.jvm.internal;
public final class k implements c {
    public final Class f16665a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f16665a = jClass;
    }

    @Override
    public final Class a() {
        return this.f16665a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f16665a, ((k) obj).f16665a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16665a.hashCode();
    }

    public final String toString() {
        return this.f16665a + " (Kotlin reflection is not available)";
    }
}
