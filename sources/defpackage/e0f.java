package defpackage;
public abstract class e0f {
    public static final Object a(long j, is4 is4Var, zw2 zw2Var) {
        Object yp2Var;
        Object C;
        if (j > 0) {
            nsb nsbVar = new nsb(j, zw2Var);
            gqe.c(nsbVar, true, new fp3(aie.b(nsbVar.e.getContext()).a(nsbVar.f, nsbVar, nsbVar.d)));
            try {
                q7c.a(2, is4Var);
                yp2Var = is4Var.invoke(nsbVar, nsbVar);
            } catch (Throwable th) {
                yp2Var = new yp2(th, false);
            }
            Object obj = vx2.a;
            if (yp2Var != obj && (C = nsbVar.C(yp2Var)) != yed.b) {
                if (C instanceof yp2) {
                    Throwable th2 = ((yp2) C).a;
                    if ((th2 instanceof msb) && ((msb) th2).a == nsbVar) {
                        if (yp2Var instanceof yp2) {
                            throw ((yp2) yp2Var).a;
                        }
                    } else {
                        throw th2;
                    }
                } else {
                    yp2Var = yed.a(C);
                }
                return yp2Var;
            }
            return obj;
        }
        throw new msb("Timed out immediately", null);
    }
}
