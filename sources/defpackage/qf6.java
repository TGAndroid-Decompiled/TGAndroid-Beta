package defpackage;
public final class qf6 implements Runnable {
    public final byte a;
    public final sf6 b;

    public qf6(sf6 sf6Var, byte b) {
        this.a = b;
        this.b = sf6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        sf6 sf6Var = this.b;
        switch (b) {
            case 0:
                s09 s09Var = sf6Var.e;
                s09Var.getAnimatedDrawable().I(0, false, false);
                s09Var.d();
                xe6 xe6Var = sf6Var.a;
                if (xe6Var != null) {
                    xe6Var.f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                sf6Var.x = false;
                while (true) {
                    gl2[] gl2VarArr = sf6Var.a.f;
                    if (i < gl2VarArr.length) {
                        gl2VarArr[i].A(0.0f);
                        i++;
                    } else {
                        return;
                    }
                }
            case 2:
                sf6Var.postDelayed(new qf6(sf6Var, (byte) 3), 150L);
                qf6 qf6Var = sf6Var.y;
                sf6Var.removeCallbacks(qf6Var);
                sf6Var.postDelayed(qf6Var, 3000L);
                sf6Var.x = true;
                return;
            default:
                xe6 xe6Var2 = sf6Var.a;
                xe6Var2.e = false;
                xe6Var2.f[0].requestFocus();
                while (true) {
                    gl2[] gl2VarArr2 = xe6Var2.f;
                    if (i < gl2VarArr2.length) {
                        gl2VarArr2[i].A(0.0f);
                        i++;
                    } else {
                        return;
                    }
                }
        }
    }
}
