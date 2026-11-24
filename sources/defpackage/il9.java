package defpackage;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
public final class il9 implements Runnable {
    public final byte a;
    public final ul9 b;

    public il9(ul9 ul9Var, byte b) {
        this.a = b;
        this.b = ul9Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                ul9 ul9Var = this.b;
                if (ul9Var.a0 == 3) {
                    ul9Var.q();
                    return;
                }
                return;
            case 1:
                ul9 ul9Var2 = this.b;
                nk9 nk9Var = ul9Var2.U;
                File file = ul9Var2.V;
                if (nk9Var != null) {
                    try {
                        synchronized (nk9Var) {
                            nk9Var.w = true;
                            try {
                                nk9Var.g();
                            } finally {
                                nk9Var.w = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    cte.c(nk9Var.a);
                }
                if (file != null) {
                    cte.c(file);
                    return;
                }
                return;
            case 2:
                ul9 ul9Var3 = this.b;
                int i = ul9Var3.a0;
                if (i == 2 || i == 6) {
                    ul9Var3.J = SystemClock.elapsedRealtime();
                    ek9 ek9Var = ul9Var3.m;
                    ek9Var.b("recording started: retainedDurationMs=" + ul9Var3.I);
                    ul9Var3.x(3);
                    long j = ((long) ul9Var3.q) - ul9Var3.I;
                    if (j > 0 && !ul9Var3.D) {
                        ul9Var3.i.postDelayed(ul9Var3.X, j);
                        return;
                    }
                    ul9Var3.D = false;
                    ul9Var3.q();
                    return;
                }
                return;
            default:
                ul9 ul9Var4 = this.b;
                ul9Var4.E = false;
                ek9 ek9Var2 = ul9Var4.m;
                ek9Var2.b("recording segment stopped: state=" + de9.A(ul9Var4.a0) + ", retainedDurationMs=" + ul9Var4.I);
                if (ul9Var4.C) {
                    ul9Var4.C = false;
                    ul9Var4.i();
                    return;
                } else if (ul9Var4.A) {
                    ul9Var4.A = false;
                    boolean z = ul9Var4.B;
                    ul9Var4.j.execute(new d97(ul9Var4, ul9Var4.U, z, ul9Var4.T, (byte) 11));
                    return;
                } else if (ul9Var4.a0 == 4) {
                    try {
                        File d = ul9Var4.d("round_video_preview_");
                        ul9Var4.V = d;
                        ul9Var4.N = System.nanoTime();
                        ek9 ek9Var3 = ul9Var4.m;
                        ek9Var3.b("preview snapshot started: file=" + d.getName());
                        ul9Var4.j.execute(new gm8(ul9Var4, ul9Var4.U, d, (byte) 17));
                        return;
                    } catch (IOException e) {
                        ul9Var4.h(e);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
