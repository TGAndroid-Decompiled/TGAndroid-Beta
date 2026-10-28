package fi;
public final class l4 implements Runnable {
    public final int f11166a;
    public final e6 f11167b;
    public final sg.c2 f11168c;

    public l4(e6 e6Var, sg.c2 c2Var, int i10) {
        this.f11166a = i10;
        this.f11167b = e6Var;
        this.f11168c = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f11166a) {
            case 0:
                this.f11167b.A0(this.f11168c, true);
                return;
            default:
                this.f11167b.z0(this.f11168c);
                return;
        }
    }
}
