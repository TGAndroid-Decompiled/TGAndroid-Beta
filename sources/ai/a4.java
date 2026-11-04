package ai;
public final class a4 implements Runnable {
    public final int f490a;
    public final o4 f491b;

    public a4(o4 o4Var, int i3) {
        this.f490a = i3;
        this.f491b = o4Var;
    }

    @Override
    public final void run() {
        switch (this.f490a) {
            case 0:
                this.f491b.setReordering(true);
                return;
            case 1:
                this.f491b.setReordering(true);
                return;
            case 2:
                this.f491b.f(false);
                return;
            default:
                this.f491b.setReordering(true);
                return;
        }
    }
}
