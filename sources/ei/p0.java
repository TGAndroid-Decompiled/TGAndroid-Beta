package ei;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class p0 implements Runnable {
    public final int f9576a;
    public final u0 f9577b;
    public final File f9578c;

    public p0(u0 u0Var, File file, int i10) {
        this.f9576a = i10;
        this.f9577b = u0Var;
        this.f9578c = file;
    }

    @Override
    public final void run() {
        switch (this.f9576a) {
            case 0:
                u0 u0Var = this.f9577b;
                if (u0Var.f9878c && u0Var.f9881r != null) {
                    MediaController.saveFile(this.f9578c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1), false);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f9577b;
                a8 a8Var = u0Var2.f9881r;
                File file = this.f9578c;
                a8Var.c(file);
                if (u0Var2.f9878c && u0Var2.f9881r != null) {
                    AndroidUtilities.runOnUIThread(new p0(u0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f9578c.getAbsolutePath();
                u0 u0Var3 = this.f9577b;
                MediaController.saveFile(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2), false);
                return;
        }
    }
}
