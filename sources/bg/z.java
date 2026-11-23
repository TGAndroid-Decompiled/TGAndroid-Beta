package bg;

import android.graphics.Rect;
import android.view.Choreographer;
public final class z implements Choreographer.FrameCallback {
    public final int f3377a;
    public final Object f3378b;

    public z(Object obj, int i7) {
        this.f3377a = i7;
        this.f3378b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f3377a) {
            case 0:
                c0 c0Var = (c0) this.f3378b;
                if (c0Var.G.get()) {
                    long j10 = c0Var.f3223b;
                    if (j10 == 0) {
                        c0Var.f3223b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        c0Var.f3224c = c0Var.f3222a;
                        c0Var.f3226f = c0Var.f3225e.getAndSet(0);
                        c0Var.f3222a = 0;
                        c0Var.f3223b = j3;
                    } else {
                        c0Var.f3222a++;
                    }
                    Choreographer.getInstance().postFrameCallback(c0Var.d);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f3378b).run();
                return;
            default:
                xh.h hVar = (xh.h) this.f3378b;
                Rect rect = hVar.f60629m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - hVar.h > 32 && !hVar.f60626j && !rect.isEmpty()) {
                    hVar.h = currentTimeMillis;
                    hVar.f60626j = true;
                    hVar.f60631o.set(rect);
                    hVar.f60619a.postRunnable(new xh.g(hVar, (hVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                hVar.f60628l = false;
                return;
        }
    }
}
