package og;
public final class c1 implements Runnable {
    public final int f14338a;
    public final d1 f14339b;

    public c1(d1 d1Var, int i10) {
        this.f14338a = i10;
        this.f14339b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f14338a) {
            case 0:
                f1 f1Var = this.f14339b.f14344b.d;
                if (f1Var != null) {
                    f1Var.postRunnable(f1Var.f14361w);
                    return;
                }
                return;
            case 1:
                f1 f1Var2 = this.f14339b.f14344b.d;
                if (f1Var2 != null) {
                    f1Var2.postRunnable(f1Var2.f14361w);
                    return;
                }
                return;
            default:
                h1 h1Var = this.f14339b.f14344b;
                f1 f1Var3 = h1Var.d;
                f1Var3.getClass();
                f1Var3.postRunnable(new e1(f1Var3, 2));
                h1Var.d = null;
                return;
        }
    }
}
