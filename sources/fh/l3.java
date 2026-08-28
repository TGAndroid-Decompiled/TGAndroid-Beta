package fh;
public final class l3 implements Runnable {
    public final int f6603a;
    public final y3 f6604b;

    public l3(y3 y3Var, int i9) {
        this.f6603a = i9;
        this.f6604b = y3Var;
    }

    @Override
    public final void run() {
        switch (this.f6603a) {
            case 0:
                this.f6604b.setReordering(true);
                return;
            case 1:
                this.f6604b.setReordering(true);
                return;
            case 2:
                this.f6604b.f(false);
                return;
            default:
                this.f6604b.setReordering(true);
                return;
        }
    }
}
