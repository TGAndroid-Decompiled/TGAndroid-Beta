package lf;

import java.util.logging.Logger;
public final class h extends jf.a {
    public static final Logger f12915s = Logger.getLogger(h.class.getName());
    public byte f12916r;

    public static boolean b(n nVar) {
        boolean z10;
        nVar.mark(3);
        try {
            if (nVar.read() == 73 && nVar.read() == 68) {
                if (nVar.read() == 51) {
                    z10 = true;
                    return z10;
                }
            }
            z10 = false;
            return z10;
        } finally {
            nVar.reset();
        }
    }

    public static g c(e eVar) {
        b b10 = eVar.b();
        eVar.c(3, b.ISO_8859_1);
        return new g(0, eVar.d(200, b10), eVar.c((int) eVar.f12904a.e(), b10));
    }

    public static String e(e eVar) {
        return eVar.c((int) eVar.f12904a.e(), eVar.b());
    }

    public final void d(lf.e r12) {
        throw new UnsupportedOperationException("Method not decompiled: lf.h.d(lf.e):void");
    }
}
