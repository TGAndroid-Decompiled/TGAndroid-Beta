package o;

import java.util.HashMap;
public final class a extends f {
    public final HashMap f21539e = new HashMap();

    @Override
    public final c f(Object obj) {
        return (c) this.f21539e.get(obj);
    }

    @Override
    public final Object i(Object obj) {
        Object i7 = super.i(obj);
        this.f21539e.remove(obj);
        return i7;
    }
}
