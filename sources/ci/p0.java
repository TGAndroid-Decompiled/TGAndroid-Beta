package ci;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class p0 implements Runnable {
    public final int f5288a;
    public final u0 f5289b;
    public final File f5290c;

    public p0(u0 u0Var, File file, int i10) {
        this.f5288a = i10;
        this.f5289b = u0Var;
        this.f5290c = file;
    }

    @Override
    public final void run() {
        switch (this.f5288a) {
            case 0:
                u0 u0Var = this.f5289b;
                if (u0Var.f5590c && u0Var.f5593r != null) {
                    MediaController.saveFile(this.f5290c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1), false);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f5289b;
                o8 o8Var = u0Var2.f5593r;
                File file = this.f5290c;
                o8Var.c(file);
                if (u0Var2.f5590c && u0Var2.f5593r != null) {
                    AndroidUtilities.runOnUIThread(new p0(u0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f5290c.getAbsolutePath();
                u0 u0Var3 = this.f5289b;
                MediaController.saveFile(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2), false);
                return;
        }
    }
}
