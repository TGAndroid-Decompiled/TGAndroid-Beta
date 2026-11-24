package defpackage;
public abstract class oxe {
    public static final Object a(long j, fs4 fs4Var, px2 px2Var) {
        Object qq2Var;
        Object C;
        if (j > 0) {
            oqb oqbVar = new oqb(j, px2Var);
            pne.c(oqbVar, true, new yp3(kfe.b(oqbVar.e.getContext()).a(oqbVar.f, oqbVar, oqbVar.d)));
            try {
                r5c.a(2, fs4Var);
                qq2Var = fs4Var.invoke(oqbVar, oqbVar);
            } catch (Throwable th) {
                qq2Var = new qq2(th, false);
            }
            Object obj = ly2.a;
            if (qq2Var != obj && (C = oqbVar.C(qq2Var)) != hcd.b) {
                if (C instanceof qq2) {
                    Throwable th2 = ((qq2) C).a;
                    if ((th2 instanceof nqb) && ((nqb) th2).a == oqbVar) {
                        if (qq2Var instanceof qq2) {
                            throw ((qq2) qq2Var).a;
                        }
                    } else {
                        throw th2;
                    }
                } else {
                    qq2Var = hcd.a(C);
                }
                return qq2Var;
            }
            return obj;
        }
        throw new nqb("Timed out immediately", null);
    }
}
