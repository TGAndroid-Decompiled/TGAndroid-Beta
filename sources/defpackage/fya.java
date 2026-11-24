package defpackage;

import j$.util.Objects;
public final class fya {
    public final String a;
    public final String b;
    public final gya c;

    public fya(String str, String str2, gya gyaVar) {
        this.a = str;
        this.b = str2;
        this.c = gyaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fya) {
                fya fyaVar = (fya) obj;
                if (this.a.equals(fyaVar.a) && this.b.equals(fyaVar.b) && this.c.equals(fyaVar.c)) {
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
