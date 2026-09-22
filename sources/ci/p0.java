package ci;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class p0 implements Runnable {
    public final int f5290a;
    public final u0 f5291b;
    public final File f5292c;

    public p0(u0 u0Var, File file, int i10) {
        this.f5290a = i10;
        this.f5291b = u0Var;
        this.f5292c = file;
    }

    @Override
    public final void run() {
        switch (this.f5290a) {
            case 0:
                u0 u0Var = this.f5291b;
                if (u0Var.f5592c && u0Var.f5595r != null) {
                    MediaController.saveFile(this.f5292c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1), false);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f5291b;
                o8 o8Var = u0Var2.f5595r;
                File file = this.f5292c;
                o8Var.c(file);
                if (u0Var2.f5592c && u0Var2.f5595r != null) {
                    AndroidUtilities.runOnUIThread(new p0(u0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f5292c.getAbsolutePath();
                u0 u0Var3 = this.f5291b;
                MediaController.saveFile(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2), false);
                return;
        }
    }
}
