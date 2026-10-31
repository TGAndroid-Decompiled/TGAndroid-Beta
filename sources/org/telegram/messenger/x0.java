package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
public final class x0 implements Runnable {
    public final int f19167a;
    public final m4.c f19168b;
    public final long f19169c;
    public final me d;
    public final File e;

    public x0(m4.c cVar, long j10, me meVar, File file, int i10) {
        this.f19167a = i10;
        this.f19168b = cVar;
        this.f19169c = j10;
        this.d = meVar;
        this.e = file;
    }

    @Override
    public final void run() {
        int i10 = this.f19167a;
        File file = this.e;
        me meVar = this.d;
        long j10 = this.f19169c;
        m4.c cVar = this.f19168b;
        switch (i10) {
            case 0:
                if (((HashSet) ((e0.h) cVar.f12706c).h).remove(Long.valueOf(j10))) {
                    c1.b(file);
                    MediaController mediaController = meVar.f16945a;
                    if (file.equals(mediaController.f14458i1)) {
                        mediaController.f14458i1 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                e0.h hVar = (e0.h) cVar.f12706c;
                if (!hVar.f6021c) {
                    ((HashSet) hVar.h).add(Long.valueOf(j10));
                    Set set = c1.f14889a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        c1.f14889a.add(absolutePath);
                    }
                    meVar.f16945a.f14458i1 = file;
                    return;
                }
                return;
        }
    }
}
