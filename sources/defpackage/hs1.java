package defpackage;

import java.util.ArrayList;
public final class hs1 extends i98 {
    public final ArrayList a;
    public final boolean[] b;
    public final mu1 c;

    public hs1(mu1 mu1Var, ArrayList arrayList, boolean[] zArr) {
        this.c = mu1Var;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.rb(i2, arrayList, z, z2);
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final jl5 k(int i) {
        return null;
    }

    @Override
    public final boolean w(int i) {
        return this.b[i];
    }

    @Override
    public final int D(int i, oac oacVar) {
        return i;
    }
}
