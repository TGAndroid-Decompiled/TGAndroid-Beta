package defpackage;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.q;
public final class gl9 implements Runnable {
    public final byte a = 1;
    public final ul9 b;
    public final ql9 c;
    public final long d;
    public final File e;
    public final boolean f;

    public gl9(ul9 ul9Var, ql9 ql9Var, long j, File file, boolean z) {
        this.b = ul9Var;
        this.c = ql9Var;
        this.d = j;
        this.e = file;
        this.f = z;
    }

    private final void a() {
        ul9 ul9Var = this.b;
        ql9 ql9Var = this.c;
        File file = this.e;
        long j = this.d;
        boolean z = this.f;
        synchronized (ul9Var.g) {
            if (!ul9Var.H && !ql9Var.d && !ql9Var.e) {
                ql9Var.e = true;
                ((lgb) ul9Var.e).b(ql9Var.a, file.length(), file);
                ul9Var.i.post(new gl9(ul9Var, ql9Var, j, file, z));
            }
        }
    }

    @Override
    public final void run() {
        kgb kgbVar;
        kgb kgbVar2;
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                ul9 ul9Var = this.b;
                ql9 ql9Var = this.c;
                long j = this.d;
                File file = this.e;
                boolean z = this.f;
                int i = ul9Var.a0;
                if (i != 10 && i != 9) {
                    ul9Var.x(8);
                    ul9Var.m.b("output completed: generation=" + ql9Var.a + ", durationMs=" + j + ", size=" + file.length() + ", hasAudio=" + z);
                    ul9Var.m("completed");
                    gi3 gi3Var = ul9Var.d;
                    long j2 = ql9Var.a;
                    q qVar = (q) gi3Var.a;
                    to5 to5Var = qVar.W;
                    if (to5Var != null) {
                        qVar.W = null;
                        qVar.m0 = true;
                        lgb lgbVar = qVar.U;
                        if (lgbVar == null) {
                            kgbVar2 = null;
                        } else {
                            synchronized (lgbVar) {
                                jgb jgbVar = (jgb) lgbVar.c.get(Long.valueOf(j2));
                                if (jgbVar != null && !jgbVar.e) {
                                    kgbVar = new kgb(Math.max(jgbVar.c, file.length()), jgbVar.f, jgbVar.g, jgbVar.h, jgbVar.i);
                                } else {
                                    kgbVar = new kgb(file.length(), null, null, null, null);
                                }
                            }
                            kgbVar2 = kgbVar;
                        }
                        oac i2 = qVar.i(file, j, kgbVar2);
                        i2.t = !z;
                        jm6 jm6Var = new jm6(0, file.getAbsolutePath(), 0, true, 0, 0);
                        jm6Var.x = to5Var.c;
                        jm6Var.y = to5Var.d;
                        qVar.f.G(jm6Var, i2, to5Var.a, to5Var.b, false, to5Var.e);
                        lgb lgbVar2 = qVar.U;
                        if (lgbVar2 != null) {
                            lgbVar2.d(false);
                        }
                        qVar.U = null;
                        MediaController.w().X(false);
                        if (qVar.b0) {
                            qVar.b0 = false;
                            qVar.Q = null;
                        }
                    }
                    if (ul9Var.G) {
                        ul9Var.s();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public gl9(ul9 ul9Var, ql9 ql9Var, File file, long j, boolean z) {
        this.b = ul9Var;
        this.c = ql9Var;
        this.e = file;
        this.d = j;
        this.f = z;
    }
}
