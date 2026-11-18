package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
public final class u0 implements Runnable {
    public final int f27105a;
    public final k8.a f27106b;
    public final long f27107c;
    public final ke d;
    public final File f27108e;

    public u0(k8.a aVar, long j3, ke keVar, File file, int i7) {
        this.f27105a = i7;
        this.f27106b = aVar;
        this.f27107c = j3;
        this.d = keVar;
        this.f27108e = file;
    }

    @Override
    public final void run() {
        int i7 = this.f27105a;
        File file = this.f27108e;
        ke keVar = this.d;
        long j3 = this.f27107c;
        k8.a aVar = this.f27106b;
        switch (i7) {
            case 0:
                if (((HashSet) ((e0.g) aVar.f18184c).h).remove(Long.valueOf(j3))) {
                    z0.b(file);
                    MediaController mediaController = keVar.f25026a;
                    if (file.equals(mediaController.f22722k1)) {
                        mediaController.f22722k1 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                e0.g gVar = (e0.g) aVar.f18184c;
                if (!gVar.f10207c) {
                    ((HashSet) gVar.h).add(Long.valueOf(j3));
                    Set set = z0.f28238a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        z0.f28238a.add(absolutePath);
                    }
                    keVar.f25026a.f22722k1 = file;
                    return;
                }
                return;
        }
    }
}
