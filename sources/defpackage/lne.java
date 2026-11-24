package defpackage;

import java.util.List;
public abstract class lne {
    public static void a(kab kabVar, int i, us2 us2Var) {
        long h = kabVar.h(i);
        List l = kabVar.l(h);
        if (!l.isEmpty()) {
            if (i != kabVar.t() - 1) {
                long h2 = kabVar.h(i + 1) - kabVar.h(i);
                if (h2 > 0) {
                    us2Var.accept(new x33(h, h2, l));
                    return;
                }
                return;
            }
            sdb.a();
        }
    }

    public static void b(defpackage.kab r12, defpackage.tab r13, defpackage.us2 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lne.b(kab, tab, us2):void");
    }
}
