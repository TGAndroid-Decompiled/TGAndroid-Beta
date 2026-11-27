package defpackage;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
public final class uo9 implements Runnable {
    public final byte a;
    public final jp9 b;

    public uo9(jp9 jp9Var, byte b) {
        this.a = b;
        this.b = jp9Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                jp9 jp9Var = this.b;
                bo9 bo9Var = jp9Var.U;
                File file = jp9Var.V;
                if (bo9Var != null) {
                    try {
                        synchronized (bo9Var) {
                            bo9Var.w = true;
                            bo9Var.g();
                            bo9Var.w = false;
                        }
                    } catch (IOException unused) {
                    }
                    uxe.c(bo9Var.a);
                }
                if (file != null) {
                    uxe.c(file);
                    return;
                }
                return;
            case 1:
                jp9 jp9Var2 = this.b;
                if (jp9Var2.a0 == 3) {
                    jp9Var2.q();
                    return;
                }
                return;
            case 2:
                jp9 jp9Var3 = this.b;
                int i = jp9Var3.a0;
                if (i == 2 || i == 6) {
                    jp9Var3.J = SystemClock.elapsedRealtime();
                    sn9 sn9Var = jp9Var3.m;
                    sn9Var.b("recording started: retainedDurationMs=" + jp9Var3.I);
                    jp9Var3.x(3);
                    long j = ((long) jp9Var3.q) - jp9Var3.I;
                    if (j > 0 && !jp9Var3.D) {
                        jp9Var3.i.postDelayed(jp9Var3.X, j);
                        return;
                    }
                    jp9Var3.D = false;
                    jp9Var3.q();
                    return;
                }
                return;
            default:
                jp9 jp9Var4 = this.b;
                jp9Var4.E = false;
                sn9 sn9Var2 = jp9Var4.m;
                sn9Var2.b("recording segment stopped: state=" + uh9.A(jp9Var4.a0) + ", retainedDurationMs=" + jp9Var4.I);
                if (jp9Var4.C) {
                    jp9Var4.C = false;
                    jp9Var4.i();
                    return;
                } else if (jp9Var4.A) {
                    jp9Var4.A = false;
                    boolean z = jp9Var4.B;
                    jp9Var4.j.execute(new lb7(jp9Var4, jp9Var4.U, z, jp9Var4.T, (byte) 11));
                    return;
                } else if (jp9Var4.a0 == 4) {
                    try {
                        File d = jp9Var4.d("round_video_preview_");
                        jp9Var4.V = d;
                        jp9Var4.N = System.nanoTime();
                        sn9 sn9Var3 = jp9Var4.m;
                        sn9Var3.b("preview snapshot started: file=" + d.getName());
                        jp9Var4.j.execute(new sa8(jp9Var4, jp9Var4.U, d, (byte) 27));
                        return;
                    } catch (IOException e) {
                        jp9Var4.h(e);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
