package ci;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class o0 implements Runnable {
    public final int f5658a;
    public final t0 f5659b;
    public final File f5660c;

    public o0(t0 t0Var, File file, int i10) {
        this.f5658a = i10;
        this.f5659b = t0Var;
        this.f5660c = file;
    }

    @Override
    public final void run() {
        switch (this.f5658a) {
            case 0:
                t0 t0Var = this.f5659b;
                if (t0Var.f5980c && t0Var.f5984r != null) {
                    MediaController.saveFile(this.f5660c.getAbsolutePath(), t0Var.getContext(), 1, null, null, new p0(t0Var, 1), false);
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.f5659b;
                l8 l8Var = t0Var2.f5984r;
                File file = this.f5660c;
                l8Var.c(file);
                if (t0Var2.f5980c && t0Var2.f5984r != null) {
                    AndroidUtilities.runOnUIThread(new o0(t0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f5660c.getAbsolutePath();
                t0 t0Var3 = this.f5659b;
                MediaController.saveFile(absolutePath, t0Var3.getContext(), 0, null, null, new p0(t0Var3, 2), false);
                return;
        }
    }
}
