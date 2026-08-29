package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import l3.g0;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.p01;
public final class b implements Choreographer.FrameCallback {
    public final int f19015a;
    public final Object f19016b;

    public b(Object obj, int i10) {
        this.f19015a = i10;
        this.f19016b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f19015a) {
            case 0:
                c cVar = (c) ((a) ((g0) this.f19016b).f14096b).f19014b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = cVar.f19019b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    i iVar = (i) arrayList.get(i11);
                    if (iVar != null) {
                        a0.k kVar2 = cVar.f19018a;
                        Long l10 = (Long) kVar2.get(iVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                kVar2.remove(iVar);
                            }
                        }
                        long j11 = iVar.f19041i;
                        if (j11 == 0) {
                            iVar.f19041i = uptimeMillis;
                            iVar.e(iVar.f19036b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            iVar.f19041i = uptimeMillis;
                            k kVar3 = (k) iVar;
                            if (kVar3.v != Float.MAX_VALUE) {
                                l lVar = kVar3.f19045u;
                                double d = lVar.f19052i;
                                i10 = i11;
                                long j13 = j12 / 2;
                                f c3 = lVar.c(kVar3.f19036b, kVar3.f19035a, j13);
                                l lVar2 = kVar3.f19045u;
                                lVar2.f19052i = kVar3.v;
                                kVar3.v = Float.MAX_VALUE;
                                f c6 = lVar2.c(c3.f19025a, c3.f19026b, j13);
                                kVar3.f19036b = c6.f19025a;
                                kVar3.f19035a = c6.f19026b;
                                kVar = kVar3;
                            } else {
                                i10 = i11;
                                kVar = kVar3;
                                f c10 = kVar3.f19045u.c(kVar3.f19036b, kVar3.f19035a, j12);
                                kVar.f19036b = c10.f19025a;
                                kVar.f19035a = c10.f19026b;
                            }
                            float max = Math.max(kVar.f19036b, kVar.h);
                            kVar.f19036b = max;
                            kVar.f19036b = Math.min(max, kVar.f19040g);
                            float f9 = kVar.f19035a;
                            l lVar3 = kVar.f19045u;
                            lVar3.getClass();
                            if (Math.abs(f9) < lVar3.f19049e && Math.abs(min - ((float) lVar3.f19052i)) < lVar3.d) {
                                kVar.f19036b = (float) kVar.f19045u.f19052i;
                                kVar.f19035a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(iVar.f19036b, iVar.f19040g);
                            iVar.f19036b = min2;
                            float max2 = Math.max(min2, iVar.h);
                            iVar.f19036b = max2;
                            iVar.e(max2);
                            if (z10) {
                                iVar.d(false);
                            }
                            i11 = i10 + 1;
                        }
                    }
                    i10 = i11;
                    i11 = i10 + 1;
                }
                if (cVar.f19021e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    cVar.f19021e = false;
                }
                if (arrayList.size() > 0) {
                    if (cVar.d == null) {
                        cVar.d = new g0(cVar.f19020c);
                    }
                    g0 g0Var = cVar.d;
                    ((Choreographer) g0Var.f14097c).postFrameCallback((b) g0Var.d);
                    return;
                }
                return;
            default:
                n01 n01Var = ((p01) this.f19016b).f31533a;
                if (n01Var != null) {
                    Handler handler = n01Var.getHandler();
                    if (handler != null && n01Var.f30801b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((p01) this.f19016b).f31533a.O) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
