package defpackage;

import j$.util.Objects;
public final class fq6 {
    public final boolean a;
    public final String b;
    public final String c;

    public fq6(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && fq6.class == obj.getClass()) {
                fq6 fq6Var = (fq6) obj;
                if (this.a == fq6Var.a && Objects.equals(this.b, fq6Var.b) && Objects.equals(this.c, fq6Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }
}
