package ib;

import java.util.concurrent.atomic.AtomicInteger;
public class e1 extends fb.u {
    @Override
    public final Object read(nb.a aVar) {
        try {
            return new AtomicInteger(aVar.p());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final void write(nb.b bVar, Object obj) {
        bVar.o(((AtomicInteger) obj).get());
    }
}
