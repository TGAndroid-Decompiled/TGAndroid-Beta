package di;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class o0 implements Runnable {
    public final int f7494a;
    public final t0 f7495b;
    public final File f7496c;

    public o0(t0 t0Var, File file, int i10) {
        this.f7494a = i10;
        this.f7495b = t0Var;
        this.f7496c = file;
    }

    @Override
    public final void run() {
        switch (this.f7494a) {
            case 0:
                t0 t0Var = this.f7495b;
                if (t0Var.f7817c && t0Var.f7820r != null) {
                    MediaController.saveFile(this.f7496c.getAbsolutePath(), t0Var.getContext(), 1, null, null, new p0(t0Var, 1), false);
                    return;
                }
                return;
            case 1:
                t0 t0Var2 = this.f7495b;
                k8 k8Var = t0Var2.f7820r;
                File file = this.f7496c;
                k8Var.c(file);
                if (t0Var2.f7817c && t0Var2.f7820r != null) {
                    AndroidUtilities.runOnUIThread(new o0(t0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f7496c.getAbsolutePath();
                t0 t0Var3 = this.f7495b;
                MediaController.saveFile(absolutePath, t0Var3.getContext(), 0, null, null, new p0(t0Var3, 2), false);
                return;
        }
    }
}
