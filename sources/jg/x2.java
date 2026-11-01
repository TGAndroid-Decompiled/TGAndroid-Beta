package jg;
public final class x2 implements Runnable {
    public final int f10357a;
    public final d3 f10358b;

    public x2(d3 d3Var, int i10) {
        this.f10357a = i10;
        this.f10358b = d3Var;
    }

    @Override
    public final void run() {
        switch (this.f10357a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                org.telegram.messenger.i0.g3(new x2(this.f10358b, 0));
                return;
            case 2:
                this.f10358b.dismiss();
                return;
            default:
                d3 d3Var = this.f10358b;
                ph.h1 h1Var = d3Var.H;
                if (h1Var != null) {
                    h1Var.a(null);
                    d3Var.H = null;
                }
                d3Var.dismiss();
                return;
        }
    }
}
