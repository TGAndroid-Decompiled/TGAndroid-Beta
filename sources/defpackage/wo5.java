package defpackage;

import j$.util.Objects;
public final class wo5 extends v9c {
    public int b;
    public Object c;
    public final v9c d;

    public wo5(v9c v9cVar) {
        super((byte) 0);
        this.d = v9cVar;
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
            vq7 vq7Var = (vq7) this.d.next();
            this.c = vq7Var.a;
            i = vq7Var.a();
            this.b = i;
        }
        this.b = i - 1;
        Object obj = this.c;
        Objects.requireNonNull(obj);
        return obj;
    }
}
