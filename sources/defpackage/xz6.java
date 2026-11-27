package defpackage;
public final class xz6 implements ot2 {
    public final byte a;
    public final lp b;
    public final ja6 c;
    public final jt6 d;

    public xz6(lp lpVar, ja6 ja6Var, jt6 jt6Var, byte b) {
        this.a = b;
        this.b = lpVar;
        this.c = ja6Var;
        this.d = jt6Var;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        jt6 jt6Var = this.d;
        ja6 ja6Var = this.c;
        lp lpVar = this.b;
        zz6 zz6Var = (zz6) obj;
        switch (b) {
            case 0:
                zz6Var.u(lpVar.b, (vz6) lpVar.c, ja6Var, jt6Var);
                return;
            default:
                zz6Var.s(lpVar.b, (vz6) lpVar.c, ja6Var, jt6Var);
                return;
        }
    }
}
