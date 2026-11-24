package defpackage;

import java.util.Iterator;
public final class uo9 extends vo9 implements Iterator {
    public to9 a;
    public boolean b = true;
    public final wo9 c;

    public uo9(wo9 wo9Var) {
        this.c = wo9Var;
    }

    @Override
    public final void a(to9 to9Var) {
        boolean z;
        to9 to9Var2 = this.a;
        if (to9Var == to9Var2) {
            to9 to9Var3 = to9Var2.d;
            this.a = to9Var3;
            if (to9Var3 == null) {
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
        to9 to9Var = this.a;
        if (to9Var != null && to9Var.c != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        to9 to9Var;
        if (this.b) {
            this.b = false;
            to9 to9Var2 = this.c.a;
            this.a = to9Var2;
            return to9Var2;
        }
        to9 to9Var3 = this.a;
        if (to9Var3 != null) {
            to9Var = to9Var3.c;
        } else {
            to9Var = null;
        }
        this.a = to9Var;
        return to9Var;
    }
}
