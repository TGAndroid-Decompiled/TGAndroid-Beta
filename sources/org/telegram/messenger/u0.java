package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
public final class u0 implements Runnable {
    public final int f25634a;
    public final m2.t f25635b;
    public final long f25636c;
    public final ge d;
    public final File f25637e;

    public u0(m2.t tVar, long j10, ge geVar, File file, int i3) {
        this.f25634a = i3;
        this.f25635b = tVar;
        this.f25636c = j10;
        this.d = geVar;
        this.f25637e = file;
    }

    @Override
    public final void run() {
        int i3 = this.f25634a;
        File file = this.f25637e;
        ge geVar = this.d;
        long j10 = this.f25636c;
        m2.t tVar = this.f25635b;
        switch (i3) {
            case 0:
                if (((HashSet) ((e0.g) tVar.f19007c).h).remove(Long.valueOf(j10))) {
                    z0.b(file);
                    MediaController mediaController = geVar.f22707a;
                    if (file.equals(mediaController.k1)) {
                        mediaController.k1 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                e0.g gVar = (e0.g) tVar.f19007c;
                if (!gVar.f9235c) {
                    ((HashSet) gVar.h).add(Long.valueOf(j10));
                    Set set = z0.f26694a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        z0.f26694a.add(absolutePath);
                    }
                    geVar.f22707a.k1 = file;
                    return;
                }
                return;
        }
    }
}
