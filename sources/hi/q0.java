package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
public final class q0 implements Runnable {
    public final int f15258a;
    public final v0 f15259b;
    public final File f15260c;

    public q0(v0 v0Var, File file, int i7) {
        this.f15258a = i7;
        this.f15259b = v0Var;
        this.f15260c = file;
    }

    @Override
    public final void run() {
        switch (this.f15258a) {
            case 0:
                v0 v0Var = this.f15259b;
                if (v0Var.f15558c && v0Var.f15562r != null) {
                    MediaController.d0(this.f15260c.getAbsolutePath(), v0Var.getContext(), 1, null, null, new r0(v0Var, 1));
                    return;
                }
                return;
            case 1:
                v0 v0Var2 = this.f15259b;
                d7 d7Var = v0Var2.f15562r;
                File file = this.f15260c;
                d7Var.c(file);
                if (v0Var2.f15558c && v0Var2.f15562r != null) {
                    org.telegram.messenger.g0.g3(new q0(v0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f15260c.getAbsolutePath();
                v0 v0Var3 = this.f15259b;
                MediaController.d0(absolutePath, v0Var3.getContext(), 0, null, null, new r0(v0Var3, 2));
                return;
        }
    }
}
