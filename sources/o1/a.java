package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import k2.g0;
import m.f3;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.i21;
public final class a implements Choreographer.FrameCallback {
    public final int f16659a;
    public final Object f16660b;

    public a(Object obj, int i10) {
        this.f16659a = i10;
        this.f16660b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        boolean z10;
        k kVar;
        float min;
        boolean z11;
        switch (this.f16659a) {
            case 0:
                b bVar = (b) ((g0) ((f3) this.f16660b).f15423b).f14466b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f16663b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f16662a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f16685i;
                        if (j10 == 0) {
                            hVar.f16685i = uptimeMillis;
                            hVar.f(hVar.f16680b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f16685i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f16690u;
                                double d = lVar.f16697i;
                                z10 = true;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f16680b, kVar2.f16679a, j12);
                                l lVar2 = kVar2.f16690u;
                                lVar2.f16697i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f16669a, c10.f16670b, j12);
                                kVar2.f16680b = c11.f16669a;
                                kVar2.f16679a = c11.f16670b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                z10 = true;
                                kVar = kVar2;
                                e c12 = kVar2.f16690u.c(kVar2.f16680b, kVar2.f16679a, j11);
                                kVar.f16680b = c12.f16669a;
                                kVar.f16679a = c12.f16670b;
                            }
                            float max = Math.max(kVar.f16680b, kVar.h);
                            kVar.f16680b = max;
                            kVar.f16680b = Math.min(max, kVar.f16684g);
                            float f7 = kVar.f16679a;
                            l lVar3 = kVar.f16690u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.f16694e && Math.abs(min - ((float) lVar3.f16697i)) < lVar3.d) {
                                kVar.f16680b = (float) kVar.f16690u.f16697i;
                                kVar.f16679a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(hVar.f16680b, hVar.f16684g);
                            hVar.f16680b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f16680b = max2;
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
                if (bVar.f16665e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    bVar.f16665e = false;
                }
                if (arrayList.size() > 0) {
                    if (bVar.d == null) {
                        bVar.d = new f3(bVar.f16664c);
                    }
                    f3 f3Var = bVar.d;
                    ((Choreographer) f3Var.f15424c).postFrameCallback((a) f3Var.d);
                    return;
                }
                return;
            default:
                g21 g21Var = ((i21) this.f16660b).f27021a;
                if (g21Var != null) {
                    Handler handler = g21Var.getHandler();
                    if (handler != null && g21Var.f26232b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((i21) this.f16660b).f27021a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
