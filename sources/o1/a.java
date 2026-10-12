package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import ji.d4;
import org.telegram.ui.Components.w11;
import org.telegram.ui.Components.y11;
public final class a implements Choreographer.FrameCallback {
    public final int f16439a;
    public final Object f16440b;

    public a(Object obj, int i10) {
        this.f16439a = i10;
        this.f16440b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        int i10;
        boolean z10;
        k kVar;
        float min;
        boolean z11;
        switch (this.f16439a) {
            case 0:
                b bVar = (b) ((d4) ((li.k) this.f16440b).f14820b).f13233b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f16443b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        a0.l lVar = bVar.f16442a;
                        Long l4 = (Long) lVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                lVar.remove(hVar);
                            }
                        }
                        long j11 = hVar.f16463i;
                        if (j11 == 0) {
                            hVar.f16463i = uptimeMillis;
                            hVar.f(hVar.f16459b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            hVar.f16463i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar2 = kVar2.f16468u;
                                double d = lVar2.f16474i;
                                z10 = true;
                                i10 = i11;
                                long j13 = j12 / 2;
                                e c10 = lVar2.c(kVar2.f16459b, kVar2.f16458a, j13);
                                l lVar3 = kVar2.f16468u;
                                lVar3.f16474i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar3.c(c10.f16448a, c10.f16449b, j13);
                                kVar2.f16459b = c11.f16448a;
                                kVar2.f16458a = c11.f16449b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                z10 = true;
                                kVar = kVar2;
                                e c12 = kVar2.f16468u.c(kVar2.f16459b, kVar2.f16458a, j12);
                                kVar.f16459b = c12.f16448a;
                                kVar.f16458a = c12.f16449b;
                            }
                            float max = Math.max(kVar.f16459b, kVar.h);
                            kVar.f16459b = max;
                            kVar.f16459b = Math.min(max, kVar.f16462g);
                            float f7 = kVar.f16458a;
                            l lVar4 = kVar.f16468u;
                            lVar4.getClass();
                            if (Math.abs(f7) < lVar4.e && Math.abs(min - ((float) lVar4.f16474i)) < lVar4.d) {
                                kVar.f16459b = (float) kVar.f16468u.f16474i;
                                kVar.f16458a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(hVar.f16459b, hVar.f16462g);
                            hVar.f16459b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f16459b = max2;
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
                        bVar.d = new li.k(bVar.f16444c);
                    }
                    li.k kVar3 = bVar.d;
                    ((Choreographer) kVar3.f14821c).postFrameCallback((a) kVar3.d);
                    return;
                }
                return;
            default:
                w11 w11Var = ((y11) this.f16440b).f31451a;
                if (w11Var != null) {
                    Handler handler = w11Var.getHandler();
                    if (handler != null && w11Var.f30739b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((y11) this.f16440b).f31451a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
