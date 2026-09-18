package m4;

import ci.m4;
public final class y0 implements f1 {
    public final int f14734a;
    public final f1 f14735b;

    public y0(f1 f1Var, int i10) {
        this.f14734a = i10;
        this.f14735b = f1Var;
    }

    @Override
    public final Object h(final a0 a0Var, final r rVar, final int i10) {
        switch (this.f14734a) {
            case 0:
                if (a0Var == null) {
                    g1.I0(null, rVar, i10, this.f14735b, new m4(rVar, i10, 1));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return g1.I0(a0Var, rVar, i10, this.f14735b, new e2.h() {
                    @Override
                    public final void accept(java.lang.Object r4) {
                        throw new UnsupportedOperationException("Method not decompiled: m4.b1.accept(java.lang.Object):void");
                    }
                });
        }
    }
}
