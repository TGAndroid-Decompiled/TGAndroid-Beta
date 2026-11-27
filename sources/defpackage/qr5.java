package defpackage;
public final class qr5 extends wl5 {
    public final String b;
    public final String c;
    public final String d;

    public qr5(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && qr5.class == obj.getClass()) {
                qr5 qr5Var = (qr5) obj;
                if (this.c.equals(qr5Var.c) && this.b.equals(qr5Var.b) && this.d.equals(qr5Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + bs2.j(bs2.j(527, 31, this.b), 31, this.c);
    }

    @Override
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
