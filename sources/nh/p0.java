package nh;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class p0 implements Runnable {
    public final int f18327a;
    public final u0 f18328b;
    public final File f18329c;

    public p0(u0 u0Var, File file, int i10) {
        this.f18327a = i10;
        this.f18328b = u0Var;
        this.f18329c = file;
    }

    @Override
    public final void run() {
        switch (this.f18327a) {
            case 0:
                u0 u0Var = this.f18328b;
                if (u0Var.f18704c && u0Var.f18708r != null) {
                    MediaController.saveFile(this.f18329c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1), false);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f18328b;
                o7 o7Var = u0Var2.f18708r;
                File file = this.f18329c;
                o7Var.c(file);
                if (u0Var2.f18704c && u0Var2.f18708r != null) {
                    AndroidUtilities.runOnUIThread(new p0(u0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f18329c.getAbsolutePath();
                u0 u0Var3 = this.f18328b;
                MediaController.saveFile(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2), false);
                return;
        }
    }
}
