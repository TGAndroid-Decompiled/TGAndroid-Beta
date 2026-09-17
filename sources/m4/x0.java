package m4;

import di.m4;
public final class x0 implements e1 {
    public final int f16110a;
    public final e1 f16111b;

    public x0(e1 e1Var, int i10) {
        this.f16110a = i10;
        this.f16111b = e1Var;
    }

    @Override
    public final Object h(final a0 a0Var, final r rVar, final int i10) {
        switch (this.f16110a) {
            case 0:
                if (a0Var == null) {
                    f1.I0(null, rVar, i10, this.f16111b, new m4(rVar, i10, 1));
                    throw null;
                }
                throw new ClassCastException();
            default:
                return f1.I0(a0Var, rVar, i10, this.f16111b, new e2.h() {
                    @Override
                    public final void accept(java.lang.Object r4) {
                        throw new UnsupportedOperationException("Method not decompiled: m4.a1.accept(java.lang.Object):void");
                    }
                });
        }
    }
}
