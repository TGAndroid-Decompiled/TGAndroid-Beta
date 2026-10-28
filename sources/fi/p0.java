package fi;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class p0 implements Runnable {
    public final int f11428a;
    public final u0 f11429b;
    public final File f11430c;

    public p0(u0 u0Var, File file, int i10) {
        this.f11428a = i10;
        this.f11429b = u0Var;
        this.f11430c = file;
    }

    @Override
    public final void run() {
        switch (this.f11428a) {
            case 0:
                u0 u0Var = this.f11429b;
                if (u0Var.f11734c && u0Var.f11737r != null) {
                    MediaController.saveFile(this.f11430c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1), false);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f11429b;
                w7 w7Var = u0Var2.f11737r;
                File file = this.f11430c;
                w7Var.c(file);
                if (u0Var2.f11734c && u0Var2.f11737r != null) {
                    AndroidUtilities.runOnUIThread(new p0(u0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f11430c.getAbsolutePath();
                u0 u0Var3 = this.f11429b;
                MediaController.saveFile(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2), false);
                return;
        }
    }
}
