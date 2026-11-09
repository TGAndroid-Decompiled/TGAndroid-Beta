package fi;

import java.io.File;
import org.telegram.messenger.MediaController;
public final class o0 implements Runnable {
    public final int f12505a;
    public final t0 f12506b;
    public final File f12507c;

    public o0(t0 t0Var, File file, int i7) {
        this.f12505a = i7;
        this.f12506b = t0Var;
        this.f12507c = file;
    }

    @Override
    public final void run() {
        switch (this.f12505a) {
            case 0:
                t0 t0Var = this.f12506b;
                if (t0Var.f12830c && t0Var.f12834r != null) {
                    MediaController.d0(this.f12507c.getAbsolutePath(), t0Var.getContext(), 1, null, null, new p0(t0Var, 1));
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.f12506b;
                e7 e7Var = t0Var2.f12834r;
                File file = this.f12507c;
                e7Var.c(file);
                if (t0Var2.f12830c && t0Var2.f12834r != null) {
                    org.telegram.messenger.g0.h3(new o0(t0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f12507c.getAbsolutePath();
                t0 t0Var3 = this.f12506b;
                MediaController.d0(absolutePath, t0Var3.getContext(), 0, null, null, new p0(t0Var3, 2));
                return;
        }
    }
}
