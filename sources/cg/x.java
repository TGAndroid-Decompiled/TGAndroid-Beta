package cg;

import android.graphics.Rect;
import android.view.Choreographer;
import b8.be;
import java.util.ArrayList;
public final class x implements Choreographer.FrameCallback {
    public final int f4760a;
    public final Object f4761b;

    public x(Object obj, int i3) {
        this.f4760a = i3;
        this.f4761b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f4760a) {
            case 0:
                a0 a0Var = (a0) this.f4761b;
                if (a0Var.G.get()) {
                    long j11 = a0Var.f4609b;
                    if (j11 == 0) {
                        a0Var.f4609b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        a0Var.f4610c = a0Var.f4608a;
                        a0Var.f4612f = a0Var.f4611e.getAndSet(0);
                        a0Var.f4608a = 0;
                        a0Var.f4609b = j10;
                    } else {
                        a0Var.f4608a++;
                    }
                    Choreographer.getInstance().postFrameCallback(a0Var.d);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f4761b).run();
                return;
            case 2:
                uf.b bVar = (uf.b) this.f4761b;
                xf.a aVar = bVar.f55833k;
                xf.a aVar2 = bVar.f55832j;
                if (bVar.f55836n) {
                    ArrayList arrayList = bVar.f55826b;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        org.telegram.ui.e eVar = ((wf.e) obj).f57574f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.f58623c != 0) {
                        bVar.d(be.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f58623c != 0) {
                        bVar.d(be.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.f55834l.postFrameCallback(bVar.f55835m);
                    return;
                }
                return;
            default:
                yh.h hVar = (yh.h) this.f4761b;
                Rect rect = hVar.f59544m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - hVar.h > 32 && !hVar.f59541j && !rect.isEmpty()) {
                    hVar.h = currentTimeMillis;
                    hVar.f59541j = true;
                    hVar.f59546o.set(rect);
                    hVar.f59534a.postRunnable(new yh.g(hVar, (hVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                hVar.f59543l = false;
                return;
        }
    }
}
