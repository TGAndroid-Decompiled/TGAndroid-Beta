package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
public final class u0 implements Runnable {
    public final int f26765a;
    public final k8.a f26766b;
    public final long f26767c;
    public final le d;
    public final File f26768e;

    public u0(k8.a aVar, long j3, le leVar, File file, int i7) {
        this.f26765a = i7;
        this.f26766b = aVar;
        this.f26767c = j3;
        this.d = leVar;
        this.f26768e = file;
    }

    @Override
    public final void run() {
        int i7 = this.f26765a;
        File file = this.f26768e;
        le leVar = this.d;
        long j3 = this.f26767c;
        k8.a aVar = this.f26766b;
        switch (i7) {
            case 0:
                if (((HashSet) ((e0.g) aVar.f17789c).h).remove(Long.valueOf(j3))) {
                    z0.b(file);
                    MediaController mediaController = leVar.f24829a;
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
                    Set set = z0.f27868a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        z0.f27868a.add(absolutePath);
                    }
                    leVar.f24829a.f22356k1 = file;
                    return;
                }
                return;
        }
    }
}
