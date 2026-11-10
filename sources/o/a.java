package o;

import java.util.HashMap;
public final class a extends f {
    public final HashMap f20665e = new HashMap();

    @Override
    public final c f(Object obj) {
        return (c) this.f20665e.get(obj);
    }

    @Override
    public final Object i(Object obj) {
        Object i7 = super.i(obj);
        this.f20665e.remove(obj);
        return i7;
    }
}
