package defpackage;
public final class mu5 extends v7c {
    public final Object b;
    public boolean c;

    public mu5(Object obj) {
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
        u36.g();
        return null;
    }
}
