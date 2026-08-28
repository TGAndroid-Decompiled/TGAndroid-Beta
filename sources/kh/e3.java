package kh;

import org.telegram.messenger.MediaController;
public final class e3 extends org.telegram.ui.ActionBar.j {
    public final q3 f15146a;

    public e3(q3 q3Var) {
        this.f15146a = q3Var;
    }

    @Override
    public final void b(int i9) {
        q3 q3Var = this.f15146a;
        if (i9 == -1) {
            Runnable runnable = q3Var.R;
            if (runnable != null) {
                runnable.run();
            }
        } else if (i9 >= 10) {
            q3Var.e((MediaController.AlbumEntry) q3Var.f15863c0.get(i9 - 10), false);
        }
    }
}
