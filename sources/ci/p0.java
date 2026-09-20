package ci;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class p0 implements Runnable {
    public final int f5292a;
    public final u0 f5293b;
    public final File f5294c;

    public p0(u0 u0Var, File file, int i10) {
        this.f5292a = i10;
        this.f5293b = u0Var;
        this.f5294c = file;
    }

    @Override
    public final void run() {
        switch (this.f5292a) {
            case 0:
                u0 u0Var = this.f5293b;
                if (u0Var.f5594c && u0Var.f5597r != null) {
                    MediaController.saveFile(this.f5294c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1), false);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f5293b;
                o8 o8Var = u0Var2.f5597r;
                File file = this.f5294c;
                o8Var.c(file);
                if (u0Var2.f5594c && u0Var2.f5597r != null) {
                    AndroidUtilities.runOnUIThread(new p0(u0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f5294c.getAbsolutePath();
                u0 u0Var3 = this.f5293b;
                MediaController.saveFile(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2), false);
                return;
        }
    }
}
