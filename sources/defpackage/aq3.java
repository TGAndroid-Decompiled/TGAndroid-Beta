package defpackage;

import java.io.File;
import org.telegram.messenger.MediaController;
public final class aq3 implements Runnable {
    public final byte a;
    public final fq3 b;
    public final File c;

    public aq3(fq3 fq3Var, File file, byte b) {
        this.a = b;
        this.b = fq3Var;
        this.c = file;
    }

    @Override
    public final void run() {
        byte b = this.a;
        File file = this.c;
        fq3 fq3Var = this.b;
        switch (b) {
            case 0:
                if (fq3Var.c && fq3Var.r != null) {
                    MediaController.g0(file.getAbsolutePath(), fq3Var.getContext(), 1, null, null, new bq3(fq3Var, (byte) 1));
                    return;
                }
                return;
            case 1:
                fq3Var.r.c(file);
                if (fq3Var.c && fq3Var.r != null) {
                    hl.c3(new aq3(fq3Var, file, (byte) 2));
                    return;
                }
                return;
            default:
                MediaController.g0(file.getAbsolutePath(), fq3Var.getContext(), 0, null, null, new bq3(fq3Var, (byte) 2));
                return;
        }
    }
}
