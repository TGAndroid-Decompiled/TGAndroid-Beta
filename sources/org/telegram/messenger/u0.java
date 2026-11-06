package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
public final class u0 implements Runnable {
    public final int f25700a;
    public final m4.d0 f25701b;
    public final long f25702c;
    public final me d;
    public final File f25703e;

    public u0(m4.d0 d0Var, long j3, me meVar, File file, int i7) {
        this.f25700a = i7;
        this.f25701b = d0Var;
        this.f25702c = j3;
        this.d = meVar;
        this.f25703e = file;
    }

    @Override
    public final void run() {
        int i7 = this.f25700a;
        File file = this.f25703e;
        me meVar = this.d;
        long j3 = this.f25702c;
        m4.d0 d0Var = this.f25701b;
        switch (i7) {
            case 0:
                if (((HashSet) ((e0.g) d0Var.f19609b).h).remove(Long.valueOf(j3))) {
                    z0.b(file);
                    MediaController mediaController = meVar.f23999a;
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
                    meVar.f23999a.f21271j1 = file;
                    return;
                }
                return;
        }
    }
}
