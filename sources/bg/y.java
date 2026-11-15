package bg;

import android.graphics.Rect;
import android.view.Choreographer;
public final class y implements Choreographer.FrameCallback {
    public final int f3347a;
    public final Object f3348b;

    public y(Object obj, int i7) {
        this.f3347a = i7;
        this.f3348b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f3347a) {
            case 0:
                b0 b0Var = (b0) this.f3348b;
                if (b0Var.G.get()) {
                    long j10 = b0Var.f3196b;
                    if (j10 == 0) {
                        b0Var.f3196b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        b0Var.f3197c = b0Var.f3195a;
                        b0Var.f3199f = b0Var.f3198e.getAndSet(0);
                        b0Var.f3195a = 0;
                        b0Var.f3196b = j3;
                    } else {
                        b0Var.f3195a++;
                    }
                    Choreographer.getInstance().postFrameCallback(b0Var.d);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f3348b).run();
                return;
            default:
                xh.h hVar = (xh.h) this.f3348b;
                Rect rect = hVar.f60018m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - hVar.h > 32 && !hVar.f60015j && !rect.isEmpty()) {
                    hVar.h = currentTimeMillis;
                    hVar.f60015j = true;
                    hVar.f60020o.set(rect);
                    hVar.f60008a.postRunnable(new xh.g(hVar, (hVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                hVar.f60017l = false;
                return;
        }
    }
}
