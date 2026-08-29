package a9;
public final class v {
    public final Class f274a;
    public final Class f275b;

    public v(Class cls, Class cls2) {
        this.f274a = cls;
        this.f275b = cls2;
    }

    public static v a(Class cls) {
        return new v(u.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.f275b.equals(vVar.f275b)) {
            return false;
        }
        return this.f274a.equals(vVar.f274a);
    }

    public final int hashCode() {
        return this.f274a.hashCode() + (this.f275b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f275b;
        Class cls2 = this.f274a;
        if (cls2 == u.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
