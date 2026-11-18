package bg;

import android.graphics.Rect;
import android.view.Choreographer;
public final class z implements Choreographer.FrameCallback {
    public final int f3357a;
    public final Object f3358b;

    public z(Object obj, int i7) {
        this.f3357a = i7;
        this.f3358b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f3357a) {
            case 0:
                c0 c0Var = (c0) this.f3358b;
                if (c0Var.G.get()) {
                    long j10 = c0Var.f3203b;
                    if (j10 == 0) {
                        c0Var.f3203b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        c0Var.f3204c = c0Var.f3202a;
                        c0Var.f3206f = c0Var.f3205e.getAndSet(0);
                        c0Var.f3202a = 0;
                        c0Var.f3203b = j3;
                    } else {
                        c0Var.f3202a++;
                    }
                    Choreographer.getInstance().postFrameCallback(c0Var.d);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f3358b).run();
                return;
            default:
                xh.h hVar = (xh.h) this.f3358b;
                Rect rect = hVar.f60583m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - hVar.h > 32 && !hVar.f60580j && !rect.isEmpty()) {
                    hVar.h = currentTimeMillis;
                    hVar.f60580j = true;
                    hVar.f60585o.set(rect);
                    hVar.f60573a.postRunnable(new xh.g(hVar, (hVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                hVar.f60582l = false;
                return;
        }
    }
}
