package bg;
public final class v implements Runnable {
    public final int f1974a;
    public final a0 f1975b;

    public v(a0 a0Var, int i9) {
        this.f1974a = i9;
        this.f1975b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f1974a) {
            case 0:
                this.f1975b.dismiss();
                return;
            default:
                this.f1975b.onBackPressed();
                return;
        }
    }
}
