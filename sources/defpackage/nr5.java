package defpackage;
public final class nr5 extends tl5 {
    public final String b;
    public final String c;
    public final String d;

    public nr5(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && nr5.class == obj.getClass()) {
                nr5 nr5Var = (nr5) obj;
                if (this.c.equals(nr5Var.c) && this.b.equals(nr5Var.b) && this.d.equals(nr5Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + ts2.j(ts2.j(527, 31, this.b), 31, this.c);
    }

    @Override
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
