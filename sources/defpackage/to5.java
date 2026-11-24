package defpackage;

import j$.util.Objects;
public final class to5 extends v7c {
    public int b;
    public Object c;
    public final v7c d;

    public to5(v7c v7cVar) {
        super((byte) 0);
        this.d = v7cVar;
    }

    @Override
    public final boolean hasNext() {
        if (this.b <= 0 && !this.d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        int i = this.b;
        if (i <= 0) {
            yp7 yp7Var = (yp7) this.d.next();
            this.c = yp7Var.a;
            i = yp7Var.a();
            this.b = i;
        }
        this.b = i - 1;
        Object obj = this.c;
        Objects.requireNonNull(obj);
        return obj;
    }
}
