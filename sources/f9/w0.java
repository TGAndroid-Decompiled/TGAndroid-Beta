package f9;

import java.util.Iterator;
public final class w0 extends f2 {
    public final e9.k f10355b;

    public w0(Iterator it, e9.k kVar) {
        super(it);
        this.f10355b = kVar;
    }

    @Override
    public final Object a(Object obj) {
        return this.f10355b.apply(obj);
    }
}
