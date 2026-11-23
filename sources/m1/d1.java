package m1;

import hi.w4;
import java.util.concurrent.atomic.AtomicInteger;
public final class d1 implements m0 {
    public final ie.d f20349a = new ie.d();
    public final w4 f20350b = new w4(12);
    public final ob.c f20351c = new ob.c((rd.p) new kd.j(2, null));

    public d1(String str) {
    }

    @Override
    public final java.lang.Object a(rd.p r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: m1.d1.a(rd.p, kd.c):java.lang.Object");
    }

    @Override
    public final Object b(kd.c cVar) {
        return new Integer(((AtomicInteger) this.f20350b.f15708b).get());
    }

    @Override
    public final java.lang.Object c(rd.l r8, kd.c r9) {
        throw new UnsupportedOperationException("Method not decompiled: m1.d1.c(rd.l, kd.c):java.lang.Object");
    }

    @Override
    public final ce.c d() {
        return this.f20351c;
    }

    @Override
    public final Object e(a0 a0Var) {
        return new Integer(((AtomicInteger) this.f20350b.f15708b).incrementAndGet());
    }
}
