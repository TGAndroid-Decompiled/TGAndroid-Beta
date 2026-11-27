package defpackage;
public final class tr7 implements f36, sa1 {
    public final a36 a;
    public final cq4 b;
    public ur7 c;
    public final vr7 d;

    public tr7(vr7 vr7Var, a36 a36Var, cq4 cq4Var) {
        cq4Var.getClass();
        this.d = vr7Var;
        this.a = a36Var;
        this.b = cq4Var;
        a36Var.a(this);
    }

    @Override
    public final void b(i36 i36Var, y26 y26Var) {
        if (y26Var == y26.ON_START) {
            vr7 vr7Var = this.d;
            ls lsVar = vr7Var.b;
            cq4 cq4Var = this.b;
            lsVar.addLast(cq4Var);
            ur7 ur7Var = new ur7(vr7Var, cq4Var);
            cq4Var.b.add(ur7Var);
            vr7Var.c();
            cq4Var.c = new j03(0, vr7Var, vr7.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, (byte) 4);
            this.c = ur7Var;
        } else if (y26Var == y26.ON_STOP) {
            ur7 ur7Var2 = this.c;
            if (ur7Var2 != null) {
                ur7Var2.cancel();
            }
        } else if (y26Var == y26.ON_DESTROY) {
            cancel();
        }
    }

    @Override
    public final void cancel() {
        this.a.b(this);
        this.b.b.remove(this);
        ur7 ur7Var = this.c;
        if (ur7Var != null) {
            ur7Var.cancel();
        }
        this.c = null;
    }
}
