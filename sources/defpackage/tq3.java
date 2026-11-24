package defpackage;

import java.io.File;
import org.telegram.messenger.MediaController;
public final class tq3 implements Runnable {
    public final byte a;
    public final yq3 b;
    public final File c;

    public tq3(yq3 yq3Var, File file, byte b) {
        this.a = b;
        this.b = yq3Var;
        this.c = file;
    }

    @Override
    public final void run() {
        byte b = this.a;
        File file = this.c;
        yq3 yq3Var = this.b;
        switch (b) {
            case 0:
                if (yq3Var.c && yq3Var.r != null) {
                    MediaController.d0(file.getAbsolutePath(), yq3Var.getContext(), 1, null, null, new uq3(yq3Var, (byte) 1));
                    return;
                }
                return;
            case 1:
                yq3Var.r.c(file);
                if (yq3Var.c && yq3Var.r != null) {
                    gm.c3(new tq3(yq3Var, file, (byte) 2));
                    return;
                }
                return;
            default:
                MediaController.d0(file.getAbsolutePath(), yq3Var.getContext(), 0, null, null, new uq3(yq3Var, (byte) 2));
                return;
        }
    }
}
