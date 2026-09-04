package gb;

import java.util.concurrent.atomic.AtomicBoolean;
public class f1 extends db.u {
    @Override
    public final Object read(lb.a aVar) {
        return new AtomicBoolean(aVar.n());
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        bVar.s(((AtomicBoolean) obj).get());
    }
}
