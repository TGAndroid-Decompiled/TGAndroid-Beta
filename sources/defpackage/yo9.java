package defpackage;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.q;
public final class yo9 implements Runnable {
    public final byte a = 1;
    public final jp9 b;
    public final fp9 c;
    public final long d;
    public final File e;
    public final boolean f;

    public yo9(jp9 jp9Var, fp9 fp9Var, long j, File file, boolean z) {
        this.b = jp9Var;
        this.c = fp9Var;
        this.d = j;
        this.e = file;
        this.f = z;
    }

    private final void a() {
        jp9 jp9Var = this.b;
        fp9 fp9Var = this.c;
        File file = this.e;
        long j = this.d;
        boolean z = this.f;
        synchronized (jp9Var.g) {
            if (!jp9Var.H && !fp9Var.d && !fp9Var.e) {
                fp9Var.e = true;
                ((hkb) jp9Var.e).b(fp9Var.a, file.length(), file);
                jp9Var.i.post(new yo9(jp9Var, fp9Var, j, file, z));
            }
        }
    }

    @Override
    public final void run() {
        gkb gkbVar;
        gkb gkbVar2;
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                jp9 jp9Var = this.b;
                fp9 fp9Var = this.c;
                long j = this.d;
                File file = this.e;
                boolean z = this.f;
                int i = jp9Var.a0;
                if (i != 10 && i != 9) {
                    jp9Var.x(8);
                    jp9Var.m.b("output completed: generation=" + fp9Var.a + ", durationMs=" + j + ", size=" + file.length() + ", hasAudio=" + z);
                    jp9Var.m("completed");
                    kj4 kj4Var = jp9Var.d;
                    long j2 = fp9Var.a;
                    q qVar = (q) kj4Var.b;
                    wq5 wq5Var = qVar.W;
                    if (wq5Var != null) {
                        qVar.W = null;
                        qVar.m0 = true;
                        hkb hkbVar = qVar.U;
                        if (hkbVar == null) {
                            gkbVar2 = null;
                        } else {
                            synchronized (hkbVar) {
                                fkb fkbVar = (fkb) hkbVar.c.get(Long.valueOf(j2));
                                if (fkbVar != null && !fkbVar.e) {
                                    gkbVar = new gkb(Math.max(fkbVar.c, file.length()), fkbVar.f, fkbVar.g, fkbVar.h, fkbVar.i);
                                } else {
                                    gkbVar = new gkb(file.length(), null, null, null, null);
                                }
                            }
                            gkbVar2 = gkbVar;
                        }
                        oec i2 = qVar.i(file, j, gkbVar2);
                        i2.t = !z;
                        no6 no6Var = new no6(0, file.getAbsolutePath(), 0, true, 0, 0);
                        no6Var.x = wq5Var.c;
                        no6Var.y = wq5Var.d;
                        qVar.f.G(no6Var, i2, wq5Var.a, wq5Var.b, false, wq5Var.e);
                        hkb hkbVar2 = qVar.U;
                        if (hkbVar2 != null) {
                            hkbVar2.d(false);
                        }
                        qVar.U = null;
                        MediaController.z().b0(false);
                        if (qVar.b0) {
                            qVar.b0 = false;
                            qVar.Q = null;
                        }
                    }
                    if (jp9Var.G) {
                        jp9Var.s();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public yo9(jp9 jp9Var, fp9 fp9Var, File file, long j, boolean z) {
        this.b = jp9Var;
        this.c = fp9Var;
        this.e = file;
        this.d = j;
        this.f = z;
    }
}
