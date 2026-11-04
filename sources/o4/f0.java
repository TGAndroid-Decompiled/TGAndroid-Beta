package o4;
public final class f0 implements Runnable {
    public final int f20644a;
    public final o0 f20645b;

    public f0(o0 o0Var, int i3) {
        this.f20644a = i3;
        this.f20645b = o0Var;
    }

    @Override
    public final void run() {
        switch (this.f20644a) {
            case 0:
                o0 o0Var = this.f20645b;
                g2.n0.W(o0Var.h.f20628l, new f0(o0Var, 1));
                return;
            default:
                this.f20645b.o0();
                return;
        }
    }
}
