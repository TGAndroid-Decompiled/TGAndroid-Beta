package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import m.g3;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.t11;
public final class a implements Choreographer.FrameCallback {
    public final int f17526a;
    public final Object f17527b;

    public a(Object obj, int i10) {
        this.f17526a = i10;
        this.f17527b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        int i10;
        boolean z10;
        k kVar;
        float min;
        boolean z11;
        switch (this.f17526a) {
            case 0:
                b bVar = (b) ((k0.b) ((g3) this.f17527b).f16196b).f14559b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f17530b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        a0.l lVar = bVar.f17529a;
                        Long l4 = (Long) lVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                lVar.remove(hVar);
                            }
                        }
                        long j11 = hVar.f17550i;
                        if (j11 == 0) {
                            hVar.f17550i = uptimeMillis;
                            hVar.f(hVar.f17546b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            hVar.f17550i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar2 = kVar2.f17555u;
                                double d = lVar2.f17561i;
                                z10 = true;
                                i10 = i11;
                                long j13 = j12 / 2;
                                e c10 = lVar2.c(kVar2.f17546b, kVar2.f17545a, j13);
                                l lVar3 = kVar2.f17555u;
                                lVar3.f17561i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar3.c(c10.f17535a, c10.f17536b, j13);
                                kVar2.f17546b = c11.f17535a;
                                kVar2.f17545a = c11.f17536b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                z10 = true;
                                kVar = kVar2;
                                e c12 = kVar2.f17555u.c(kVar2.f17546b, kVar2.f17545a, j12);
                                kVar.f17546b = c12.f17535a;
                                kVar.f17545a = c12.f17536b;
                            }
                            float max = Math.max(kVar.f17546b, kVar.h);
                            kVar.f17546b = max;
                            kVar.f17546b = Math.min(max, kVar.f17549g);
                            float f7 = kVar.f17545a;
                            l lVar4 = kVar.f17555u;
                            lVar4.getClass();
                            if (Math.abs(f7) < lVar4.e && Math.abs(min - ((float) lVar4.f17561i)) < lVar4.d) {
                                kVar.f17546b = (float) kVar.f17555u.f17561i;
                                kVar.f17545a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(hVar.f17546b, hVar.f17549g);
                            hVar.f17546b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f17546b = max2;
                            hVar.f(max2);
                            if (z11) {
                                hVar.d(false);
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
                        bVar.d = new g3(bVar.f17531c);
                    }
                    g3 g3Var = bVar.d;
                    ((Choreographer) g3Var.f16197c).postFrameCallback((a) g3Var.d);
                    return;
                }
                return;
            default:
                r11 r11Var = ((t11) this.f17527b).f30430a;
                if (r11Var != null) {
                    Handler handler = r11Var.getHandler();
                    if (handler != null && r11Var.f29791b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((t11) this.f17527b).f30430a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
