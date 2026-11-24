package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class zca extends i49 {
    public final pca a;
    public final qca b;
    public final nfa c;

    public zca(nfa nfaVar, pca pcaVar, qca qcaVar) {
        this.c = nfaVar;
        this.a = pcaVar;
        this.b = qcaVar;
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
        nfa nfaVar = this.c;
        cfa[] cfaVarArr = nfaVar.w1;
        qca qcaVar = this.b;
        pca pcaVar = this.a;
        nfaVar.z(pcaVar, (o39) recyclerView, qcaVar);
        if (i2 != 0 && ((i4 = nfaVar.n0[0].F) == 0 || i4 == 5)) {
            cfaVarArr[0].a.isEmpty();
        }
        if (i2 != 0 && ((i3 = pcaVar.F) == 0 || nfa.j0(i3))) {
            nfa.m1(pcaVar, cfaVarArr, true);
        }
        pcaVar.h.M0(true);
        if (pcaVar.G != null) {
            pcaVar.invalidate();
        }
    }
}
