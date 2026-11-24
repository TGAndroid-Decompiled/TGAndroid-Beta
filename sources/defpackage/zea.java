package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class zea extends k69 {
    public final pea a;
    public final qea b;
    public final nha c;

    public zea(nha nhaVar, pea peaVar, qea qeaVar) {
        this.c = nhaVar;
        this.a = peaVar;
        this.b = qeaVar;
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
        nha nhaVar = this.c;
        cha[] chaVarArr = nhaVar.w1;
        qea qeaVar = this.b;
        pea peaVar = this.a;
        nhaVar.z(peaVar, (r59) recyclerView, qeaVar);
        if (i2 != 0 && ((i4 = nhaVar.n0[0].F) == 0 || i4 == 5)) {
            chaVarArr[0].a.isEmpty();
        }
        if (i2 != 0 && ((i3 = peaVar.F) == 0 || nha.j0(i3))) {
            nha.m1(peaVar, chaVarArr, true);
        }
        peaVar.h.M0(true);
        if (peaVar.G != null) {
            peaVar.invalidate();
        }
    }
}
