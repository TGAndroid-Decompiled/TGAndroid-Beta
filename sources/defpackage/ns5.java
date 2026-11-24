package defpackage;
public final class ns5 extends v5c {
    public final Object b;
    public boolean c;

    public ns5(Object obj) {
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
        w26.g();
        return null;
    }
}
