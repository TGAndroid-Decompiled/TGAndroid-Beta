package c9;
public final class u {
    public final Class f2208a;
    public final Class f2209b;

    public u(Class cls, Class cls2) {
        this.f2208a = cls;
        this.f2209b = cls2;
    }

    public static u a(Class cls) {
        return new u(t.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (!this.f2209b.equals(uVar.f2209b)) {
            return false;
        }
        return this.f2208a.equals(uVar.f2208a);
    }

    public final int hashCode() {
        return this.f2208a.hashCode() + (this.f2209b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f2209b;
        Class cls2 = this.f2208a;
        if (cls2 == t.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
