package oa;

import java.util.concurrent.atomic.AtomicBoolean;
public class f1 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
        return new AtomicBoolean(aVar.n());
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        cVar.s(((AtomicBoolean) obj).get());
    }
}
