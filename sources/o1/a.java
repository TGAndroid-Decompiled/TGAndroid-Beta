package o1;

import a0.l;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import m2.t;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.h01;
public final class a implements Choreographer.FrameCallback {
    public final int f13929a;
    public final Object f13930b;

    public a(Object obj, int i10) {
        this.f13929a = i10;
        this.f13930b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        boolean z10;
        float min;
        int i10;
        boolean z11;
        switch (this.f13929a) {
            case 0:
                b bVar = (b) ((t) ((li.k) this.f13930b).f12100b).f12684b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f13933b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    j jVar = (j) arrayList.get(i11);
                    if (jVar != null) {
                        l lVar = bVar.f13932a;
                        Long l4 = (Long) lVar.get(jVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                lVar.remove(jVar);
                            }
                        }
                        long j11 = jVar.f13953i;
                        if (j11 == 0) {
                            jVar.f13953i = uptimeMillis;
                            jVar.g(jVar.f13949b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            jVar.f13953i = uptimeMillis;
                            if (jVar.f13958n != Float.MAX_VALUE) {
                                k kVar = jVar.f13957m;
                                double d = kVar.f13964i;
                                z10 = true;
                                long j13 = j12 / 2;
                                e c10 = kVar.c(jVar.f13949b, jVar.f13948a, j13);
                                k kVar2 = jVar.f13957m;
                                kVar2.f13964i = jVar.f13958n;
                                jVar.f13958n = Float.MAX_VALUE;
                                e c11 = kVar2.c(c10.f13938a, c10.f13939b, j13);
                                jVar.f13949b = c11.f13938a;
                                jVar.f13948a = c11.f13939b;
                            } else {
                                z10 = true;
                                e c12 = jVar.f13957m.c(jVar.f13949b, jVar.f13948a, j12);
                                jVar.f13949b = c12.f13938a;
                                jVar.f13948a = c12.f13939b;
                            }
                            float max = Math.max(jVar.f13949b, jVar.h);
                            jVar.f13949b = max;
                            jVar.f13949b = Math.min(max, jVar.f13952g);
                            float f7 = jVar.f13948a;
                            k kVar3 = jVar.f13957m;
                            kVar3.getClass();
                            double abs = Math.abs(f7);
                            i10 = i11;
                            if (abs < kVar3.e && Math.abs(min - ((float) kVar3.f13964i)) < kVar3.d) {
                                jVar.f13949b = (float) jVar.f13957m.f13964i;
                                jVar.f13948a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(jVar.f13949b, jVar.f13952g);
                            jVar.f13949b = min2;
                            float max2 = Math.max(min2, jVar.h);
                            jVar.f13949b = max2;
                            jVar.g(max2);
                            if (z11) {
                                jVar.e(false);
                            }
                            i11 = i10 + 1;
                        }
                    }
                    i10 = i11;
                    i11 = i10 + 1;
                }
                if (bVar.e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    bVar.e = false;
                }
                if (arrayList.size() > 0) {
                    if (bVar.d == null) {
                        bVar.d = new li.k(bVar.f13934c);
                    }
                    li.k kVar4 = bVar.d;
                    ((Choreographer) kVar4.f12101c).postFrameCallback((a) kVar4.d);
                    return;
                }
                return;
            default:
                f01 f01Var = ((h01) this.f13930b).f26574a;
                if (f01Var != null) {
                    Handler handler = f01Var.getHandler();
                    if (handler != null && f01Var.f25916b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((h01) this.f13930b).f26574a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
