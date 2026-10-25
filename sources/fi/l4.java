package fi;
public final class l4 implements Runnable {
    public final int f11167a;
    public final e6 f11168b;
    public final sg.d2 f11169c;

    public l4(e6 e6Var, sg.d2 d2Var, int i10) {
        this.f11167a = i10;
        this.f11168b = e6Var;
        this.f11169c = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f11167a) {
            case 0:
                this.f11168b.A0(this.f11169c, true);
                return;
            default:
                this.f11168b.z0(this.f11169c);
                return;
        }
    }
}
