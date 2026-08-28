package dh;

import android.graphics.Rect;
import android.view.Choreographer;
import ff.b0;
import java.util.ArrayList;
public final class m implements Choreographer.FrameCallback {
    public final int f4636a;
    public final Object f4637b;

    public m(Object obj, int i9) {
        this.f4636a = i9;
        this.f4637b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f4636a) {
            case 0:
                o oVar = (o) this.f4637b;
                Rect rect = oVar.f4652m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - oVar.h > 32 && !oVar.f4649j && !rect.isEmpty()) {
                    oVar.h = currentTimeMillis;
                    oVar.f4649j = true;
                    oVar.f4654o.set(rect);
                    oVar.f4642a.postRunnable(new n(oVar, (oVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                oVar.f4651l = false;
                return;
            case 1:
                ((Runnable) this.f4637b).run();
                return;
            case 2:
                b0 b0Var = (b0) this.f4637b;
                if (b0Var.B.get()) {
                    long j11 = b0Var.f6135b;
                    if (j11 == 0) {
                        b0Var.f6135b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        b0Var.f6136c = b0Var.f6134a;
                        b0Var.f6138f = b0Var.f6137e.getAndSet(0);
                        b0Var.f6134a = 0;
                        b0Var.f6135b = j10;
                    } else {
                        b0Var.f6134a++;
                    }
                    Choreographer.getInstance().postFrameCallback(b0Var.d);
                    return;
                }
                return;
            default:
                xe.b bVar = (xe.b) this.f4637b;
                af.a aVar = bVar.f49128k;
                af.a aVar2 = bVar.f49127j;
                if (bVar.f49131n) {
                    ArrayList arrayList = bVar.f49121b;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        xe.e eVar = ((ze.e) ((ye.b) obj)).f50443f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.f150c != 0) {
                        bVar.d(g7.n.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f150c != 0) {
                        bVar.d(g7.n.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.f49129l.postFrameCallback(bVar.f49130m);
                    return;
                }
                return;
        }
    }
}
