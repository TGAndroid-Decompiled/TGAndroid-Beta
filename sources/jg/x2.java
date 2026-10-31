package jg;
public final class x2 implements Runnable {
    public final int f10356a;
    public final d3 f10357b;

    public x2(d3 d3Var, int i10) {
        this.f10356a = i10;
        this.f10357b = d3Var;
    }

    @Override
    public final void run() {
        switch (this.f10356a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                org.telegram.messenger.i0.g3(new x2(this.f10357b, 0));
                return;
            case 2:
                this.f10357b.dismiss();
                return;
            default:
                d3 d3Var = this.f10357b;
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
