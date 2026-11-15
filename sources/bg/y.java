package bg;

import android.graphics.Rect;
import android.view.Choreographer;
public final class y implements Choreographer.FrameCallback {
    public final int f3350a;
    public final Object f3351b;

    public y(Object obj, int i7) {
        this.f3350a = i7;
        this.f3351b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f3350a) {
            case 0:
                b0 b0Var = (b0) this.f3351b;
                if (b0Var.G.get()) {
                    long j10 = b0Var.f3199b;
                    if (j10 == 0) {
                        b0Var.f3199b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        b0Var.f3200c = b0Var.f3198a;
                        b0Var.f3202f = b0Var.f3201e.getAndSet(0);
                        b0Var.f3198a = 0;
                        b0Var.f3199b = j3;
                    } else {
                        b0Var.f3198a++;
                    }
                    Choreographer.getInstance().postFrameCallback(b0Var.d);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f3351b).run();
                return;
            default:
                xh.h hVar = (xh.h) this.f3351b;
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
