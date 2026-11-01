package org.telegram.messenger;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
public final class x0 implements Runnable {
    public final int f19366a;
    public final m4.c f19367b;
    public final long f19368c;
    public final ne d;
    public final File e;

    public x0(m4.c cVar, long j10, ne neVar, File file, int i10) {
        this.f19366a = i10;
        this.f19367b = cVar;
        this.f19368c = j10;
        this.d = neVar;
        this.e = file;
    }

    @Override
    public final void run() {
        int i10 = this.f19366a;
        File file = this.e;
        ne neVar = this.d;
        long j10 = this.f19368c;
        m4.c cVar = this.f19367b;
        switch (i10) {
            case 0:
                if (((HashSet) ((e0.h) cVar.f12707c).h).remove(Long.valueOf(j10))) {
                    c1.b(file);
                    MediaController mediaController = neVar.f17287a;
                    if (file.equals(mediaController.f14459i1)) {
                        mediaController.f14459i1 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                e0.h hVar = (e0.h) cVar.f12707c;
                if (!hVar.f6021c) {
                    ((HashSet) hVar.h).add(Long.valueOf(j10));
                    Set set = c1.f15048a;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        c1.f15048a.add(absolutePath);
                    }
                    neVar.f17287a.f14459i1 = file;
                    return;
                }
                return;
        }
    }
}
