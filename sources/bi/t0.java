package bi;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class t0 implements Runnable {
    public final int f3665a;
    public final y0 f3666b;
    public final File f3667c;

    public t0(y0 y0Var, File file, int i10) {
        this.f3665a = i10;
        this.f3666b = y0Var;
        this.f3667c = file;
    }

    @Override
    public final void run() {
        switch (this.f3665a) {
            case 0:
                y0 y0Var = this.f3666b;
                if (y0Var.f3955c && y0Var.f3958r != null) {
                    MediaController.saveFile(this.f3667c.getAbsolutePath(), y0Var.getContext(), 1, null, null, new u0(y0Var, 1), false);
                    return;
                }
                return;
            case 1:
                y0 y0Var2 = this.f3666b;
                r9 r9Var = y0Var2.f3958r;
                File file = this.f3667c;
                r9Var.c(file);
                if (y0Var2.f3955c && y0Var2.f3958r != null) {
                    AndroidUtilities.runOnUIThread(new t0(y0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f3667c.getAbsolutePath();
                y0 y0Var3 = this.f3666b;
                MediaController.saveFile(absolutePath, y0Var3.getContext(), 0, null, null, new u0(y0Var3, 2), false);
                return;
        }
    }
}
