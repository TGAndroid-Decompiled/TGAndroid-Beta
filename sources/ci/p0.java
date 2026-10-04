package ci;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class p0 implements Runnable {
    public final int f5677a;
    public final u0 f5678b;
    public final File f5679c;

    public p0(u0 u0Var, File file, int i10) {
        this.f5677a = i10;
        this.f5678b = u0Var;
        this.f5679c = file;
    }

    @Override
    public final void run() {
        switch (this.f5677a) {
            case 0:
                u0 u0Var = this.f5678b;
                if (u0Var.f6045c && u0Var.f6049r != null) {
                    MediaController.saveFile(this.f5679c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1), false);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f5678b;
                k8 k8Var = u0Var2.f6049r;
                File file = this.f5679c;
                k8Var.c(file);
                if (u0Var2.f6045c && u0Var2.f6049r != null) {
                    AndroidUtilities.runOnUIThread(new p0(u0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f5679c.getAbsolutePath();
                u0 u0Var3 = this.f5678b;
                MediaController.saveFile(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2), false);
                return;
        }
    }
}
