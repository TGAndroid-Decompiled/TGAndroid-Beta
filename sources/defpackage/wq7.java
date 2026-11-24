package defpackage;
public final class wq7 implements b36, sb1 {
    public final w26 a;
    public final zp4 b;
    public xq7 c;
    public final yq7 d;

    public wq7(yq7 yq7Var, w26 w26Var, zp4 zp4Var) {
        zp4Var.getClass();
        this.d = yq7Var;
        this.a = w26Var;
        this.b = zp4Var;
        w26Var.a(this);
    }

    @Override
    public final void b(e36 e36Var, u26 u26Var) {
        if (u26Var == u26.ON_START) {
            yq7 yq7Var = this.d;
            lt ltVar = yq7Var.b;
            zp4 zp4Var = this.b;
            ltVar.addLast(zp4Var);
            xq7 xq7Var = new xq7(yq7Var, zp4Var);
            zp4Var.b.add(xq7Var);
            yq7Var.c();
            zp4Var.c = new b13(0, yq7Var, yq7.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, (byte) 4);
            this.c = xq7Var;
        } else if (u26Var == u26.ON_STOP) {
            xq7 xq7Var2 = this.c;
            if (xq7Var2 != null) {
                xq7Var2.cancel();
            }
        } else if (u26Var == u26.ON_DESTROY) {
            cancel();
        }
    }

    @Override
    public final void cancel() {
        this.a.b(this);
        this.b.b.remove(this);
        xq7 xq7Var = this.c;
        if (xq7Var != null) {
            xq7Var.cancel();
        }
        this.c = null;
    }
}
