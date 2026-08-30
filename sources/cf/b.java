package cf;

import android.graphics.Rect;
import android.view.Choreographer;
import ih.l;
import ih.m;
import java.util.ArrayList;
import k7.n;
import lf.a0;
public final class b implements Choreographer.FrameCallback {
    public final int f2269a;
    public final Object f2270b;

    public b(Object obj, int i10) {
        this.f2269a = i10;
        this.f2270b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f2269a) {
            case 0:
                c cVar = (c) this.f2270b;
                ff.a aVar = cVar.f2278k;
                ff.a aVar2 = cVar.f2277j;
                if (cVar.f2281n) {
                    ArrayList arrayList = cVar.f2272b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        g gVar = ((ef.f) ((df.b) obj)).f5199f;
                        if (gVar != null) {
                            gVar.invalidate();
                        }
                    }
                    if (aVar2.f6111c != 0) {
                        cVar.d(n.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f6111c != 0) {
                        cVar.d(n.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f2279l.postFrameCallback(cVar.f2280m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f2270b).run();
                return;
            case 2:
                m mVar = (m) this.f2270b;
                Rect rect = mVar.f7638m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - mVar.h > 32 && !mVar.f7635j && !rect.isEmpty()) {
                    mVar.h = currentTimeMillis;
                    mVar.f7635j = true;
                    mVar.f7640o.set(rect);
                    mVar.f7629a.postRunnable(new l(mVar, (mVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                mVar.f7637l = false;
                return;
            default:
                a0 a0Var = (a0) this.f2270b;
                if (a0Var.C.get()) {
                    long j11 = a0Var.f11948b;
                    if (j11 == 0) {
                        a0Var.f11948b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        a0Var.f11949c = a0Var.f11947a;
                        a0Var.f11950f = a0Var.e.getAndSet(0);
                        a0Var.f11947a = 0;
                        a0Var.f11948b = j10;
                    } else {
                        a0Var.f11947a++;
                    }
                    Choreographer.getInstance().postFrameCallback(a0Var.d);
                    return;
                }
                return;
        }
    }
}
