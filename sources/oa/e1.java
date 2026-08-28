package oa;

import java.util.concurrent.atomic.AtomicInteger;
public class e1 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
        try {
            return new AtomicInteger(aVar.p());
        } catch (NumberFormatException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        cVar.o(((AtomicInteger) obj).get());
    }
}
