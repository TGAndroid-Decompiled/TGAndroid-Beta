package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
public final class y0 implements Runnable {
    public final int f15854a;
    public final d1 f15855b;
    public final File f15856c;

    public y0(d1 d1Var, File file, int i7) {
        this.f15854a = i7;
        this.f15855b = d1Var;
        this.f15856c = file;
    }

    @Override
    public final void run() {
        switch (this.f15854a) {
            case 0:
                d1 d1Var = this.f15855b;
                if (d1Var.f14298c && d1Var.f14302r != null) {
                    MediaController.d0(this.f15856c.getAbsolutePath(), d1Var.getContext(), 1, null, null, new z0(d1Var, 1));
                    return;
                }
                return;
            case 1:
                d1 d1Var2 = this.f15855b;
                x7 x7Var = d1Var2.f14302r;
                File file = this.f15856c;
                x7Var.c(file);
                if (d1Var2.f14298c && d1Var2.f14302r != null) {
                    org.telegram.messenger.g0.g3(new y0(d1Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f15856c.getAbsolutePath();
                d1 d1Var3 = this.f15855b;
                MediaController.d0(absolutePath, d1Var3.getContext(), 0, null, null, new z0(d1Var3, 2));
                return;
        }
    }
}
