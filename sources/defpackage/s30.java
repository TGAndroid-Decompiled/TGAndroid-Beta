package defpackage;

import j$.util.Objects;
public final class s30 {
    public final ko4 a;
    public final lo5 b;
    public final asb c;
    public final vz6 d;

    public s30(u8a u8aVar) {
        this.a = (ko4) u8aVar.a;
        this.b = (lo5) u8aVar.b;
        this.c = (asb) u8aVar.c;
        this.d = (vz6) u8aVar.d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s30) {
                s30 s30Var = (s30) obj;
                if (this.a.equals(s30Var.a) && Objects.equals(this.b, s30Var.b) && this.c.equals(s30Var.c) && Objects.equals(this.d, s30Var.d)) {
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
        lo5 lo5Var = this.b;
        if (lo5Var == null) {
            hashCode = 0;
        } else {
            hashCode = lo5Var.hashCode();
        }
        int hashCode3 = (this.c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        vz6 vz6Var = this.d;
        if (vz6Var != null) {
            i = vz6Var.hashCode();
        }
        return hashCode3 + i;
    }
}
