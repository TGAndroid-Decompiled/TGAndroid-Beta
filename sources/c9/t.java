package c9;
public final class t {
    public final Class f2374a;
    public final Class f2375b;

    public t(Class cls, Class cls2) {
        this.f2374a = cls;
        this.f2375b = cls2;
    }

    public static t a(Class cls) {
        return new t(s.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (!this.f2375b.equals(tVar.f2375b)) {
            return false;
        }
        return this.f2374a.equals(tVar.f2374a);
    }

    public final int hashCode() {
        return this.f2374a.hashCode() + (this.f2375b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f2375b;
        Class cls2 = this.f2374a;
        if (cls2 == s.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
