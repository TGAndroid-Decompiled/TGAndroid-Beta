package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
public final class rka implements kr5 {
    public final qj7 a = new qj7();
    public final k6d b = new k6d((byte) 7);
    public final oo8 c = new oo8(new eeb(2, null), (byte) 9);

    public rka(String str) {
    }

    @Override
    public final Object a(g93 g93Var) {
        return new Integer(((AtomicInteger) this.b.b).incrementAndGet());
    }

    @Override
    public final Object b(px2 px2Var) {
        return new Integer(((AtomicInteger) this.b.b).get());
    }

    @Override
    public final java.lang.Object c(defpackage.rr4 r7, defpackage.px2 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rka.c(rr4, px2):java.lang.Object");
    }

    @Override
    public final im4 d() {
        return this.c;
    }

    @Override
    public final java.lang.Object e(defpackage.fs4 r6, defpackage.px2 r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rka.e(fs4, px2):java.lang.Object");
    }
}
