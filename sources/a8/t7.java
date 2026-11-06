package a8;

import java.util.List;
public abstract class t7 {
    public static void a(c4.d dVar, int i7, h2.j jVar) {
        long k10 = dVar.k(i7);
        List s5 = dVar.s(k10);
        if (!s5.isEmpty()) {
            if (i7 != dVar.y() - 1) {
                long k11 = dVar.k(i7 + 1) - dVar.k(i7);
                if (k11 > 0) {
                    jVar.accept(new c4.a(k10, k11, s5));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void b(c4.d r12, c4.l r13, h2.j r14) {
        throw new UnsupportedOperationException("Method not decompiled: a8.t7.b(c4.d, c4.l, h2.j):void");
    }
}
