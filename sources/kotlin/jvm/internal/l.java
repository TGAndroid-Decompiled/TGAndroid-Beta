package kotlin.jvm.internal;

public final class l implements d {

    public final Class f15249a;

    public l(Class jClass) {
        j.e(jClass, "jClass");
        this.f15249a = jClass;
    }

    @Override
    public final Class a() {
        return this.f15249a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return j.a(this.f15249a, ((l) obj).f15249a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15249a.hashCode();
    }

    public final String toString() {
        return this.f15249a + " (Kotlin reflection is not available)";
    }
}
