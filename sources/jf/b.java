package jf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import nh.j;
import nh.k;
import rf.v;
import w7.u;
public final class b implements Choreographer.FrameCallback {
    public final int f9836a;
    public final Object f9837b;

    public b(Object obj, int i10) {
        this.f9836a = i10;
        this.f9837b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f9836a) {
            case 0:
                c cVar = (c) this.f9837b;
                mf.a aVar = cVar.f9845k;
                mf.a aVar2 = cVar.f9844j;
                if (cVar.f9848n) {
                    ArrayList arrayList = cVar.f9839b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        g gVar = ((lf.e) obj).f11820f;
                        if (gVar != null) {
                            gVar.invalidate();
                        }
                    }
                    if (aVar2.f13058c != 0) {
                        cVar.d(u.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f13058c != 0) {
                        cVar.d(u.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f9846l.postFrameCallback(cVar.f9847m);
                    return;
                }
                return;
            case 1:
                k kVar = (k) this.f9837b;
                Rect rect = kVar.f13874m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - kVar.h > 32 && !kVar.f13871j && !rect.isEmpty()) {
                    kVar.h = currentTimeMillis;
                    kVar.f13871j = true;
                    kVar.f13876o.set(rect);
                    kVar.f13865a.postRunnable(new j(kVar, (kVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                kVar.f13873l = false;
                return;
            case 2:
                ((Runnable) this.f9837b).run();
                return;
            default:
                v vVar = (v) this.f9837b;
                if (vVar.F.get()) {
                    long j11 = vVar.f46560b;
                    if (j11 == 0) {
                        vVar.f46560b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        vVar.f46561c = vVar.f46559a;
                        vVar.f46562f = vVar.e.getAndSet(0);
                        vVar.f46559a = 0;
                        vVar.f46560b = j10;
                    } else {
                        vVar.f46559a++;
                    }
                    Choreographer.getInstance().postFrameCallback(vVar.d);
                    return;
                }
                return;
        }
    }
}
