package defpackage;

import java.util.List;
public abstract class ope {
    public static void a(lcb lcbVar, int i, fu2 fu2Var) {
        long k = lcbVar.k(i);
        List p = lcbVar.p(k);
        if (!p.isEmpty()) {
            if (i != lcbVar.q() - 1) {
                long k2 = lcbVar.k(i + 1) - lcbVar.k(i);
                if (k2 > 0) {
                    fu2Var.accept(new i53(k, k2, p));
                    return;
                }
                return;
            }
            rjb.h();
        }
    }

    public static void b(defpackage.lcb r12, defpackage.ucb r13, defpackage.fu2 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ope.b(lcb, ucb, fu2):void");
    }
}
