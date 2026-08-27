package e2;

import android.graphics.Rect;
import android.view.Choreographer;
import eh.m;
import gf.b0;
import h7.n;
import java.util.ArrayList;

public final class f implements Choreographer.FrameCallback {

    public final int f5176a;

    public final Object f5177b;

    public f(Object obj, int i10) {
        this.f5176a = i10;
        this.f5177b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f5176a) {
            case 0:
                ((Runnable) this.f5177b).run();
                break;
            case 1:
                m mVar = (m) this.f5177b;
                Rect rect = mVar.f5548m;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - mVar.h > 32 && !mVar.f5545j && !rect.isEmpty()) {
                    mVar.h = jCurrentTimeMillis;
                    mVar.f5545j = true;
                    mVar.f5550o.set(rect);
                    mVar.f5538a.postRunnable(new eh.l(mVar, (mVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                mVar.f5547l = false;
                break;
            case 2:
                b0 b0Var = (b0) this.f5177b;
                if (b0Var.B.get()) {
                    long j11 = b0Var.f6935b;
                    if (j11 == 0) {
                        b0Var.f6935b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        b0Var.f6936c = b0Var.f6934a;
                        b0Var.f6938f = b0Var.f6937e.getAndSet(0);
                        b0Var.f6934a = 0;
                        b0Var.f6935b = j10;
                    } else {
                        b0Var.f6934a++;
                    }
                    Choreographer.getInstance().postFrameCallback(b0Var.d);
                    break;
                }
                break;
            default:
                ye.b bVar = (ye.b) this.f5177b;
                bf.a aVar = bVar.f49844k;
                bf.a aVar2 = bVar.f49843j;
                if (bVar.f49847n) {
                    ArrayList arrayList = bVar.f49837b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ye.e eVar = ((af.f) ((ze.b) obj)).f262f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.f2078c != 0) {
                        bVar.d(n.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f2078c != 0) {
                        bVar.d(n.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.f49845l.postFrameCallback(bVar.f49846m);
                    break;
                }
                break;
        }
    }
}
