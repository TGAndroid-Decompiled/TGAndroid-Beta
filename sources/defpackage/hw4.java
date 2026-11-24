package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
public final class hw4 {
    public final qw4 a;

    public hw4(qw4 qw4Var) {
        this.a = qw4Var;
    }

    public final void a() {
        int i;
        qw4 qw4Var = this.a;
        ArrayList arrayList = qw4Var.c;
        ArrayList arrayList2 = qw4Var.E;
        long j = qw4Var.t;
        long j2 = qw4.G;
        if (j != j2) {
            qw4Var.t = j2;
            qw4Var.f = true;
            i = 32;
        } else {
            i = 0;
        }
        long j3 = bkb.Dm + zkb.b;
        if (qw4Var.s != j3) {
            qw4Var.s = j3;
            i |= 16;
        }
        Iterator it = qw4Var.n.iterator();
        while (it.hasNext()) {
            if (((o39) it.next()).c0()) {
                qw4Var.i++;
            }
        }
        if (i == 0) {
            return;
        }
        if (fod.a(i, 16)) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ow4 ow4Var = (ow4) arrayList2.get(i2);
                ow4Var.a.a(ow4Var.b.i());
            }
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            pw4 pw4Var = (pw4) arrayList.get(i3);
            if (fod.a(i, 32)) {
                fw4 fw4Var = pw4Var.b;
                fx4 fx4Var = qw4.F;
                if (!Objects.equals(fw4Var.b, fx4Var)) {
                    fw4Var.b = fx4Var;
                    fw4Var.g(fx4Var);
                }
            }
            if (fod.a(i, 16)) {
                pw4Var.b.updateColors();
            }
            pw4Var.b.invalidateSelf();
            pw4Var.a.invalidate();
            pw4Var.h = true;
        }
        qw4Var.u |= i;
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw4.b():void");
    }
}
