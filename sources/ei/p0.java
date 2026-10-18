package ei;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class p0 implements Runnable {
    public final int f9575a;
    public final u0 f9576b;
    public final File f9577c;

    public p0(u0 u0Var, File file, int i10) {
        this.f9575a = i10;
        this.f9576b = u0Var;
        this.f9577c = file;
    }

    @Override
    public final void run() {
        switch (this.f9575a) {
            case 0:
                u0 u0Var = this.f9576b;
                if (u0Var.f9877c && u0Var.f9880r != null) {
                    MediaController.saveFile(this.f9577c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1), false);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f9576b;
                a8 a8Var = u0Var2.f9880r;
                File file = this.f9577c;
                a8Var.c(file);
                if (u0Var2.f9877c && u0Var2.f9880r != null) {
                    AndroidUtilities.runOnUIThread(new p0(u0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f9577c.getAbsolutePath();
                u0 u0Var3 = this.f9576b;
                MediaController.saveFile(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2), false);
                return;
        }
    }
}
