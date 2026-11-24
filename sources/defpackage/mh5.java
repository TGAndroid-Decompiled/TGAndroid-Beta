package defpackage;

import j$.util.Objects;
public final class mh5 {
    public final go4 a;
    public final String b;
    public final String c;

    public mh5(go4 go4Var, String str, String str2) {
        fo4 a = go4Var.a();
        a.a = null;
        a.l = null;
        this.a = new go4(a);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mh5) {
                mh5 mh5Var = (mh5) obj;
                if (this.a.equals(mh5Var.a) && Objects.equals(this.b, mh5Var.b) && Objects.equals(this.c, mh5Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
