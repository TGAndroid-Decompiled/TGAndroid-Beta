package ci;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class o0 implements Runnable {
    public final int f5656a;
    public final t0 f5657b;
    public final File f5658c;

    public o0(t0 t0Var, File file, int i10) {
        this.f5656a = i10;
        this.f5657b = t0Var;
        this.f5658c = file;
    }

    @Override
    public final void run() {
        switch (this.f5656a) {
            case 0:
                t0 t0Var = this.f5657b;
                if (t0Var.f5978c && t0Var.f5982r != null) {
                    MediaController.saveFile(this.f5658c.getAbsolutePath(), t0Var.getContext(), 1, null, null, new p0(t0Var, 1), false);
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.f5657b;
                l8 l8Var = t0Var2.f5982r;
                File file = this.f5658c;
                l8Var.c(file);
                if (t0Var2.f5978c && t0Var2.f5982r != null) {
                    AndroidUtilities.runOnUIThread(new o0(t0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f5658c.getAbsolutePath();
                t0 t0Var3 = this.f5657b;
                MediaController.saveFile(absolutePath, t0Var3.getContext(), 0, null, null, new p0(t0Var3, 2), false);
                return;
        }
    }
}
