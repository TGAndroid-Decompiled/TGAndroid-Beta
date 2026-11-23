package a8;

import java.util.List;
public abstract class v7 {
    public static void a(c4.d dVar, int i7, h2.j jVar) {
        long h = dVar.h(i7);
        List m10 = dVar.m(h);
        if (!m10.isEmpty()) {
            if (i7 != dVar.p() - 1) {
                long h7 = dVar.h(i7 + 1) - dVar.h(i7);
                if (h7 > 0) {
                    jVar.accept(new c4.a(h, h7, m10));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void b(c4.d r12, c4.l r13, h2.j r14) {
        throw new UnsupportedOperationException("Method not decompiled: a8.v7.b(c4.d, c4.l, h2.j):void");
    }
}
