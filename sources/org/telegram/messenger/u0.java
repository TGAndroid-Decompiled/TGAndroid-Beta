package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
public final class u0 implements Runnable {
    public final int f25712a;
    public final m4.d0 f25713b;
    public final long f25714c;
    public final me d;
    public final File f25715e;

    public u0(m4.d0 d0Var, long j3, me meVar, File file, int i7) {
        this.f25712a = i7;
        this.f25713b = d0Var;
        this.f25714c = j3;
        this.d = meVar;
        this.f25715e = file;
    }

    @Override
    public final void run() {
        int i7 = this.f25712a;
        File file = this.f25715e;
        me meVar = this.d;
        long j3 = this.f25714c;
        m4.d0 d0Var = this.f25713b;
        switch (i7) {
            case 0:
                if (((HashSet) ((e0.g) d0Var.f19612b).h).remove(Long.valueOf(j3))) {
                    z0.b(file);
                    MediaController mediaController = meVar.f24011a;
                    if (file.equals(mediaController.f21274j1)) {
                        mediaController.f21274j1 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                e0.g gVar = (e0.g) d0Var.f19612b;
                if (!gVar.f10053c) {
                    ((HashSet) gVar.h).add(Long.valueOf(j3));
                    Set set = z0.f26790a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        z0.f26790a.add(absolutePath);
                    }
                    meVar.f24011a.f21274j1 = file;
                    return;
                }
                return;
        }
    }
}
