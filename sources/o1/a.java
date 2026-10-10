package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import m.f3;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.d21;
public final class a implements Choreographer.FrameCallback {
    public final int f16911a;
    public final Object f16912b;

    public a(Object obj, int i10) {
        this.f16911a = i10;
        this.f16912b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        boolean z10;
        k kVar;
        float min;
        boolean z11;
        switch (this.f16911a) {
            case 0:
                b bVar = (b) ((f3) ((la.h) this.f16912b).f15466b).f15672b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f16915b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f16914a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f16937i;
                        if (j10 == 0) {
                            hVar.f16937i = uptimeMillis;
                            hVar.f(hVar.f16932b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f16937i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f16942u;
                                double d = lVar.f16949i;
                                z10 = true;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f16932b, kVar2.f16931a, j12);
                                l lVar2 = kVar2.f16942u;
                                lVar2.f16949i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f16921a, c10.f16922b, j12);
                                kVar2.f16932b = c11.f16921a;
                                kVar2.f16931a = c11.f16922b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                z10 = true;
                                kVar = kVar2;
                                e c12 = kVar2.f16942u.c(kVar2.f16932b, kVar2.f16931a, j11);
                                kVar.f16932b = c12.f16921a;
                                kVar.f16931a = c12.f16922b;
                            }
                            float max = Math.max(kVar.f16932b, kVar.h);
                            kVar.f16932b = max;
                            kVar.f16932b = Math.min(max, kVar.f16936g);
                            float f7 = kVar.f16931a;
                            l lVar3 = kVar.f16942u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.f16946e && Math.abs(min - ((float) lVar3.f16949i)) < lVar3.d) {
                                kVar.f16932b = (float) kVar.f16942u.f16949i;
                                kVar.f16931a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(hVar.f16932b, hVar.f16936g);
                            hVar.f16932b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f16932b = max2;
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
                if (bVar.f16917e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    bVar.f16917e = false;
                }
                if (arrayList.size() > 0) {
                    if (bVar.d == null) {
                        bVar.d = new la.h(bVar.f16916c);
                    }
                    la.h hVar2 = bVar.d;
                    ((Choreographer) hVar2.f15467c).postFrameCallback((a) hVar2.d);
                    return;
                }
                return;
            default:
                b21 b21Var = ((d21) this.f16912b).f25528a;
                if (b21Var != null) {
                    Handler handler = b21Var.getHandler();
                    if (handler != null && b21Var.f24814b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((d21) this.f16912b).f25528a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
