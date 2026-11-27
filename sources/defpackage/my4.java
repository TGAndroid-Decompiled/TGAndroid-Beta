package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
public final class my4 {
    public final vy4 a;

    public my4(vy4 vy4Var) {
        this.a = vy4Var;
    }

    public final void a() {
        int i;
        vy4 vy4Var = this.a;
        ArrayList arrayList = vy4Var.c;
        ArrayList arrayList2 = vy4Var.E;
        long j = vy4Var.t;
        long j2 = vy4.G;
        if (j != j2) {
            vy4Var.t = j2;
            vy4Var.f = true;
            i = 32;
        } else {
            i = 0;
        }
        long j3 = aob.Em + yob.b;
        if (vy4Var.s != j3) {
            vy4Var.s = j3;
            i |= 16;
        }
        Iterator it = vy4Var.n.iterator();
        while (it.hasNext()) {
            if (((d79) it.next()).d0()) {
                vy4Var.i++;
            }
        }
        if (i == 0) {
            return;
        }
        if (vsd.a(i, 16)) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ty4 ty4Var = (ty4) arrayList2.get(i2);
                ty4Var.a.a(ty4Var.b.h());
            }
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            uy4 uy4Var = (uy4) arrayList.get(i3);
            if (vsd.a(i, 32)) {
                ky4 ky4Var = uy4Var.b;
                lz4 lz4Var = vy4.F;
                if (!Objects.equals(ky4Var.b, lz4Var)) {
                    ky4Var.b = lz4Var;
                    ky4Var.g(lz4Var);
                }
            }
            if (vsd.a(i, 16)) {
                uy4Var.b.updateColors();
            }
            uy4Var.b.invalidateSelf();
            uy4Var.a.invalidate();
            uy4Var.h = true;
        }
        vy4Var.u |= i;
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my4.b():void");
    }
}
