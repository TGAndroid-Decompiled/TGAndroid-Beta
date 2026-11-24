package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
public final class jy4 {
    public final sy4 a;

    public jy4(sy4 sy4Var) {
        this.a = sy4Var;
    }

    public final void a() {
        int i;
        sy4 sy4Var = this.a;
        ArrayList arrayList = sy4Var.c;
        ArrayList arrayList2 = sy4Var.E;
        long j = sy4Var.t;
        long j2 = sy4.G;
        if (j != j2) {
            sy4Var.t = j2;
            sy4Var.f = true;
            i = 32;
        } else {
            i = 0;
        }
        long j3 = cmb.Dm + anb.b;
        if (sy4Var.s != j3) {
            sy4Var.s = j3;
            i |= 16;
        }
        Iterator it = sy4Var.n.iterator();
        while (it.hasNext()) {
            if (((r59) it.next()).c0()) {
                sy4Var.i++;
            }
        }
        if (i == 0) {
            return;
        }
        if (iqd.a(i, 16)) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                qy4 qy4Var = (qy4) arrayList2.get(i2);
                qy4Var.a.a(qy4Var.b.i());
            }
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ry4 ry4Var = (ry4) arrayList.get(i3);
            if (iqd.a(i, 32)) {
                hy4 hy4Var = ry4Var.b;
                hz4 hz4Var = sy4.F;
                if (!Objects.equals(hy4Var.b, hz4Var)) {
                    hy4Var.b = hz4Var;
                    hy4Var.g(hz4Var);
                }
            }
            if (iqd.a(i, 16)) {
                ry4Var.b.updateColors();
            }
            ry4Var.b.invalidateSelf();
            ry4Var.a.invalidate();
            ry4Var.h = true;
        }
        sy4Var.u |= i;
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy4.b():void");
    }
}
