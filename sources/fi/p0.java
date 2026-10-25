package fi;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class p0 implements Runnable {
    public final int f11429a;
    public final u0 f11430b;
    public final File f11431c;

    public p0(u0 u0Var, File file, int i10) {
        this.f11429a = i10;
        this.f11430b = u0Var;
        this.f11431c = file;
    }

    @Override
    public final void run() {
        switch (this.f11429a) {
            case 0:
                u0 u0Var = this.f11430b;
                if (u0Var.f11735c && u0Var.f11738r != null) {
                    MediaController.saveFile(this.f11431c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1), false);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f11430b;
                w7 w7Var = u0Var2.f11738r;
                File file = this.f11431c;
                w7Var.c(file);
                if (u0Var2.f11735c && u0Var2.f11738r != null) {
                    AndroidUtilities.runOnUIThread(new p0(u0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f11431c.getAbsolutePath();
                u0 u0Var3 = this.f11430b;
                MediaController.saveFile(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2), false);
                return;
        }
    }
}
