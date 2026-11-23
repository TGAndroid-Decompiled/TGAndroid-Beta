package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
public final class q0 implements Runnable {
    public final int f15289a;
    public final v0 f15290b;
    public final File f15291c;

    public q0(v0 v0Var, File file, int i7) {
        this.f15289a = i7;
        this.f15290b = v0Var;
        this.f15291c = file;
    }

    @Override
    public final void run() {
        switch (this.f15289a) {
            case 0:
                v0 v0Var = this.f15290b;
                if (v0Var.f15594c && v0Var.f15598r != null) {
                    MediaController.d0(this.f15291c.getAbsolutePath(), v0Var.getContext(), 1, null, null, new r0(v0Var, 1));
                    return;
                }
                return;
            case 1:
                v0 v0Var2 = this.f15290b;
                c7 c7Var = v0Var2.f15598r;
                File file = this.f15291c;
                c7Var.c(file);
                if (v0Var2.f15594c && v0Var2.f15598r != null) {
                    org.telegram.messenger.g0.g3(new q0(v0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f15291c.getAbsolutePath();
                v0 v0Var3 = this.f15290b;
                MediaController.d0(absolutePath, v0Var3.getContext(), 0, null, null, new r0(v0Var3, 2));
                return;
        }
    }
}
