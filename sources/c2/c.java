package c2;
public final class c implements Runnable {
    public final int f2123a;
    public final androidx.emoji2.text.o f2124b;
    public final int f2125c;

    public c(androidx.emoji2.text.o oVar, int i9, int i10) {
        this.f2123a = i10;
        this.f2124b = oVar;
        this.f2125c = i9;
    }

    @Override
    public final void run() {
        switch (this.f2123a) {
            case 0:
                a0 a0Var = ((e) ((a5.m) this.f2124b.f873f).d).d;
                if (a0Var != null) {
                    a0Var.j(this.f2125c);
                    return;
                }
                return;
            default:
                a0 a0Var2 = ((e) ((a5.m) this.f2124b.f873f).d).d;
                if (a0Var2 != null) {
                    a0Var2.k(this.f2125c);
                    return;
                }
                return;
        }
    }
}
