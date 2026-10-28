package of;

import java.util.logging.Logger;
public final class g extends mf.a {
    public static final Logger f19369s = Logger.getLogger(g.class.getName());
    public byte f19370r;

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

    public static d5.a c(e eVar) {
        b b10 = eVar.b();
        eVar.c(3, b.ISO_8859_1);
        return new d5.a(eVar.d(200, b10), eVar.c((int) eVar.f19361a.e(), b10), false);
    }

    public static String e(e eVar) {
        return eVar.c((int) eVar.f19361a.e(), eVar.b());
    }

    public final void d(of.e r12) {
        throw new UnsupportedOperationException("Method not decompiled: of.g.d(of.e):void");
    }
}
