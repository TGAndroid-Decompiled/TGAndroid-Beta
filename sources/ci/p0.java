package ci;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class p0 implements Runnable {
    public final int f5676a;
    public final u0 f5677b;
    public final File f5678c;

    public p0(u0 u0Var, File file, int i10) {
        this.f5676a = i10;
        this.f5677b = u0Var;
        this.f5678c = file;
    }

    @Override
    public final void run() {
        switch (this.f5676a) {
            case 0:
                u0 u0Var = this.f5677b;
                if (u0Var.f6044c && u0Var.f6048r != null) {
                    MediaController.saveFile(this.f5678c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1), false);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f5677b;
                k8 k8Var = u0Var2.f6048r;
                File file = this.f5678c;
                k8Var.c(file);
                if (u0Var2.f6044c && u0Var2.f6048r != null) {
                    AndroidUtilities.runOnUIThread(new p0(u0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f5678c.getAbsolutePath();
                u0 u0Var3 = this.f5677b;
                MediaController.saveFile(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2), false);
                return;
        }
    }
}
