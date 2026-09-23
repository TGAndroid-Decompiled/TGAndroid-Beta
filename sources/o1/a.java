package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.w01;
public final class a implements Choreographer.FrameCallback {
    public final int f15297a;
    public final Object f15298b;

    public a(Object obj, int i10) {
        this.f15297a = i10;
        this.f15298b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f15297a) {
            case 0:
                b bVar = (b) ((ka.c) ((lf.i) this.f15298b).f14011b).f13554b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f15301b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f15300a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f15321i;
                        if (j10 == 0) {
                            hVar.f15321i = uptimeMillis;
                            hVar.e(hVar.f15317b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f15321i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f15326u;
                                double d = lVar.f15332i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f15317b, kVar2.f15316a, j12);
                                l lVar2 = kVar2.f15326u;
                                lVar2.f15332i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f15306a, c10.f15307b, j12);
                                kVar2.f15317b = c11.f15306a;
                                kVar2.f15316a = c11.f15307b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f15326u.c(kVar2.f15317b, kVar2.f15316a, j11);
                                kVar.f15317b = c12.f15306a;
                                kVar.f15316a = c12.f15307b;
                            }
                            float max = Math.max(kVar.f15317b, kVar.h);
                            kVar.f15317b = max;
                            kVar.f15317b = Math.min(max, kVar.f15320g);
                            float f7 = kVar.f15316a;
                            l lVar3 = kVar.f15326u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.e && Math.abs(min - ((float) lVar3.f15332i)) < lVar3.d) {
                                kVar.f15317b = (float) kVar.f15326u.f15332i;
                                kVar.f15316a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f15317b, hVar.f15320g);
                            hVar.f15317b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f15317b = max2;
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
                        bVar.d = new lf.i(bVar.f15302c);
                    }
                    lf.i iVar = bVar.d;
                    ((Choreographer) iVar.f14012c).postFrameCallback((a) iVar.d);
                    return;
                }
                return;
            default:
                u01 u01Var = ((w01) this.f15298b).f29455a;
                if (u01Var != null) {
                    Handler handler = u01Var.getHandler();
                    if (handler != null && u01Var.f28357b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((w01) this.f15298b).f29455a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
