package ib;

import java.util.concurrent.atomic.AtomicBoolean;
public class f1 extends fb.u {
    @Override
    public final Object read(nb.a aVar) {
        return new AtomicBoolean(aVar.n());
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        bVar.s(((AtomicBoolean) obj).get());
    }
}
