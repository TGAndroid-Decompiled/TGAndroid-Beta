package ag;

import a8.ee;
import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
public final class d0 implements Choreographer.FrameCallback {
    public final int f1268a;
    public final Object f1269b;

    public d0(Object obj, int i10) {
        this.f1268a = i10;
        this.f1269b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f1268a) {
            case 0:
                g0 g0Var = (g0) this.f1269b;
                if (g0Var.F.get()) {
                    long j11 = g0Var.f1283b;
                    if (j11 == 0) {
                        g0Var.f1283b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        g0Var.f1284c = g0Var.f1282a;
                        g0Var.f1285f = g0Var.e.getAndSet(0);
                        g0Var.f1282a = 0;
                        g0Var.f1283b = j10;
                    } else {
                        g0Var.f1282a++;
                    }
                    Choreographer.getInstance().postFrameCallback(g0Var.d);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f1269b).run();
                return;
            case 2:
                sf.b bVar = (sf.b) this.f1269b;
                vf.a aVar = bVar.f48110k;
                vf.a aVar2 = bVar.f48109j;
                if (bVar.f48113n) {
                    ArrayList arrayList = bVar.f48104b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        sf.e eVar = ((uf.e) ((tf.b) obj)).f49722f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.f50109c != 0) {
                        bVar.d(ee.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f50109c != 0) {
                        bVar.d(ee.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.f48111l.postFrameCallback(bVar.f48112m);
                    return;
                }
                return;
            default:
                xh.i iVar = (xh.i) this.f1269b;
                Rect rect = iVar.f51892m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f51889j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f51889j = true;
                    iVar.f51894o.set(rect);
                    iVar.f51883a.postRunnable(new xh.h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f51891l = false;
                return;
        }
    }
}
