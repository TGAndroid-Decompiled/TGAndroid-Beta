package a8;

import java.util.List;
public abstract class u7 {
    public static void a(c4.d dVar, int i7, h2.j jVar) {
        long i10 = dVar.i(i7);
        List q10 = dVar.q(i10);
        if (!q10.isEmpty()) {
            if (i7 != dVar.u() - 1) {
                long i11 = dVar.i(i7 + 1) - dVar.i(i7);
                if (i11 > 0) {
                    jVar.accept(new c4.a(i10, i11, q10));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void b(c4.d r12, c4.l r13, h2.j r14) {
        throw new UnsupportedOperationException("Method not decompiled: a8.u7.b(c4.d, c4.l, h2.j):void");
    }
}
