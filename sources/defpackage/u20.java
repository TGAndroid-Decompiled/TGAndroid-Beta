package defpackage;

import java.io.File;
import java.util.Set;
import org.telegram.messenger.MediaController;
public final class u20 implements Runnable {
    public final byte a;
    public final lh2 b;
    public final long c;
    public final sn6 d;
    public final File e;

    public u20(lh2 lh2Var, long j, sn6 sn6Var, File file, byte b) {
        this.a = b;
        this.b = lh2Var;
        this.c = j;
        this.d = sn6Var;
        this.e = file;
    }

    @Override
    public final void run() {
        byte b = this.a;
        File file = this.e;
        sn6 sn6Var = this.d;
        long j = this.c;
        lh2 lh2Var = this.b;
        switch (b) {
            case 0:
                if (((v20) lh2Var.c).e.remove(Long.valueOf(j))) {
                    u60.b(file);
                    MediaController mediaController = sn6Var.a;
                    if (file.equals(mediaController.k1)) {
                        mediaController.k1 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                v20 v20Var = (v20) lh2Var.c;
                if (!v20Var.h) {
                    v20Var.e.add(Long.valueOf(j));
                    Set set = u60.a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        u60.a.add(absolutePath);
                    }
                    sn6Var.a.k1 = file;
                    return;
                }
                return;
        }
    }
}
