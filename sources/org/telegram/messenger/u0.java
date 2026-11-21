package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
public final class u0 implements Runnable {
    public final int f27131a;
    public final k8.a f27132b;
    public final long f27133c;
    public final ke d;
    public final File f27134e;

    public u0(k8.a aVar, long j3, ke keVar, File file, int i7) {
        this.f27131a = i7;
        this.f27132b = aVar;
        this.f27133c = j3;
        this.d = keVar;
        this.f27134e = file;
    }

    @Override
    public final void run() {
        int i7 = this.f27131a;
        File file = this.f27134e;
        ke keVar = this.d;
        long j3 = this.f27133c;
        k8.a aVar = this.f27132b;
        switch (i7) {
            case 0:
                if (((HashSet) ((e0.g) aVar.f18212c).h).remove(Long.valueOf(j3))) {
                    z0.b(file);
                    MediaController mediaController = keVar.f25051a;
                    if (file.equals(mediaController.f22747k1)) {
                        mediaController.f22747k1 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                e0.g gVar = (e0.g) aVar.f18212c;
                if (!gVar.f10233c) {
                    ((HashSet) gVar.h).add(Long.valueOf(j3));
                    Set set = z0.f28264a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        z0.f28264a.add(absolutePath);
                    }
                    keVar.f25051a.f22747k1 = file;
                    return;
                }
                return;
        }
    }
}
