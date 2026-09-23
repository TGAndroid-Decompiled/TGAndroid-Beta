package lf;

import java.util.logging.Logger;
public final class h extends jf.a {
    public static final Logger f14008s = Logger.getLogger(h.class.getName());
    public byte f14009r;

    public static boolean b(o oVar) {
        boolean z10;
        oVar.mark(3);
        try {
            if (oVar.read() == 73 && oVar.read() == 68) {
                if (oVar.read() == 51) {
                    z10 = true;
                    return z10;
                }
            }
            z10 = false;
            return z10;
        } finally {
            oVar.reset();
        }
    }

    public static g c(e eVar) {
        b b10 = eVar.b();
        eVar.c(3, b.ISO_8859_1);
        return new g(0, eVar.d(200, b10), eVar.c((int) eVar.f13997a.e(), b10));
    }

    public static String e(e eVar) {
        return eVar.c((int) eVar.f13997a.e(), eVar.b());
    }

    public final void d(lf.e r12) {
        throw new UnsupportedOperationException("Method not decompiled: lf.h.d(lf.e):void");
    }
}
