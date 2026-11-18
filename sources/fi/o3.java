package fi;
public final class o3 implements Runnable {
    public final int f12325a;
    public final hi.q8 f12326b;

    public o3(hi.q8 q8Var, int i7) {
        this.f12325a = i7;
        this.f12326b = q8Var;
    }

    @Override
    public final void run() {
        switch (this.f12325a) {
            case 0:
                this.f12326b.dismiss();
                return;
            case 1:
                this.f12326b.dismiss();
                return;
            default:
                this.f12326b.onBackPressed();
                return;
        }
    }
}
