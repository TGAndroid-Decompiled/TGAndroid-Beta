package kotlin.jvm.internal;
public final class k implements c {
    public final Class f13888a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f13888a = jClass;
    }

    @Override
    public final Class a() {
        return this.f13888a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f13888a, ((k) obj).f13888a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13888a.hashCode();
    }

    public final String toString() {
        return this.f13888a + " (Kotlin reflection is not available)";
    }
}
