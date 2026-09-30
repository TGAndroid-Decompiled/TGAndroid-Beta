package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import k2.u;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.n11;
public final class a implements Choreographer.FrameCallback {
    public final int f15520a;
    public final Object f15521b;

    public a(Object obj, int i10) {
        this.f15520a = i10;
        this.f15521b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f15520a) {
            case 0:
                b bVar = (b) ((u) ((la.h) this.f15521b).f14182b).f13384b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f15524b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f15523a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f15544i;
                        if (j10 == 0) {
                            hVar.f15544i = uptimeMillis;
                            hVar.e(hVar.f15540b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f15544i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f15549u;
                                double d = lVar.f15555i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f15540b, kVar2.f15539a, j12);
                                l lVar2 = kVar2.f15549u;
                                lVar2.f15555i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f15529a, c10.f15530b, j12);
                                kVar2.f15540b = c11.f15529a;
                                kVar2.f15539a = c11.f15530b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f15549u.c(kVar2.f15540b, kVar2.f15539a, j11);
                                kVar.f15540b = c12.f15529a;
                                kVar.f15539a = c12.f15530b;
                            }
                            float max = Math.max(kVar.f15540b, kVar.h);
                            kVar.f15540b = max;
                            kVar.f15540b = Math.min(max, kVar.f15543g);
                            float f7 = kVar.f15539a;
                            l lVar3 = kVar.f15549u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.e && Math.abs(min - ((float) lVar3.f15555i)) < lVar3.d) {
                                kVar.f15540b = (float) kVar.f15549u.f15555i;
                                kVar.f15539a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f15540b, hVar.f15543g);
                            hVar.f15540b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f15540b = max2;
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
                        bVar.d = new la.h(bVar.f15525c);
                    }
                    la.h hVar2 = bVar.d;
                    ((Choreographer) hVar2.f14183c).postFrameCallback((a) hVar2.d);
                    return;
                }
                return;
            default:
                l11 l11Var = ((n11) this.f15521b).f26523a;
                if (l11Var != null) {
                    Handler handler = l11Var.getHandler();
                    if (handler != null && l11Var.f25878b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((n11) this.f15521b).f26523a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
