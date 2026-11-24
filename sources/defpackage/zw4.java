package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public final class zw4 implements g94, py4, bj0 {
    public final ux4 a;

    public zw4(ux4 ux4Var) {
        this.a = ux4Var;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        rja rjaVar = this.a.u2;
        if (rjaVar != null) {
            rjaVar.setTitlesAlpha(f);
        }
    }

    @Override
    public final void b(fj0 fj0Var, List list) {
        int i;
        ux4 ux4Var = this.a;
        ArrayList arrayList = ux4Var.g2;
        Iterator it = list.iterator();
        long j = 0;
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            ln8 ln8Var = (ln8) it.next();
            int size = arrayList.size();
            while (true) {
                if (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    nw4 nw4Var = (nw4) obj;
                    if (nw4Var.h() != null && nw4Var.h().equals(ln8Var.c)) {
                        nw4Var.h = ln8Var;
                        if (nw4Var.f() > j) {
                            j = nw4Var.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            ((nw4) obj2).g = j;
        }
        gm.c3(new qn4(ux4Var, (byte) 8));
    }

    @Override
    public final int i() {
        return cmb.v0(cmb.a6, this.a.J0);
    }

    @Override
    public final void V(float f, int i) {
    }
}
