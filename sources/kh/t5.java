package kh;
public final class t5 implements Runnable {
    public final int f10937a;
    public final d6 f10938b;

    public t5(d6 d6Var, int i10) {
        this.f10937a = i10;
        this.f10938b = d6Var;
    }

    @Override
    public final void run() {
        switch (this.f10937a) {
            case 0:
                this.f10938b.Y(false);
                return;
            case 1:
                this.f10938b.Y(true);
                return;
            case 2:
                d6.U(this.f10938b);
                return;
            case 3:
                d6.T(this.f10938b);
                return;
            case 4:
                d6.R(this.f10938b);
                return;
            default:
                this.f10938b.dismiss();
                return;
        }
    }
}
