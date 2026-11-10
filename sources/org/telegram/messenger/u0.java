package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
public final class u0 implements Runnable {
    public final int f25716a;
    public final m4.d0 f25717b;
    public final long f25718c;
    public final me d;
    public final File f25719e;

    public u0(m4.d0 d0Var, long j3, me meVar, File file, int i7) {
        this.f25716a = i7;
        this.f25717b = d0Var;
        this.f25718c = j3;
        this.d = meVar;
        this.f25719e = file;
    }

    @Override
    public final void run() {
        int i7 = this.f25716a;
        File file = this.f25719e;
        me meVar = this.d;
        long j3 = this.f25718c;
        m4.d0 d0Var = this.f25717b;
        switch (i7) {
            case 0:
                if (((HashSet) ((e0.g) d0Var.f19617b).h).remove(Long.valueOf(j3))) {
                    z0.b(file);
                    MediaController mediaController = meVar.f24015a;
                    if (file.equals(mediaController.f21279j1)) {
                        mediaController.f21279j1 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                e0.g gVar = (e0.g) d0Var.f19617b;
                if (!gVar.f10058c) {
                    ((HashSet) gVar.h).add(Long.valueOf(j3));
                    Set set = z0.f26794a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        z0.f26794a.add(absolutePath);
                    }
                    meVar.f24015a.f21279j1 = file;
                    return;
                }
                return;
        }
    }
}
