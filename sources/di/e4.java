package di;
public final class e4 implements Runnable {
    public final int f8516a;
    public final fi.n9 f8517b;

    public e4(fi.n9 n9Var, int i10) {
        this.f8516a = i10;
        this.f8517b = n9Var;
    }

    @Override
    public final void run() {
        switch (this.f8516a) {
            case 0:
                this.f8517b.dismiss();
                return;
            case 1:
                this.f8517b.dismiss();
                return;
            default:
                this.f8517b.onBackPressed();
                return;
        }
    }
}
