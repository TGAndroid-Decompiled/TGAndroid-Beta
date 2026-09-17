package ci;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class p0 implements Runnable {
    public final int f5291a;
    public final u0 f5292b;
    public final File f5293c;

    public p0(u0 u0Var, File file, int i10) {
        this.f5291a = i10;
        this.f5292b = u0Var;
        this.f5293c = file;
    }

    @Override
    public final void run() {
        switch (this.f5291a) {
            case 0:
                u0 u0Var = this.f5292b;
                if (u0Var.f5593c && u0Var.f5596r != null) {
                    MediaController.saveFile(this.f5293c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1), false);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f5292b;
                o8 o8Var = u0Var2.f5596r;
                File file = this.f5293c;
                o8Var.c(file);
                if (u0Var2.f5593c && u0Var2.f5596r != null) {
                    AndroidUtilities.runOnUIThread(new p0(u0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f5293c.getAbsolutePath();
                u0 u0Var3 = this.f5292b;
                MediaController.saveFile(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2), false);
                return;
        }
    }
}
