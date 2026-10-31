package e9;

import java.util.Iterator;
public final class b1 extends l2 {
    public final d9.k f6334b;

    public b1(Iterator it, d9.k kVar) {
        super(it);
        this.f6334b = kVar;
    }

    @Override
    public final Object a(Object obj) {
        return this.f6334b.apply(obj);
    }
}
