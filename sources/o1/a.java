package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import k2.w0;
import m.g3;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.v11;
public final class a implements Choreographer.FrameCallback {
    public final int f17530a;
    public final Object f17531b;

    public a(Object obj, int i10) {
        this.f17530a = i10;
        this.f17531b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        int i10;
        boolean z10;
        k kVar;
        float min;
        boolean z11;
        switch (this.f17530a) {
            case 0:
                b bVar = (b) ((w0) ((g3) this.f17531b).f16202b).f14830b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f17534b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        a0.l lVar = bVar.f17533a;
                        Long l4 = (Long) lVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                lVar.remove(hVar);
                            }
                        }
                        long j11 = hVar.f17554i;
                        if (j11 == 0) {
                            hVar.f17554i = uptimeMillis;
                            hVar.f(hVar.f17550b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            hVar.f17554i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar2 = kVar2.f17559u;
                                double d = lVar2.f17565i;
                                z10 = true;
                                i10 = i11;
                                long j13 = j12 / 2;
                                e c10 = lVar2.c(kVar2.f17550b, kVar2.f17549a, j13);
                                l lVar3 = kVar2.f17559u;
                                lVar3.f17565i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar3.c(c10.f17539a, c10.f17540b, j13);
                                kVar2.f17550b = c11.f17539a;
                                kVar2.f17549a = c11.f17540b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                z10 = true;
                                kVar = kVar2;
                                e c12 = kVar2.f17559u.c(kVar2.f17550b, kVar2.f17549a, j12);
                                kVar.f17550b = c12.f17539a;
                                kVar.f17549a = c12.f17540b;
                            }
                            float max = Math.max(kVar.f17550b, kVar.h);
                            kVar.f17550b = max;
                            kVar.f17550b = Math.min(max, kVar.f17553g);
                            float f7 = kVar.f17549a;
                            l lVar4 = kVar.f17559u;
                            lVar4.getClass();
                            if (Math.abs(f7) < lVar4.e && Math.abs(min - ((float) lVar4.f17565i)) < lVar4.d) {
                                kVar.f17550b = (float) kVar.f17559u.f17565i;
                                kVar.f17549a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(hVar.f17550b, hVar.f17553g);
                            hVar.f17550b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f17550b = max2;
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
                        bVar.d = new g3(bVar.f17535c);
                    }
                    g3 g3Var = bVar.d;
                    ((Choreographer) g3Var.f16203c).postFrameCallback((a) g3Var.d);
                    return;
                }
                return;
            default:
                t11 t11Var = ((v11) this.f17531b).f31118a;
                if (t11Var != null) {
                    Handler handler = t11Var.getHandler();
                    if (handler != null && t11Var.f30395b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((v11) this.f17531b).f31118a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
