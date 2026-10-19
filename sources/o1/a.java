package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import k2.w0;
import m.g3;
import org.telegram.ui.Components.s11;
import org.telegram.ui.Components.u11;
public final class a implements Choreographer.FrameCallback {
    public final int f17532a;
    public final Object f17533b;

    public a(Object obj, int i10) {
        this.f17532a = i10;
        this.f17533b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        int i10;
        boolean z10;
        k kVar;
        float min;
        boolean z11;
        switch (this.f17532a) {
            case 0:
                b bVar = (b) ((w0) ((g3) this.f17533b).f16204b).f14832b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f17536b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        a0.l lVar = bVar.f17535a;
                        Long l4 = (Long) lVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                lVar.remove(hVar);
                            }
                        }
                        long j11 = hVar.f17556i;
                        if (j11 == 0) {
                            hVar.f17556i = uptimeMillis;
                            hVar.f(hVar.f17552b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            hVar.f17556i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar2 = kVar2.f17561u;
                                double d = lVar2.f17567i;
                                z10 = true;
                                i10 = i11;
                                long j13 = j12 / 2;
                                e c10 = lVar2.c(kVar2.f17552b, kVar2.f17551a, j13);
                                l lVar3 = kVar2.f17561u;
                                lVar3.f17567i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar3.c(c10.f17541a, c10.f17542b, j13);
                                kVar2.f17552b = c11.f17541a;
                                kVar2.f17551a = c11.f17542b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                z10 = true;
                                kVar = kVar2;
                                e c12 = kVar2.f17561u.c(kVar2.f17552b, kVar2.f17551a, j12);
                                kVar.f17552b = c12.f17541a;
                                kVar.f17551a = c12.f17542b;
                            }
                            float max = Math.max(kVar.f17552b, kVar.h);
                            kVar.f17552b = max;
                            kVar.f17552b = Math.min(max, kVar.f17555g);
                            float f7 = kVar.f17551a;
                            l lVar4 = kVar.f17561u;
                            lVar4.getClass();
                            if (Math.abs(f7) < lVar4.e && Math.abs(min - ((float) lVar4.f17567i)) < lVar4.d) {
                                kVar.f17552b = (float) kVar.f17561u.f17567i;
                                kVar.f17551a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(hVar.f17552b, hVar.f17555g);
                            hVar.f17552b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f17552b = max2;
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
                        bVar.d = new g3(bVar.f17537c);
                    }
                    g3 g3Var = bVar.d;
                    ((Choreographer) g3Var.f16205c).postFrameCallback((a) g3Var.d);
                    return;
                }
                return;
            default:
                s11 s11Var = ((u11) this.f17533b).f30862a;
                if (s11Var != null) {
                    Handler handler = s11Var.getHandler();
                    if (handler != null && s11Var.f30122b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((u11) this.f17533b).f30862a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
