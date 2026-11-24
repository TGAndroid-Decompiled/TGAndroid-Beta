package defpackage;

import java.io.Serializable;
public final class ta1 {
    public Serializable a;
    public va1 b;
    public ec9 c;
    public boolean d;

    public final void a() {
        this.d = true;
        va1 va1Var = this.b;
        if (va1Var != null && va1Var.b.k(null)) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public final void finalize() {
        ec9 ec9Var;
        va1 va1Var = this.b;
        if (va1Var != null) {
            ua1 ua1Var = va1Var.b;
            if (!ua1Var.isDone()) {
                ua1Var.l(new i2("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, (byte) 2));
            }
        }
        if (!this.d && (ec9Var = this.c) != null) {
            ec9Var.k(null);
        }
    }
}
