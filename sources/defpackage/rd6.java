package defpackage;
public final class rd6 implements Runnable {
    public final byte a;
    public final td6 b;

    public rd6(td6 td6Var, byte b) {
        this.a = b;
        this.b = td6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        td6 td6Var = this.b;
        switch (b) {
            case 0:
                ry8 ry8Var = td6Var.e;
                ry8Var.getAnimatedDrawable().I(0, false, false);
                ry8Var.d();
                yc6 yc6Var = td6Var.a;
                if (yc6Var != null) {
                    yc6Var.f[0].requestFocus();
                    return;
                }
                return;
            case 1:
                td6Var.x = false;
                while (true) {
                    sj2[] sj2VarArr = td6Var.a.f;
                    if (i < sj2VarArr.length) {
                        sj2VarArr[i].A(0.0f);
                        i++;
                    } else {
                        return;
                    }
                }
            case 2:
                td6Var.postDelayed(new rd6(td6Var, (byte) 3), 150L);
                rd6 rd6Var = td6Var.y;
                td6Var.removeCallbacks(rd6Var);
                td6Var.postDelayed(rd6Var, 3000L);
                td6Var.x = true;
                return;
            default:
                yc6 yc6Var2 = td6Var.a;
                yc6Var2.e = false;
                yc6Var2.f[0].requestFocus();
                while (true) {
                    sj2[] sj2VarArr2 = yc6Var2.f;
                    if (i < sj2VarArr2.length) {
                        sj2VarArr2[i].A(0.0f);
                        i++;
                    } else {
                        return;
                    }
                }
        }
    }
}
