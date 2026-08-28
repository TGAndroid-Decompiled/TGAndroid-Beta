package o;

import java.util.HashMap;
public final class a extends f {
    public final HashMap f18732e = new HashMap();

    @Override
    public final c i(Object obj) {
        return (c) this.f18732e.get(obj);
    }

    @Override
    public final Object n(Object obj) {
        Object n10 = super.n(obj);
        this.f18732e.remove(obj);
        return n10;
    }
}
