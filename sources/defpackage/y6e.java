package defpackage;
public final class y6e extends v7c {
    public boolean b;
    public final Object c;

    public y6e(Object obj) {
        super((byte) 12);
        this.c = obj;
    }

    @Override
    public final boolean hasNext() {
        if (!this.b) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        if (!this.b) {
            this.b = true;
            return this.c;
        }
        u36.g();
        return null;
    }
}
