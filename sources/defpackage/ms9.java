package defpackage;

import java.util.Iterator;
public final class ms9 extends ns9 implements Iterator {
    public ls9 a;
    public boolean b = true;
    public final os9 c;

    public ms9(os9 os9Var) {
        this.c = os9Var;
    }

    @Override
    public final void a(ls9 ls9Var) {
        boolean z;
        ls9 ls9Var2 = this.a;
        if (ls9Var == ls9Var2) {
            ls9 ls9Var3 = ls9Var2.d;
            this.a = ls9Var3;
            if (ls9Var3 == null) {
                z = true;
            } else {
                z = false;
            }
            this.b = z;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.b) {
            if (this.c.a != null) {
                return true;
            }
            return false;
        }
        ls9 ls9Var = this.a;
        if (ls9Var != null && ls9Var.c != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        ls9 ls9Var;
        if (this.b) {
            this.b = false;
            ls9 ls9Var2 = this.c.a;
            this.a = ls9Var2;
            return ls9Var2;
        }
        ls9 ls9Var3 = this.a;
        if (ls9Var3 != null) {
            ls9Var = ls9Var3.c;
        } else {
            ls9Var = null;
        }
        this.a = ls9Var;
        return ls9Var;
    }
}
