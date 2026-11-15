package hi;

import java.io.File;
import org.telegram.messenger.MediaController;
public final class p0 implements Runnable {
    public final int f14834a;
    public final u0 f14835b;
    public final File f14836c;

    public p0(u0 u0Var, File file, int i7) {
        this.f14834a = i7;
        this.f14835b = u0Var;
        this.f14836c = file;
    }

    @Override
    public final void run() {
        switch (this.f14834a) {
            case 0:
                u0 u0Var = this.f14835b;
                if (u0Var.f15170c && u0Var.f15174r != null) {
                    MediaController.d0(this.f14836c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1));
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f14835b;
                d7 d7Var = u0Var2.f15174r;
                File file = this.f14836c;
                d7Var.c(file);
                if (u0Var2.f15170c && u0Var2.f15174r != null) {
                    org.telegram.messenger.g0.h3(new p0(u0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f14836c.getAbsolutePath();
                u0 u0Var3 = this.f14835b;
                MediaController.d0(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2));
                return;
        }
    }
}
