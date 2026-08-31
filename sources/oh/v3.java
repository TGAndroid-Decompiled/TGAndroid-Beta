package oh;
public final class v3 implements Runnable {
    public final int f17845a;
    public final qh.d8 f17846b;

    public v3(qh.d8 d8Var, int i10) {
        this.f17845a = i10;
        this.f17846b = d8Var;
    }

    @Override
    public final void run() {
        switch (this.f17845a) {
            case 0:
                this.f17846b.dismiss();
                return;
            case 1:
                this.f17846b.dismiss();
                return;
            default:
                this.f17846b.onBackPressed();
                return;
        }
    }
}
