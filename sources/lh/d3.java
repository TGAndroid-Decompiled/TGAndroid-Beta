package lh;

import org.telegram.messenger.MediaController;

public final class d3 extends org.telegram.ui.ActionBar.j {

    public final p3 f15853a;

    public d3(p3 p3Var) {
        this.f15853a = p3Var;
    }

    @Override
    public final void b(int i10) {
        p3 p3Var = this.f15853a;
        if (i10 != -1) {
            if (i10 >= 10) {
                p3Var.e((MediaController.AlbumEntry) p3Var.f16512c0.get(i10 - 10), false);
            }
        } else {
            Runnable runnable = p3Var.R;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
