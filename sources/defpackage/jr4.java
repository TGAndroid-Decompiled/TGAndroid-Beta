package defpackage;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.Choreographer;
import org.telegram.utils.twidget.z;
import org.webrtc.RenderSynchronizer;
public final class jr4 implements Choreographer.FrameCallback {
    public final byte a;
    public final Object b;

    public jr4(Object obj, byte b) {
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
                mr4 mr4Var = (mr4) obj;
                if (mr4Var.G.get()) {
                    long j2 = mr4Var.b;
                    if (j2 == 0) {
                        mr4Var.b = j;
                    } else {
                        int i = ((j - j2) > 1000000000L ? 1 : ((j - j2) == 1000000000L ? 0 : -1));
                        int i2 = mr4Var.a;
                        if (i >= 0) {
                            mr4Var.c = i2;
                            mr4Var.f = mr4Var.e.getAndSet(0);
                            mr4Var.a = 0;
                            mr4Var.b = j;
                        } else {
                            mr4Var.a = i2 + 1;
                        }
                    }
                    Choreographer.getInstance().postFrameCallback(mr4Var.d);
                    return;
                }
                return;
            case 1:
                jk6 jk6Var = (jk6) obj;
                jk6Var.j = false;
                jk6Var.c();
                return;
            case 2:
                ((Runnable) obj).run();
                return;
            case 3:
                ((RenderSynchronizer) obj).onDisplayRefreshCycleBegin(j);
                return;
            case 4:
                ppa ppaVar = (ppa) obj;
                Rect rect = ppaVar.m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - ppaVar.h > 32 && !ppaVar.j && !rect.isEmpty()) {
                    ppaVar.h = currentTimeMillis;
                    ppaVar.j = true;
                    ppaVar.o.set(rect);
                    ppaVar.a.postRunnable(new opa(ppaVar, (ppaVar.d + 1) % 2, (byte) 0));
                }
                rect.set(0, 0, 0, 0);
                ppaVar.l = false;
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
