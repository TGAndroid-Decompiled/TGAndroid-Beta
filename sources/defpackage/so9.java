package defpackage;

import java.util.Iterator;
public final class so9 extends vo9 implements Iterator {
    public to9 a;
    public to9 b;
    public final byte c;

    public so9(to9 to9Var, to9 to9Var2, byte b) {
        this.c = b;
        this.a = to9Var2;
        this.b = to9Var;
    }

    @Override
    public final void a(to9 to9Var) {
        to9 to9Var2;
        to9 to9Var3 = this.a;
        to9 to9Var4 = null;
        if (to9Var3 == to9Var && to9Var == this.b) {
            this.b = null;
            this.a = null;
            to9Var3 = null;
        }
        to9 to9Var5 = to9Var3;
        if (to9Var3 == to9Var) {
            switch (this.c) {
                case 0:
                    to9Var2 = to9Var3.d;
                    break;
                default:
                    to9Var2 = to9Var3.c;
                    break;
            }
            to9Var5 = to9Var2;
            this.a = to9Var5;
        }
        to9 to9Var6 = this.b;
        if (to9Var6 == to9Var) {
            if (to9Var6 != to9Var5 && to9Var5 != null) {
                to9Var4 = b(to9Var6);
            }
            this.b = to9Var4;
        }
    }

    public final to9 b(to9 to9Var) {
        switch (this.c) {
            case 0:
                return to9Var.c;
            default:
                return to9Var.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        to9 to9Var;
        to9 to9Var2 = this.b;
        to9 to9Var3 = this.a;
        if (to9Var2 != to9Var3 && to9Var3 != null) {
            to9Var = b(to9Var2);
        } else {
            to9Var = null;
        }
        this.b = to9Var;
        return to9Var2;
    }
}
