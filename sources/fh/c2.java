package fh;
public final class c2 implements Runnable {
    public final int f6398a;
    public final f2 f6399b;
    public final boolean f6400c;

    public c2(f2 f2Var, boolean z10, int i9) {
        this.f6398a = i9;
        this.f6399b = f2Var;
        this.f6400c = z10;
    }

    @Override
    public final void run() {
        switch (this.f6398a) {
            case 0:
                boolean z10 = this.f6400c;
                f2 f2Var = this.f6399b;
                if (!z10) {
                    f2Var.C.setVisibility(8);
                    return;
                } else {
                    f2Var.getClass();
                    return;
                }
            default:
                boolean z11 = this.f6400c;
                f2 f2Var2 = this.f6399b;
                if (!z11) {
                    f2Var2.v.setVisibility(8);
                    return;
                } else {
                    f2Var2.getClass();
                    return;
                }
        }
    }
}
