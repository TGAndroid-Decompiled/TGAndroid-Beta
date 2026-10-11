package ci;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class o0 implements Runnable {
    public final int f5657a;
    public final t0 f5658b;
    public final File f5659c;

    public o0(t0 t0Var, File file, int i10) {
        this.f5657a = i10;
        this.f5658b = t0Var;
        this.f5659c = file;
    }

    @Override
    public final void run() {
        switch (this.f5657a) {
            case 0:
                t0 t0Var = this.f5658b;
                if (t0Var.f5979c && t0Var.f5983r != null) {
                    MediaController.saveFile(this.f5659c.getAbsolutePath(), t0Var.getContext(), 1, null, null, new p0(t0Var, 1), false);
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.f5658b;
                l8 l8Var = t0Var2.f5983r;
                File file = this.f5659c;
                l8Var.c(file);
                if (t0Var2.f5979c && t0Var2.f5983r != null) {
                    AndroidUtilities.runOnUIThread(new o0(t0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f5659c.getAbsolutePath();
                t0 t0Var3 = this.f5658b;
                MediaController.saveFile(absolutePath, t0Var3.getContext(), 0, null, null, new p0(t0Var3, 2), false);
                return;
        }
    }
}
