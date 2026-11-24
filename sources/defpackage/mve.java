package defpackage;
public abstract class mve {
    public static final Object a(long j, eq4 eq4Var, fw2 fw2Var) {
        Object fp2Var;
        Object C;
        if (j > 0) {
            nob nobVar = new nob(j, fw2Var);
            nle.c(nobVar, true, new oo3(jde.b(nobVar.e.getContext()).a(nobVar.f, nobVar, nobVar.d)));
            try {
                r3c.a(2, eq4Var);
                fp2Var = eq4Var.invoke(nobVar, nobVar);
            } catch (Throwable th) {
                fp2Var = new fp2(th, false);
            }
            Object obj = bx2.a;
            if (fp2Var != obj && (C = nobVar.C(fp2Var)) != fad.b) {
                if (C instanceof fp2) {
                    Throwable th2 = ((fp2) C).a;
                    if ((th2 instanceof mob) && ((mob) th2).a == nobVar) {
                        if (fp2Var instanceof fp2) {
                            throw ((fp2) fp2Var).a;
                        }
                    } else {
                        throw th2;
                    }
                } else {
                    fp2Var = fad.a(C);
                }
                return fp2Var;
            }
            return obj;
        }
        throw new mob("Timed out immediately", null);
    }
}
