package defpackage;

import java.util.HashMap;
public final class d84 extends wo9 {
    public final HashMap e = new HashMap();

    @Override
    public final to9 h(Object obj) {
        return (to9) this.e.get(obj);
    }

    @Override
    public final Object i(Object obj) {
        Object i = super.i(obj);
        this.e.remove(obj);
        return i;
    }
}
