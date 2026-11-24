package defpackage;

import android.content.Context;
public final class lha extends kha {
    public final mha H;

    public lha(mha mhaVar, Context context, int i) {
        super(mhaVar.e, context, i, false);
        this.H = mhaVar;
    }

    @Override
    public final void f() {
        boolean z;
        super.f();
        mha mhaVar = this.H;
        nha nhaVar = mhaVar.e;
        int i = mhaVar.a;
        int[] iArr = nha.t2;
        iga P = nhaVar.P(i);
        if (P != null && P.n.getVisibility() == 0) {
            mhaVar.d.f();
        }
        if (P != null) {
            efa efaVar = P.w;
            z3b z3bVar = this.s;
            if (z3bVar != null && (z3bVar.k() || (nhaVar.d0() && this.s.g() > 0))) {
                z = true;
            } else {
                z = false;
            }
            efaVar.e(z, true);
        }
    }
}
