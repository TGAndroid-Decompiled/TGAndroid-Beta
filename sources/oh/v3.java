package oh;
public final class v3 implements Runnable {
    public final int f17847a;
    public final qh.c8 f17848b;

    public v3(qh.c8 c8Var, int i10) {
        this.f17847a = i10;
        this.f17848b = c8Var;
    }

    @Override
    public final void run() {
        switch (this.f17847a) {
            case 0:
                this.f17848b.dismiss();
                return;
            case 1:
                this.f17848b.dismiss();
                return;
            default:
                this.f17848b.onBackPressed();
                return;
        }
    }
}
