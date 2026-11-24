package defpackage;
public final class wd3 {
    public final xw8 a;
    public final byte b;
    public final byte c;

    public wd3(xw8 xw8Var, int i, int i2) {
        hre.a(xw8Var, "Null dependency anInterface.");
        this.a = xw8Var;
        this.b = i;
        this.c = i2;
    }

    public static wd3 a(xw8 xw8Var) {
        return new wd3(xw8Var, 1, 0);
    }

    public static wd3 b(Class cls) {
        return new wd3(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wd3) {
            wd3 wd3Var = (wd3) obj;
            if (this.a.equals(wd3Var.a) && this.b == wd3Var.b && this.c == wd3Var.c) {
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
                    fi7.g(de9.k(b2, "Unsupported injection: "));
                    return null;
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return b00.j(sb, str2, "}");
    }

    public wd3(int i, int i2, Class cls) {
        this(xw8.a(cls), i, i2);
    }
}
