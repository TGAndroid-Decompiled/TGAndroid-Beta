package b8;

import java.util.List;
public abstract class g1 {
    public static void a(b4.d dVar, int i3, g2.k kVar) {
        long h = dVar.h(i3);
        List p10 = dVar.p(h);
        if (!p10.isEmpty()) {
            if (i3 != dVar.t() - 1) {
                long h7 = dVar.h(i3 + 1) - dVar.h(i3);
                if (h7 > 0) {
                    kVar.accept(new b4.a(h, h7, p10));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void b(b4.d r12, b4.l r13, g2.k r14) {
        throw new UnsupportedOperationException("Method not decompiled: b8.g1.b(b4.d, b4.l, g2.k):void");
    }
}
