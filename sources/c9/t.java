package c9;
public final class t {
    public final Class f2184a;
    public final Class f2185b;

    public t(Class cls, Class cls2) {
        this.f2184a = cls;
        this.f2185b = cls2;
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
        if (!this.f2185b.equals(tVar.f2185b)) {
            return false;
        }
        return this.f2184a.equals(tVar.f2184a);
    }

    public final int hashCode() {
        return this.f2184a.hashCode() + (this.f2185b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f2185b;
        Class cls2 = this.f2184a;
        if (cls2 == s.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
