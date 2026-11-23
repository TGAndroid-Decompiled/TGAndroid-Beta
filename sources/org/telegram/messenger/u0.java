package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
public final class u0 implements Runnable {
    public final int f27104a;
    public final k8.a f27105b;
    public final long f27106c;
    public final le d;
    public final File f27107e;

    public u0(k8.a aVar, long j3, le leVar, File file, int i7) {
        this.f27104a = i7;
        this.f27105b = aVar;
        this.f27106c = j3;
        this.d = leVar;
        this.f27107e = file;
    }

    @Override
    public final void run() {
        int i7 = this.f27104a;
        File file = this.f27107e;
        le leVar = this.d;
        long j3 = this.f27106c;
        k8.a aVar = this.f27105b;
        switch (i7) {
            case 0:
                if (((HashSet) ((e0.g) aVar.f18178c).h).remove(Long.valueOf(j3))) {
                    z0.b(file);
                    MediaController mediaController = leVar.f25181a;
                    if (file.equals(mediaController.f22714k1)) {
                        mediaController.f22714k1 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                e0.g gVar = (e0.g) aVar.f18178c;
                if (!gVar.f10199c) {
                    ((HashSet) gVar.h).add(Long.valueOf(j3));
                    Set set = z0.f28239a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        z0.f28239a.add(absolutePath);
                    }
                    leVar.f25181a.f22714k1 = file;
                    return;
                }
                return;
        }
    }
}
