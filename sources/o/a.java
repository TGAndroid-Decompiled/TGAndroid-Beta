package o;

import java.util.HashMap;
public final class a extends f {
    public final HashMap f18973e = new HashMap();

    @Override
    public final c i(Object obj) {
        return (c) this.f18973e.get(obj);
    }

    @Override
    public final Object n(Object obj) {
        Object n10 = super.n(obj);
        this.f18973e.remove(obj);
        return n10;
    }
}
