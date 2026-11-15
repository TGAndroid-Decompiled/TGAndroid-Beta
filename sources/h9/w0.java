package h9;

import java.util.Iterator;
public final class w0 extends f2 {
    public final g9.k f13766b;

    public w0(Iterator it, g9.k kVar) {
        super(it);
        this.f13766b = kVar;
    }

    @Override
    public final Object a(Object obj) {
        return this.f13766b.apply(obj);
    }
}
