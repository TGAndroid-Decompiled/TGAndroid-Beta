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
    public final int f16993a;
    public final Object f16994b;

    public a(Object obj, int i10) {
        this.f16993a = i10;
        this.f16994b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        boolean z10;
        k kVar;
        float min;
        boolean z11;
        switch (this.f16993a) {
            case 0:
                b bVar = (b) ((f3) ((la.h) this.f16994b).f15501b).f15729b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f16997b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f16996a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f17019i;
                        if (j10 == 0) {
                            hVar.f17019i = uptimeMillis;
                            hVar.f(hVar.f17014b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f17019i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f17024u;
                                double d = lVar.f17031i;
                                z10 = true;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f17014b, kVar2.f17013a, j12);
                                l lVar2 = kVar2.f17024u;
                                lVar2.f17031i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f17003a, c10.f17004b, j12);
                                kVar2.f17014b = c11.f17003a;
                                kVar2.f17013a = c11.f17004b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                z10 = true;
                                kVar = kVar2;
                                e c12 = kVar2.f17024u.c(kVar2.f17014b, kVar2.f17013a, j11);
                                kVar.f17014b = c12.f17003a;
                                kVar.f17013a = c12.f17004b;
                            }
                            float max = Math.max(kVar.f17014b, kVar.h);
                            kVar.f17014b = max;
                            kVar.f17014b = Math.min(max, kVar.f17018g);
                            float f7 = kVar.f17013a;
                            l lVar3 = kVar.f17024u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.f17028e && Math.abs(min - ((float) lVar3.f17031i)) < lVar3.d) {
                                kVar.f17014b = (float) kVar.f17024u.f17031i;
                                kVar.f17013a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(hVar.f17014b, hVar.f17018g);
                            hVar.f17014b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f17014b = max2;
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
                if (bVar.f16999e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    bVar.f16999e = false;
                }
                if (arrayList.size() > 0) {
                    if (bVar.d == null) {
                        bVar.d = new la.h(bVar.f16998c);
                    }
                    la.h hVar2 = bVar.d;
                    ((Choreographer) hVar2.f15502c).postFrameCallback((a) hVar2.d);
                    return;
                }
                return;
            default:
                b21 b21Var = ((d21) this.f16994b).f25590a;
                if (b21Var != null) {
                    Handler handler = b21Var.getHandler();
                    if (handler != null && b21Var.f24856b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((d21) this.f16994b).f25590a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
