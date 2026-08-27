package gh;

public final class y implements Runnable {

    public final int f7632a;

    public final i0 f7633b;

    public y(i0 i0Var, int i10) {
        this.f7632a = i10;
        this.f7633b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f7632a) {
            case 0:
                this.f7633b.onBackPressed();
                break;
            default:
                this.f7633b.T();
                break;
        }
    }
}
