package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
public final class u0 implements Runnable {
    public final int f27200a;
    public final jb.m f27201b;
    public final long f27202c;
    public final ke d;
    public final File f27203e;

    public u0(jb.m mVar, long j3, ke keVar, File file, int i7) {
        this.f27200a = i7;
        this.f27201b = mVar;
        this.f27202c = j3;
        this.d = keVar;
        this.f27203e = file;
    }

    @Override
    public final void run() {
        int i7 = this.f27200a;
        File file = this.f27203e;
        ke keVar = this.d;
        long j3 = this.f27202c;
        jb.m mVar = this.f27201b;
        switch (i7) {
            case 0:
                if (((HashSet) ((e0.g) mVar.f17465c).h).remove(Long.valueOf(j3))) {
                    z0.b(file);
                    MediaController mediaController = keVar.f25122a;
                    if (file.equals(mediaController.f22817k1)) {
                        mediaController.f22817k1 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                e0.g gVar = (e0.g) mVar.f17465c;
                if (!gVar.f10197c) {
                    ((HashSet) gVar.h).add(Long.valueOf(j3));
                    Set set = z0.f28337a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        z0.f28337a.add(absolutePath);
                    }
                    keVar.f25122a.f22817k1 = file;
                    return;
                }
                return;
        }
    }
}
