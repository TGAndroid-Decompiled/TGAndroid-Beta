package o;

import java.util.HashMap;
public final class a extends f {
    public final HashMap e = new HashMap();

    @Override
    public final c h(Object obj) {
        return (c) this.e.get(obj);
    }

    @Override
    public final Object m(Object obj) {
        Object m10 = super.m(obj);
        this.e.remove(obj);
        return m10;
    }
}
