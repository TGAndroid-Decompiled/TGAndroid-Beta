package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import k2.u;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.m11;
public final class a implements Choreographer.FrameCallback {
    public final int f15505a;
    public final Object f15506b;

    public a(Object obj, int i10) {
        this.f15505a = i10;
        this.f15506b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f15505a) {
            case 0:
                b bVar = (b) ((u) ((la.h) this.f15506b).f14167b).f13369b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f15509b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f15508a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f15529i;
                        if (j10 == 0) {
                            hVar.f15529i = uptimeMillis;
                            hVar.e(hVar.f15525b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f15529i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f15534u;
                                double d = lVar.f15540i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f15525b, kVar2.f15524a, j12);
                                l lVar2 = kVar2.f15534u;
                                lVar2.f15540i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f15514a, c10.f15515b, j12);
                                kVar2.f15525b = c11.f15514a;
                                kVar2.f15524a = c11.f15515b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f15534u.c(kVar2.f15525b, kVar2.f15524a, j11);
                                kVar.f15525b = c12.f15514a;
                                kVar.f15524a = c12.f15515b;
                            }
                            float max = Math.max(kVar.f15525b, kVar.h);
                            kVar.f15525b = max;
                            kVar.f15525b = Math.min(max, kVar.f15528g);
                            float f7 = kVar.f15524a;
                            l lVar3 = kVar.f15534u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.e && Math.abs(min - ((float) lVar3.f15540i)) < lVar3.d) {
                                kVar.f15525b = (float) kVar.f15534u.f15540i;
                                kVar.f15524a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f15525b, hVar.f15528g);
                            hVar.f15525b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f15525b = max2;
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
                        bVar.d = new la.h(bVar.f15510c);
                    }
                    la.h hVar2 = bVar.d;
                    ((Choreographer) hVar2.f14168c).postFrameCallback((a) hVar2.d);
                    return;
                }
                return;
            default:
                k11 k11Var = ((m11) this.f15506b).f26227a;
                if (k11Var != null) {
                    Handler handler = k11Var.getHandler();
                    if (handler != null && k11Var.f25569b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((m11) this.f15506b).f26227a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
