package di;
public final class e4 implements Runnable {
    public final int f8517a;
    public final fi.n9 f8518b;

    public e4(fi.n9 n9Var, int i10) {
        this.f8517a = i10;
        this.f8518b = n9Var;
    }

    @Override
    public final void run() {
        switch (this.f8517a) {
            case 0:
                this.f8518b.dismiss();
                return;
            case 1:
                this.f8518b.dismiss();
                return;
            default:
                this.f8518b.onBackPressed();
                return;
        }
    }
}
