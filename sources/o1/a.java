package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import k2.g0;
import m2.t;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.w01;
public final class a implements Choreographer.FrameCallback {
    public final int f16794a;
    public final Object f16795b;

    public a(Object obj, int i10) {
        this.f16794a = i10;
        this.f16795b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f16794a) {
            case 0:
                b bVar = (b) ((g0) ((t) this.f16795b).f15817b).f14578b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f16798b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        a0.l lVar = bVar.f16797a;
                        Long l4 = (Long) lVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                lVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f16820i;
                        if (j10 == 0) {
                            hVar.f16820i = uptimeMillis;
                            hVar.e(hVar.f16815b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f16820i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar2 = kVar2.f16825u;
                                double d = lVar2.f16832i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar2.c(kVar2.f16815b, kVar2.f16814a, j12);
                                l lVar3 = kVar2.f16825u;
                                lVar3.f16832i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar3.c(c10.f16804a, c10.f16805b, j12);
                                kVar2.f16815b = c11.f16804a;
                                kVar2.f16814a = c11.f16805b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f16825u.c(kVar2.f16815b, kVar2.f16814a, j11);
                                kVar.f16815b = c12.f16804a;
                                kVar.f16814a = c12.f16805b;
                            }
                            float max = Math.max(kVar.f16815b, kVar.h);
                            kVar.f16815b = max;
                            kVar.f16815b = Math.min(max, kVar.f16819g);
                            float f7 = kVar.f16814a;
                            l lVar4 = kVar.f16825u;
                            lVar4.getClass();
                            if (Math.abs(f7) < lVar4.f16829e && Math.abs(min - ((float) lVar4.f16832i)) < lVar4.d) {
                                kVar.f16815b = (float) kVar.f16825u.f16832i;
                                kVar.f16814a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f16815b, hVar.f16819g);
                            hVar.f16815b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f16815b = max2;
                            hVar.e(max2);
                            if (z10) {
                                hVar.d(false);
                            }
                            i11 = i10 + 1;
                        }
                    }
                    i10 = i11;
                    i11 = i10 + 1;
                }
                if (bVar.f16800e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    bVar.f16800e = false;
                }
                if (arrayList.size() > 0) {
                    if (bVar.d == null) {
                        bVar.d = new t(bVar.f16799c);
                    }
                    t tVar = bVar.d;
                    ((Choreographer) tVar.f15818c).postFrameCallback((a) tVar.d);
                    return;
                }
                return;
            default:
                u01 u01Var = ((w01) this.f16795b).f32052a;
                if (u01Var != null) {
                    Handler handler = u01Var.getHandler();
                    if (handler != null && u01Var.f30755b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((w01) this.f16795b).f32052a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
