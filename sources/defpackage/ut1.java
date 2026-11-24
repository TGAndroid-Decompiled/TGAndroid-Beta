package defpackage;

import java.util.ArrayList;
public final class ut1 extends jb8 {
    public final ArrayList a;
    public final boolean[] b;
    public final yv1 c;

    public ut1(yv1 yv1Var, ArrayList arrayList, boolean[] zArr) {
        this.c = yv1Var;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.Bb(i2, arrayList, z, z2);
    }

    @Override
    public final boolean U() {
        return false;
    }

    @Override
    public final jn5 k(int i) {
        return null;
    }

    @Override
    public final boolean w(int i) {
        return this.b[i];
    }

    @Override
    public final int E(int i, rcc rccVar) {
        return i;
    }
}
