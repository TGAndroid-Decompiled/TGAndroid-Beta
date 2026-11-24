package defpackage;

import java.io.Serializable;
public final class k91 {
    public Serializable a;
    public m91 b;
    public ea9 c;
    public boolean d;

    public final void a() {
        this.d = true;
        m91 m91Var = this.b;
        if (m91Var != null && m91Var.b.k(null)) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public final void finalize() {
        ea9 ea9Var;
        m91 m91Var = this.b;
        if (m91Var != null) {
            l91 l91Var = m91Var.b;
            if (!l91Var.isDone()) {
                l91Var.l(new i2("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, (byte) 2));
            }
        }
        if (!this.d && (ea9Var = this.c) != null) {
            ea9Var.k(null);
        }
    }
}
