package defpackage;

import java.util.Iterator;
public final class tq9 extends wq9 implements Iterator {
    public uq9 a;
    public uq9 b;
    public final byte c;

    public tq9(uq9 uq9Var, uq9 uq9Var2, byte b) {
        this.c = b;
        this.a = uq9Var2;
        this.b = uq9Var;
    }

    @Override
    public final void a(uq9 uq9Var) {
        uq9 uq9Var2;
        uq9 uq9Var3 = this.a;
        uq9 uq9Var4 = null;
        if (uq9Var3 == uq9Var && uq9Var == this.b) {
            this.b = null;
            this.a = null;
            uq9Var3 = null;
        }
        uq9 uq9Var5 = uq9Var3;
        if (uq9Var3 == uq9Var) {
            switch (this.c) {
                case 0:
                    uq9Var2 = uq9Var3.d;
                    break;
                default:
                    uq9Var2 = uq9Var3.c;
                    break;
            }
            uq9Var5 = uq9Var2;
            this.a = uq9Var5;
        }
        uq9 uq9Var6 = this.b;
        if (uq9Var6 == uq9Var) {
            if (uq9Var6 != uq9Var5 && uq9Var5 != null) {
                uq9Var4 = b(uq9Var6);
            }
            this.b = uq9Var4;
        }
    }

    public final uq9 b(uq9 uq9Var) {
        switch (this.c) {
            case 0:
                return uq9Var.c;
            default:
                return uq9Var.d;
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
        uq9 uq9Var;
        uq9 uq9Var2 = this.b;
        uq9 uq9Var3 = this.a;
        if (uq9Var2 != uq9Var3 && uq9Var3 != null) {
            uq9Var = b(uq9Var2);
        } else {
            uq9Var = null;
        }
        this.b = uq9Var;
        return uq9Var2;
    }
}
