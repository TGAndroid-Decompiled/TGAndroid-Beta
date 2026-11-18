package bg;

import android.graphics.Rect;
import android.view.Choreographer;
public final class z implements Choreographer.FrameCallback {
    public final int f3358a;
    public final Object f3359b;

    public z(Object obj, int i7) {
        this.f3358a = i7;
        this.f3359b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f3358a) {
            case 0:
                c0 c0Var = (c0) this.f3359b;
                if (c0Var.G.get()) {
                    long j10 = c0Var.f3204b;
                    if (j10 == 0) {
                        c0Var.f3204b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        c0Var.f3205c = c0Var.f3203a;
                        c0Var.f3207f = c0Var.f3206e.getAndSet(0);
                        c0Var.f3203a = 0;
                        c0Var.f3204b = j3;
                    } else {
                        c0Var.f3203a++;
                    }
                    Choreographer.getInstance().postFrameCallback(c0Var.d);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f3359b).run();
                return;
            default:
                xh.h hVar = (xh.h) this.f3359b;
                Rect rect = hVar.f60584m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - hVar.h > 32 && !hVar.f60581j && !rect.isEmpty()) {
                    hVar.h = currentTimeMillis;
                    hVar.f60581j = true;
                    hVar.f60586o.set(rect);
                    hVar.f60574a.postRunnable(new xh.g(hVar, (hVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                hVar.f60583l = false;
                return;
        }
    }
}
