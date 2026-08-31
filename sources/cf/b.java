package cf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import jh.l;
import jh.m;
import k7.o;
import lf.a0;
public final class b implements Choreographer.FrameCallback {
    public final int f2463a;
    public final Object f2464b;

    public b(Object obj, int i10) {
        this.f2463a = i10;
        this.f2464b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f2463a) {
            case 0:
                c cVar = (c) this.f2464b;
                ff.a aVar = cVar.f2473k;
                ff.a aVar2 = cVar.f2472j;
                if (cVar.f2476n) {
                    ArrayList arrayList = cVar.f2466b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        g gVar = ((ef.e) ((df.b) obj)).f5040f;
                        if (gVar != null) {
                            gVar.invalidate();
                        }
                    }
                    if (aVar2.f6230c != 0) {
                        cVar.d(o.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f6230c != 0) {
                        cVar.d(o.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f2474l.postFrameCallback(cVar.f2475m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f2464b).run();
                return;
            case 2:
                m mVar = (m) this.f2464b;
                Rect rect = mVar.f10170m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - mVar.h > 32 && !mVar.f10167j && !rect.isEmpty()) {
                    mVar.h = currentTimeMillis;
                    mVar.f10167j = true;
                    mVar.f10172o.set(rect);
                    mVar.f10160a.postRunnable(new l(mVar, (mVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                mVar.f10169l = false;
                return;
            default:
                a0 a0Var = (a0) this.f2464b;
                if (a0Var.C.get()) {
                    long j11 = a0Var.f12387b;
                    if (j11 == 0) {
                        a0Var.f12387b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        a0Var.f12388c = a0Var.f12386a;
                        a0Var.f12390f = a0Var.f12389e.getAndSet(0);
                        a0Var.f12386a = 0;
                        a0Var.f12387b = j10;
                    } else {
                        a0Var.f12386a++;
                    }
                    Choreographer.getInstance().postFrameCallback(a0Var.d);
                    return;
                }
                return;
        }
    }
}
