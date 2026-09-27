package ci;

import org.telegram.messenger.MediaController;
public final class j3 extends org.telegram.ui.ActionBar.j {
    public final w3 f4818a;

    public j3(w3 w3Var) {
        this.f4818a = w3Var;
    }

    @Override
    public final void b(int i10) {
        w3 w3Var = this.f4818a;
        if (i10 == -1) {
            Runnable runnable = w3Var.V;
            if (runnable != null) {
                runnable.run();
            }
        } else if (i10 >= 10) {
            w3Var.e((MediaController.AlbumEntry) w3Var.f5773g0.get(i10 - 10), false);
        }
    }
}
