package di;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class p0 implements Runnable {
    public final int f7810a;
    public final u0 f7811b;
    public final File f7812c;

    public p0(u0 u0Var, File file, int i10) {
        this.f7810a = i10;
        this.f7811b = u0Var;
        this.f7812c = file;
    }

    @Override
    public final void run() {
        switch (this.f7810a) {
            case 0:
                u0 u0Var = this.f7811b;
                if (u0Var.f8214c && u0Var.f8218r != null) {
                    MediaController.saveFile(this.f7812c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1), false);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f7811b;
                o8 o8Var = u0Var2.f8218r;
                File file = this.f7812c;
                o8Var.c(file);
                if (u0Var2.f8214c && u0Var2.f8218r != null) {
                    AndroidUtilities.runOnUIThread(new p0(u0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f7812c.getAbsolutePath();
                u0 u0Var3 = this.f7811b;
                MediaController.saveFile(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2), false);
                return;
        }
    }
}
