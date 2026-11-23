package fi;
public final class o3 implements Runnable {
    public final int f12329a;
    public final hi.k9 f12330b;

    public o3(hi.k9 k9Var, int i7) {
        this.f12329a = i7;
        this.f12330b = k9Var;
    }

    @Override
    public final void run() {
        switch (this.f12329a) {
            case 0:
                this.f12330b.dismiss();
                return;
            case 1:
                this.f12330b.dismiss();
                return;
            default:
                this.f12330b.onBackPressed();
                return;
        }
    }
}
