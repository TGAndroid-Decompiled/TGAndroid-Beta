package hi;

import org.telegram.messenger.hd;
public final class o9 implements Runnable {
    public final int f15237a = 1;
    public final p9 f15238b;
    public final Runnable f15239c;
    public final boolean d;

    public o9(p9 p9Var, Runnable runnable, boolean z10) {
        this.f15238b = p9Var;
        this.f15239c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f15237a;
        boolean z10 = this.d;
        Runnable runnable = this.f15239c;
        p9 p9Var = this.f15238b;
        switch (i10) {
            case 0:
                p9Var.g(runnable, z10);
                return;
            default:
                runnable.run();
                sa saVar = p9Var.f15282a;
                i3 i3Var = saVar.U0;
                if (z10) {
                    i7 = 2131744417;
                } else {
                    i7 = 2131744418;
                }
                i3Var.f14787a.t(hd.N0(i7, null), false, true);
                i3Var.invalidate();
                saVar.g(true, true);
                saVar.c0(true);
                saVar.J0.a(false, true);
                saVar.K0.b(true, true);
                saVar.h0(true, true);
                return;
        }
    }

    public o9(p9 p9Var, boolean z10, Runnable runnable) {
        this.f15238b = p9Var;
        this.d = z10;
        this.f15239c = runnable;
    }
}
