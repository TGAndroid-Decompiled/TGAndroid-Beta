package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
public final class u0 implements Runnable {
    public final int f26763a;
    public final k8.a f26764b;
    public final long f26765c;
    public final le d;
    public final File f26766e;

    public u0(k8.a aVar, long j3, le leVar, File file, int i7) {
        this.f26763a = i7;
        this.f26764b = aVar;
        this.f26765c = j3;
        this.d = leVar;
        this.f26766e = file;
    }

    @Override
    public final void run() {
        int i7 = this.f26763a;
        File file = this.f26766e;
        le leVar = this.d;
        long j3 = this.f26765c;
        k8.a aVar = this.f26764b;
        switch (i7) {
            case 0:
                if (((HashSet) ((e0.g) aVar.f17789c).h).remove(Long.valueOf(j3))) {
                    z0.b(file);
                    MediaController mediaController = leVar.f24823a;
                    if (file.equals(mediaController.f22356k1)) {
                        mediaController.f22356k1 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                e0.g gVar = (e0.g) aVar.f17789c;
                if (!gVar.f9889c) {
                    ((HashSet) gVar.h).add(Long.valueOf(j3));
                    Set set = z0.f27858a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        z0.f27858a.add(absolutePath);
                    }
                    leVar.f24823a.f22356k1 = file;
                    return;
                }
                return;
        }
    }
}
