package lh;

public final class q3 implements Runnable {

    public final int f16553a;

    public final t3 f16554b;

    public q3(t3 t3Var, int i10) {
        this.f16553a = i10;
        this.f16554b = t3Var;
    }

    @Override
    public final void run() {
        switch (this.f16553a) {
            case 0:
                this.f16554b.dismiss();
                break;
            default:
                super/*org.telegram.ui.ActionBar.e3*/.dismiss();
                break;
        }
    }
}
