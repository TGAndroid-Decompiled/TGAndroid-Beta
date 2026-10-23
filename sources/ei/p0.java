package ei;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class p0 implements Runnable {
    public final int f9588a;
    public final u0 f9589b;
    public final File f9590c;

    public p0(u0 u0Var, File file, int i10) {
        this.f9588a = i10;
        this.f9589b = u0Var;
        this.f9590c = file;
    }

    @Override
    public final void run() {
        switch (this.f9588a) {
            case 0:
                u0 u0Var = this.f9589b;
                if (u0Var.f9892c && u0Var.f9895r != null) {
                    MediaController.saveFile(this.f9590c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1), false);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f9589b;
                a8 a8Var = u0Var2.f9895r;
                File file = this.f9590c;
                a8Var.c(file);
                if (u0Var2.f9892c && u0Var2.f9895r != null) {
                    AndroidUtilities.runOnUIThread(new p0(u0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f9590c.getAbsolutePath();
                u0 u0Var3 = this.f9589b;
                MediaController.saveFile(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2), false);
                return;
        }
    }
}
