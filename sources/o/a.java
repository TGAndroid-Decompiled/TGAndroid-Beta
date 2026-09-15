package o;

import java.util.HashMap;
public final class a extends f {
    public final HashMap e = new HashMap();

    @Override
    public final c i(Object obj) {
        return (c) this.e.get(obj);
    }

    @Override
    public final Object n(Object obj) {
        Object n10 = super.n(obj);
        this.e.remove(obj);
        return n10;
    }
}
