package defpackage;

import j$.util.Objects;
public final class r30 {
    public final fm4 a;
    public final im5 b;
    public final aob c;
    public final rx6 d;

    public r30(c5a c5aVar) {
        this.a = (fm4) c5aVar.b;
        this.b = (im5) c5aVar.c;
        this.c = (aob) c5aVar.d;
        this.d = (rx6) c5aVar.e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r30) {
                r30 r30Var = (r30) obj;
                if (this.a.equals(r30Var.a) && Objects.equals(this.b, r30Var.b) && this.c.equals(r30Var.c) && Objects.equals(this.d, r30Var.d)) {
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
        im5 im5Var = this.b;
        if (im5Var == null) {
            hashCode = 0;
        } else {
            hashCode = im5Var.hashCode();
        }
        int hashCode3 = (this.c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        rx6 rx6Var = this.d;
        if (rx6Var != null) {
            i = rx6Var.hashCode();
        }
        return hashCode3 + i;
    }
}
