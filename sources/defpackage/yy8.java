package defpackage;
public final class yy8 {
    public final Class a;
    public final Class b;

    public yy8(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static yy8 a(Class cls) {
        return new yy8(xy8.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yy8.class == obj.getClass()) {
            yy8 yy8Var = (yy8) obj;
            if (this.b.equals(yy8Var.b)) {
                return this.a.equals(yy8Var.a);
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
        if (cls2 == xy8.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
