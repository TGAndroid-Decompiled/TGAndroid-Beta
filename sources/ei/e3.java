package ei;

import org.telegram.messenger.MediaController;
public final class e3 extends org.telegram.ui.ActionBar.j {
    public final q3 f8951a;

    public e3(q3 q3Var) {
        this.f8951a = q3Var;
    }

    @Override
    public final void b(int i10) {
        q3 q3Var = this.f8951a;
        if (i10 == -1) {
            Runnable runnable = q3Var.V;
            if (runnable != null) {
                runnable.run();
            }
        } else if (i10 >= 10) {
            q3Var.e((MediaController.AlbumEntry) q3Var.f9631g0.get(i10 - 10), false);
        }
    }
}
