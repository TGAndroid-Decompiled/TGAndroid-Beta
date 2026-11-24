package defpackage;
public final class if3 {
    public final yy8 a;
    public final byte b;
    public final byte c;

    public if3(yy8 yy8Var, int i, int i2) {
        kte.a(yy8Var, "Null dependency anInterface.");
        this.a = yy8Var;
        this.b = i;
        this.c = i2;
    }

    public static if3 a(yy8 yy8Var) {
        return new if3(yy8Var, 1, 0);
    }

    public static if3 b(Class cls) {
        return new if3(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof if3) {
            if3 if3Var = (if3) obj;
            if (this.a.equals(if3Var.a) && this.b == if3Var.b && this.c == if3Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        byte b = this.b;
        if (b == 1) {
            str = "required";
        } else if (b == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        byte b2 = this.c;
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 == 2) {
                    str2 = "deferred";
                } else {
                    bh7.j(hg9.j(b2, "Unsupported injection: "));
                    return null;
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return b10.j(sb, str2, "}");
    }

    public if3(int i, int i2, Class cls) {
        this(yy8.a(cls), i, i2);
    }
}
