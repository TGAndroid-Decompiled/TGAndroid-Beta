package fi;
public final class o3 implements Runnable {
    public final int f12322a;
    public final hi.q8 f12323b;

    public o3(hi.q8 q8Var, int i7) {
        this.f12322a = i7;
        this.f12323b = q8Var;
    }

    @Override
    public final void run() {
        switch (this.f12322a) {
            case 0:
                this.f12323b.dismiss();
                return;
            case 1:
                this.f12323b.dismiss();
                return;
            default:
                this.f12323b.onBackPressed();
                return;
        }
    }
}
