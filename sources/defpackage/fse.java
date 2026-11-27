package defpackage;

import java.util.List;
public abstract class fse {
    public static void a(heb hebVar, int i, ot2 ot2Var) {
        long i2 = hebVar.i(i);
        List l = hebVar.l(i2);
        if (!l.isEmpty()) {
            if (i != hebVar.q() - 1) {
                long i3 = hebVar.i(i + 1) - hebVar.i(i);
                if (i3 > 0) {
                    ot2Var.accept(new p43(i2, i3, l));
                    return;
                }
                return;
            }
            grb.g();
        }
    }

    public static void b(defpackage.heb r12, defpackage.qeb r13, defpackage.ot2 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fse.b(heb, qeb, ot2):void");
    }
}
