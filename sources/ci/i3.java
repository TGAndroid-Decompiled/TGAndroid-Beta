package ci;

import org.telegram.messenger.MediaController;
public final class i3 extends org.telegram.ui.ActionBar.j {
    public final v3 f5195a;

    public i3(v3 v3Var) {
        this.f5195a = v3Var;
    }

    @Override
    public final void b(int i10) {
        v3 v3Var = this.f5195a;
        if (i10 == -1) {
            Runnable runnable = v3Var.V;
            if (runnable != null) {
                runnable.run();
            }
        } else if (i10 >= 10) {
            v3Var.e((MediaController.AlbumEntry) v3Var.f6139g0.get(i10 - 10), false);
        }
    }
}
