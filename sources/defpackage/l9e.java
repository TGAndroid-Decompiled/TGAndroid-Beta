package defpackage;
public final class l9e extends v9c {
    public boolean b;
    public final Object c;

    public l9e(Object obj) {
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
        lq5.n();
        return null;
    }
}
