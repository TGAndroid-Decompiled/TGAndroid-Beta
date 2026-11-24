package defpackage;

import j$.util.Objects;
public final class r40 {
    public final go4 a;
    public final io5 b;
    public final bqb c;
    public final rz6 d;

    public r40(e7a e7aVar) {
        this.a = (go4) e7aVar.a;
        this.b = (io5) e7aVar.b;
        this.c = (bqb) e7aVar.c;
        this.d = (rz6) e7aVar.d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r40) {
                r40 r40Var = (r40) obj;
                if (this.a.equals(r40Var.a) && Objects.equals(this.b, r40Var.b) && this.c.equals(r40Var.c) && Objects.equals(this.d, r40Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 961;
        int i = 0;
        io5 io5Var = this.b;
        if (io5Var == null) {
            hashCode = 0;
        } else {
            hashCode = io5Var.hashCode();
        }
        int hashCode3 = (this.c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        rz6 rz6Var = this.d;
        if (rz6Var != null) {
            i = rz6Var.hashCode();
        }
        return hashCode3 + i;
    }
}
