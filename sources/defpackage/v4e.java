package defpackage;
public final class v4e extends v5c {
    public boolean b;
    public final Object c;

    public v4e(Object obj) {
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
        w26.g();
        return null;
    }
}
