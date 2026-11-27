package defpackage;

import j$.util.Objects;
public final class ph5 {
    public final ko4 a;
    public final String b;
    public final String c;

    public ph5(ko4 ko4Var, String str, String str2) {
        jo4 a = ko4Var.a();
        a.a = null;
        a.l = null;
        this.a = new ko4(a);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ph5) {
                ph5 ph5Var = (ph5) obj;
                if (this.a.equals(ph5Var.a) && Objects.equals(this.b, ph5Var.b) && Objects.equals(this.c, ph5Var.c)) {
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
