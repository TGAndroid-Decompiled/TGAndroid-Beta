package fi;
public final class o3 implements Runnable {
    public final int f12364a;
    public final hi.p8 f12365b;

    public o3(hi.p8 p8Var, int i7) {
        this.f12364a = i7;
        this.f12365b = p8Var;
    }

    @Override
    public final void run() {
        switch (this.f12364a) {
            case 0:
                this.f12365b.dismiss();
                return;
            case 1:
                this.f12365b.dismiss();
                return;
            default:
                this.f12365b.onBackPressed();
                return;
        }
    }
}
