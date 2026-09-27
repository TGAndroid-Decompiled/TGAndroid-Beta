package kotlin.jvm.internal;
public final class k implements c {
    public final Class f13905a;

    public k(Class jClass) {
        i.e(jClass, "jClass");
        this.f13905a = jClass;
    }

    @Override
    public final Class a() {
        return this.f13905a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (i.a(this.f13905a, ((k) obj).f13905a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13905a.hashCode();
    }

    public final String toString() {
        return this.f13905a + " (Kotlin reflection is not available)";
    }
}
