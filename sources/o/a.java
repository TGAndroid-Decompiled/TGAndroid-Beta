package o;

import java.util.HashMap;
public final class a extends f {
    public final HashMap f16918e = new HashMap();

    @Override
    public final c i(Object obj) {
        return (c) this.f16918e.get(obj);
    }

    @Override
    public final Object n(Object obj) {
        Object n10 = super.n(obj);
        this.f16918e.remove(obj);
        return n10;
    }
}
