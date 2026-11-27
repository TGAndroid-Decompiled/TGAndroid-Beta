package defpackage;

import java.io.Serializable;
public final class mgd extends n3 implements Serializable {
    public final Object b;
    public final m3 c;

    public mgd(Object obj, m3 m3Var) {
        super((byte) 1, false);
        this.b = obj;
        this.c = m3Var;
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
