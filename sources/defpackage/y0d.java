package defpackage;

import android.os.SystemClock;
import org.telegram.utils.twidget.z;
public final class y0d implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;

    public y0d(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                z zVar = (z) this.c;
                boolean z = this.b;
                if (!zVar.A && zVar.v != 0) {
                    zVar.v = 0L;
                    boolean z2 = false;
                    zVar.o.set(false);
                    zVar.U = "Widget engine stopped";
                    q0d q0dVar = zVar.R;
                    if (q0dVar != null) {
                        if (z) {
                            if (q0dVar.n && q0dVar.m && !q0dVar.o) {
                                z2 = true;
                            }
                            q0dVar.n();
                            if (z2) {
                                if (q0dVar.d != null) {
                                    z3f.n(q0dVar, true);
                                    return;
                                } else {
                                    q0dVar.a();
                                    return;
                                }
                            }
                            return;
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - q0dVar.C > 60000) {
                            q0dVar.C = elapsedRealtime;
                            q0dVar.B = 0;
                        }
                        if (q0dVar.n) {
                            int i = q0dVar.B;
                            q0dVar.B = i + 1;
                            if (i < 2) {
                                z2 = true;
                            }
                        }
                        q0dVar.n();
                        if (q0dVar.d != null) {
                            z3f.n(q0dVar, z2);
                        } else if (z2) {
                            q0dVar.a();
                        }
                        if (!z2) {
                            q0dVar.g("Widget engine stopped");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                dx7 dx7Var = (dx7) this.c;
                if (!this.b) {
                    dx7Var.H0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
