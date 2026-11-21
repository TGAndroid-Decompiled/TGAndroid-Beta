package bg;

import android.graphics.Rect;
import android.view.Choreographer;
public final class z implements Choreographer.FrameCallback {
    public final int f3370a;
    public final Object f3371b;

    public z(Object obj, int i7) {
        this.f3370a = i7;
        this.f3371b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f3370a) {
            case 0:
                c0 c0Var = (c0) this.f3371b;
                if (c0Var.G.get()) {
                    long j10 = c0Var.f3216b;
                    if (j10 == 0) {
                        c0Var.f3216b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        c0Var.f3217c = c0Var.f3215a;
                        c0Var.f3219f = c0Var.f3218e.getAndSet(0);
                        c0Var.f3215a = 0;
                        c0Var.f3216b = j3;
                    } else {
                        c0Var.f3215a++;
                    }
                    Choreographer.getInstance().postFrameCallback(c0Var.d);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f3371b).run();
                return;
            default:
                xh.h hVar = (xh.h) this.f3371b;
                Rect rect = hVar.f60625m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - hVar.h > 32 && !hVar.f60622j && !rect.isEmpty()) {
                    hVar.h = currentTimeMillis;
                    hVar.f60622j = true;
                    hVar.f60627o.set(rect);
                    hVar.f60615a.postRunnable(new xh.g(hVar, (hVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                hVar.f60624l = false;
                return;
        }
    }
}
