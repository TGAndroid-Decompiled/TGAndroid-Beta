package m4;

import bi.g5;
public final class z0 implements g1 {
    public final int f13566a;
    public final g1 f13567b;

    public z0(g1 g1Var, int i10) {
        this.f13566a = i10;
        this.f13567b = g1Var;
    }

    @Override
    public final Object i(final b0 b0Var, final r rVar, final int i10) {
        switch (this.f13566a) {
            case 0:
                if (b0Var == null) {
                    h1.I0(null, rVar, i10, this.f13567b, new g5(rVar, i10, 1));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return h1.I0(b0Var, rVar, i10, this.f13567b, new e2.h() {
                    @Override
                    public final void accept(java.lang.Object r4) {
                        throw new UnsupportedOperationException("Method not decompiled: m4.c1.accept(java.lang.Object):void");
                    }
                });
        }
    }
}
