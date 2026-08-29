package nh;

import org.telegram.ui.Components.mc;
public final class o8 implements Runnable {
    public final int f18307a;
    public final y8 f18308b;

    public o8(y8 y8Var, int i10) {
        this.f18307a = i10;
        this.f18308b = y8Var;
    }

    @Override
    public final void run() {
        switch (this.f18307a) {
            case 0:
                e9 e9Var = this.f18308b.S;
                mc.h(e9Var.container);
                e9.D(e9Var);
                return;
            case 1:
                y8 y8Var = this.f18308b;
                y8Var.v.setLoading(false);
                e9 e9Var2 = y8Var.S;
                e9Var2.f1();
                e9Var2.f17603b.D(0);
                return;
            case 2:
                this.f18308b.Q = false;
                return;
            case 3:
                e9 e9Var3 = this.f18308b.S;
                e9Var3.I = 6;
                e9Var3.f17603b.D(1);
                return;
            case 4:
                y8 y8Var2 = this.f18308b;
                y8Var2.f18906n.m(2);
                y8Var2.f18905f.forceLayout();
                y8Var2.j();
                return;
            default:
                y8 y8Var3 = this.f18308b;
                e9 e9Var4 = y8Var3.S;
                if (y8Var3.f18901a == 0) {
                    e9Var4.dismiss();
                    return;
                } else {
                    e9Var4.onBackPressed();
                    return;
                }
        }
    }
}
