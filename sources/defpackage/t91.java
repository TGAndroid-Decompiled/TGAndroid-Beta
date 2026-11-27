package defpackage;

import java.io.Serializable;
public final class t91 {
    public Serializable a;
    public v91 b;
    public sd9 c;
    public boolean d;

    public final void a() {
        this.d = true;
        v91 v91Var = this.b;
        if (v91Var != null && v91Var.b.k(null)) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public final void finalize() {
        sd9 sd9Var;
        v91 v91Var = this.b;
        if (v91Var != null) {
            u91 u91Var = v91Var.b;
            if (!u91Var.isDone()) {
                u91Var.l(new j2("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, (byte) 2));
            }
        }
        if (!this.d && (sd9Var = this.c) != null) {
            sd9Var.k(null);
        }
    }
}
