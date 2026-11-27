package defpackage;
public final class tf6 implements Runnable {
    public final byte a;
    public final vf6 b;

    public tf6(vf6 vf6Var, byte b) {
        this.a = b;
        this.b = vf6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        vf6 vf6Var = this.b;
        switch (b) {
            case 0:
                e29 e29Var = vf6Var.e;
                e29Var.getAnimatedDrawable().I(0, false, false);
                e29Var.d();
                bf6 bf6Var = vf6Var.a;
                if (bf6Var != null) {
                    bf6Var.f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                vf6Var.x = false;
                while (true) {
                    ok2[] ok2VarArr = vf6Var.a.f;
                    if (i < ok2VarArr.length) {
                        ok2VarArr[i].A(0.0f);
                        i++;
                    } else {
                        return;
                    }
                }
            case 2:
                vf6Var.postDelayed(new tf6(vf6Var, (byte) 3), 150L);
                tf6 tf6Var = vf6Var.y;
                vf6Var.removeCallbacks(tf6Var);
                vf6Var.postDelayed(tf6Var, 3000L);
                vf6Var.x = true;
                return;
            default:
                bf6 bf6Var2 = vf6Var.a;
                bf6Var2.e = false;
                bf6Var2.f[0].requestFocus();
                while (true) {
                    ok2[] ok2VarArr2 = bf6Var2.f;
                    if (i < ok2VarArr2.length) {
                        ok2VarArr2[i].A(0.0f);
                        i++;
                    } else {
                        return;
                    }
                }
        }
    }
}
