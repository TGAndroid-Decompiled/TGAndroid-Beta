package bf;

import android.graphics.Rect;
import android.view.Choreographer;
import ih.l;
import ih.m;
import java.util.ArrayList;
import k7.n;
import kf.a0;
public final class b implements Choreographer.FrameCallback {
    public final int f1791a;
    public final Object f1792b;

    public b(Object obj, int i10) {
        this.f1791a = i10;
        this.f1792b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f1791a) {
            case 0:
                c cVar = (c) this.f1792b;
                ef.a aVar = cVar.f1800k;
                ef.a aVar2 = cVar.f1799j;
                if (cVar.f1803n) {
                    ArrayList arrayList = cVar.f1794b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        g gVar = ((df.e) ((cf.b) obj)).f4337f;
                        if (gVar != null) {
                            gVar.invalidate();
                        }
                    }
                    if (aVar2.f5196c != 0) {
                        cVar.d(n.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f5196c != 0) {
                        cVar.d(n.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f1801l.postFrameCallback(cVar.f1802m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f1792b).run();
                return;
            case 2:
                m mVar = (m) this.f1792b;
                Rect rect = mVar.f7620m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - mVar.h > 32 && !mVar.f7617j && !rect.isEmpty()) {
                    mVar.h = currentTimeMillis;
                    mVar.f7617j = true;
                    mVar.f7622o.set(rect);
                    mVar.f7611a.postRunnable(new l(mVar, (mVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                mVar.f7619l = false;
                return;
            default:
                a0 a0Var = (a0) this.f1792b;
                if (a0Var.C.get()) {
                    long j11 = a0Var.f10390b;
                    if (j11 == 0) {
                        a0Var.f10390b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        a0Var.f10391c = a0Var.f10389a;
                        a0Var.f10392f = a0Var.e.getAndSet(0);
                        a0Var.f10389a = 0;
                        a0Var.f10390b = j10;
                    } else {
                        a0Var.f10389a++;
                    }
                    Choreographer.getInstance().postFrameCallback(a0Var.d);
                    return;
                }
                return;
        }
    }
}
