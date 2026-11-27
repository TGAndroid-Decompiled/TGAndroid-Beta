package defpackage;
public final class xod extends v9c {
    public static final Object c = new Object();
    public Object b;

    public xod(Object obj) {
        super((byte) 10);
        this.b = obj;
    }

    @Override
    public final boolean hasNext() {
        if (this.b != c) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            this.b = obj2;
            return obj;
        }
        lq5.n();
        return null;
    }
}
