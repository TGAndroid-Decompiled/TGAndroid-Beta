package bi;

import org.telegram.messenger.MediaController;
public final class b4 extends org.telegram.ui.ActionBar.k {
    public final p4 f2356a;

    public b4(p4 p4Var) {
        this.f2356a = p4Var;
    }

    @Override
    public final void b(int i10) {
        p4 p4Var = this.f2356a;
        if (i10 == -1) {
            Runnable runnable = p4Var.V;
            if (runnable != null) {
                runnable.run();
            }
        } else if (i10 >= 10) {
            p4Var.e((MediaController.AlbumEntry) p4Var.f3378g0.get(i10 - 10), false);
        }
    }
}
