package ci;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class p0 implements Runnable {
    public final int f5273a;
    public final u0 f5274b;
    public final File f5275c;

    public p0(u0 u0Var, File file, int i10) {
        this.f5273a = i10;
        this.f5274b = u0Var;
        this.f5275c = file;
    }

    @Override
    public final void run() {
        switch (this.f5273a) {
            case 0:
                u0 u0Var = this.f5274b;
                if (u0Var.f5590c && u0Var.f5593r != null) {
                    MediaController.saveFile(this.f5275c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1), false);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f5274b;
                l8 l8Var = u0Var2.f5593r;
                File file = this.f5275c;
                l8Var.c(file);
                if (u0Var2.f5590c && u0Var2.f5593r != null) {
                    AndroidUtilities.runOnUIThread(new p0(u0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f5275c.getAbsolutePath();
                u0 u0Var3 = this.f5274b;
                MediaController.saveFile(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2), false);
                return;
        }
    }
}
