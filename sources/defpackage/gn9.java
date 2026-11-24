package defpackage;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.q;
public final class gn9 implements Runnable {
    public final byte a = 1;
    public final un9 b;
    public final qn9 c;
    public final long d;
    public final File e;
    public final boolean f;

    public gn9(un9 un9Var, qn9 qn9Var, long j, File file, boolean z) {
        this.b = un9Var;
        this.c = qn9Var;
        this.d = j;
        this.e = file;
        this.f = z;
    }

    private final void a() {
        un9 un9Var = this.b;
        qn9 qn9Var = this.c;
        File file = this.e;
        long j = this.d;
        boolean z = this.f;
        synchronized (un9Var.g) {
            if (!un9Var.H && !qn9Var.d && !qn9Var.e) {
                qn9Var.e = true;
                ((mib) un9Var.e).b(qn9Var.a, file.length(), file);
                un9Var.i.post(new gn9(un9Var, qn9Var, j, file, z));
            }
        }
    }

    @Override
    public final void run() {
        lib libVar;
        lib libVar2;
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                un9 un9Var = this.b;
                qn9 qn9Var = this.c;
                long j = this.d;
                File file = this.e;
                boolean z = this.f;
                int i = un9Var.a0;
                if (i != 10 && i != 9) {
                    un9Var.x(8);
                    un9Var.m.b("output completed: generation=" + qn9Var.a + ", durationMs=" + j + ", size=" + file.length() + ", hasAudio=" + z);
                    un9Var.m("completed");
                    lj4 lj4Var = un9Var.d;
                    long j2 = qn9Var.a;
                    q qVar = (q) lj4Var.a;
                    tq5 tq5Var = qVar.W;
                    if (tq5Var != null) {
                        qVar.W = null;
                        qVar.m0 = true;
                        mib mibVar = qVar.U;
                        if (mibVar == null) {
                            libVar2 = null;
                        } else {
                            synchronized (mibVar) {
                                kib kibVar = (kib) mibVar.c.get(Long.valueOf(j2));
                                if (kibVar != null && !kibVar.e) {
                                    libVar = new lib(Math.max(kibVar.c, file.length()), kibVar.f, kibVar.g, kibVar.h, kibVar.i);
                                } else {
                                    libVar = new lib(file.length(), null, null, null, null);
                                }
                            }
                            libVar2 = libVar;
                        }
                        rcc i2 = qVar.i(file, j, libVar2);
                        i2.t = !z;
                        jo6 jo6Var = new jo6(0, file.getAbsolutePath(), 0, true, 0, 0);
                        jo6Var.x = tq5Var.c;
                        jo6Var.y = tq5Var.d;
                        qVar.f.G(jo6Var, i2, tq5Var.a, tq5Var.b, false, tq5Var.e);
                        mib mibVar2 = qVar.U;
                        if (mibVar2 != null) {
                            mibVar2.d(false);
                        }
                        qVar.U = null;
                        MediaController.w().X(false);
                        if (qVar.b0) {
                            qVar.b0 = false;
                            qVar.Q = null;
                        }
                    }
                    if (un9Var.G) {
                        un9Var.s();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public gn9(un9 un9Var, qn9 qn9Var, File file, long j, boolean z) {
        this.b = un9Var;
        this.c = qn9Var;
        this.e = file;
        this.d = j;
        this.f = z;
    }
}
