package ai;
public final class h0 implements Runnable {
    public final int f671a;
    public final s0 f672b;

    public h0(s0 s0Var, int i3) {
        this.f671a = i3;
        this.f672b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f671a) {
            case 0:
                this.f672b.onBackPressed();
                return;
            default:
                this.f672b.f1();
                return;
        }
    }
}
