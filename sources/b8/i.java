package b8;

import java.io.Serializable;
public final class i extends bh implements Serializable {
    public final Object f2666b;
    public final ah f2667c;

    public i(Object obj, ah ahVar) {
        super(0, false);
        this.f2666b = obj;
        this.f2667c = ahVar;
    }

    @Override
    public final Object getKey() {
        return this.f2666b;
    }

    @Override
    public final Object getValue() {
        return this.f2667c;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
