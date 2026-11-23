package fi;
public final class o3 implements Runnable {
    public final int f12367a;
    public final hi.p8 f12368b;

    public o3(hi.p8 p8Var, int i7) {
        this.f12367a = i7;
        this.f12368b = p8Var;
    }

    @Override
    public final void run() {
        switch (this.f12367a) {
            case 0:
                this.f12368b.dismiss();
                return;
            case 1:
                this.f12368b.dismiss();
                return;
            default:
                this.f12368b.onBackPressed();
                return;
        }
    }
}
