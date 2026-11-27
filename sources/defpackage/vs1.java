package defpackage;

import java.util.ArrayList;
public final class vs1 extends yc8 {
    public final ArrayList a;
    public final boolean[] b;
    public final zu1 c;

    public vs1(zu1 zu1Var, ArrayList arrayList, boolean[] zArr) {
        this.c = zu1Var;
        this.a = arrayList;
        this.b = zArr;
    }

    @Override
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.b[size]) {
                arrayList.remove(size);
            }
        }
        this.c.Cb(i2, arrayList, z, z2);
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final mn5 k(int i) {
        return null;
    }

    @Override
    public final boolean w(int i) {
        return this.b[i];
    }

    @Override
    public final int D(int i, oec oecVar) {
        return i;
    }
}
