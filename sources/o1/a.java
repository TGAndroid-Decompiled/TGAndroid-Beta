package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import k2.u;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.k11;
public final class a implements Choreographer.FrameCallback {
    public final int f15504a;
    public final Object f15505b;

    public a(Object obj, int i10) {
        this.f15504a = i10;
        this.f15505b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f15504a) {
            case 0:
                b bVar = (b) ((u) ((la.h) this.f15505b).f14166b).f13369b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f15508b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f15507a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f15528i;
                        if (j10 == 0) {
                            hVar.f15528i = uptimeMillis;
                            hVar.e(hVar.f15524b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f15528i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f15533u;
                                double d = lVar.f15539i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f15524b, kVar2.f15523a, j12);
                                l lVar2 = kVar2.f15533u;
                                lVar2.f15539i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f15513a, c10.f15514b, j12);
                                kVar2.f15524b = c11.f15513a;
                                kVar2.f15523a = c11.f15514b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f15533u.c(kVar2.f15524b, kVar2.f15523a, j11);
                                kVar.f15524b = c12.f15513a;
                                kVar.f15523a = c12.f15514b;
                            }
                            float max = Math.max(kVar.f15524b, kVar.h);
                            kVar.f15524b = max;
                            kVar.f15524b = Math.min(max, kVar.f15527g);
                            float f7 = kVar.f15523a;
                            l lVar3 = kVar.f15533u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.e && Math.abs(min - ((float) lVar3.f15539i)) < lVar3.d) {
                                kVar.f15524b = (float) kVar.f15533u.f15539i;
                                kVar.f15523a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f15524b, hVar.f15527g);
                            hVar.f15524b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f15524b = max2;
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
                        bVar.d = new la.h(bVar.f15509c);
                    }
                    la.h hVar2 = bVar.d;
                    ((Choreographer) hVar2.f14167c).postFrameCallback((a) hVar2.d);
                    return;
                }
                return;
            default:
                i11 i11Var = ((k11) this.f15505b).f25597a;
                if (i11Var != null) {
                    Handler handler = i11Var.getHandler();
                    if (handler != null && i11Var.f24909b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((k11) this.f15505b).f25597a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
