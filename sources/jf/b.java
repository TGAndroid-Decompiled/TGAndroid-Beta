package jf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import nh.j;
import nh.k;
import rf.v;
import w7.u;
public final class b implements Choreographer.FrameCallback {
    public final int f9837a;
    public final Object f9838b;

    public b(Object obj, int i10) {
        this.f9837a = i10;
        this.f9838b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f9837a) {
            case 0:
                c cVar = (c) this.f9838b;
                mf.a aVar = cVar.f9846k;
                mf.a aVar2 = cVar.f9845j;
                if (cVar.f9849n) {
                    ArrayList arrayList = cVar.f9840b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        g gVar = ((lf.e) obj).f11821f;
                        if (gVar != null) {
                            gVar.invalidate();
                        }
                    }
                    if (aVar2.f13059c != 0) {
                        cVar.d(u.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f13059c != 0) {
                        cVar.d(u.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f9847l.postFrameCallback(cVar.f9848m);
                    return;
                }
                return;
            case 1:
                k kVar = (k) this.f9838b;
                Rect rect = kVar.f13875m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - kVar.h > 32 && !kVar.f13872j && !rect.isEmpty()) {
                    kVar.h = currentTimeMillis;
                    kVar.f13872j = true;
                    kVar.f13877o.set(rect);
                    kVar.f13866a.postRunnable(new j(kVar, (kVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                kVar.f13874l = false;
                return;
            case 2:
                ((Runnable) this.f9838b).run();
                return;
            default:
                v vVar = (v) this.f9838b;
                if (vVar.F.get()) {
                    long j11 = vVar.f46571b;
                    if (j11 == 0) {
                        vVar.f46571b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        vVar.f46572c = vVar.f46570a;
                        vVar.f46573f = vVar.e.getAndSet(0);
                        vVar.f46570a = 0;
                        vVar.f46571b = j10;
                    } else {
                        vVar.f46570a++;
                    }
                    Choreographer.getInstance().postFrameCallback(vVar.d);
                    return;
                }
                return;
        }
    }
}
