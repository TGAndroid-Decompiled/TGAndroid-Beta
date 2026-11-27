package defpackage;

import android.content.Context;
public final class cja extends bja {
    public final dja H;

    public cja(dja djaVar, Context context, int i) {
        super(djaVar.e, context, i, false);
        this.H = djaVar;
    }

    @Override
    public final void f() {
        boolean z;
        super.f();
        dja djaVar = this.H;
        eja ejaVar = djaVar.e;
        int i = djaVar.a;
        int[] iArr = eja.t2;
        zha P = ejaVar.P(i);
        if (P != null && P.n.getVisibility() == 0) {
            djaVar.d.f();
        }
        if (P != null) {
            vga vgaVar = P.w;
            v5b v5bVar = this.s;
            if (v5bVar != null && (v5bVar.k() || (ejaVar.d0() && this.s.g() > 0))) {
                z = true;
            } else {
                z = false;
            }
            vgaVar.e(z, true);
        }
    }
}
