package l1;

import gi.w5;
import java.util.concurrent.atomic.AtomicInteger;
public final class e1 implements m0 {
    public final fe.d f17524a = new fe.d();
    public final w5 f17525b = new w5(8);
    public final z6.c f17526c = new z6.c((od.p) new hd.j(2, null));

    public e1(String str) {
    }

    @Override
    public final Object a(a0 a0Var) {
        return new Integer(((AtomicInteger) this.f17525b.f13798b).incrementAndGet());
    }

    @Override
    public final java.lang.Object b(od.l r8, hd.c r9) {
        throw new UnsupportedOperationException("Method not decompiled: l1.e1.b(od.l, hd.c):java.lang.Object");
    }

    @Override
    public final java.lang.Object c(od.p r7, hd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: l1.e1.c(od.p, hd.c):java.lang.Object");
    }

    @Override
    public final Object d(hd.c cVar) {
        return new Integer(((AtomicInteger) this.f17525b.f13798b).get());
    }

    @Override
    public final zd.b e() {
        return this.f17526c;
    }
}
