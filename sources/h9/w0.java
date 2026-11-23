package h9;

import java.util.Iterator;
public final class w0 extends f2 {
    public final g9.k f14075b;

    public w0(Iterator it, g9.k kVar) {
        super(it);
        this.f14075b = kVar;
    }

    @Override
    public final Object a(Object obj) {
        return this.f14075b.apply(obj);
    }
}
