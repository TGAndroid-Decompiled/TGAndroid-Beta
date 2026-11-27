package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class qga extends v79 {
    public final gga a;
    public final hga b;
    public final eja c;

    public qga(eja ejaVar, gga ggaVar, hga hgaVar) {
        this.c = ejaVar;
        this.a = ggaVar;
        this.b = hgaVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        this.c.e1 = z;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        eja ejaVar = this.c;
        tia[] tiaVarArr = ejaVar.w1;
        hga hgaVar = this.b;
        gga ggaVar = this.a;
        ejaVar.z(ggaVar, (d79) recyclerView, hgaVar);
        if (i2 != 0 && ((i4 = ejaVar.n0[0].F) == 0 || i4 == 5)) {
            tiaVarArr[0].a.isEmpty();
        }
        if (i2 != 0 && ((i3 = ggaVar.F) == 0 || eja.j0(i3))) {
            eja.m1(ggaVar, tiaVarArr, true);
        }
        ggaVar.h.N0(true);
        if (ggaVar.G != null) {
            ggaVar.invalidate();
        }
    }
}
