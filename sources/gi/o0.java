package gi;

import java.io.File;
import org.telegram.messenger.MediaController;
public final class o0 implements Runnable {
    public final int f13320a;
    public final t0 f13321b;
    public final File f13322c;

    public o0(t0 t0Var, File file, int i3) {
        this.f13320a = i3;
        this.f13321b = t0Var;
        this.f13322c = file;
    }

    @Override
    public final void run() {
        switch (this.f13320a) {
            case 0:
                t0 t0Var = this.f13321b;
                if (t0Var.f13592c && t0Var.f13596r != null) {
                    MediaController.d0(this.f13322c.getAbsolutePath(), t0Var.getContext(), 1, null, null, new p0(t0Var, 1));
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.f13321b;
                f7 f7Var = t0Var2.f13596r;
                File file = this.f13322c;
                f7Var.c(file);
                if (t0Var2.f13592c && t0Var2.f13596r != null) {
                    org.telegram.messenger.g0.h3(new o0(t0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f13322c.getAbsolutePath();
                t0 t0Var3 = this.f13321b;
                MediaController.d0(absolutePath, t0Var3.getContext(), 0, null, null, new p0(t0Var3, 2));
                return;
        }
    }
}
