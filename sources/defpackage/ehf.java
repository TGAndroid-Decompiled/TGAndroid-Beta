package defpackage;

import java.util.Arrays;
public final class ehf {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public ehf(am2 am2Var) {
        this.a = (Boolean) am2Var.b;
        this.b = (Boolean) am2Var.c;
        this.c = (Boolean) am2Var.d;
        this.d = (Boolean) am2Var.e;
        this.e = (Boolean) am2Var.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ehf)) {
            return false;
        }
        ehf ehfVar = (ehf) obj;
        if (vue.a(this.a, ehfVar.a) && vue.a(this.b, ehfVar.b) && vue.a(this.c, ehfVar.c) && vue.a(this.d, ehfVar.d) && vue.a(this.e, ehfVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }
}
