package ei;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class p0 implements Runnable {
    public final int f9574a;
    public final u0 f9575b;
    public final File f9576c;

    public p0(u0 u0Var, File file, int i10) {
        this.f9574a = i10;
        this.f9575b = u0Var;
        this.f9576c = file;
    }

    @Override
    public final void run() {
        switch (this.f9574a) {
            case 0:
                u0 u0Var = this.f9575b;
                if (u0Var.f9876c && u0Var.f9879r != null) {
                    MediaController.saveFile(this.f9576c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1), false);
                    return;
                }
                return;
            case 1:
                u0 u0Var2 = this.f9575b;
                a8 a8Var = u0Var2.f9879r;
                File file = this.f9576c;
                a8Var.c(file);
                if (u0Var2.f9876c && u0Var2.f9879r != null) {
                    AndroidUtilities.runOnUIThread(new p0(u0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f9576c.getAbsolutePath();
                u0 u0Var3 = this.f9575b;
                MediaController.saveFile(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2), false);
                return;
        }
    }
}
