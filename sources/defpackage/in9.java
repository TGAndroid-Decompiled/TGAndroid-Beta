package defpackage;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
public final class in9 implements Runnable {
    public final byte a;
    public final un9 b;

    public in9(un9 un9Var, byte b) {
        this.a = b;
        this.b = un9Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                un9 un9Var = this.b;
                if (un9Var.a0 == 3) {
                    un9Var.q();
                    return;
                }
                return;
            case 1:
                un9 un9Var2 = this.b;
                om9 om9Var = un9Var2.U;
                File file = un9Var2.V;
                if (om9Var != null) {
                    try {
                        synchronized (om9Var) {
                            om9Var.w = true;
                            try {
                                om9Var.g();
                            } finally {
                                om9Var.w = false;
                            }
                        }
                    } catch (IOException unused) {
                    }
                    fve.c(om9Var.a);
                }
                if (file != null) {
                    fve.c(file);
                    return;
                }
                return;
            case 2:
                un9 un9Var3 = this.b;
                int i = un9Var3.a0;
                if (i == 2 || i == 6) {
                    un9Var3.J = SystemClock.elapsedRealtime();
                    fm9 fm9Var = un9Var3.m;
                    fm9Var.b("recording started: retainedDurationMs=" + un9Var3.I);
                    un9Var3.x(3);
                    long j = ((long) un9Var3.q) - un9Var3.I;
                    if (j > 0 && !un9Var3.D) {
                        un9Var3.i.postDelayed(un9Var3.X, j);
                        return;
                    }
                    un9Var3.D = false;
                    un9Var3.q();
                    return;
                }
                return;
            default:
                un9 un9Var4 = this.b;
                un9Var4.E = false;
                fm9 fm9Var2 = un9Var4.m;
                fm9Var2.b("recording segment stopped: state=" + hg9.A(un9Var4.a0) + ", retainedDurationMs=" + un9Var4.I);
                if (un9Var4.C) {
                    un9Var4.C = false;
                    un9Var4.i();
                    return;
                } else if (un9Var4.A) {
                    un9Var4.A = false;
                    boolean z = un9Var4.B;
                    un9Var4.j.execute(new eb7(un9Var4, un9Var4.U, z, un9Var4.T, (byte) 11));
                    return;
                } else if (un9Var4.a0 == 4) {
                    try {
                        File d = un9Var4.d("round_video_preview_");
                        un9Var4.V = d;
                        un9Var4.N = System.nanoTime();
                        fm9 fm9Var3 = un9Var4.m;
                        fm9Var3.b("preview snapshot started: file=" + d.getName());
                        un9Var4.j.execute(new ak8(un9Var4, un9Var4.U, d, (byte) 20));
                        return;
                    } catch (IOException e) {
                        un9Var4.h(e);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
