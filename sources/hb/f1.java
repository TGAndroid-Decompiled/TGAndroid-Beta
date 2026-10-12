package hb;

import java.util.concurrent.atomic.AtomicBoolean;
public class f1 extends eb.u {
    @Override
    public final Object read(mb.a aVar) {
        return new AtomicBoolean(aVar.n());
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        bVar.s(((AtomicBoolean) obj).get());
    }
}
