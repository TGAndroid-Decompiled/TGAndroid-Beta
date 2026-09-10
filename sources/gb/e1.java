package gb;

import java.util.concurrent.atomic.AtomicInteger;
public class e1 extends db.u {
    @Override
    public final Object read(lb.a aVar) {
        try {
            return new AtomicInteger(aVar.p());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final void write(lb.b bVar, Object obj) {
        bVar.o(((AtomicInteger) obj).get());
    }
}
