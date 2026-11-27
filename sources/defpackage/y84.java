package defpackage;

import java.util.HashMap;
public final class y84 extends os9 {
    public final HashMap e = new HashMap();

    @Override
    public final ls9 h(Object obj) {
        return (ls9) this.e.get(obj);
    }

    @Override
    public final Object i(Object obj) {
        Object i = super.i(obj);
        this.e.remove(obj);
        return i;
    }
}
