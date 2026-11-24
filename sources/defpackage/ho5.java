package defpackage;

import java.io.Serializable;
public final class ho5 extends m3 implements Serializable {
    public final Object b;
    public final Object c;

    public ho5(Object obj, Object obj2) {
        super((byte) 0, false);
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final Object getKey() {
        return this.b;
    }

    @Override
    public final Object getValue() {
        return this.c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
