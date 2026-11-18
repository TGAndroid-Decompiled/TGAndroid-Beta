package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
public final class u0 implements Runnable {
    public final int f27103a;
    public final k8.a f27104b;
    public final long f27105c;
    public final ke d;
    public final File f27106e;

    public u0(k8.a aVar, long j3, ke keVar, File file, int i7) {
        this.f27103a = i7;
        this.f27104b = aVar;
        this.f27105c = j3;
        this.d = keVar;
        this.f27106e = file;
    }

    @Override
    public final void run() {
        int i7 = this.f27103a;
        File file = this.f27106e;
        ke keVar = this.d;
        long j3 = this.f27105c;
        k8.a aVar = this.f27104b;
        switch (i7) {
            case 0:
                if (((HashSet) ((e0.g) aVar.f18181c).h).remove(Long.valueOf(j3))) {
                    z0.b(file);
                    MediaController mediaController = keVar.f25023a;
                    if (file.equals(mediaController.f22719k1)) {
                        mediaController.f22719k1 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                e0.g gVar = (e0.g) aVar.f18181c;
                if (!gVar.f10204c) {
                    ((HashSet) gVar.h).add(Long.valueOf(j3));
                    Set set = z0.f28236a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        z0.f28236a.add(absolutePath);
                    }
                    keVar.f25023a.f22719k1 = file;
                    return;
                }
                return;
        }
    }
}
