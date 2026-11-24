package defpackage;

import j$.util.Objects;
public final class tm5 extends v5c {
    public int b;
    public Object c;
    public final v5c d;

    public tm5(v5c v5cVar) {
        super((byte) 0);
        this.d = v5cVar;
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
            vn7 vn7Var = (vn7) this.d.next();
            this.c = vn7Var.a;
            i = vn7Var.a();
            this.b = i;
        }
        this.b = i - 1;
        Object obj = this.c;
        Objects.requireNonNull(obj);
        return obj;
    }
}
