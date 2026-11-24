package defpackage;

import java.io.Serializable;
public final class tbd extends m3 implements Serializable {
    public final Object b;
    public final l3 c;

    public tbd(Object obj, l3 l3Var) {
        super((byte) 1, false);
        this.b = obj;
        this.c = l3Var;
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
