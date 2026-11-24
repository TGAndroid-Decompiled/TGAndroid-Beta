package defpackage;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.Choreographer;
import org.telegram.utils.twidget.z;
import org.webrtc.RenderSynchronizer;
public final class gr4 implements Choreographer.FrameCallback {
    public final byte a;
    public final Object b;

    public gr4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void doFrame(long j) {
        boolean z;
        boolean z2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                jr4 jr4Var = (jr4) obj;
                if (jr4Var.G.get()) {
                    long j2 = jr4Var.b;
                    if (j2 == 0) {
                        jr4Var.b = j;
                    } else {
                        int i = ((j - j2) > 1000000000L ? 1 : ((j - j2) == 1000000000L ? 0 : -1));
                        int i2 = jr4Var.a;
                        if (i >= 0) {
                            jr4Var.c = i2;
                            jr4Var.f = jr4Var.e.getAndSet(0);
                            jr4Var.a = 0;
                            jr4Var.b = j;
                        } else {
                            jr4Var.a = i2 + 1;
                        }
                    }
                    Choreographer.getInstance().postFrameCallback(jr4Var.d);
                    return;
                }
                return;
            case 1:
                hk6 hk6Var = (hk6) obj;
                hk6Var.j = false;
                hk6Var.c();
                return;
            case 2:
                ((Runnable) obj).run();
                return;
            case 3:
                ((RenderSynchronizer) obj).onDisplayRefreshCycleBegin(j);
                return;
            case 4:
                tna tnaVar = (tna) obj;
                Rect rect = tnaVar.m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - tnaVar.h > 32 && !tnaVar.j && !rect.isEmpty()) {
                    tnaVar.h = currentTimeMillis;
                    tnaVar.j = true;
                    tnaVar.o.set(rect);
                    tnaVar.a.postRunnable(new sna(tnaVar, (tnaVar.d + 1) % 2, (byte) 0));
                }
                rect.set(0, 0, 0, 0);
                tnaVar.l = false;
                return;
            default:
                z zVar = (z) obj;
                zVar.J = false;
                long j3 = zVar.v;
                if (!zVar.A && j3 != 0 && zVar.o.compareAndSet(false, true)) {
                    if (zVar.L && (zVar.r.getAndSet(false) | zVar.q.get())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zVar.L && zVar.p.getAndSet(false)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        zVar.c0 = j;
                    }
                    zVar.Z = SystemClock.uptimeMillis();
                    if (!zVar.a0) {
                        zVar.a0 = true;
                        zVar.a.postDelayed(zVar.b0, 5000L);
                    }
                    zVar.c.j(j3, ((float) (j - zVar.m)) / 1000000.0f, z2, z, zVar.n.getAndSet(false));
                    return;
                }
                return;
        }
    }
}
