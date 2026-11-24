package defpackage;

import java.util.Iterator;
public final class vq9 extends wq9 implements Iterator {
    public uq9 a;
    public boolean b = true;
    public final xq9 c;

    public vq9(xq9 xq9Var) {
        this.c = xq9Var;
    }

    @Override
    public final void a(uq9 uq9Var) {
        boolean z;
        uq9 uq9Var2 = this.a;
        if (uq9Var == uq9Var2) {
            uq9 uq9Var3 = uq9Var2.d;
            this.a = uq9Var3;
            if (uq9Var3 == null) {
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
        uq9 uq9Var = this.a;
        if (uq9Var != null && uq9Var.c != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        uq9 uq9Var;
        if (this.b) {
            this.b = false;
            uq9 uq9Var2 = this.c.a;
            this.a = uq9Var2;
            return uq9Var2;
        }
        uq9 uq9Var3 = this.a;
        if (uq9Var3 != null) {
            uq9Var = uq9Var3.c;
        } else {
            uq9Var = null;
        }
        this.a = uq9Var;
        return uq9Var;
    }
}
