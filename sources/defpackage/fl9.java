package defpackage;

import java.util.Iterator;
public final class fl9 implements Iterator {
    public byte a;
    public Object b;
    public int c;
    public int d;
    public final gl9 e;

    public fl9(gl9 gl9Var) {
        this.e = gl9Var;
        this.c = gl9Var.d;
        this.d = gl9Var.c;
    }

    public final boolean a() {
        this.a = (byte) 3;
        int i = this.c;
        if (i == 0) {
            this.a = (byte) 2;
            return false;
        }
        gl9 gl9Var = this.e;
        Object[] objArr = gl9Var.a;
        int i2 = this.d;
        this.b = objArr[i2];
        this.a = (byte) 1;
        this.d = (i2 + 1) % gl9Var.b;
        this.c = i - 1;
        return true;
    }

    @Override
    public final boolean hasNext() {
        byte b = this.a;
        if (b != 0) {
            if (b == 1) {
                return true;
            }
            if (b == 2) {
                return false;
            }
            u36.j("hasNext called when the iterator is in the FAILED state.");
            return false;
        }
        return a();
    }

    @Override
    public final Object next() {
        byte b = this.a;
        if (b == 1) {
            this.a = (byte) 0;
            return this.b;
        } else if (b != 2 && a()) {
            this.a = (byte) 0;
            return this.b;
        } else {
            u36.g();
            return null;
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
