package kh;
public final class a3 implements Runnable {
    public final int f10460a;
    public final n3 f10461b;

    public a3(n3 n3Var, int i10) {
        this.f10460a = i10;
        this.f10461b = n3Var;
    }

    @Override
    public final void run() {
        switch (this.f10460a) {
            case 0:
                this.f10461b.setReordering(true);
                return;
            case 1:
                this.f10461b.setReordering(true);
                return;
            case 2:
                this.f10461b.f(false);
                return;
            default:
                this.f10461b.setReordering(true);
                return;
        }
    }
}
