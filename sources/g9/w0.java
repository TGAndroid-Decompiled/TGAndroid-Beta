package g9;

import java.util.Iterator;
public final class w0 extends f2 {
    public final f9.k f12163b;

    public w0(Iterator it, f9.k kVar) {
        super(it);
        this.f12163b = kVar;
    }

    @Override
    public final Object a(Object obj) {
        return this.f12163b.apply(obj);
    }
}
