package mf;

import java.util.logging.Logger;
import m2.u;
public final class g extends kf.a {
    public static final Logger f16215s = Logger.getLogger(g.class.getName());
    public byte f16216r;

    public static boolean b(m mVar) {
        boolean z10;
        mVar.mark(3);
        try {
            if (mVar.read() == 73 && mVar.read() == 68) {
                if (mVar.read() == 51) {
                    z10 = true;
                    return z10;
                }
            }
            z10 = false;
            return z10;
        } finally {
            mVar.reset();
        }
    }

    public static u c(e eVar) {
        b b10 = eVar.b();
        eVar.c(3, b.ISO_8859_1);
        return new u(1, eVar.d(200, b10), eVar.c((int) eVar.f16206a.e(), b10));
    }

    public static String e(e eVar) {
        return eVar.c((int) eVar.f16206a.e(), eVar.b());
    }

    public final void d(mf.e r12) {
        throw new UnsupportedOperationException("Method not decompiled: mf.g.d(mf.e):void");
    }
}
