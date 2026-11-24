package defpackage;
public final class tx6 implements us2 {
    public final byte a;
    public final kp b;
    public final f86 c;
    public final fr6 d;

    public tx6(kp kpVar, f86 f86Var, fr6 fr6Var, byte b) {
        this.a = b;
        this.b = kpVar;
        this.c = f86Var;
        this.d = fr6Var;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        fr6 fr6Var = this.d;
        f86 f86Var = this.c;
        kp kpVar = this.b;
        vx6 vx6Var = (vx6) obj;
        switch (b) {
            case 0:
                vx6Var.u(kpVar.b, (rx6) kpVar.c, f86Var, fr6Var);
                return;
            default:
                vx6Var.s(kpVar.b, (rx6) kpVar.c, f86Var, fr6Var);
                return;
        }
    }
}
