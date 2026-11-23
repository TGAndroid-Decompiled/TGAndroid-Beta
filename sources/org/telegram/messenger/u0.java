package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
public final class u0 implements Runnable {
    public final int f27140a;
    public final k8.a f27141b;
    public final long f27142c;
    public final le d;
    public final File f27143e;

    public u0(k8.a aVar, long j3, le leVar, File file, int i7) {
        this.f27140a = i7;
        this.f27141b = aVar;
        this.f27142c = j3;
        this.d = leVar;
        this.f27143e = file;
    }

    @Override
    public final void run() {
        int i7 = this.f27140a;
        File file = this.f27143e;
        le leVar = this.d;
        long j3 = this.f27142c;
        k8.a aVar = this.f27141b;
        switch (i7) {
            case 0:
                if (((HashSet) ((e0.g) aVar.f18215c).h).remove(Long.valueOf(j3))) {
                    z0.b(file);
                    MediaController mediaController = leVar.f25217a;
                    if (file.equals(mediaController.f22750k1)) {
                        mediaController.f22750k1 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                e0.g gVar = (e0.g) aVar.f18215c;
                if (!gVar.f10236c) {
                    ((HashSet) gVar.h).add(Long.valueOf(j3));
                    Set set = z0.f28275a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        z0.f28275a.add(absolutePath);
                    }
                    leVar.f25217a.f22750k1 = file;
                    return;
                }
                return;
        }
    }
}
