package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import ki.e0;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.n11;
public final class a implements Choreographer.FrameCallback {
    public final int f15508a;
    public final Object f15509b;

    public a(Object obj, int i10) {
        this.f15508a = i10;
        this.f15509b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f15508a) {
            case 0:
                b bVar = (b) ((e0) ((lf.h) this.f15509b).f14230b).f13672b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f15512b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f15511a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f15532i;
                        if (j10 == 0) {
                            hVar.f15532i = uptimeMillis;
                            hVar.e(hVar.f15528b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f15532i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f15537u;
                                double d = lVar.f15543i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f15528b, kVar2.f15527a, j12);
                                l lVar2 = kVar2.f15537u;
                                lVar2.f15543i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f15517a, c10.f15518b, j12);
                                kVar2.f15528b = c11.f15517a;
                                kVar2.f15527a = c11.f15518b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f15537u.c(kVar2.f15528b, kVar2.f15527a, j11);
                                kVar.f15528b = c12.f15517a;
                                kVar.f15527a = c12.f15518b;
                            }
                            float max = Math.max(kVar.f15528b, kVar.h);
                            kVar.f15528b = max;
                            kVar.f15528b = Math.min(max, kVar.f15531g);
                            float f7 = kVar.f15527a;
                            l lVar3 = kVar.f15537u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.e && Math.abs(min - ((float) lVar3.f15543i)) < lVar3.d) {
                                kVar.f15528b = (float) kVar.f15537u.f15543i;
                                kVar.f15527a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f15528b, hVar.f15531g);
                            hVar.f15528b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f15528b = max2;
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
                        bVar.d = new lf.h(bVar.f15513c);
                    }
                    lf.h hVar2 = bVar.d;
                    ((Choreographer) hVar2.f14231c).postFrameCallback((a) hVar2.d);
                    return;
                }
                return;
            default:
                l11 l11Var = ((n11) this.f15509b).f26593a;
                if (l11Var != null) {
                    Handler handler = l11Var.getHandler();
                    if (handler != null && l11Var.f25950b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((n11) this.f15509b).f26593a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
