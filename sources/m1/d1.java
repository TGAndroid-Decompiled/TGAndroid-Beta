package m1;

import java.util.concurrent.atomic.AtomicInteger;
public final class d1 implements m0 {
    public final ie.d f19360a = new ie.d();
    public final g6.d0 f19361b = new g6.d0(17);
    public final d6.i f19362c = new d6.i((rd.p) new kd.j(2, null));

    public d1(String str) {
    }

    @Override
    public final java.lang.Object a(rd.p r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: m1.d1.a(rd.p, kd.c):java.lang.Object");
    }

    @Override
    public final Object b(kd.c cVar) {
        return new Integer(((AtomicInteger) this.f19361b.f13555b).get());
    }

    @Override
    public final java.lang.Object c(rd.l r8, kd.c r9) {
        throw new UnsupportedOperationException("Method not decompiled: m1.d1.c(rd.l, kd.c):java.lang.Object");
    }

    @Override
    public final ce.c d() {
        return this.f19362c;
    }

    @Override
    public final Object e(a0 a0Var) {
        return new Integer(((AtomicInteger) this.f19361b.f13555b).incrementAndGet());
    }
}
