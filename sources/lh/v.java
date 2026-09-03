package lh;
public final class v implements Runnable {
    public final int f13026a;
    public final f0 f13027b;

    public v(f0 f0Var, int i10) {
        this.f13026a = i10;
        this.f13027b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f13026a) {
            case 0:
                this.f13027b.onBackPressed();
                return;
            default:
                this.f13027b.T();
                return;
        }
    }
}
