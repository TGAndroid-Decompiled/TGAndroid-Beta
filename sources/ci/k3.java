package ci;

import org.telegram.messenger.MediaController;
public final class k3 extends org.telegram.ui.ActionBar.j {
    public final x3 f4874a;

    public k3(x3 x3Var) {
        this.f4874a = x3Var;
    }

    @Override
    public final void b(int i10) {
        x3 x3Var = this.f4874a;
        if (i10 == -1) {
            Runnable runnable = x3Var.V;
            if (runnable != null) {
                runnable.run();
            }
        } else if (i10 >= 10) {
            x3Var.e((MediaController.AlbumEntry) x3Var.f5738g0.get(i10 - 10), false);
        }
    }
}
