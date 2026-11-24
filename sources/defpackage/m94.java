package defpackage;

import java.util.HashMap;
public final class m94 extends xq9 {
    public final HashMap e = new HashMap();

    @Override
    public final uq9 h(Object obj) {
        return (uq9) this.e.get(obj);
    }

    @Override
    public final Object i(Object obj) {
        Object i = super.i(obj);
        this.e.remove(obj);
        return i;
    }
}
