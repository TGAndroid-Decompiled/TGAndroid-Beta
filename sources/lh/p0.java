package lh;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

public final class p0 implements Runnable {

    public final int f16500a;

    public final u0 f16501b;

    public final File f16502c;

    public p0(u0 u0Var, File file, int i10) {
        this.f16500a = i10;
        this.f16501b = u0Var;
        this.f16502c = file;
    }

    @Override
    public final void run() {
        switch (this.f16500a) {
            case 0:
                u0 u0Var = this.f16501b;
                if (u0Var.f16888c && u0Var.f16892r != null) {
                    MediaController.saveFile(this.f16502c.getAbsolutePath(), u0Var.getContext(), 1, null, null, new q0(u0Var, 1), false);
                    break;
                }
                break;
            case 1:
                u0 u0Var2 = this.f16501b;
                z7 z7Var = u0Var2.f16892r;
                File file = this.f16502c;
                z7Var.c(file);
                if (u0Var2.f16888c && u0Var2.f16892r != null) {
                    AndroidUtilities.runOnUIThread(new p0(u0Var2, file, 2));
                    break;
                }
                break;
            default:
                String absolutePath = this.f16502c.getAbsolutePath();
                u0 u0Var3 = this.f16501b;
                MediaController.saveFile(absolutePath, u0Var3.getContext(), 0, null, null, new q0(u0Var3, 2), false);
                break;
        }
    }
}
