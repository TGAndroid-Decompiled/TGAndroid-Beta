package o;

import java.util.HashMap;

public final class a extends f {

    public final HashMap f19074e = new HashMap();

    @Override
    public final c i(Object obj) {
        return (c) this.f19074e.get(obj);
    }

    @Override
    public final Object n(Object obj) {
        Object objN = super.n(obj);
        this.f19074e.remove(obj);
        return objN;
    }
}
