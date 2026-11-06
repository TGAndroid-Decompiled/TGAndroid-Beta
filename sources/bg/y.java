package bg;

import android.graphics.Rect;
import android.view.Choreographer;
public final class y implements Choreographer.FrameCallback {
    public final int f3395a;
    public final Object f3396b;

    public y(Object obj, int i7) {
        this.f3395a = i7;
        this.f3396b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f3395a) {
            case 0:
                b0 b0Var = (b0) this.f3396b;
                if (b0Var.F.get()) {
                    long j10 = b0Var.f3241b;
                    if (j10 == 0) {
                        b0Var.f3241b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        b0Var.f3242c = b0Var.f3240a;
                        b0Var.f3244f = b0Var.f3243e.getAndSet(0);
                        b0Var.f3240a = 0;
                        b0Var.f3241b = j3;
                    } else {
                        b0Var.f3240a++;
                    }
                    Choreographer.getInstance().postFrameCallback(b0Var.d);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f3396b).run();
                return;
            default:
                xh.h hVar = (xh.h) this.f3396b;
                Rect rect = hVar.f58707m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - hVar.h > 32 && !hVar.f58704j && !rect.isEmpty()) {
                    hVar.h = currentTimeMillis;
                    hVar.f58704j = true;
                    hVar.f58709o.set(rect);
                    hVar.f58697a.postRunnable(new xh.g(hVar, (hVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                hVar.f58706l = false;
                return;
        }
    }
}
