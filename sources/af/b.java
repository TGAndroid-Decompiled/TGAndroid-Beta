package af;

import android.graphics.Rect;
import android.view.Choreographer;
import gh.l;
import gh.m;
import i7.w;
import java.util.ArrayList;
import jf.a0;
public final class b implements Choreographer.FrameCallback {
    public final int f367a;
    public final Object f368b;

    public b(Object obj, int i10) {
        this.f367a = i10;
        this.f368b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f367a) {
            case 0:
                d dVar = (d) this.f368b;
                df.a aVar = dVar.f379k;
                df.a aVar2 = dVar.f378j;
                if (dVar.f382n) {
                    ArrayList arrayList = dVar.f372b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        h hVar = ((cf.e) ((bf.b) obj)).f3048f;
                        if (hVar != null) {
                            hVar.invalidate();
                        }
                    }
                    if (aVar2.f5543c != 0) {
                        dVar.d(w.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f5543c != 0) {
                        dVar.d(w.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    dVar.f380l.postFrameCallback(dVar.f381m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f368b).run();
                return;
            case 2:
                m mVar = (m) this.f368b;
                Rect rect = mVar.f7440m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - mVar.h > 32 && !mVar.f7437j && !rect.isEmpty()) {
                    mVar.h = currentTimeMillis;
                    mVar.f7437j = true;
                    mVar.f7442o.set(rect);
                    mVar.f7430a.postRunnable(new l(mVar, (mVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                mVar.f7439l = false;
                return;
            default:
                a0 a0Var = (a0) this.f368b;
                if (a0Var.B.get()) {
                    long j11 = a0Var.f11551b;
                    if (j11 == 0) {
                        a0Var.f11551b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        a0Var.f11552c = a0Var.f11550a;
                        a0Var.f11554f = a0Var.f11553e.getAndSet(0);
                        a0Var.f11550a = 0;
                        a0Var.f11551b = j10;
                    } else {
                        a0Var.f11550a++;
                    }
                    Choreographer.getInstance().postFrameCallback(a0Var.d);
                    return;
                }
                return;
        }
    }
}
