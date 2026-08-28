package kh;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class q0 implements Runnable {
    public final int f15851a;
    public final v0 f15852b;
    public final File f15853c;

    public q0(v0 v0Var, File file, int i9) {
        this.f15851a = i9;
        this.f15852b = v0Var;
        this.f15853c = file;
    }

    @Override
    public final void run() {
        switch (this.f15851a) {
            case 0:
                v0 v0Var = this.f15852b;
                if (v0Var.f16184c && v0Var.f16188r != null) {
                    MediaController.saveFile(this.f15853c.getAbsolutePath(), v0Var.getContext(), 1, null, null, new r0(v0Var, 1), false);
                    return;
                }
                return;
            case 1:
                v0 v0Var2 = this.f15852b;
                a8 a8Var = v0Var2.f16188r;
                File file = this.f15853c;
                a8Var.c(file);
                if (v0Var2.f16184c && v0Var2.f16188r != null) {
                    AndroidUtilities.runOnUIThread(new q0(v0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f15853c.getAbsolutePath();
                v0 v0Var3 = this.f15852b;
                MediaController.saveFile(absolutePath, v0Var3.getContext(), 0, null, null, new r0(v0Var3, 2), false);
                return;
        }
    }
}
