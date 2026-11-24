package defpackage;

import j$.util.Objects;
public final class km2 extends uj5 {
    public final String b;
    public final String c;
    public final String d;

    public km2(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && km2.class == obj.getClass()) {
                km2 km2Var = (km2) obj;
                if (this.c.equals(km2Var.c) && this.b.equals(km2Var.b) && Objects.equals(this.d, km2Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int j = ir2.j(ir2.j(527, 31, this.b), 31, this.c);
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return j + i;
    }

    @Override
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
