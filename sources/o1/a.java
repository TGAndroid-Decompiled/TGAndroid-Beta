package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.x01;
public final class a implements Choreographer.FrameCallback {
    public final int f15320a;
    public final Object f15321b;

    public a(Object obj, int i10) {
        this.f15320a = i10;
        this.f15321b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f15320a) {
            case 0:
                b bVar = (b) ((ka.c) ((lf.i) this.f15321b).f14021b).f13566b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f15324b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f15323a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f15344i;
                        if (j10 == 0) {
                            hVar.f15344i = uptimeMillis;
                            hVar.e(hVar.f15340b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f15344i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f15349u;
                                double d = lVar.f15355i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f15340b, kVar2.f15339a, j12);
                                l lVar2 = kVar2.f15349u;
                                lVar2.f15355i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f15329a, c10.f15330b, j12);
                                kVar2.f15340b = c11.f15329a;
                                kVar2.f15339a = c11.f15330b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f15349u.c(kVar2.f15340b, kVar2.f15339a, j11);
                                kVar.f15340b = c12.f15329a;
                                kVar.f15339a = c12.f15330b;
                            }
                            float max = Math.max(kVar.f15340b, kVar.h);
                            kVar.f15340b = max;
                            kVar.f15340b = Math.min(max, kVar.f15343g);
                            float f7 = kVar.f15339a;
                            l lVar3 = kVar.f15349u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.e && Math.abs(min - ((float) lVar3.f15355i)) < lVar3.d) {
                                kVar.f15340b = (float) kVar.f15349u.f15355i;
                                kVar.f15339a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f15340b, hVar.f15343g);
                            hVar.f15340b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f15340b = max2;
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
                        bVar.d = new lf.i(bVar.f15325c);
                    }
                    lf.i iVar = bVar.d;
                    ((Choreographer) iVar.f14022c).postFrameCallback((a) iVar.d);
                    return;
                }
                return;
            default:
                v01 v01Var = ((x01) this.f15321b).f29837a;
                if (v01Var != null) {
                    Handler handler = v01Var.getHandler();
                    if (handler != null && v01Var.f28542b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((x01) this.f15321b).f29837a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
