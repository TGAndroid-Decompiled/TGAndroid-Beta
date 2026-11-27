package defpackage;
public final class qu5 extends v9c {
    public final Object b;
    public boolean c;

    public qu5(Object obj) {
        super((byte) 0);
        this.b = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.c;
    }

    @Override
    public final Object next() {
        if (!this.c) {
            this.c = true;
            return this.b;
        }
        lq5.n();
        return null;
    }
}
