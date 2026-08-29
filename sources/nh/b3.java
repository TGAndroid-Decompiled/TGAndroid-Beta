package nh;

import org.telegram.messenger.MediaController;
public final class b3 extends org.telegram.ui.ActionBar.k {
    public final n3 f17412a;

    public b3(n3 n3Var) {
        this.f17412a = n3Var;
    }

    @Override
    public final void b(int i10) {
        n3 n3Var = this.f17412a;
        if (i10 == -1) {
            Runnable runnable = n3Var.R;
            if (runnable != null) {
                runnable.run();
            }
        } else if (i10 >= 10) {
            n3Var.e((MediaController.AlbumEntry) n3Var.f18172c0.get(i10 - 10), false);
        }
    }
}
