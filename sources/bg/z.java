package bg;

import android.graphics.Rect;
import android.view.Choreographer;
public final class z implements Choreographer.FrameCallback {
    public final int f3328a;
    public final Object f3329b;

    public z(Object obj, int i7) {
        this.f3328a = i7;
        this.f3329b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f3328a) {
            case 0:
                c0 c0Var = (c0) this.f3329b;
                if (c0Var.G.get()) {
                    long j10 = c0Var.f3174b;
                    if (j10 == 0) {
                        c0Var.f3174b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        c0Var.f3175c = c0Var.f3173a;
                        c0Var.f3177f = c0Var.f3176e.getAndSet(0);
                        c0Var.f3173a = 0;
                        c0Var.f3174b = j3;
                    } else {
                        c0Var.f3173a++;
                    }
                    Choreographer.getInstance().postFrameCallback(c0Var.d);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f3329b).run();
                return;
            default:
                xh.h hVar = (xh.h) this.f3329b;
                Rect rect = hVar.f60594m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - hVar.h > 32 && !hVar.f60591j && !rect.isEmpty()) {
                    hVar.h = currentTimeMillis;
                    hVar.f60591j = true;
                    hVar.f60596o.set(rect);
                    hVar.f60584a.postRunnable(new xh.g(hVar, (hVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                hVar.f60593l = false;
                return;
        }
    }
}
