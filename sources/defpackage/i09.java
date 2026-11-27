package defpackage;
public final class i09 {
    public final Class a;
    public final Class b;

    public i09(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static i09 a(Class cls) {
        return new i09(h09.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i09.class == obj.getClass()) {
            i09 i09Var = (i09) obj;
            if (this.b.equals(i09Var.b)) {
                return this.a.equals(i09Var.a);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == h09.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
