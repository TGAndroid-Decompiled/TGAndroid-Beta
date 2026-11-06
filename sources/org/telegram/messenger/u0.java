package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
public final class u0 implements Runnable {
    public final int f25708a;
    public final m4.d0 f25709b;
    public final long f25710c;
    public final me d;
    public final File f25711e;

    public u0(m4.d0 d0Var, long j3, me meVar, File file, int i7) {
        this.f25708a = i7;
        this.f25709b = d0Var;
        this.f25710c = j3;
        this.d = meVar;
        this.f25711e = file;
    }

    @Override
    public final void run() {
        int i7 = this.f25708a;
        File file = this.f25711e;
        me meVar = this.d;
        long j3 = this.f25710c;
        m4.d0 d0Var = this.f25709b;
        switch (i7) {
            case 0:
                if (((HashSet) ((e0.g) d0Var.f19609b).h).remove(Long.valueOf(j3))) {
                    z0.b(file);
                    MediaController mediaController = meVar.f24006a;
                    if (file.equals(mediaController.f21271j1)) {
                        mediaController.f21271j1 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                e0.g gVar = (e0.g) d0Var.f19609b;
                if (!gVar.f10053c) {
                    ((HashSet) gVar.h).add(Long.valueOf(j3));
                    Set set = z0.f26769a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        z0.f26769a.add(absolutePath);
                    }
                    meVar.f24006a.f21271j1 = file;
                    return;
                }
                return;
        }
    }
}
