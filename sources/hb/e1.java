package hb;

import java.util.concurrent.atomic.AtomicInteger;
public class e1 extends eb.u {
    @Override
    public final Object read(mb.a aVar) {
        try {
            return new AtomicInteger(aVar.p());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final void write(mb.b bVar, Object obj) {
        bVar.o(((AtomicInteger) obj).get());
    }
}
