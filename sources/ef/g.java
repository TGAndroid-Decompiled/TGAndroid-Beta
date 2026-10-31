package ef;

import java.util.logging.Logger;
public final class g extends cf.a {
    public static final Logger f6503s = Logger.getLogger(g.class.getName());
    public byte f6504r;

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

    public static hf.b c(e eVar) {
        b b10 = eVar.b();
        eVar.c(3, b.ISO_8859_1);
        return new hf.b(16, eVar.d(200, b10), eVar.c((int) eVar.f6495a.e(), b10));
    }

    public static String e(e eVar) {
        return eVar.c((int) eVar.f6495a.e(), eVar.b());
    }

    public final void d(ef.e r12) {
        throw new UnsupportedOperationException("Method not decompiled: ef.g.d(ef.e):void");
    }
}
