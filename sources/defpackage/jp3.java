package defpackage;

import java.io.File;
import org.telegram.messenger.MediaController;
public final class jp3 implements Runnable {
    public final byte a;
    public final op3 b;
    public final File c;

    public jp3(op3 op3Var, File file, byte b) {
        this.a = b;
        this.b = op3Var;
        this.c = file;
    }

    @Override
    public final void run() {
        byte b = this.a;
        File file = this.c;
        op3 op3Var = this.b;
        switch (b) {
            case 0:
                if (op3Var.c && op3Var.r != null) {
                    MediaController.d0(file.getAbsolutePath(), op3Var.getContext(), 1, null, null, new kp3(op3Var, (byte) 1));
                    return;
                }
                return;
            case 1:
                op3Var.r.c(file);
                if (op3Var.c && op3Var.r != null) {
                    gl.c3(new jp3(op3Var, file, (byte) 2));
                    return;
                }
                return;
            default:
                MediaController.d0(file.getAbsolutePath(), op3Var.getContext(), 0, null, null, new kp3(op3Var, (byte) 2));
                return;
        }
    }
}
