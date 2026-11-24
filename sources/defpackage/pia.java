package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
public final class pia implements kp5 {
    public final nh7 a = new nh7();
    public final i4d b = new i4d((byte) 7);
    public final v39 c = new v39(new ccb(2, null), (byte) 5);

    public pia(String str) {
    }

    @Override
    public final Object a(u73 u73Var) {
        return new Integer(((AtomicInteger) this.b.a).incrementAndGet());
    }

    @Override
    public final Object b(fw2 fw2Var) {
        return new Integer(((AtomicInteger) this.b.a).get());
    }

    @Override
    public final java.lang.Object c(defpackage.qp4 r7, defpackage.fw2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pia.c(qp4, fw2):java.lang.Object");
    }

    @Override
    public final hk4 d() {
        return this.c;
    }

    @Override
    public final java.lang.Object e(defpackage.eq4 r6, defpackage.fw2 r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pia.e(eq4, fw2):java.lang.Object");
    }
}
