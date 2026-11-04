package ei;
public final class y3 implements Runnable {
    public final int f11228a;
    public final gi.t8 f11229b;

    public y3(gi.t8 t8Var, int i3) {
        this.f11228a = i3;
        this.f11229b = t8Var;
    }

    @Override
    public final void run() {
        switch (this.f11228a) {
            case 0:
                this.f11229b.dismiss();
                return;
            case 1:
                this.f11229b.dismiss();
                return;
            default:
                this.f11229b.onBackPressed();
                return;
        }
    }
}
