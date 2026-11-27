package defpackage;
public final class qe3 {
    public final i09 a;
    public final byte b;
    public final byte c;

    public qe3(i09 i09Var, int i, int i2) {
        bwe.a(i09Var, "Null dependency anInterface.");
        this.a = i09Var;
        this.b = i;
        this.c = i2;
    }

    public static qe3 a(i09 i09Var) {
        return new qe3(i09Var, 1, 0);
    }

    public static qe3 b(Class cls) {
        return new qe3(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qe3) {
            qe3 qe3Var = (qe3) obj;
            if (this.a.equals(qe3Var.a) && this.b == qe3Var.b && this.c == qe3Var.c) {
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
                    hz6.e(uh9.k(b2, "Unsupported injection: "));
                    return null;
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return c00.k(sb, str2, "}");
    }

    public qe3(int i, int i2, Class cls) {
        this(i09.a(cls), i, i2);
    }
}
