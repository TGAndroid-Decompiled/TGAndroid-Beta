package fi;

import org.telegram.messenger.MediaController;
public final class c3 extends org.telegram.ui.ActionBar.j {
    public final o3 f10606a;

    public c3(o3 o3Var) {
        this.f10606a = o3Var;
    }

    @Override
    public final void b(int i10) {
        o3 o3Var = this.f10606a;
        if (i10 == -1) {
            Runnable runnable = o3Var.V;
            if (runnable != null) {
                runnable.run();
            }
        } else if (i10 >= 10) {
            o3Var.e((MediaController.AlbumEntry) o3Var.f11346g0.get(i10 - 10), false);
        }
    }
}
