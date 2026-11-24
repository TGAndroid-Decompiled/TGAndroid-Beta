package defpackage;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.MediaController;
public final class t30 implements Runnable {
    public final byte a;
    public final lx6 b;
    public final long c;
    public final on6 d;
    public final File e;

    public t30(lx6 lx6Var, long j, on6 on6Var, File file, byte b) {
        this.a = b;
        this.b = lx6Var;
        this.c = j;
        this.d = on6Var;
        this.e = file;
    }

    @Override
    public final void run() {
        byte b = this.a;
        File file = this.e;
        on6 on6Var = this.d;
        long j = this.c;
        lx6 lx6Var = this.b;
        switch (b) {
            case 0:
                if (((HashSet) ((u30) lx6Var.c).h).remove(Long.valueOf(j))) {
                    s70.b(file);
                    MediaController mediaController = on6Var.a;
                    if (file.equals(mediaController.k1)) {
                        mediaController.k1 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                u30 u30Var = (u30) lx6Var.c;
                if (!u30Var.c) {
                    ((HashSet) u30Var.h).add(Long.valueOf(j));
                    Set set = s70.a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        s70.a.add(absolutePath);
                    }
                    on6Var.a.k1 = file;
                    return;
                }
                return;
        }
    }
}
