package defpackage;
public final class tz6 implements fu2 {
    public final byte a;
    public final kq b;
    public final ea6 c;
    public final ft6 d;

    public tz6(kq kqVar, ea6 ea6Var, ft6 ft6Var, byte b) {
        this.a = b;
        this.b = kqVar;
        this.c = ea6Var;
        this.d = ft6Var;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        ft6 ft6Var = this.d;
        ea6 ea6Var = this.c;
        kq kqVar = this.b;
        vz6 vz6Var = (vz6) obj;
        switch (b) {
            case 0:
                vz6Var.u(kqVar.b, (rz6) kqVar.c, ea6Var, ft6Var);
                return;
            default:
                vz6Var.s(kqVar.b, (rz6) kqVar.c, ea6Var, ft6Var);
                return;
        }
    }
}
